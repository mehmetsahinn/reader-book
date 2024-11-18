package org.example;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    String name;
    int age;
    String sex;
    List<Book> books = new ArrayList<>();
    public void readBook(Book book) {
        books.add(book);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
