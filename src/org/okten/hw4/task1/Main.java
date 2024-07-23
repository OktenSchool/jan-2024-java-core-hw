package org.okten.hw4.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
          new User("Max", 16),
          new User("Karina", 20),
          new User("Albina", 17),
          new User("Olha", 13),
          new User("Kokos", 18)
        );

//        users.sort((o1, o2) -> o1.getAge()-o2.getAge());
//        users.sort(Comparator.comparingInt(User::getAge));
//        users.sort((o1, o2) -> o1.getName().length()-o2.getName().length());
//        users.sort(Comparator.comparingInt(o -> o.getName().length()));
//        System.out.println(users);
        List<String> words = Arrays.asList("Karina", "Albina", "Olha", "Kokos", "Oleh", "Nazar");
//        words.sort((o1, o2) -> o1.compareTo(o2));
        words.sort(String::compareTo);
        System.out.println(words);
    }
}
