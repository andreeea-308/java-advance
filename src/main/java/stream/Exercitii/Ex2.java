package stream.Exercitii;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Exercise 8: Mapping, Grouping, and Collecting to Map
Given a list of people with their ages, map each person to their age group (e.g., child, adult, senior),
and collect them into a map where the key is the age group and the value is the list of people belonging to that age group.
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static AgeGroup getAgeGroup(int age){
        if (age <= 18)
            return AgeGroup.CHILD;
        else if (age<=65)
            return AgeGroup.ADULT;
        else
            return AgeGroup.SENIOR;
    }
}

enum AgeGroup {
    CHILD, ADULT, SENIOR
}
public class Ex2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 26),
                new Person("Bob", 40),
                new Person("Charlie", 18),
                new Person("David", 55),
                new Person("Eve", 70)
        );

        Map<AgeGroup, List<Person>> ageGroupMap = people
                .stream()
                .collect(Collectors.groupingBy(it -> Person.getAgeGroup(it.getAge())));

        ageGroupMap.forEach((itK, itV)->{
            System.out.println("Age Group: "+ itK);
            itV.forEach(itP -> System.out.println("- "+ itP.getName()+" has "+ itP.getAge()+" years."));
        });

    }
}
