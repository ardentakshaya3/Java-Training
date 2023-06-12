import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    String fn,ln,gpa;
    public Student(String a, String b, String c ) {
        this.fn = a;
        this.ln = b;
        this.gpa = c;
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

            while (line != null)
            {
                String[] temp = line.split(",");
                Student s = createStudent(temp);
                System.out.println(temp);
                students.add(s);
                line = br.readLine();
            }
//            for(Student st: students)
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


