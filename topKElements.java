import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class topKElements {
    /*
    Given an integer array nums, and an integer k, return the k most frequent elements, answer in any order
    
    input= [1,1,1,2,2,3], k=2
    output= [1,2]
    */
   public static void main(String[] args) {
    int[] ans = {1,1,1,2,2,3};

    System.out.println(Arrays.toString(topElements(ans, 2)));
   }
   public static int[] topElements(int[] nums, int k) {
    if (nums.length == k) return nums;

    Map<Integer, Integer> ansMap = new HashMap<>();

    for (int n: nums) {
        ansMap.put(n, ansMap.getOrDefault(n, 0) +1);
    }
    Queue<Integer> heap = new PriorityQueue<>(
        (a,b) -> ansMap.get(a) - ansMap.get(b)
    );

    for (int n:ansMap.keySet()) {
        heap.add(n);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    int[] ans = new int[k];
    for(int i=0; i < k; i++) {
        ans[i] = heap.poll();
    }

    return ans;
   }
}
