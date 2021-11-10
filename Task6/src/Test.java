import java.lang.*;
public class Test {
    public static void main(String[] args) {
            Student s1 = new Student(13);
            Student s2 = new Student(5);
            Student s3 = new Student(11);
            Student s4 = new Student(19);
            Student s5 = new Student(112);
            Student s6 = new Student(10);
            Student s7 = new Student(11245);
            Student s8 = new Student(1321);
            Student s9 = new Student(115);
            Student s10 = new Student(162);
            Student s11 = new Student(1274);
            Student[] iDNumber = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11};
            int size = iDNumber.length;
            int t;
            for (int a = 1; a < size; a++)
                for (int b = size - 1; b >= a; b--) {
                    if (iDNumber[b - 1].id > iDNumber[b].id) {
                        t = iDNumber[b - 1].id;
                        iDNumber[b - 1].id = iDNumber[b].id;
                        iDNumber[b].id = t;
                    }
                }
            for (Student student : iDNumber) System.out.println(" " + student);
    }
}
