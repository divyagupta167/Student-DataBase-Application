Student Database Application
The Student Database Application is a Java program that allows users to manage student information, enroll students in courses, and process tuition payments. It provides a simple command-line interface for interacting with the application. Users can add multiple students, enroll them in courses, and pay their tuition fees.

Getting Started
To run the Student Database Application, you need to have Java installed on your system. Simply compile the provided Java files and run the databaseApp class, which serves as the entry point to the application.



#javac Student.java databaseApp.java
#java databaseApp


Features
Adding Students: The application allows the user to input student details such as first name, last name, and grade level. It then automatically generates a unique student ID for each student.

Enroll in Courses: After adding student details, the user can enroll the students in different courses. The application keeps track of the enrolled courses and calculates the total tuition balance for each student.

View Balance: Users can check the current tuition balance for a specific student at any time.

Pay Tuition: The application provides the functionality to process tuition payments for students. Users can enter the amount they want to pay, and the application deducts the payment from the student's tuition balance.

Display Student Information: The program can display all the relevant information about a student, including their name, grade level, student ID, enrolled courses, and current tuition balance.

How to Use
When you run the program, it will prompt you to enter the number of new students you want to enroll.

For each student, you need to provide their first name, last name, and grade level (1 for Freshman, 2 for Sophomore, 3 for Junior, or 4 for Senior).

After adding the student's basic information, you can enroll them in courses. Enter the course name for each student until you decide to stop (by typing 'Q' when prompted).

Once enrolled in courses, the program will display the total tuition balance for that student.

You can then process tuition payments for each student. Enter the amount they want to pay, and the program will update the tuition balance accordingly.

At the end of the process, the program will display all the information for each student, including their name, grade level, student ID, enrolled courses, and the updated tuition balance.

Note
This application is a simple educational project and does not store data persistently. When the program terminates, all data will be lost.
The tuition cost for each course is fixed at $600, as defined in the costOfCourse variable.




An application for a university to manage student enrollments,courses applied, and course payment balance.

This Application does the following things -->

Ask the user how many students will be added to the database.
The user should be prompt to enter the name and year for each student.
The Student should have a 5-digit unique ID, with the first number being their grade level.
Assuming the course cost $600 to enroll.
The students can view their balance and pay the tuition fees.
To see the status about the student, we can see their name, ID, courses enrolled and payment balance.
