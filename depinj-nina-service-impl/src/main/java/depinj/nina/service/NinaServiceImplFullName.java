package depinj.nina.service;

import depinj.nina.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinaServiceImplFullName implements NinaService{

    private static List<Student> students = new ArrayList<>();

    public NinaServiceImplFullName() {
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
                students.get(0).toString(),
                students.get(1).toString(),
                students.get(2).toString());
    }

}
