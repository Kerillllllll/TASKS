package seven;

import java.util.*;public class Library {
    private ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(String title) {
        for(int i = 0; i < books.size(); i++) {
        if(books.get(i).getTitle().equals(title)) {
            books.remove(i);
            break;
        }
    }
    }
    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for(Book book : books) {
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                booksByAuthor.add(book);
            }
        }
        System.out.println("Книги автора: " + booksByAuthor);
        return booksByAuthor;
    }
    public void printAllBooks() {
        for(Book book : books) {
            System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Год: " + book.getYear());
        }
    }
}
