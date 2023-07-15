package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance=0;
    private static int costOfCourse=600;
    private static int id = 1000;


    // constructor promts user to enter students name and year
    public Student(){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Students first name ");
         this.firstName=sc.nextLine();

         System.out.println("Enter students last name");
         this.lastName=sc.nextLine();

         System.out.println("1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior\nEnter Student Class level: ");
         this.gradeYear=sc.nextLine();

         setStudentId();

        //  System.out.println(firstName+" "+lastName+" "+gradeYear+"  "+studentID);

         

         

    }

    // generate an Student  ID
    private void setStudentId(){
        id++;
        //grade level +ID
        this.studentID=gradeYear+""+id;

    }

    //Enroll in courses
    public void enroll(){
        // get inside a loop, user hits 0 to end enroll
       do {
         System.out.println("Enter course to enroll(Q to quit)");
        Scanner sc = new Scanner(System.in);
        String course = sc.nextLine();
        if(!course.equals("Q")){
            courses = courses +"\n  "+course;
            tuitionBalance=tuitionBalance+costOfCourse;
        }
        else{break;}
       } while (1 != 0);
        // System.out.println("Enrolled in "+ courses);
        // System.out.println("Tuition Balance $"+tuitionBalance);
    }

    // view balance
    public void viewBalance(){
        System.out.println("Your Due Balance is $"+ tuitionBalance);
    }

    // pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter the amount you want to pay $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance= tuitionBalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();

    }

    // show status
    public String showInfo(){
        return "Name: "+firstName+" "+lastName+
                "\nGrade Level "+gradeYear+
                "\nStudent Id: "+studentID+
                "\nCourses Enrolled: "+courses+
                "\nBalance: $"+tuitionBalance;
    }
    
}
