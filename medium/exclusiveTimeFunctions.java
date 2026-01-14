package medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class exclusiveTimeFunctions {
    /*
    You are given the number of functions n and a list of logs. Each log is a string with this format: "function_id:start_or_end:timestamp".
    Each function has a unique ID between 0 and n-1.
    A function can be called recursively or by another function.
    Your task is to find the exclusive time of each function. The exclusive time of a function is the time spent within this function, excluding the time spent by calling other functions.
    Return the exclusive time of each function in an array where the value at index i represents the exclusive time for the function with ID i.
    Example:
    Input: n = 2, logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
    Output: [3,4]
    Explanation:
    Function 0 starts at time 0, then it calls function 1 at time 2.
    Function 1 starts at time 2 and ends at time 5. So, function 1's exclusive time is 5 - 2 + 1 = 4. 
    Function 0 resumes at time 6 and ends at time 6. So, function 0's exclusive time is (6 - 0 + 1) - (5 - 2 + 1) = 3.
    */
   public static void main(String[] args) {
    exclusiveTimeFunctions obj = new exclusiveTimeFunctions();
    int n = 2;
    List<String> logs = List.of("0:start:0","1:start:2","1:end:5","0:end:6");
    int[] result = obj.exclusiveTime(n, logs);
    for (int time : result) {
        System.out.print(time + " ");
    }
   }
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String type = parts[1];
            int currentTime = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += currentTime - prevTime;
                }
                stack.push(functionId);
                prevTime = currentTime;
            } else { 
                int finishedFunction = stack.pop();
                result[finishedFunction] += currentTime - prevTime + 1;
                prevTime = currentTime + 1;
            }
        }

        return result;
    }
}