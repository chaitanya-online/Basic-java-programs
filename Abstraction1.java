abstract class Engine{  
    abstract void fuel();  
    }  
    
class Bike extends Engine{  
    void fuel()
    {
        System.out.println("Petrol bike ");
    }  
    } 
    class Abstraction1{  
    public static void main(String args[]){  
    Engine e1=new Bike();
    e1.fuel();  
    }  
    }  
    /*Main aim of the abstract class is it methods (fuel()) 
    dont have any implementation the implementation provided by
    it is derived classes method




    */