/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount userAccount : userAccountList)
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
        return null;
    }
    
    public boolean authenticateUserLogin(String username,String password)
    {
        for (UserAccount userAccount : userAccountList)
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return true;
            }
        return false;
    }
    
    public boolean checkIfUserIsUnique(String user_id){
        
        for(UserAccount userAccount : userAccountList)
        {
            if(userAccount.getUsername().equals(user_id))
                return false;
        }
        
       return true;
    }

    public void addUserAccount(UserAccount userAccount){
        userAccountList.add(userAccount);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountList){
            if (userAccount.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public UserAccount getUserAccount(String username) {
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(username))
            {
                return userAccount;
            }
        }
        return null;
    }

    
}
