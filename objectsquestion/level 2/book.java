import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "";
        author = "";
        price = 0;
    }

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("king lear", "William Shakespeare", 500);

        b1.display();
        b2.display();
    }
}