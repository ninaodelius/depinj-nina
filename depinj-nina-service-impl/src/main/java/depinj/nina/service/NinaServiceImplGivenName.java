package depinj.nina.service;

import depinj.nina.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinaServiceImplGivenName implements NinaService{

    private static List<Student> students = new ArrayList<>();

    public NinaServiceImplGivenName() {
        fillStudentList();
    }

    private static List<Student> fillStudentList(){
        students.add(new Student("Nina", "Odelius"));
        students.add(new Student("Therese", "Lindquist"));
        students.add(new Student("Sally", "Resch"));
        return students;
    }

    @Override
    public List<String> getStudents() {
        return Arrays.asList(
                students.get(0).getGivenName(),
                students.get(1).getGivenName(),
                students.get(2).getGivenName());
    }
}
