package org.example;

public class Book {
    Author author;
    String title;
    int page;
    String type;
    Boolean isHardCover;
    int currentPage;
    Book(Author author, String title, int page){
        this.author=author;
        this.title=title;
        this.page=page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHardCover() {
        return isHardCover;
    }

    public void setHardCover(Boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
