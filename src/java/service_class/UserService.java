/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_class;

/**
 *
 * @author Administrator
 */
public class UserService {
    
    private String username;
    private String password;
    
    public UserService()
    {
        
    }
    
    public boolean login(String username, String password)
    {
        this.username = username;
        this.password = password;
        
        if((this.username.equals("adam")) && (this.password.equals("password")))
        {
            return true;
        }
        else if((this.username.equals("betty")) && (this.password.equals("password")))
        {
            return true;
        }
        return false;
       
    }
}
