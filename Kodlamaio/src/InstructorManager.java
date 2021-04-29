public class InstructorManager extends UserManager{
    public void List(){
        System.out.println("Listelendi");
    }
    public void Add(Instructor instructor){
        System.out.println(instructor.getFirstName()  + " " +  instructor.getLastName()  + " eklendi");
    }

    public void Update(Instructor instructor){
        System.out.println(instructor.getFirstName()  + " " + instructor.getLastName()  + " güncellendi");
    }

    public void AddLesson(Instructor instructor){
        System.out.println(instructor.getFirstName() + " "  + instructor.getLastName()  + "'in dersi eklendi");
    }

    public void DeleteLesson(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName()  + "'in dersi silindi");
    }
}
