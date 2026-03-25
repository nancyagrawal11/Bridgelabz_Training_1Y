import com.school.data.*;
import com.school.util.*;

class MainApp {
    public static void main(String[] args){

        Student s=new Student("Raj",70,80,90);
        Analyzer a=new Analyzer();

        double avg=a.avg(s);

        System.out.println(s);
        System.out.println("Avg: "+avg);
        System.out.println("Grade: "+a.grade(avg));
    }
}