package classes;


import org.springframework.beans.factory.annotation.Required;


/**
 * Created by Артём on 02.12.2015.
 */


public class Contact {
    private String name;
    private int age;

    public Contact() {
    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name is: "+name+"; "+" Age is: "+age+"\n";
    }
}
