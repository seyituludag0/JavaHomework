public class UserManager {
    public void List(){
        System.out.println("Listelendi");
    }

    public void Add(User user){
        System.out.println(user.getFirstName() + " "  + user.getLastName() + " eklendi");
    }
    public void Update(User user){
        System.out.println(user.getFirstName() + " "  + user.getLastName() + " güncellendi");
    }

    public void Delete(User user){
        System.out.println(user.getFirstName() + " "  + user.getLastName()  + " silindi");
    }
}
