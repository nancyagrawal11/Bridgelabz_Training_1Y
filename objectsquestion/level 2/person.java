import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p2) {
        this.name = p2.name;
        this.age = p2.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
		p1.name = "rithik";
		p1.age = 10;
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}