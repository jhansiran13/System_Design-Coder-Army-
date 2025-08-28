package SOLID_PRINCIPLES.solid.SRP.Example2.Library_mng;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String title;
    public String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
}

class Library{
    private ArrayList<Book> books=new ArrayList<>();
    public void addBook(Book b){
        books.add(b);
    }
    public List<Book> getBooks(){
        return books;
    }
}

class LibraryPrinter{
    private Library library;
    public LibraryPrinter(Library library){
        this.library=library;
    }
    public void printBooks(){
        for(Book book:library.getBooks()){
            System.out.println(book.title+" "+book.author);

        }
    }
}

class LibraryStorage{
    private Library library;
    public LibraryStorage(Library library){
        this.library=library;
    }
    public void saveToFile(){
        System.out.println("Saved to DB>..");
    }
}

public class Manage {
    public static void main(String args[]) {
        Library library = new Library();
        library.addBook(new Book("I mean it", "Jhansi"));
        library.addBook(new Book("I mean it", "Jhansi"));

        // Corrected usage of LibraryPrinter
        LibraryPrinter printer = new LibraryPrinter(library);
        printer.printBooks();

        // Corrected usage of LibraryStorage
        LibraryStorage storage = new LibraryStorage(library);
        storage.saveToFile(); 
    }
}
