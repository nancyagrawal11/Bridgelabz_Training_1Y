import java.util.Scanner;
class Course {
    String courseName;
    int duration;
    double fee;
   static  String instituteName = "VKA institute";

    Course(String n, int d, double f , ) {
        courseName = n;
        duration = d;
        fee = f;
		
    }

    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    static void displayInstituteName() {
        System.out.println("Institute Name: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 18000);
        Course c2 = new Course("Python", 4, 19000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.displayInstituteName();
    }
}