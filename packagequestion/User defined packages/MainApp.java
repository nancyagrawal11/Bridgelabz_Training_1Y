import college.student.Student;
import college.faculty.Faculty;

class MainApp {
    public static void main(String[] args){

        Student s=new Student("Rahul",101);
        Faculty f=new Faculty("Sharma","Java");

        s.display();
        f.display();
    }
}