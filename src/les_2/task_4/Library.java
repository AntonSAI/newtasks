package les_2.task_4;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class Library {
    Author[] authors;
    Book[] books;

    public Library() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Book[] getBooks() {
        return books;
    }

    public static Library createListOfEntity() {
        Library library = new Library();
        library.generateParams();
        return library;
    }

    private void generateParams() {
        Author author1 = new Author("Сергей Лукьяненко", (short) 51);
        Author author2 = new Author("Кир Булычёв", (short) 69);
        Author author3 = new Author("Головачев Василий", (short) 43);
        Author author4 = new Author("Мазин Александр", (short) 33);

        Book book1 = new Book("Дневной дозор", 302, asList(author1));
        Book book2 = new Book("Ночной дозор", 432, asList(author1));
        Book book3 = new Book("Черновик", 3312, asList(author1));

        author1.setBooks(asList(book1, book2, book3));

        Book book4 = new Book("Путешествие Алисы", 302, asList(author2));
        Book book5 = new Book("Поселок", 432, asList(author2));

        author2.setBooks(asList(book4, book5));

        Book book6 = new Book("Евангелие от зверя", 302, asList(author3));
        Book book7 = new Book("Запрещенная реальность", 432, asList(author3));
        Book book8 = new Book("Катарсис", 3312, asList(author3));
        Book book9 = new Book("Спасатели Веера", 3312, asList(author3));

        author3.setBooks(asList(book6, book7, book8, book9));

        Book book10 = new Book("Варяг", 302, asList(author4));
        Book book11 = new Book("Варвары", 432, asList(author4));

        authors = (Author[]) asList(author1, author2, author3, author4).toArray();
        books = (Book[]) asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book9, book10, book11).toArray();
    }

    @Override
    public String toString() {
        return "Library{" +
                "authors=" + Arrays.toString(authors) +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
