import college.student.*;
import college.faculty.*;
import college.department.*;

class MainApp {
    public static void main(String[] args){

        Student s=new Student("Aman",1);
        Faculty f=new Faculty("Sir","Math");
        Department d=new Department("CSE");

        s.display();
        f.display();
        d.show();
    }
}