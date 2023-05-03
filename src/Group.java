import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    private Student leader;
    private ArrayList<Student> students;
    private ArrayList<String> tasks;
    private final Map<String, ArrayList<Student>> taskForStudent;

    public Group(Student leader) {
        this.leader = leader;
        this.students = new ArrayList<Student>();
        this.tasks = new ArrayList<String>();
        this.taskForStudent = new HashMap<>();
    }

    public void changeLeader(Student student) {
        this.leader = student;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void setStudents(List<Student> students) {
        this.students = (ArrayList<Student>) students;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = (ArrayList<String>) tasks;
    }

    public void removeStudent(Student student2) {
        students.remove(student2);

    }

    public void renameStudent(Student student, String newName, String newSurname) {
        student.setName(newName);
        student.setSurname(newSurname);
    }

    public void addTasksForGroup(String tasks) {
        this.tasks.add(tasks);
        this.taskForStudent.put(tasks, new ArrayList<Student>());
    }

}
