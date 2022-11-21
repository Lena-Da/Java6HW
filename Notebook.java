public class Notebook{
    Integer id;
    String brand;
    String os;
    Integer ram;
    Integer price;
    String color;

    public void data(Integer id, String brand, String os, Integer ram, Integer price, String color){
        this.id=id;
        this.brand=brand;
        this.os=os;
        this.ram=ram;
        this.price=price;
        this.color=color;
    }

    @Override
    public String toString(){
        return String.format("ID: %s %nBrand: %s %nOS: %s %nRAM: %s %nPrice: %s %nColor: %s %n", id, brand,os,ram,price,color);
    }
}