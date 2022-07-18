package lesson_07_oop.inheritance;

public abstract class Person {

    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    /**
     * Not Abstract method
     **/
    public void whoAreYou(){
        System.out.println("Too general question - I'm a person");
    }

    /**
     * Not Abstract method
     **/
    public void walk() {
        System.out.println("Too general expression - I'm a person");
    };

    /**
     * Abstract method
     **/
    public abstract void speak();




}
