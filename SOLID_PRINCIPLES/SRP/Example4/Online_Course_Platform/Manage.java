import java.util.ArrayList;
import java.util.List;
class Course {
    public String title;
    public int duration; // in hours
    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
 
class CourseManager {
    private List<Course> courses = new ArrayList<>();
    public void addCourse(Course c) {
        courses.add(c);
    }
    public List<Course> getCourses() {
        return courses;
    }
}
 
class CoursePrinter {
    private CourseManager manager;
    public CoursePrinter(CourseManager manager) {
        this.manager = manager;
    }
    public void printCourses() {
        for (Course c : manager.getCourses()) {
            System.out.println(c.title + " - " + c.duration + " hrs");
        }
    }
}
 
class CourseExporter {
    private CourseManager manager;
    public CourseExporter(CourseManager manager) {
        this.manager = manager;
    }
    public void exportAsCSV() {
        System.out.println("Exporting courses as CSV...");
    }
}