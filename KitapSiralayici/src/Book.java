

public class Book {
    private String name;
    private String authorName;
    private int totalPages;
    private int publishDate;

    Book(String name, String authorName, int totalPages, int publishDate) {
        this.name = name;
        this.authorName = authorName;
        this.totalPages = totalPages;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate() {
        this.publishDate = publishDate;
    }
}
