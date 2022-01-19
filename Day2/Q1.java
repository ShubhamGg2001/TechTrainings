public class Q1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 9, 4, 4, 5, 6, 5 };
        for (int element : removeDuplicates(array))
            System.out.println(element);
    }

    public static int[] removeDuplicates(int[] values) {
        String string = "";
        string = string + values[0];
        for (int i = 1; i < values.length; i++) {
            if (!string.contains(values[i] + ""))
                string = string + values[i];
        }
        int[] answer = new int[string.length()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = Integer.parseInt(string.charAt(i) + "");
        return answer;

    }

}
