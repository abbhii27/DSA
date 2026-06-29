package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

   class Student{
        private String name;
        private int age;

            public Student(int age, String name) {
                this.age = age;
                this.name = name;
            }


        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
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

public class Comparator1{
    public static void main(String[] args) {
        Comparator<Student> comp = new Comparator<Student>(){
        public int compare(Student a, Student b){
            if(a.getAge() > b.getAge()){
                return 1;
            } else 
                return -1;
        }
    };


    // List<Integer> list = new ArrayList<>();
    // list.add(12);
    // list.add(23);
    // list.add(34);
    // list.add(45);

    List<Student> stud= new ArrayList<>();
    stud.add(new Student(21,"john"));
    stud.add(new Student(20,"doe"));
    stud.add(new Student(22,"unom"));
    stud.add(new Student(21,"masuda"));

    for(Student s : stud){
        System.out.println(s);
    }
    


    
    
    
    // Collections.sort(list, comp);
    // System.out.println(list);

    }
}