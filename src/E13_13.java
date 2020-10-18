public class E13_13 {
    public static void main(String[] args) {

    }
class Course implements Cloneable{
        private String courseName;
        private String[] students = new String[100];
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }
        public void addStudent(String student) {
            students[numberOfStudents] = student;
        numberOfStudents++;
        }
        public int getNumberOfStudents() {
            return numberOfStudents;
        }
        public String[] getStudents() {
            return students;
        }
        public String getCourseName() {
            return courseName;
        }

    public Object clone() {
        Course course = null;
        try {
            course = (Course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course.students = students.clone();
        course.courseName = new String(courseName);

        return course;
    }
}
}
/**
 *
 (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6 to
 add a clone method to perform a deep copy on the students field*/