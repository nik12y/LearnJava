package books;

public class BooksRun {
    public static void main(String[] args) {
        Book book = new Book();
        book.setCamlin(5);
        System.out.println(book.getCamlin());

        book.increaseNumberOfBooks(5);
        System.out.println(book.getCamlin());

        book.decreaseNumberOfBooks(8);
        System.out.println(book.getCamlin());
    }
}