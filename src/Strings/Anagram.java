package Strings;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Give 1st word");
        String word1 = sc.next();
        System.out.println("Give 2nd word");
String word2 = sc.next();
int count = 0;
if(word1.length() == word2.length()) {
    for (int i = 0; i < word1.length(); i++) {

        for( int j = 0; j <= word2.length()-1; j++) {
            if (word1.charAt(i) == word1.charAt(j)) {
                count++;
            }
        }
for (int k = 0; k <= word2.length()-1; k++){

    if(word1.charAt(i) == word2.charAt(k)){
        count--;
    }

}

if(count > 0){
    System.out.println("Not an anagram");
    break;
}


    }

    if(count == 0){
        System.out.println("Given 2 words are anagram");
    }
}
else {
    System.out.println("Lengths of given words not matching, so not an anagram");
}
    }
}
