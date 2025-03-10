package exercises;
import java.util.HashMap;
import java.util.Map;
public class NumCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> storage = new HashMap<>();
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = phrase.toCharArray();

        for (char character : charactersInString) {

            Integer integer = storage.get(character);

            if (!storage.containsKey(character))
                storage.put(character, 1);

            else {
                storage.put(character, integer + 1);
            }
        }



    }
}


