public class Callingmethod {
    static   void Message()
    {
        System.out.println("This is static method hence printed directly without calling by object");

    }
    void Show()
    {
        System.out.println("This is Non- static method hence printed calling by object");
 
    }
    public static void main(String[] args)   {
        //Creating an object
    Callingmethod cm=new Callingmethod();
    //Calling method using object
    Message();  
    cm.Show(); 
    }



}
