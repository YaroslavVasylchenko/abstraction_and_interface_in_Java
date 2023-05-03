public class Main {
    public static void main(String[] args) {
        Student student = new Student("Misha", "Pupkin");
        Student student1 = new Student("Gosha", "Palkin");
        Student student2 = new Student("Masha", "Golkina");
        Student student3 = new Student("Sasha", "Vovk");

        Group group = new Group(student3);
        group.addTask("execute the method");
        group.addTask("learn what is collection");
        group.addTask("what are the operators");
        group.removeStudent(student2);
        group.changeLeader(student3);
        group.addStudent(new Student("Koly","Suslik"));

        group.renameStudent(student1,"Sanya","Panasenko");


        group.addTasksForGroup("Task for student");
        group.addTasksForGroup("Task for student");
        group.addTasksForGroup("Task for student");


    }
}
