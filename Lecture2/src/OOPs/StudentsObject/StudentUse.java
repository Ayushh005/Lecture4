package OOPs.StudentsObject;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Ayush",12);

        Student s2 = new Student("Aman",13);
//        s2.name = "Aman";
//        s2.setRollNo(13);

        System.out.println(s1.name);
        System.out.println(s1.getRollNo());
        s1.print();
    }
}
