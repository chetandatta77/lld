package builder;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if (studentBuilder instanceof MbaStudentBuilder){
            return this.studentBuilder.setAge(10).setFatherName("sarma").setMotherName("naga").setSubjects().build();
        } else {
            return this.studentBuilder.setAge(15).setFatherName("cool").setName("chetan").setSubjects().build();
        }
    }

}
