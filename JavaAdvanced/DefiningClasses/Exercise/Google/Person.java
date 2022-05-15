package advanced.DefiningClasses.Exercise.Google;

import java.util.*;

public class Person {
    // 1 company
    private Company company;
    // 1 car
    private Car car;
    // list of parents
    private final List<Parent> parents;
    // list of kids
    private final List<Child> children;
    // list of pokemons
    private final List<Pokemon> pokemons;

    public Person() {
        // null
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Person(Company company, Car car, List<Parent> parents, List<Child> children, List<Pokemon> pokemons) {
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemons = pokemons;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company).append("\n");
        }
        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car).append("\n");
        }
        builder.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            builder.append(pokemon).append("\n");
        }
        builder.append("Parents:").append("\n");
        for (Parent parent : parents) {
            builder.append(parent).append("\n");
        }
        builder.append("Children:").append("\n");
        for (Child child : children) {
            builder.append(child).append("\n");
        }

        return builder.toString();
    }


}





















