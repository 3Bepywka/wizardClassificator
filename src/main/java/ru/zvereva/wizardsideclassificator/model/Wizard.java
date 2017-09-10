package ru.zvereva.wizardsideclassificator.model;

public class Wizard {

    private final String name;
    private final Gender gender;
    private final int age;
    private final MagicWand magicWand;
    private final Faculty faculty;
    private final ExceptionalAbility exceptionalAbility;

    public Wizard(String name, Gender gender, int age, MagicWand magicWand, Faculty faculty, ExceptionalAbility exceptionalAbility) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.magicWand = magicWand;
        this.faculty = faculty;
        this.exceptionalAbility = exceptionalAbility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wizard wizard = (Wizard) o;

        if (age != wizard.age) return false;
        if (name != null ? !name.equals(wizard.name) : wizard.name != null) return false;
        if (gender != wizard.gender) return false;
        if (magicWand != wizard.magicWand) return false;
        if (faculty != wizard.faculty) return false;
        return exceptionalAbility == wizard.exceptionalAbility;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (magicWand != null ? magicWand.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (exceptionalAbility != null ? exceptionalAbility.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", magicWand=" + magicWand +
                ", faculty=" + faculty +
                ", exceptionalAbility=" + exceptionalAbility +
                '}';
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public MagicWand getMagicWand() {
        return magicWand;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public ExceptionalAbility getExceptionalAbility() {
        return exceptionalAbility;
    }
}
