public class StudentManagement {
    public Student[] students = new Student[100];
    public int num = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[num] = newStudent;
        num++;
    }

    /**
     * list students by group.
     */
    public String studentsByGroup() {
        String res = "";
        String gr = "";
        int cnt = 0;
        boolean[] check = new boolean[num];
        for (int i = 0; i < num; i++) {
            check[i] = false;
        }
        while (cnt < num) {
            for (int i = 0; i < num; i++) {
                if (check[i] == false) {
                    gr = students[i].getGroup();
                    res = res + gr + "\n";
                    for (int j = i; j < num; j++) {
                        if (students[j].getGroup().equals(gr)) {
                            res = res + students[j].getInfo() + "\n";
                            check[j] = true;
                            cnt++;
                        }
                    }
                }
            }
        }
        return res;
    }

    void removeStudent(String id) {
        if (num == 0) {
            return;
        }
        for (int i = 0; i < num - 1; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i + 1; j < num; j++) {
                    students[j - 1] = students[j];
                }
                num--;
                students[num] = null;
                return;
            }
        }
        if (students[num - 1].getId().equals(id)) {
            num--;
            students[num] = null;
        }
    }
}
