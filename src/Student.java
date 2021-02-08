/*
    Application Purpose: Student info
    Author: Stephanie Caliwag
    Date: 2/1/21
    Time: 6:08pm
 */

import java.util.ArrayList;


public class Student {
    //instance variables
    private String firstName;
    private String lastName;

    //added in the array lists for interests
    private ArrayList<String> interests;
    private int studentNumber;

    //constructor
    //added arraylist interests to constructor
    public Student(String firstName, String lastName, ArrayList<String> interests, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setInterests(interests);
        setStudentNumber(studentNumber);
    }

    //setters and getters
    public String getFirstName() {
        return firstName;
    }

    //first name validation
    public void setFirstName(String firstName) {
        if(firstName.length() >= 5)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name must be at least 5 characters or more");
    }

    public String getLastName() {
        return lastName;
    }

    //last name validation
    public void setLastName(String lastName) {
        if(lastName.length() >=5)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last name must be at least 5 characters or more");
    }


    public ArrayList<String> getInterests() {
        return interests;
    }

    /**
     * This method returns a list of interests
     * @return
     */

    //using static method to get the interests
    public static ArrayList<String> getAllInterests(){
        ArrayList<String> interests = new ArrayList<>();
        interests.add("Hiking");
        interests.add("Video games");
        interests.add("Skating");
        interests.add("Coding");
        interests.add("Photography");
        return interests;
    }

    /**
     * This will validate the argument that contains interests
     * @param interests
     */

    //interests validation
    public void setInterests(ArrayList<String> interests) {
        ArrayList<String> validInterests = getAllInterests();
        for(String interest : interests){

            if(!validInterests.contains(interest))
                throw new IllegalArgumentException(interest + "Invalid. The options you have are: "
                                                    + validInterests);
        }
        this.interests = interests;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    //student number validation
    public void setStudentNumber(int studentNumber) {
        if(studentNumber >= 100000000 && studentNumber <=999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("The student number you have entered is our of range 100000000-999999999");
    }
}
