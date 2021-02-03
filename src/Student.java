/*
    Application Purpose: Student info
    Author: Stephanie Caliwag
    Date: 2/1/21
    Time: 6:08pm
 */

public class Student {
    //instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;

    //constructor
    public Student(String firstName, String lastName, int studentNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);

    }
    //setters and getters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
}
