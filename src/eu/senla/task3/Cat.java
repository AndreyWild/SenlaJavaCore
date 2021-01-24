package eu.senla.task3;

import java.util.Objects;

public class Cat {
    private String name = "Fluffy";
    private int age = 3;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                name.equals(cat.name);
    }

    @Override
    public String toString() {
        return "The cat named " + name + " is " + age + " years old.";
    }

}
