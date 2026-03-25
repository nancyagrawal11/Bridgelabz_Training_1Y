import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

class LibraryMain {
    public static void main(String[] args){

        Book b=new Book("Java");
        Member m=new Member("Amit");
        Transaction t=new Transaction();

        b.show();
        m.show();
        t.issue("Java","Amit");
    }
}