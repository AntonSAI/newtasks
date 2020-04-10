package les_2.task_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class MyStream {
    //check if some book have more than 200 pages;
    public static boolean checkIfSomeBookHasMoreThanTwoHundredPages(Book[] books) {
        return Stream.of(books).anyMatch(book -> book.getNumberOfPages() > 200);
    }

    //check if all books have more than 200 pages;
    public static boolean checkIfAllBooksHaveMoreThanTwoHundredPages(Book[] books) {
        return Stream.of(books).allMatch(book -> book.getNumberOfPages() > 200);
    }

    //find the books with max number of pages
    public static Book findTheBookWithMaxNumberOfPages(Book[] books) {
        return Stream.of(books).max(Comparator.comparingInt(Book::getNumberOfPages)).orElse(new Book());
    }

    //find the books with min number of pages
    public static Book findTheBookWithMinNumberOfPages(Book[] books) {
        return Stream.of(books).min(Comparator.comparingInt(Book::getNumberOfPages)).orElse(new Book());
    }

    //filter books with only single author;
    public static List<Book> filterBooksWithOnlySingleAuthor(Book[] books) {
        return Stream.of(books).filter(book -> book.getAuthors().size() == 1).collect(toList());
    }

    //sort the books by number of pages;
    public static List<Book> sortTheBooksByNumberOfPages(Book[] books) {
        return Stream.of(books).sorted(Comparator.comparingInt(Book::getNumberOfPages)).collect(toList());
    }

    //sort the books by title;
    public static List<Book> sortTheBooksByTitle(Book[] books) {
        return Stream.of(books).sorted(Comparator.comparing(Book::getTitle)).collect(toList());
    }

    //get list of all titles;
    public static List<String> getListOfAllTitles(Book[] books) {
        return Stream.of(books).map(Book::getTitle).collect(toList());
    }

    //print them using forEach method;
    public static void printThem(Book[] books) {
        Stream.of(books).forEach(System.out::println);
    }

    //get distinct list of all authors.
    //Use peek method for debugging intermediate streams during execution the previous task
    public static List<Author> getDisctinctListOfAllAuthors(Book[] books) {
        return Stream.of(books)
                .flatMap(
                        book -> book.getAuthors().stream()
                )
                .peek(System.out::println)
                .distinct()
                .peek(System.out::println)
                .parallel()
                .collect(toList());
    }

    // Use the Optional type for determining the title of the biggest book of some author.
    public static Book findTheBiggestBookOfAuthor(Author author) {
        return author.getBooks().stream().max(Comparator.comparingInt(Book::getNumberOfPages)).orElse(new Book());
    }
}
