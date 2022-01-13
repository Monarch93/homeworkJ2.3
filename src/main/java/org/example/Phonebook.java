package org.example;
import java.sql.SQLOutput;
import java.util.*;

public class Phonebook {

    private static Map<String, List<String>> phoneBook = new LinkedHashMap<>();

    public static void add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            List list = new ArrayList();
            list.add(phoneNumber);
            phoneBook.put(name, list);
        } else {
            if (phoneBook.get(name).contains(phoneNumber)) {
                System.out.println("Номер уже добавлен");
            } else {
                List list = phoneBook.get(name);
                list.add(phoneNumber);
                phoneBook.put(name, list);
            }
        }
    }

    public static void get(String name) {

        if (phoneBook.containsKey(name)) {
            System.out.print(name + ": ");
            for (String number : phoneBook.get(name)) {
                System.out.print(number + "; ");
            }
            System.out.println();
        } else {
            System.out.printf("Неизвестное имя %s\n",name);
        }


    }
}
