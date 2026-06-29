package Java;
class Human{
    private int age;
    private String name;
    
    public Human() { //defulat constructor
        age = 11;
        name= "jbjada";
    }
    
    public Human(int age, String name) {          //Parametarized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Constructor {
    
     public static void main(String args[]){
    Human obj = new Human();
    Human obj1 = new Human();
    System.out.println(obj.getAge()+ obj.getName());
    System.out.println(obj1.getAge() + obj1.getName());
    // obj.setAge(20);
    // obj.setName("reddy");
    }
}
