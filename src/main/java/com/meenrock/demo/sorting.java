package com.meenrock.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class sorting {
    public static List<Person> sortingPerson() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(30, "Hello", "Art", "Male"));
        persons.add(new Person(25, "Hello", "World", "Female"));
        persons.add(new Person(40, "AFirst", "ZLast", "Male"));

        // sorting with comparator
        // Collections.sort(persons, Comparator.comparing(Person::getFirstname).thenComparing(Person::getLastname));

        // group by gender map
        // Map<String, List<Person>> genderGrouping = groupByGender(persons);

        List<Person> personOver30 = findAgePerson(30,persons);

        //return genderGrouping;
        //return persons;
        return personOver30;
    }

    public static Map<String, List<Person>> groupByGender(List<Person> persons) {
        Map<String, List<Person>> result = new HashMap<>();

        for (Person person : persons) {
            String gender = person.getGender();
            result.computeIfAbsent(gender, k -> new ArrayList<>()).add(person);
        }

        return result;
    }

    public static List<Person> findAgePerson(int age,List<Person> persons) {
        List<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() >= age) {
                result.add(person);
            }
        }

        return result;
    }

}
class Person {
    private int age;
    private String firstname;
    private String lastname;
    private String gender;

    // Person properties
    public Person(int age, String firstname, String lastname, String gender) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // to obj string
    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

