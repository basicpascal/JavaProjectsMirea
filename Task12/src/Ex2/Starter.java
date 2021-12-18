package Ex2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Петров Василий Антонович", 67, 12, 18));
        s.add(new Student("Сидоров Петр Андреевич", 57, 12, 18));

        new LabClassUI(s);
    }

}
