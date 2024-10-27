package JUnit.n1exercise1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book1");
        library.addBook("The Great Gatsby");
        library.addBook("Book2");
        library.addBook("Book3");
        library.addBook("Book3");
        library.addBook("AdditionalBook3");
        ArrayList<String> books = library.getBooks();
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(library.getBook(1));
    }
}
