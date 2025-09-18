// example showing the concept of clone | Deep clone

class Course implements Cloneable{
    String courseName1,courseName2;
    Course(String courseName1,String courseName2){
        this.courseName1 = courseName1;
        this.courseName2 = courseName2;
    }
    @Override
    protected Object clone()  throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student implements Cloneable{
    int sid;
    String studentName;
    Course course;
    Student(int sid,String studentName,Course course){
        this.sid=sid;
        this.studentName = studentName;
        this.course = course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student stud = (Student)super.clone();
        stud.course = (Course)course.clone();
        return stud;
    }
}
class Demo15{
    public static void main(String args[]){
        try{
            Course course = new Course("Java","Python");
            Student stud1 = new Student(101,"Andrew Anderson",course);
            Student stud2 = (Student)stud1.clone(); // downcasting
    
            stud2.course.courseName1 = "Sanskrit";

            System.out.println("Student 1 Details : ");
            System.out.println("StudentId : "+stud1.sid);
            System.out.println("StudentName : "+stud1.studentName);
            System.out.println("StudentCourse : \n\t"+stud1.course.courseName1+" "+stud1.course.courseName2);

            System.out.println("\nStudent 2 Details : ");
            System.out.println("StudentId : "+stud2.sid);
            System.out.println("StudentName : "+stud2.studentName);
            System.out.println("StudentCourse : \n\t"+stud2.course.courseName1+" "+stud2.course.courseName2);

        }catch(CloneNotSupportedException e){
            System.out.println("Exception : "+e);
        }
    }
}