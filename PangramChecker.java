import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String str) 
    {
        str = str.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }
    public static void main(String[] args) 
    {
        String input = "The quick brown fox jumps over the lazy dog";
        if (isPangram(input))
         {
            System.out.println("The input is a pangram.");
        } 
        else 
        {
            System.out.println("The input is not a pangram.");
        }
    }
}
