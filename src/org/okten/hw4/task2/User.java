package org.okten.hw4.task2;

import java.util.List;
import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private List<Skill> skills;
    private Gender gender;
    public User() {
    }

    public User(int id, String name, List<Skill> skills, Gender gender) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() && Objects.equals(getName(), user.getName()) && Objects.equals(getSkills(), user.getSkills()) && getGender() == user.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSkills(), getGender());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size()-o.skills.size();
    }
}

