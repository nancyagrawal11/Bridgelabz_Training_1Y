package library.books;

public class Book {
    String title;

    public Book(String t){
        title=t;
    }

    public void show(){
        System.out.println(title);
    }
}