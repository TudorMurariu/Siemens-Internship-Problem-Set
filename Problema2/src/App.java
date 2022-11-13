import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(getNumberFromString("12 might 45% internship 2022"));
    }

    private static List<Integer> getNumberFromString(String text) {
        String[] words = text.split("\\s"); // splits by whitespaces
        List<Integer> numbers = new ArrayList<>();

        for(String word : words)
        {
            Pattern digit_pattern = Pattern.compile("\\d"); // digit
            Matcher matcher = digit_pattern.matcher(word);

            int number = 0;
            boolean any_digit = false;
            while(matcher.find()) // we iterate to find all the digits in the word
            {
                any_digit = true;
                number = number * 10 + matcher.group().charAt(0) - '0';
            }
            
            if(any_digit)
                numbers.add(number);
        }

        return numbers;
    }
}
