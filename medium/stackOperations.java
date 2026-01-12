package medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class stackOperations {
    /*
    Given an array target and an integer n. In each iteration, you will read a number from 1 to n.
    Build the target array using the following operations:
    "Push": Read a new element from the beginning of the list.
    "Pop": Remove the last element of the list.
    If the target array is already built, stop reading more elements.
    Return the operations to build the target array.
    You are guaranteed that the answer is unique.
    Example:
    Input: target = [1,3], n = 3
    Output: ["Push","Push","Pop","Push"]
    */
   public static void main(String[] args) {

    stackOperations obj = new stackOperations();
    int[] target = {1,3};
    int n = 3;
    List<String> result = obj.buildArray(target, n);
    for (String res: result) {
        System.out.print(res + " ");
    }
   }
    public List<String> buildArray(int[] target, int n) {
        // O(n) time complexity, O(n) space complexity
        List<String> operations = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int targetIndex = 0;

        for(int currNum=1; currNum <= n; currNum++) {
            operations.add("Push");
            stack.push(currNum);

            if (currNum == target[targetIndex]) {
                targetIndex++;
                if (targetIndex == target.length) {
                    break;
                }
            }else {
                operations.add("Pop");
                stack.pop();
            }
        }
        return operations;
        
    }
    public List<String> buildArray2(int[] target, int n) {
        // Optimized approach. O(m) time complexity, O(m) space complexity where m is the length of target array.
        List<String> ans = new ArrayList();
        int i = 0;
        
        for (int num : target) {
            while (i < num - 1) {
                ans.add("Push");
                ans.add("Pop");
                i++;
            }
            
            ans.add("Push");
            i++;
        }
        
        return ans;
    }
}
