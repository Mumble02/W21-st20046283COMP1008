/*
    Application Purpose: Student info
    Author: Stephanie Caliwag
    Date: 2/8/21
    Time: 9:00pm
 */



import java.util.ArrayList;
import java.util.Arrays;


public class StudentTestHarness {
    public static void main (String[] args) {
        ArrayList<String> personalInterests = new ArrayList<>();
        personalInterests.addAll(Arrays.asList("Video games", "Photography"));

        Student st1 = new Student("Stephanie", "Caliwag", personalInterests, 200462383);
        System.out.printf(st1.getFirstName());
        System.out.println();
        System.out.println(st1.getLastName());
        System.out.println(st1.getInterests());
        System.out.println(st1.getStudentNumber());

    }
}
