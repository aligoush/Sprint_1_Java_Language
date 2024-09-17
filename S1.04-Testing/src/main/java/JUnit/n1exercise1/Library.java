package JUnit.n1exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList<String> getBooks() {
        return new ArrayList<>(this.books);
    }

    public void addBook(String bookTitle) {
        if(this.books.contains(bookTitle)) {
            System.out.println("The book " + bookTitle + " already exists in the library");
        } else {
            this.books.add(bookTitle);
        }
    }

    public void removeBook(String bookTitle){
        this.books.remove(bookTitle);
    }

    public String getBook(int position) {
        return books.get(position);
    }

    public void addBookByPosition(String bookTitle, int position) {
        if(this.books.contains(bookTitle)) {
            System.out.println("The book " + bookTitle + " already exists in the library");
        } else {
            this.books.add(position, bookTitle);
        }
    }

    public void sortBooks() {
        Collections.sort(this.books);
    }

}
