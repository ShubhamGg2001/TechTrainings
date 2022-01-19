package Day1;
public class smallestPrime {
    public static void main(String[] args) {
        int n = 100;
        int answer = 0;
        int test = n - 1;
        boolean flag = false;
        while (flag != true) {
            if (checkPrime(test)) {
                flag = true;
                answer = test;
            } else
                test--;

        }
        System.out.println(answer);
    }

    public static boolean checkPrime(int number) {

        String s = number + "";
        int i = 0;
        while (i < s.length()) {
            if (checkPrimeOnly(s.charAt(i) + ""))
                i++;
            else
                break;
        }
        if (i == (s.length()))
            return true;
        else
            return false;

    }

    public static boolean checkPrimeOnly(String n) {
        int number = Integer.parseInt(n);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
