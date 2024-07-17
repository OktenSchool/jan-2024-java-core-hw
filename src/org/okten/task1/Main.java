package org.okten.task1;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("book1"),
                new Book("book2"),
                new Book("book3"),
                new Book("book4"),
                new Magazine("magazine1"),
                new Magazine("magazine2"),
                new Magazine("magazine3"),
                new Magazine("magazine4"),
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
