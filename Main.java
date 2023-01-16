class Chicken{
  private String name;
  private int tag;
  public Chicken(){ // A constructor can also take parameters, just as methods. This constructor doesn't accept parameter.
    System.out.println("First Constructor is running!");
    name = "pek";
    System.out.println("Hello world!"+name);
  }
  
  public Chicken(String newName){//this can work just like set method.
    this.name = newName;
    System.out.println("Second Constructor is running!");
    
  }
  public Chicken(String name, int tag){
    this.name = name;
    this.tag = tag;
    System.out.println("Third Constructor is running!");
  }
}

class Main {
  public static void main(String[] args) {
    
    Chicken chik1 = new Chicken();//This constructor doesn't accept parameter.
    new Chicken(); // This can create a new object. This is the important bit for invoking a constructor.

    Chicken chik2 =new Chicken("Jk");

    Chicken chik3 =new Chicken("Tom",8);
  }
}