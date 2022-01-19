public class Q3 {
    public static void main(String[] args) {
        int n =11;
        int test1 = 0;
        int test2 = n - 1;
        if (n > 4 && (n % 2 != 0)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == test1)
                        System.out.print("\\");
                    else if (j == test2)
                        System.out.print("/");
                    else
                        System.out.print("*");
                }
                test1++;
                test2--;
                System.out.println();
            }
        } else
            System.out.println("Invalid Input");
    }
}
