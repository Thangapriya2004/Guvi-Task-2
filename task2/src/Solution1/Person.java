package Solution1;

public class Person {
    public String name;
    public int age;
 // default constructor
public Person(){
    System.out.println("hi from constructor");

}

// parameterized constructor/no argument constructor
public Person(String name, int age) {
    this.name=name;
            this.age=age;

}


// Method to display person's details
    public String print(){

        return "My name is "+name+ " and age is " + age;

    }


}

