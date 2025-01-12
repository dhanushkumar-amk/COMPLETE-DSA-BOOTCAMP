package OOPS.COMPARINGOBJECTS;

public class Student  implements Comparable<Student>{
    int rollNo;
    int marks;

    public Student(int marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
