import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet to order the name of books
        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());
        //TreeSet to order the total page number of books (big to small)
        TreeSet<Book> booksOrderTotalPages = new TreeSet<>(new OrderTotalPagesComparator().reversed());

        books.add(new Book("Crime and Punishment", "Dostoyevski", 704, 1866));
        books.add(new Book("Dead Souls", "Gogol", 484, 1842));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 432, 1813));
        books.add(new Book("Great Expectations", "Charles Dickens", 712, 1861));
        books.add(new Book("To the Lighthouse", "Virginia Woolf", 224, 1927));

        for (Book book : books) {
            System.out.println(book.getName());
        }

        System.out.println("######################");

        //The same books list added to new TreeSet for ordering total pages of books
        booksOrderTotalPages.addAll(books);


        for(Book bookPage : booksOrderTotalPages){
            System.out.println(bookPage.getName());
        }

    }

}