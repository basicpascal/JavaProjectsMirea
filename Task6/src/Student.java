public class Student {
    int id;

    public Student(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student's id: " +
                 id;
    }
}
