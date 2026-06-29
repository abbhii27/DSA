package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
        private String name;
        int age;

            public Student(int age, String name) {
                this.age = age;
                this.name = name;
            }


        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }

    }

public class Comparator2 {
    public static void main(String[] args) {
        
        Comparator<Student> comp = (a, b) ->{ return a.age > b.age ? 1: -1;
            // if(a.getAge() > b.getAge()){
            //     return 1;
            // } else 
            //     return -1;
        
        };


    List<Student> stud= new ArrayList<>();
    stud.add(new Student(21,"john"));
    stud.add(new Student(20,"doe"));
    stud.add(new Student(22,"unom"));
    stud.add(new Student(21,"masuda"));

    Collections.sort(stud, comp);
    for (Student s : stud){
        System.out.println(s);
    }
}
}
