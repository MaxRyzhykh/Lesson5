package academy.belhard;

import entity.User;

public class Main {

    public static void main(String[] args) {


        User user1 = new User("email@mail.ru","1234");

        System.out.println(user1.getFullInfo());
    }
}
