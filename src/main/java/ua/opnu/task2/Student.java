package ua.opnu.task2;
import java.util.Arrays;
public class Student {
    private String name;
    private String group;
    private int[] marks;
    public Student(String name, String group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }
    public String getName() { return name; }
    public String getGroup() { return group; }
    public int[] getMarks() { return marks; }
    @Override
    public String toString() {
        return name + " [" + group + "] " + Arrays.toString(marks);
    }
}
