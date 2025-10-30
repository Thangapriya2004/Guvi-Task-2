public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeID;
    double salary;

    Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // using super to call parent constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Riya", 22, 101, 50000);
        emp.display();
    }
}
