import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class PeopleStream {
    public static Map<Integer, List<String>> streamPeople(String file) {
        try (Scanner scanner = new Scanner(new File(file))) {
            Map<Integer, List<String>> groupedNames;

            groupedNames = scanner.tokens()
                    .map(line -> line.split(":"))
                    .filter(parts -> parts.length == 2)
                    .filter(parts -> {
                        try {
                            Integer.parseInt(parts[1].trim());
                            return true;
                        } catch (NumberFormatException e) {
                            return false;
                        }
                    })
                    .collect(Collectors.groupingBy(
                            parts -> Integer.parseInt(parts[1].trim()),
                            Collectors.mapping(
                                    parts -> Character.toUpperCase(parts[0].trim().charAt(0)) + parts[0].trim().substring(1).toLowerCase(),
                                    Collectors.toList()
                            )
                    ));
            return groupedNames;
        }
        catch (Exception e) {
            System.out.println("Произошла ошибка");
            return null;
        }
    }
}