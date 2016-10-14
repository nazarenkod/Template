package appLogic;

import model.User;

/**
 * Created by nazarenkod on 14.10.2016.
 */
public class UserHalper {

    private User user;


    public void loginAs(User user){

        if(user.getPassword().equals("wrong")){
            return;
        }
        this.user = user;
        }


    public void logout(){
        this.user = null;
    }

    public boolean isLoggedIn(){
        return user != null;
    }
    public boolean isLoggedInAs(User user){
        return isLoggedIn() && this.user.getLogin().equals(user.getLogin());
    }
    public boolean isNotLoggedIn(){
        return user == null;
    }
}
