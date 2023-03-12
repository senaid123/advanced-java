import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regexStr = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher("12345679adadfdd23234343");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Match found");
        }else{
            System.out.println("Not found");
        }
    }
}