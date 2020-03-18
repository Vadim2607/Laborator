package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;



public class Course{
        private String title;
        private String description;
        private Student[] student;

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Student[] getStudent() {
                return student;
        }

        public void setStudent(Student[] student) {
                this.student = student;
        }

        @Override
        public boolean equals(Object object) {
                if(this == object) return true;
                if(object == null || getClass() != object.getClass()) return false;
                Course course = (Course) object;
                return Objects.equals(title, course.title);
        }
        public ArrayList<Student> filterStudentByYear(int year) {
                ArrayList<Student> filteredStudents = new ArrayList<>();

                for (Student student : student) {
                        if (student.getYear() == year) {
                                filteredStudents.add(student);
                        }
                }
                return filteredStudents;
        }

        @Override
        public String toString() {
                return "Course{" +
                        "title:'" + title.toUpperCase() + '\'' +
                        ", description:'" + description + '\'' +
                        ", students:" + Arrays.toString(student) +
                        '}';
        }
}

