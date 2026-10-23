public class Main {
    public static void main(String[] args) {
        BookCopy book = new BookCopy("Java for begyndere");
        System.out.println(book.returnBook());
        System.out.println(book.isBorrowed());

        
        book.borrow();  
        System.out.println(book.isBorrowed());
        System.out.println(book.returnBook());
        System.out.println(book.isBorrowed());
        System.out.println(book.returnBook());
    }
}