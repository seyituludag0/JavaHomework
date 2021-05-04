package Entities;

public class Campaign {
    private int id;
    private String name;
    private int discount;

    public Campaign(){

    }

    public Campaign(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }
}
