package application;

import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.age - s1.age; // от большего к меньшему
    }
}





class Solucion   {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));


        Collections.sort(students, new StudentAgeComparator());

        for (Student s : students) {
            System.out.println(s.name + ": " + s.age);
        }
    }


}
