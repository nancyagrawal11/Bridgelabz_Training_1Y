package inheritance.com;

class Book {
    String title;
    int publicationYear;


    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        Author obj = new Author(
                "The Great Gatsby",
                1925,
                "F. Scott Fitzgerald",
                "American novelist and short story writer"
        );

        obj.displayInfo();
    }
}



