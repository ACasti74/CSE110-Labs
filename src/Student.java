public class Student {
    private String firstName, lastName, sFullName, sAsuID;

    private double sGrade;

    private int numOfUpdates, numOfAccessed;

    public Student() {
        numOfAccessed = 0; // initialize values
        numOfUpdates = 0;
    }

    public Student(String firstName, String lastName, String fullName, String asuId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sFullName = fullName;
        this.sAsuID = asuId;
    }

    public Student(String sFullName, String sAsuID, double sGrade) {
        this.sFullName = sFullName;
        this.sAsuID = sAsuID;
        this.sGrade = sGrade;
    }

    public String toString() {
        return "Student: " + sFullName + ", ASUID: " + sAsuID + ", Grade: " + sGrade + ", Number of Updates: "
                + numOfUpdates + ", Number of Accessed: " + numOfAccessed;
    }

    public String getFirstName() {
        numOfAccessed++;
        return firstName;
    }

    public void setFirstName(String firstName) {
        numOfUpdates++;
        this.firstName = firstName;
    }

    public String getLastName() {
        numOfAccessed++;
        return lastName;
    }

    public void setLastName(String lastName) {
        numOfUpdates++;
        this.lastName = lastName;
    }

    public String getFullName() {
        numOfAccessed++;
        return sFullName;
    }

    public void setName(String sFullName) {
        numOfUpdates++;
        this.sFullName = sFullName;
    }

    public String getAsuID() {
        setNumOfAccessed(numOfAccessed++);
        return sAsuID;
    }

    public void setId(String sAsuID) {
        numOfUpdates++;
        this.sAsuID = sAsuID;
    }

    public double getGrade() {
        numOfAccessed++;
        return sGrade;
    }

    public void setGrade(double sGrade) {
        numOfUpdates++;
        this.sGrade = sGrade;
    }

    public int getNumOfUpdates() {
        numOfAccessed++;
        return numOfUpdates;
    }

    public void setNumOfUpdates(int numOfUpdates) {
        this.numOfUpdates = numOfUpdates;
    }

    public int getNumOfAccessed() {
        numOfAccessed++;
        return numOfAccessed;
    }

    public void setNumOfAccessed(int numOfAccessed) {
        numOfAccessed++;
        this.numOfAccessed = numOfAccessed;
    }

    public boolean equals(Student other) {
        if (other.sAsuID == this.sAsuID) {
            return true;
        } else if (other.sFullName.equalsIgnoreCase(this.sFullName)) {
            return true;
        }
        return false;
    }
}