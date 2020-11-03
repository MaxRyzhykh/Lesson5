package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String em, String pa) {
        super(em, pa);
    }


    public String getFullInfo() {
        String fullInfo = "Имя: " + getFullName() + "\n" + "E-mail: " + email;
        return fullInfo;
    }


    public boolean isPasswordCorrect(String pd) {
        if (pd.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
