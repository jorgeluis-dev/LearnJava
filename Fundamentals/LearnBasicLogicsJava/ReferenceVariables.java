import java.util.Arrays;

public class ReferenceVariables {
    public static void main(String[] args) {
        // Example String
        String isString = new String("String is an object");
        System.out.println(isString);
        
        //Example Array type primitive int
        int[] thisArrayContainsOnlyIntegers = new int[]{1, 2, 3, 4, 5};
        System.out.println("Just Integers: "+Arrays.toString(thisArrayContainsOnlyIntegers));

        //Example Array type primitive char
        char[] thisArrayContainsOnlyCharacters = new char[]{'A', 'a', 'b', 'C'};
        System.out.println("Just Characters: "+Arrays.toString(thisArrayContainsOnlyCharacters));

        //Example Array type Object String
        String[] thisArrayContainsOnlyStrings = {"Java", "is", "Good"};
        System.out.println("Just Strings: "+Arrays.toString(thisArrayContainsOnlyStrings));
    }
}
