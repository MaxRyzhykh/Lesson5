package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String fn,String ln, String em, String pa) {
        super.firstName = fn;
        super.lastName = ln;
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
