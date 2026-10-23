public class BookCopy {
    private String title;
    private boolean borrowed;

    public BookCopy(String title) {
        this.title = title;
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public boolean borrow() {
        if (!borrowed) {
            borrowed = true;
            return true;
        }

        return false;
    }

    public boolean returnBook() {
        if (borrowed) {
            borrowed = false;
            return true;
        }

        return false;
    }
}
