import java.util.Random;  
public class Ranomm {
    public static void main(String[]args)
    {
        Random rand=new Random();
        int randint=rand.nextInt(60);
        System.out.println(randint);
    }
}
