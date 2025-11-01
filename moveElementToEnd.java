import java.util.ArrayList;
import java.util.List;

public class moveElementToEnd {
    /*
    Given an array of integers and an integer representing a target element, write a function that moves all instances of that target element to the end of the array.
    The function should modify the input array in place and does not need to return anything.
    */
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(2, 1, 2, 2, 3, 4, 2, 5));
        int target = 2;
        moveElementToEnd(array, target);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void moveElementToEnd(List<Integer> array, int target) {
        // TODO Auto-generated method stub
        int j = array.size() - 1;
        int i = 0, temp;
        while (i < j) {
            temp = array.get(j);
            if (temp == target) {
                j--;
                continue;
            } 
            if (array.get(i) == target) {
                array.set(j, target);
                array.set(i, temp);
                j--;
            }
            i++;
        }
    }
    
}
