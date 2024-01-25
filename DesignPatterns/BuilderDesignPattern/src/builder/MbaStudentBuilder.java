package builder;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        this.subjects.add("Micro Economics");
        this.subjects.add("Operation Management");
        this.subjects.add("Business studies");
        return this;
    }
}
