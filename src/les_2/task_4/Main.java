package les_2.task_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = Library.createListOfEntity();

        Author[] authors = library.getAuthors();
        Book[] books = library.getBooks();

        System.out.println(MyStream.filterBooksWithOnlySingleAuthor(books));
    }
}
