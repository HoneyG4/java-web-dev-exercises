package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What word would you like to locate? : ");
        String searchTerm = input.nextLine();
        boolean ind = firstSentence.contains(searchTerm);
        System.out.println(ind);



        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);


    }

}
