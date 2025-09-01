package SOLID_PRINCIPLES.solid.SRP.Example6.StudentReportCard;
class Student {
    public String name;
    public int[] marks;
    public Student(String name, int[] marks) {
this.name = name;
        this.marks = marks;
    }
}
 
class ReportCard {
    private Student student;
    public ReportCard(Student student) {
        this.student = student;
    }
    public int getTotal() {
        int total = 0;
        for (int mark : student.marks) total += mark;
        return total;
    }
    public String getGrade() {
        int avg = getTotal() / student.marks.length;
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        return "C";
    }
}
 
class ReportCardPrinter {
    private ReportCard report;
    public ReportCardPrinter(ReportCard report) {
this.report = report;
    }
    public void printReport() {
        System.out.println("Total: " + report.getTotal());
        System.out.println("Grade: " + report.getGrade());
    }
}
 
class ReportCardStorage {
    private ReportCard report;
    public ReportCardStorage(ReportCard report) {
this.report = report;
    }
    public void saveToFile() {
        System.out.println("Saving report card...");
    }
}