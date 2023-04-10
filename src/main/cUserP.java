/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author engeer
 */
public class cUserP {
    private static final cUserP cUser = new cUserP();
    
    private int user_id;



    private String username;
    private String password;
    private String name;
    private String level;
    
    private cUserP() {
        
    }
    
    public static cUserP getInstance() {
        return cUser;
    }
    
    
    public static cUserP getcUser() {
        return cUser;
    }
        public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    


}
