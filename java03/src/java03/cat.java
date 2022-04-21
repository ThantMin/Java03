package java03;

public class cat {
    String name;
    int age;
    String color;
    
    //Constructor
    public cat(String name,int age,String color) {
        this.name=name;
        this.age=age;
        this.color=color;
    }
  //method
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getAge() {
        return age;
    }
    
    public String toString() {
        return("Name is "+this.getName()+"Age is "+this.getAge()+"Color is "+this.getColor());
    }
    
    public static void main(String args[]) {
        cat pop = new cat("pop",3,"white");
        System.out.println(pop);
    }
}
