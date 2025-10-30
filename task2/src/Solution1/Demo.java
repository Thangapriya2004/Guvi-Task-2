package Solution1;

public class Demo {
    // constructor
    static void main(String[] args) {
        Person person = new Person();

        person.name = "priya";
        person.age = 20;

        System.out.println(person.print());

        Person person1 = new Person("riya",21);

        System.out.println(person1.print());


    }
}
