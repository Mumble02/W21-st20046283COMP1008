/*
    Application Purpose: Student info
    Author: Stephanie Caliwag
    Date: 2/2/21
    Time: 6:08pm
 */


import java.util.Scanner;

public class StudentTestHarness {
    public static void main (String[] args){
        //data type    variable    calling constructor
        Scanner scan = new Scanner(System.in);

        //Using last semester java knowledge
        Student studentInfo = new Student ("Stephanie", "Caliwag" , 200462383);

        studentInfo.setFirstName("Stephanie");
        System.out.println(studentInfo.getFirstName());
        System.out.println();
        studentInfo.setLastName("Caliwag");
        System.out.println(studentInfo.getLastName());
        System.out.println();
        studentInfo.setStudentNumber(200462383);
        System.out.println(studentInfo.getStudentNumber());

        //Tried using your code as a reference from last class but it seems like i kept running into a lot of errors
        /*Student firstName = new Student("Stephanie");
        String lastName = new Student("Caliwag"); */
        //last name
        //Student lastName = new Student (firstName.getLastName());
        //student number
        //Student studentNumber = new Student(studentNumber + .getStudentNumber());


    }
}
