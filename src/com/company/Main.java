package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = scan.nextLine().toLowerCase(); // Convert the user input to lower case
        sentence = sentence.replaceAll("\\p{Punct}", ""); // Remove all special characters from the user input
        String[] words = sentence.split(" ");   //Split the sentence into separate words

        var countRepeatedWord = new HashMap<String, Integer>(); // Create a hashmap

        for (String w : words) {
            if (countRepeatedWord.containsKey(w)) {
                countRepeatedWord.put(w, countRepeatedWord.get(w) + 1);     //Calculate how many times a word appears in the array
            } else {
                countRepeatedWord.put(w, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new LinkedList<Map.Entry<String, Integer>>(countRepeatedWord.entrySet()); // create a linked list
        Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {     // sort the linked list
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());     //
            }
        });

        for (Map.Entry<String, Integer> item : sortedList) {       //Print the sorted list in the console
            System.out.println(item);
        }
    }
}




