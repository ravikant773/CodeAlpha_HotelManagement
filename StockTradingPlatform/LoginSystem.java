public class LoginSystem {

    boolean login(String user, String pass) {

        if ("admin".equals(user) && "1234".equals(pass)) {
            System.out.println("Login Successful");
            return true;
        }

        System.out.println("Invalid Username or Password");
        return false;
    }

    public static void main(String[] args) {
        LoginSystem obj = new LoginSystem();
        obj.login("admin", "1234");
    }
}