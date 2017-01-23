import org.mindrot.jbcrypt.BCrypt;

public class Main{
    public static void main(String[] args){
        String password = BCrypt.hashpw("password", BCrypt.gensalt(10));
        System.out.println(password);
    }
    
}