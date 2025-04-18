/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Ahmed", 22);
        dao.createStudent(s1);

        Student fetched = dao.getStudent(1);
        System.out.println("Student: " + fetched.getName());

        dao.updateStudent(1, "Ahmed Updated", 23);
        dao.deleteStudent(1);
    }
}
