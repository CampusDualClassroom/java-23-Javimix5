package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> personas = new HashMap<>();
        personas.put("person", new Person("John", "Smith"));
        personas.put("teacher", new Teacher("María", "Montessori", "Educación"));
        personas.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        personas.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return personas;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            entry.getValue().getDetails();
        }

    }

    public static void main(String[] args) {
        Map<String, Person> personas = createHashMap();
        printMapValues(personas);

        System.out.println(" ");
        Person newPerson = new PoliceOfficer("Charles", "Boyle", "B-99");
        addMapValue(personas, "B-99", newPerson);
        System.out.println("After adding a new person:");
        printMapValues(personas);

    }
}
