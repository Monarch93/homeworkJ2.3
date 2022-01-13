package org.example;
import java.util.ArrayList;
import java.util.List;

public class WordsArray {

    private static List<String> wordsList = new ArrayList<>();

    static {
        wordsList.add("Java");
        wordsList.add("JavaScript");
        wordsList.add("C#");
        wordsList.add("Python");
        wordsList.add("C");
        wordsList.add("C++");
        wordsList.add("Java");
        wordsList.add("Fortran");
        wordsList.add("Go");
        wordsList.add("C#");
        wordsList.add("Java");
        wordsList.add("PHP");
        wordsList.add("PHP");
        wordsList.add("Scratch");
        wordsList.add("SQL");
        wordsList.add("JavaScript");
        wordsList.add("C++");
        wordsList.add("Python");
    }

    public static List<String> getWordsList() {
        return wordsList;
    }

    static List<String> uniqueWords() {

        List<String> uniqueWords = new ArrayList<>();
        for (String ln: wordsList) {
            if(!uniqueWords.contains(ln)) {
                uniqueWords.add(ln);
            }
        }
        return uniqueWords;
    }

    public static void numberWords() {
        List<String> unique = uniqueWords();
        int cost = 0;
        for (String ln: unique) {
            cost = 0;
            for (String tmp: wordsList) {
                if(ln.equals(tmp)){
                    cost++;
                }
            }
            System.out.printf("слово %s встречается %d раз(а)\n", ln, cost);
        }

    }
}
