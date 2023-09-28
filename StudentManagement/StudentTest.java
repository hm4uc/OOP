public class StudentTest {
    public static void main(String[] args) {
        StudentManagement list = new StudentManagement();

        Student D = new Student();
        D.setName("Hoang Minh Duc");
        D.setId("22028039");
        D.setGroup("K67CA");
        D.setEmail("22028039@vnu.edu.vn");

        Student B = new Student("Lo Van B", "22028001", "22028001@vnu.edu.vn");
        B.setGroup("K66CA");

        Student C = new Student("Nguyen Thi C", "22029999", "22029999@vnu.edu.vn");
        C.setGroup("K67CA");

        Student E = new Student(D);

        list.addStudent(D);
        list.addStudent(B);
        list.addStudent(C);
        list.addStudent(E);

        System.out.println(list.studentsByGroup());

        list.removeStudent("22029999");

        System.out.println(list.studentsByGroup());
    }
}
