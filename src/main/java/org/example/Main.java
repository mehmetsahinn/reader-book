package org.example;

public class Main {
    public static void main(String[] args) {
        Author ilk =new Author("james clear");
        Book atomicHabits =new Book(ilk,"Atomic Habits",341);
        Reader mehmet =new Reader("mehmet",26,"man");
        mehmet.readBook(atomicHabits);
        System.out.println(mehmet.books.get(0).author.name +" ****  "+ mehmet.books.get(0).getTitle());

   }
}