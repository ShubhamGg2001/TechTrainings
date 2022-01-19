package Day1;
public class SmallestDivisible {
    public static void main(String[] args) {
        int answer=1;
        for(int i=2;i<=9;i++)
            answer=lcm(answer,i);
        System.out.println(answer);
    }
    public static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int higherNumber = Math.max(number1, number2);
        int lowerNumber = Math.min(number1, number2);
        int lcm = higherNumber;
        while (lcm % lowerNumber != 0) {
            lcm += higherNumber;
        }
        return lcm;
    }
}
