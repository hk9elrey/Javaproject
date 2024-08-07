import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList a = new ArrayList();
//        a.add("");

        Students student = new Students("Humza", "humza@gmail.com");


        Course course1 = new Course("Math" , 60 , 100);

        Course course2 = new Course("English" , 70 , 100);

        student.addCourse(course1);
        student.addCourse(course2);


        System.out.println(student.name + student.email);
        for(Course course : student.getCourses()){
            System.out.println(course.Name + " " + course.O_Marks);
        }
        student.Calculate_perc();



//        int size_of_arr = 3;
//
//      // Scanner s = new Scanner(System.in);
//         String[] name = new String[3];
//        for(int i = 0 ; i < name.length ; i++){
//            name[i] = "2345";
//        }
//    String temp = "qwe";
//
//
//        String[] Arr = new String[4];
//
//        for(int j = 0 ; j < Arr.length ; j ++){
//
//           if(j < name.length){
//               Arr[j] = name[j];
//           }
//             else{
//            Arr[j] = temp;}
//
//        }
//
//        for(String k : Arr){
//
//             System.out.println(k);
//        }

//        for(int j = 0 ; j < 1 ; j++){
//
//            name[j+2] = name[j] + "," + temp;
//        }
//        System.out.println(Arrays.toString(name));

//        for(int j = 3 ; j < name.length ; j++) {
//            name[3] = s.nextLine();
//        }




//        ArrayList<String> Name = new ArrayList<String>();
//
//        Name.add("humza");
//        Name.add("khan");
//
//        System.out.println(Name);

    }
}