package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String em, String pa) {
        super(em, pa);
    }


    public String getFullInfo() {
        return "Имя: " + super.getFullName() + "\n" + "E-mail: " + email;
    }


    public boolean isPasswordCorrect(String pd) {
        if (pd.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
