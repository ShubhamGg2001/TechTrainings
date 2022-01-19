import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int[] array = { 1, 2,6 };
        int target = 9;
        Arrays.sort(array);
        List<int[]> list = new ArrayList<>();
        // list.add(new int[]{1,2,4});
        for (int i = 0; i < array.length - 2; i++) {
            int first = i;
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                if ((array[first] + array[left] + array[right]) > target)
                    right--;
                else if ((array[first] + array[left] + array[right]) < target)
                    left++;
                else {

                    list.add(new int[] { array[first], array[left], array[right] });
                    left++;
                    right--;
                }
            }
        }
        int[][] a = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
