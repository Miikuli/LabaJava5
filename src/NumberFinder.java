import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import static java.lang.Character.getNumericValue;

public class NumberFinder {
    public static Set<Integer> findNumbers(String file) {
        Set<Integer> numbers = new HashSet<>();
        StringBuilder textBuilder = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                textBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка, попробуйте ещё раз");
        }
        String text = textBuilder.toString();
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(getNumericValue(ch));
            }
        }
        return numbers;
    }
}
