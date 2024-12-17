public class Student {
    private String lastName;
    private String firstName;
    private int schoolNumber;
    private int mark;

    public Student(String lastName, String firstName, int schoolNumber, int mark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.schoolNumber = schoolNumber;
        this.mark = mark;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Студент: " + lastName + " " + firstName + " из школы №" + schoolNumber + " с количеством баллов: " + mark;
    }
}
