package org.okten.hw4.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users= new HashSet<>();
//        users.add(new User(1, "Max", Arrays.asList(new Skill("Js"), new Skill("Java")),Gender.MALE));
//        users.add(new User(2, "Marina", Arrays.asList(new Skill("Python"), new Skill("Java")),Gender.FEMALE));
//        users.add(new User(1, "Karina", Arrays.asList(new Skill("CSS"), new Skill("Java")),Gender.FEMALE));

//        users.removeIf(user -> user.getGender() == Gender.MALE);
//        System.out.println(users);

        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1, "Max", Arrays.asList(new Skill("Js"), new Skill("Java")),Gender.MALE));
        users.add(new User(2, "Marina", Arrays.asList(new Skill("Python")),Gender.FEMALE));
        users.add(new User(1, "Karina", Arrays.asList(new Skill("CSS"), new Skill("HTML"), new Skill("React")),Gender.FEMALE));
        System.out.println(users);
    }
}
