import java.util.HashSet;
import java.util.Set;

public class listDupes {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5};

        System.out.println(checkDupes(arr));
    }

    public static boolean checkDupes(int[] arr) {
        Set<Integer> dupes = new HashSet<>();

        for(int item: arr) {
            if (dupes.contains(item)) {
                return true;
            } else {
                dupes.add(item);
            }
        }
        return false;
    }
}