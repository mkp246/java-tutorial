package oop;

public class Book{
    private String name;
    private String contents;
    private int publishingYear;

    public Book(String name, String contents, int publishingYear) {
        this.name = name;
        this.contents = contents;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }
}
