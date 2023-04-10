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
public class usersP {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String level;
    private boolean is_active;

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setLevel(String level) {
        this.level = level;
    }

    public void setIsActive(boolean is_active) {
        this.is_active = is_active;
    }

    public String getLevel() {
        return level;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean validatePassword(String passwordDB){
        if(passwordDB == null ? password == null : passwordDB.equals(password)){
            return true;
        }else{
            return false;
        }
        
    }
  
    
}
