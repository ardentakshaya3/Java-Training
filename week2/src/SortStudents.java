import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String fn,ln,gpa;
    public Student(String a, String b, String c ) {
        this.fn = a;
        this.ln = b;
        this.gpa = c;
    }
}
class SortByLN implements Comparator<Student> {
    @Override
    public int compare(Student a1, Student a2) {
        return a1.ln.charAt(0) - a2.ln.charAt(0);
    }
}
public class SortStudents {
    public static void main(String[] args)
    {
        try
        {

            List<Student> students = new ArrayList<>();
            int i = 0;
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\srpak\\Documents\\CIS\\GitHub Proj\\Java-Training\\week2\\students.csv"));
            String line = br.readLine();
            line = br.readLine();
            while (line != null)
            {
                String[] temp = line.split(",");
                Student s = createStudent(temp);
//                System.out.println(s.fn);
                students.add(s);
                line = br.readLine();
            }

            Collections.sort(students,new SortByLN());

            for(Student st: students)
            {
                System.out.printf(st.fn+"   ");
                System.out.printf(st.ln+"   ");
                System.out.println(st.gpa);
            }
//                System.out.println(st);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

        public static Student createStudent(String[] metadata) {
            String fn = metadata[0];
            String ln = metadata[1];
            String gpa = metadata[2];

            return new Student(fn,ln,gpa);
    }

}


