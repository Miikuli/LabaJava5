import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class SchoolMap {
    public static List<Integer> countAverageSchool(List<Student> students) {
        double totalMark = 0;
        for (Student student : students) {
            totalMark += student.getMark();
        }
        double districtAverage = totalMark / students.size();

        Map<Integer, List<Integer>> schoolMarks = new HashMap<>();
        for (Student student : students) {
            int schoolNumber = student.getSchoolNumber();
            schoolMarks.putIfAbsent(schoolNumber, new ArrayList<>());
            schoolMarks.get(schoolNumber).add(student.getMark());
        }

        List<Integer> aboveAverageSchools = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : schoolMarks.entrySet()) {
            int schoolNumber = entry.getKey();
            List<Integer> marks = entry.getValue();

            double averageMark = 0;
            for (int mark : marks) {
                averageMark += mark;
            }
            averageMark /= marks.size();

            if (averageMark > districtAverage) {
                aboveAverageSchools.add(schoolNumber);
            }
        }
        return aboveAverageSchools;
    }
}
