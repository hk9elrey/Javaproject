import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    public String name;

    public String email;

    public ArrayList<Course> courses = new ArrayList<>();


    public Students(String mame, String Email) {
        name = mame;
        this.email = Email;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void Calculate_perc(){
        float perc = 0;
        float obtain = 0 ;
        float total = 0 ;
        for(Course course : getCourses()){
            obtain += course.O_Marks;
            total += course.T_Marks;
        }
        perc = obtain / total * 100;
        System.out.println("Percentage is "+ perc);
    }

    //    int[] Marks = new int[3];
//
//    Scanner s = new Scanner(System.in);
//
//    public void add_student(String Name, String Email) {
//
//        this.name = Name;
//        this.email = Email;
//
//    }
//
//public void add_course(){
//    System.out.println("Enter Courses");
//    for (int i = 0; i < Course.length; i++) {
//        Course[i] = s.nextLine();
//    }
//}

//public void add_marks(){
//    System.out.println("Enter Marks");
//    for (int i = 0; i < Marks.length; i++) {
//        Marks[i] = Integer.parseInt(s.nextLine());
//    }
//}

//
//    public void student_details(){
//     float total = 0;
//     float percetage  = 0;
//        System.out.println(name +" "+ email );
//
//        System.out.println("Courses");
//        for(String k : Course){
//             System.out.println(k);
//       }
//        System.out.println("Marks");
//        for(int p : Marks){
//            System.out.println(p);
//        }
//        System.out.println("Total Marks");
//        for(int i = 0 ; i < Marks.length ; i++){
//            total += Marks[i] ;
//        }
//        System.out.println(total);
//
//
//        percetage = total / 300 * 100; // 300 is Total Marks
//
//        System.out.println("Percentage is "+ percetage +"%");
//
//    }



}