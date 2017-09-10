package model;

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
