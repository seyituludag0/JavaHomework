public class Student extends User {
    String lesson;

    public Student(int id, String firstName, String lastName, String lesson) {
        super(id, firstName, lastName);
        this.lesson = lesson;
    }
}
