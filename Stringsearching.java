package Java;
public class Stringsearching {
    public static void main(String[] args) {
        String name="Abhishek";
        char target = 'i';
        search(name, target);

    }

    static boolean  search(String name, char target) {
        
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }            
        }
        return false;
       }

       static boolean  search1(String name, char target) {
        
        if(name.length()==0){
            return false;
        }
        for(char element:name.toCharArray()){
            if(element==target){
                return true;
            }
        }           
        return false;
       }

}
