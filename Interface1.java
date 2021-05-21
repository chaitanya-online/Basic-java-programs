interface Laptop {
    void company();

}
class Brand implements Laptop{
    public void company()
    {
        System.out.println("Hp");
    }
}
public class Interface1{


public static void main(String[]args) {
    Brand b=new Brand();
    b.company();
}}