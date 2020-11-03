package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String fn,String lm, String em, String pa) {
        super.firstName = fn;
        super.lastName = lm;
        this.email = em;
        this.password = pa;
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
