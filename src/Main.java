import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Дроби
        FractionProperties fraction_1 = FractionFactory.createFraction(2, 4);
        System.out.println("Дробь: " + fraction_1);
        System.out.println("Вещественное значение дроби: " + fraction_1.getValue());
        fraction_1.setNumerator(5);
        System.out.println("Изменили числитель на 5: " + fraction_1);
        System.out.println("Вещественное значение измененной дроби 1: " + fraction_1.getValue());
        System.out.println();
        FractionProperties fraction_2 = FractionFactory.createFraction(-7, 3);
        System.out.println("Дробь 2: " + fraction_2);
        System.out.println("Вещественное значение дроби: " + fraction_2.getValue());
        fraction_2.setDenominator(-7);
        System.out.println("Изменили знаменатель на -7: " + fraction_2);
        System.out.println("Вещественное значение измененной дроби: " + fraction_2.getValue());
        System.out.println();

        //Количество мяуканий
        Meowable cat_1 = new Cat("Вася");
        Funs funs = new Funs();
        funs.meowsCare(cat_1);
        System.out.println("Количество мяуканий: " + funs.getCount());
        System.out.println();

        //Списки
        List <Integer> list_1 = List.of(2, 3, 4, 5);
        List <Integer> list_2 = List.of(3, 5, 7);
        List <Integer> listInt = MakeList.makeList(list_1, list_2);
        System.out.println("Первый список: " + list_1);
        System.out.println("Второй список: " + list_2);
        System.out.println("Результат: " + listInt);
        System.out.println();

        List <String> list_3 = List.of("Петя", "Лиза", "Игорь");
        List <String> list_4 = List.of("Петя", "Павел");
        List <String> listString = MakeList.makeList(list_3, list_4);
        System.out.println("Первый список: " + list_3);
        System.out.println("Второй список: " + list_4);
        System.out.println("Результат: " + listString);
        System.out.println();

        //Мап
        String file = "src/students.txt";
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(file))) {
            int N = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < N; i++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String lastName = parts[0];
                String firstName = parts[1];
                int schoolNumber = Integer.parseInt(parts[2]);
                int score = Integer.parseInt(parts[3]);
                students.add(new Student(lastName, firstName, schoolNumber, score));
            }
            System.out.println("Школы с быллами выше среднего: ");
            List<Integer> aboveAverageSchools = SchoolMap.countAverageSchool(students);
            for (int school : aboveAverageSchools) {
                System.out.print(school + " ");
            }
            System.out.println();
        }
         catch (Exception e) {
            System.out.println("Произошла ошибка, попробуйте ещё раз");
        }
        System.out.println();

        //Сет
        String file2 = "src/numbers.txt";
        Set<Integer> numbers = NumberFinder.findNumbers(file2);
        System.out.println("Найденные числа: " + numbers);
        System.out.println();

        //Очередь
        Queue<Integer> queue_1 = new LinkedList<>();
        queue_1.add(1);
        queue_1.add(1);
        queue_1.add(1);
        queue_1.add(4);
        queue_1.add(1);
        queue_1.add(1);
        System.out.println("Очередь: " + queue_1);
        int i = 0;
        int j = 4;
        boolean result_1 = QueueCheck.checkEqual(queue_1, i, j);
        System.out.println("Элементы c " + i + " по " + j + " равны : " + (result_1 ? "Да" : "Нет"));
        System.out.println();

        Queue<String> queue_2 = new LinkedList<>();
        queue_2.add("Петя");
        queue_2.add("Павел");
        queue_2.add("Антон");
        queue_2.add("Антон");
        queue_2.add("Антон");
        System.out.println("Очередь: " + queue_2);
        i = 2;
        j = 4;
        boolean result_2 = QueueCheck.checkEqual(queue_2, i, j);
        System.out.println("Элементы c " + i + " по " + j + " равны : " + (result_2 ? "Да" : "Нет"));
        System.out.println();

        //Стрим
        List<Point> points = Arrays.asList(
                new Point(0, 1),
                new Point(-1, 2),
                new Point(0, 1),
                new Point(1, 2),
                new Point(3, -4),
                new Point(3, -4)
        );
        System.out.println("Точки: " + points);
        Polyline polyline = PointStream.streamPoints(points);
        System.out.println(polyline);
        System.out.println();

        String file3 = "src/people.txt";
        Map<Integer, List<String>> peopleNumbers = PeopleStream.streamPeople(file3);
        System.out.println(peopleNumbers);
    }
}