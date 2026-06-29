package Java;
class human{
    private int age;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getage(){
        return age;
    }
    public void setage(int a){
        age = a;
    }


}

public class GetterandSetter {
    

    public static void main(String args[]){

        human obj = new human();
        obj.setName("jjsdh");
        obj.setage(111); 

        
    }
}
