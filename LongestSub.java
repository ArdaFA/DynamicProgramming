import java.util.HashMap;
import java.util.HashSet;

public class LongestSub {

    static int lengthOfLongestSubString(String s){
        HashSet<Character>  characters = new HashSet<Character>();

        String newString = "";

        for (int i = 0; i < s.length(); i++){
            if(!characters.contains(s.charAt(i))){
                characters.add(s.charAt(i));
                newString += s.charAt(i);
            }
        }

        System.out.println("output: " + newString.length());
        System.out.print(newString);

        return characters.size();
    }

    public static void main(String args[]){

        lengthOfLongestSubString("aabbcc");
    }
}
