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

    public void addBook(String bookTitle){
        try{
            this.findBook(bookTitle, true);
            this.books.add(bookTitle);
        } catch(BookAlreadyExistsException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(this.books);
    }

    public void removeBook(String bookTitle){
        try{
            this.findBook(bookTitle, false);
            this.books.remove(bookTitle);
        } catch(BookAlreadyExistsException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(this.books);
    }

    public String getBook(int position) {
        return books.get(position);
    }

    public void addBookByPosition(String bookTitle, int position) {
        try{
            this.findBook(bookTitle, true);
            this.books.add(position,bookTitle);
        } catch(BookAlreadyExistsException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(this.books);
    }

    private void findBook(String bookTitle, boolean isAdding) throws BookAlreadyExistsException, BookNotFoundException {
        if(this.books.contains(bookTitle) && isAdding) {
            throw new BookAlreadyExistsException("The book " + bookTitle + " already exists in the library");
        }
        if(!this.books.contains(bookTitle) && !isAdding){
            throw new BookNotFoundException("The book " + bookTitle + " is not found in the library");
        }
    }
}
