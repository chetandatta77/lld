package builder;

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MbaStudentBuilder());
        Student engineeringStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
        StringBuilder
    }
}
