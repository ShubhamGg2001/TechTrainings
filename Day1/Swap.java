package Day1;
public class Swap {
    public static void main(String[] args) {
        int n=23450;
        int test=n;
        int count=0;
        while(test!=0)
        {
            test=test/10;
            count++;
        }
        int last=n%10;
        int number=last;
        int first=n/(int)(Math.pow(10, count-1));
        int bnumber=(int)(n%(Math.pow(10, count-1)));
        int swap=number*((int)Math.pow(10, count-1))+bnumber-last+first;
        System.out.println(swap);
    }
}
