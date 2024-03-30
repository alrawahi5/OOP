import javax.swing.*;

public class Student {

    private String name;
    private Integer age;
    private Integer grade;

    public Student(){}

    public static void displyStudentInfo(String name, Integer age, Integer grade){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Grade is: " + grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String [] args){
        displyStudentInfo("Abdullah", 25, 100);

        Student student = new Student();

        student.grade = 22;
        student.age = 3;
        student.name = "Ameer";

        System.out.println();
        System.out.println("With the constructor: " + '\n' + "Name is: " + student.name +  '\n' + "Age is: " +student.age +  '\n' + "Grade is: " +student.grade);
    }
}
