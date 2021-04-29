public class Instructor extends User{
    private String profession;
    private String workplace;

    public Instructor(int id, String firstName, String lastName, String profession, String workplace) {
        super(id, firstName, lastName);
        this.profession = profession;
        this.workplace = workplace;
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
