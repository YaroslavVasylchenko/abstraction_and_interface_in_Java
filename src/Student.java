public class Student {
    private static int idBase = 0;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

        idBase++;
        this.id = idBase;

    }
}
