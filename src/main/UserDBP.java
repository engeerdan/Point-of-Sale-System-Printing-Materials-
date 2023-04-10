/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author engeer
 */
public class UserDBP extends DBClassP{
    public int tryLogin( usersP user ){
        System.out.println(user.getUsername());
        return 1;
    }
    
    public boolean validateUser( usersP user ){
        boolean userIsValid = false;
        try {
            //and is_active = true *removed
            PreparedStatement st = con.prepareStatement("Select * from users where username = ? ");
            st.setString(1, user.getUsername());
            ResultSet rs = st.executeQuery();
            
            if ( rs.next() ) {
                //System.out.println(rs.getString("level"));
                
                if (user.validatePassword(rs.getString("password"))){
                    userIsValid =true;
                    
                    cUserP currentUser = cUserP.getInstance();
                    currentUser.setName(rs.getString("name"));
                    currentUser.setLevel(rs.getString("level"));
                    user.setLevel(rs.getString("level"));
                    
                }else{
                    userIsValid =false;
                  
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return userIsValid;
    }

    public boolean createUser( usersP user ) {
        boolean result = false;
        try {
            PreparedStatement st = con.prepareStatement("insert into users (username, password, "
                    + " name, level) VALUES (?, ?, ?, ?)");

            st.setString( 1 , user.getUsername());
            st.setString( 2 , user.getPassword());
            st.setString( 3 , user.getName());
            st.setString( 4 , user.getLevel());


            if( st.executeUpdate(  ) > 0 ) {
                result = true;
            }
            con.close();
        } catch ( SQLException e ) {
            System.out.println( e );
            
           JOptionPane.showMessageDialog(null, "Username already exist", "Invalid!", JOptionPane.ERROR_MESSAGE);
        }
        
        return result;
    }
    
    
}
