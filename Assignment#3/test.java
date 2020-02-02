class Student{
private String Name;
private String ID;

public Student(String n, String i){
        Name = n;
        ID = i;
        }

public String getName(){
        return Name;
        }
public String getID(){
        return ID;
        }
public void setName(String n){
        Name = n;
        }
public void setID(String i){
        ID = i;
        }
        }
class Course {
    private String courseName;
    private int num;
    private Student[] studentAry ;

    public Course(String c, int n) {
        courseName = c;
        num = n;
        studentAry = new Student[10];

    }

    public Student[] getStudents() {
        return studentAry;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNum() {
        return num;
    }

    public void setCourseName(String c) {
        courseName = c;
    }

    public void setNum(int n) {
        num = n;
    }

    public void registerStudent(Student student) {
        if (num < 10) {
            studentAry[num] = student;
            num += 1;
        }
    }

    public boolean isFull() {
        if (num == 10) {
            return true;
        }
        else {
            return false;
        }
    }

}

public class test{
    public static void main(String[] args) {


        Student student1 = new Student("lizehua","123456");
        Student student2 = new Student("a","1");
        Student student3 = new Student("b","2");
        Student student4 = new Student("c","3");
        Student student5 = new Student("d","4");
        Student student6 = new Student("e","5");
        Student student7 = new Student("f","6");
        Student student8 = new Student("g","7");
        Student student9 = new Student("h","8");
        Student student10 = new Student("i","9");
        Student student11 = new Student("j", "10");

        Course math = new Course("math", 0);
        Course english = new Course("English", 0);
        math.registerStudent(student1);
        math.registerStudent(student2);
        math.registerStudent(student3);
        math.registerStudent(student4);
        math.registerStudent(student5);
        math.registerStudent(student6);
        math.registerStudent(student7);
        math.registerStudent(student8);
        math.registerStudent(student9);
        math.registerStudent(student10);

        english.registerStudent(student1);
        english.registerStudent(student2);
        english.registerStudent(student3);
        english.registerStudent(student4);
        english.registerStudent(student5);
        english.registerStudent(student6);
        english.registerStudent(student7);
        english.registerStudent(student8);
        english.registerStudent(student9);
        //english.registerStudent(student10);
        //english.registerStudent(student11);

        System.out.println(math.isFull());
        System.out.println(math.getCourseName());
        for(Student each : math.getStudents()) {
            if (each != null) {
                System.out.println(each.getName());
            }
            else {
                break;
            }
        }
        System.out.println(english.isFull());
        System.out.println(english.getCourseName());
        for(Student each : english.getStudents()){
            if (each != null) {
                System.out.println(each.getName());
            }
            else {
                break;
            }
        }



    }

}
