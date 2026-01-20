import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book book = new Book("C# Programming", 5);
        while (true) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to borrow this book?",
                    "Borrow Book", JOptionPane.YES_NO_OPTION);
            if (choice != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
            if (book.getAvailableBook() == 0) {
                JOptionPane.showMessageDialog(null, "No available to borrow...",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                break;
            }
            book.borrowBook();
            System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
        }
    }
}
