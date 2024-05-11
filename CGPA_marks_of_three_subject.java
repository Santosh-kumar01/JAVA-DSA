import org.w3c.dom.ls.LSOutput;

public class CGPA_marks_of_three_subject {
    public static void main(String[] args) {
        float subject1 = 25;
        float subject2 = 58;
        float subject3 = 90;
        float CGPA = (subject1 + subject2 + subject3) / 30;
        System.out.println(CGPA);
    }
}

