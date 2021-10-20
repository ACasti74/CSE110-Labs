public class Student {
    private String firstName, lastName, fullName, asuid;
    private double grade;

    public Student(String fName, String lName, String fullName, String asuid) {
        this.firstName = fName;
        this.lastName = lName;
        this.fullName = fullName;
        this.asuid = asuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAsuID() {
        return asuid;
    }

    public String getFullName() {
        return fullName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double newGrade) {
        this.grade = newGrade;
    }


}