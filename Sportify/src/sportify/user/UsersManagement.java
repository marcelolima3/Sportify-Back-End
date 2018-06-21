
import sportify.user.User;
import java.util.Map;

public class UsersManagement {

    private User loggedUser;
    private Map<String, User> registeredUsers;

    public boolean login(String email, String password){
        if(!registeredUsers.containsKey(email) || !registeredUsers.get(email).checkPassword(password))
            return false; // throw new InvalidUserException
        loggedUser = registeredUsers.get(email);
        return true;
    }

    public boolean logout(){
        if(this.loggedUser != null){
            this.loggedUser = null;
            return true;
        }
        else return false; // throw new UserNotLoggedInException
    }

    public User registerNewUser(String name, String email, String password, PaymentMethod paymentMethod){
        if(registeredUsers.containsKey(email))
            return null;
            //throw new UsernameAlreadyExistsException
        else {
            User new_user = new User(name, email, password, paymentMethod)
            registeredUsers.put(email, new_user);
            return new_user;
        }
    }

}
