import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentObj {
    String firstName;
    String lastName;
    double gpa;

    public StudentObj(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double gpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class RemoveStudents {
    public static void main(String[] args) {
        List<StudentObj> studentList = new ArrayList<>();
        studentList.add(new StudentObj("Ross", "Geller", 3.5));
        studentList.add(new StudentObj("Monica", "Geller", 4.0));
        studentList.add(new StudentObj("Chandler", "Bing", 2.8));
        studentList.add(new StudentObj("Joey", "Tribbiani", 3.2));
        studentList.add(new StudentObj("Phoebe", "Buffay", 3.7));

        double totalGpa = 0.0;
        for (StudentObj student : studentList) {
            totalGpa += student.gpa();
        }
        double averageGpa = totalGpa / studentList.size();

        System.out.println("Students having gpa < average gpa:");

        Iterator<StudentObj> i = studentList.iterator();
        while (i.hasNext()) {
            StudentObj student = i.next();
            if (student.gpa() < averageGpa) {
                System.out.println(student.firstName + " " + student.lastName);
                i.remove();
            }
        }

        System.out.println("Remaining students having gpa > average gpa:");
        for (StudentObj student : studentList) {
            System.out.println(student.firstName + " " + student.lastName);
        }
    }
}