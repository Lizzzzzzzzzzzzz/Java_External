package Java;

public class Book {
    private String author;
    private String name;
    private String publishingHouse;
    private int publishingYear;
    private int countOfPages;
    private int price;

    public Book(String author, String name, String publishingHouse, int publishingYear, int countOfPages, int price) {
        this.author = author;
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.countOfPages = countOfPages;
        this.price = price;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPublishingHouse() { return publishingHouse; }

    public void setPublishingHouse(String publishingHouse) { this.publishingHouse = publishingHouse; }

    public int getPublishingYear() { return publishingYear; }

    public void setPublishingYear(int publishingYear) { this.publishingYear = publishingYear; }

    public int getCountOfPages() { return countOfPages; }

    public void setCountOfPages(int countOfPages) { this.countOfPages = countOfPages; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}
