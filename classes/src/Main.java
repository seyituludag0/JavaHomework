public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.id = 1;
        course1.name ="Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";

        Course course2 = new Course(2,"Programlamaya Giriş için Temel Kurs");

        Course[] courses = { course1, course2};

        for (Course course:courses) {
            System.out.println(course.name);
        }
        System.out.println("Toplam Kurs Sayısı: " + courses.length);

        CourseManager courseManager = new CourseManager();
        courseManager.Add(course1);

//        courseManager.Delete(course2);
    }
}
