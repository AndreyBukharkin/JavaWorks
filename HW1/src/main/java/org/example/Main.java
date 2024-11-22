package org.example;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        List<String> addString = new ArrayList<>();

        while(!words.isEmpty()){
            addString.add(words);
            words = scanner.nextLine();
        }

        System.out.println(guavaCountWordsClassExample(addString, scanner.nextLine()));
    }

    static int guavaCountWordsClassExample(List<String> words, String countOfWords){
        Multiset<String> multiset = HashMultiset.create();
        multiset.addAll(words);
        return multiset.count(countOfWords);
    }
}