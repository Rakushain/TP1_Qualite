package main.isen.library;

public class Person {
    private String name;
    private int years;

    public Person() {
        name = "unknown";
        years = 22;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
