import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleArray {
    public static void main(String[] args) 
    {
        int originalArray[] = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>();
        for (int value : originalArray)
         {
            list.add(value);
        }
        Collections.shuffle(list);
        for (int i = 0; i < originalArray.length; i++) 
        {
            originalArray[i] = list.get(i);
        }
        for (int value : originalArray) 
        {
            System.out.print(value + " ");
        }
    }
}
