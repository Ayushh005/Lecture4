package OOPs.StudentsObject;

public class Student {
    String name;
    int rollNo;

    public Student(String n,int rn){
        name = n;
        rollNo = rn;
    }
    public void setRollNo(int rn){
        if (rn <= 0){
            return;
        }
        rollNo = rn;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void print(){
        System.out.println("Name : "+ name + " Roll No : "+rollNo);
    }
}
