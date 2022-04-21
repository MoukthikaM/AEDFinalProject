/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepetstore;

import java.util.ArrayList;

/**
 *
 * @author moukthikamanapati
 */
public class UserDirectory {
    ArrayList<User> userList;

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

   
 
    public UserDirectory() {
        userList = new ArrayList<User>();
    }
    
   
    public User addUser() {
        User newUser = new User();
        userList.add(newUser);
        return newUser;
    }

    public void removeUser(User u) {
        userList.remove(u);
    }
     public User searchUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
