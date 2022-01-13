package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(WordsArray.getWordsList() + " - Массив слов");
        System.out.println(WordsArray.uniqueWords() + " - Уникальные слова");
        WordsArray.numberWords();

        System.out.println("\n*********************\n");

        Phonebook.add("Игорь", "89236661512");
        Phonebook.add("Крабичигоръ", "89236661512");
        Phonebook.add("Крабич", "89059541212");
        Phonebook.add("Кот", "89236661512");

        Phonebook.get("Игорь");
        Phonebook.get("Кот");
        Phonebook.get("Котики");
        Phonebook.get("Крабичигоръ");
        Phonebook.add("Крабичигорь", "89236661512");
        Phonebook.get("Крабичигорь");
    }
}