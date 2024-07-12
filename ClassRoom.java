package mission.ClassRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoom<T extends CollegeStudent> {
    private String className;

    private Map<String, T> studentMap; //key : studentNumber, value : 객체
    private List<String> studentNames;

    public ClassRoom(String className) {
        this.className = className;
        studentMap = new HashMap<>();
        studentNames = new ArrayList<>();

    }

    public void addStudent(T student) {
        studentMap.put(student.getStudentNumber(), student);
        studentNames.add(student.getName());
    }

    public String getStudentByStudentNumber(String studentNumber) {
        T student = studentMap.get(studentNumber);
        if (student == null) return null;
        String name = student.getName();
        double gpa = student.getGpa();
        return String.format("%s{studentNumber='%s', name='%s', gpa=%.1f}", student.getClass().getSimpleName(), studentNumber, name, gpa);

    }

    public void printStudentNames() {
        List<String> studentNames = new ArrayList<>();
        List<T> students = new ArrayList<>(studentMap.values());
        for (T student : students) {
            studentNames.add(student.getName());
        }
        System.out.printf("이 클래스룸(%s)은 학생들 %s가 있습니다.\n", className, studentNames);
    }
}
