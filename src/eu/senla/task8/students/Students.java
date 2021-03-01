package eu.senla.task8.students;

public class Students {
    private int id;
    private String name;
    private int course;
    private double avrGrade;

    public Students(int id, String name, int course, double avrGrade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
