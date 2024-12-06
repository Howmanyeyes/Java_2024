package helpful_classes.Problem9;
public class PostGraduateStudent extends Student {

    public PostGraduateStudent(String firstName, String lastName, double averageGrade) {
        // Call the constructor of the superclass (Student)
        super(firstName, lastName, averageGrade);
    }

    // @Override
    public double getScholarship() {
        if (this.getAverageGrade() == 5.0) {
            return 150.0;
        } else {
            return 100.0;
        }
    }
}
