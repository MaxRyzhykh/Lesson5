package entity;

public class Person {
    public Person(){}
    protected String firstName ;
    protected String lastName ;


    Person (String fn, String ln){
        firstName = fn;
        lastName = ln;
    }


    public String getFullName(){
        return firstName + " " + lastName;
    }
}
