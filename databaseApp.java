package StudentDatabaseApp;

import java.util.Scanner;

public class databaseApp {
    public static void main(String[] args) {
   

       //Ask the users how many new students to be added
       System.out.println("Enter the number of new students to enroll: ");
       Scanner sc= new Scanner(System.in);
       int numOfStudents = sc.nextInt();
       Student[] students=new Student[numOfStudents];

       //create n number of new students
       for (int i = 0; i < numOfStudents; i++) {
          students[i] = new Student();
          students[i].enroll();
          students[i].payTuition();
            System.out.println(students[i].showInfo());
       }
     
     
    
    }
    
}
