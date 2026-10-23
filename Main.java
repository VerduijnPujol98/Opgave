public class Main {
    public static void main(String[] args) {
        BookCopy book = new BookCopy("Java for begyndere");

        System.out.println("Første udlån: " + book.borrow());
        System.out.println("Er bogen udlånt? " + book.isBorrowed());

        System.out.println("Gentaget udlån: " + book.borrow());
        System.out.println("Er bogen stadig udlånt? " + book.isBorrowed());

        book.returnBook();
        System.out.println("Efter aflevering er bogen udlånt? " + book.isBorrowed());

        System.out.println("Nyt udlån: " + book.borrow());
        System.out.println("Er bogen udlånt? " + book.isBorrowed());
    }
}