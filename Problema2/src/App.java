import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        String[] strings = new String[]{
            "12 might 45% internship 2022",
            "array of 5 elements",
            "best fo[23]%6c abc 45"
        };

        System.out.println(SolveProblem2(strings));
    }

    private static List<Integer> SolveProblem2(String[] strings) {
        //  we will chosse a treeSet because it keeps our elements unique 
        // and it keeps them sorted at the same time.
        TreeSet<Integer> treeSet = new TreeSet<>(); 

        for(String string : strings)
        {
            List<Integer> number_list = getNumberFromString(string);
            number_list.stream()
                .forEach(x -> treeSet.add(x));
        }

        return treeSet.stream().collect(Collectors.toList());
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
