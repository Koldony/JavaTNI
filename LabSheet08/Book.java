public class Book {
    private String title;
    private int totalBook;
    private int availableBook;
    public Book(String title, int totalBook) {
        this.title = title;
        this.availableBook = totalBook;
        this.totalBook = availableBook;
    }
    public Book(String title) {
        this.title = title;
        this.availableBook = 0;
        this.totalBook = 0;
    }
    public Book() {
        this.title = "";
        this.availableBook = 0;
        this.totalBook = 0;
    }
    public String getTitle() {
        return title;
    }
    public int getTotalBook() {
        return totalBook;
    }
    public int getAvailableBook() {
        return availableBook;
    }
    public void borrowBook() {
        if (availableBook > 0) {
            availableBook--;
        }
    }
    public void returnBook() {
        if (availableBook < totalBook) {
            availableBook++;
        }
    }
}
