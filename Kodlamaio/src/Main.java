public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        User user1 = new User(1, "Seyit", "Uludağ");
        userManager.Add(user1);

        InstructorManager instructorManager = new InstructorManager();
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ",
                "Senior Software Developer", "Kodlama.io");
        instructorManager.Add(instructor);
        instructorManager.AddLesson(instructor);


        StudentManager studentManager = new StudentManager();
        Student student = new Student(1,"Burak", "Tağıl", "PHP");
        studentManager.Add(student);



    }
}
