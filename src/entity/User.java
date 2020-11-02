package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String em, String pa) {
        super(em, pa);
    }


    public String getFullInfo(){
        System.out.println("Имя: " + Person.getFullName + "\n" + "E-mail: " + email);
    //разве не надо создать объект класса person чтобы к нему обратиться?
    }


    public boolean isPasswordCorrect(String pd){
        if (pd.equals(password)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
