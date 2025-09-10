package org.zeta.batch4.java.assignment.iteratorsAndComparators;

public class Book{
    private String bookName;
    private String authorName;
    private int year;

    public Book(String bookName, String authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "[Name : "+bookName+" Author : "+authorName+" Published Year : "+year+"]";
    }
}
