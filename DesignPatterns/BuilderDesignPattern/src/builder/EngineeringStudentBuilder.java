package builder;

import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        this.subjects.add("Mathematics");
        this.subjects.add("Python Programming");
        this.subjects.add("Data Structures and Algorithms");
        return this;
    }
}
