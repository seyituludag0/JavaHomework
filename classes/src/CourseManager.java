

public class CourseManager {
    public void Add(Course course) {
        System.out.println(course.name + " eklendi");
    }

    public void Delete(Course course) {
        System.out.println(course.id + " Id' li " + course.name + " silindi");
    }
}


