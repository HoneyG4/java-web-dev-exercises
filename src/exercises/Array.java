package exercises;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] IntergerArray = {1, 1, 2, 3, 5, 8};
       for(int Interger : IntergerArray) {
           if ( Interger %2 != 0){
               System.out.println(Interger);
               continue;
           }

        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" \\. ");
        System.out.println(Arrays.toString(words));


    }
}

