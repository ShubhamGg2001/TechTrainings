package Day1;

import java.util.regex.Pattern;


import java.util.regex.Pattern;

public class Matches{
public static void main(String[] args) {
    String regex = "\\b(https?|ftp|file)://[-A-Z0-9+&@#/%?=~_|!:,.;]*[-A-Z0-9+&@#/%=~_|]";
    String text = "http://google.com";
    System.out.println(IsMatch(text,regex));
}
private static boolean IsMatch(String s, String pattern) {
    try {
        Pattern patt = Pattern.compile(pattern);
        java.util.regex.Matcher matcher = patt.matcher(s);
        return matcher.matches();
    } catch (RuntimeException e) {
    return false;
}       
}   
}
