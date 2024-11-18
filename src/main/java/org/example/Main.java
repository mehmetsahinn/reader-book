package org.example;

public class Main {
    public static void main(String[] args) {
        Author ilk =new Author();
        ilk.setName("James Clear");
        Book atomicHabits =new Book();
        atomicHabits.setAuthor(ilk);
        atomicHabits.setPage(341);
        atomicHabits.setTitle("Atomic Habits");
        Reader mehmet =new Reader();
        mehmet.setName("Mehmet şahin");
        mehmet.setAge(26);
        mehmet.setSex("man");
        mehmet.readBook(atomicHabits);
        System.out.println(mehmet.books.get(0).author.name +" ****  "+ mehmet.books.get(0).getTitle());

    }
}