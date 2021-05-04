public class Main {
    int x;
  
    public Main(int y) {
      x = y;
    }
  public class T {

    public  void main(String[] args) {
      Main myObj = new Main(5);
      System.out.println(myObj.x);
    }
  }
}