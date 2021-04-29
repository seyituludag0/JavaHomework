public class StudentManager extends UserManager {
    public void Add(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " eklendi");
    }
    public void Update(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " güncellendi");
    }

    public void Delete(Student student){
        System.out.println(student.getFirstName() + " " +  student.getLastName() + " silindi");
    }
}
