public class UniversityGroup {
    private final String groupName;
    private final int startYear;

    public UniversityGroup(String groupName, int startYear, int endYear, String[] studentArray){
        this.groupName = groupName;
        this.startYear  = startYear;
        this.endYear = endYear;
        this.StudentArray = studentArray;
    }
    


    public UniversityGroup(String groupName, int startYear, int endYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = endYear +5 ;
    }

    private int endYear;
        private String [] StudentArray;


    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentArray() {
        return StudentArray;
    }

public static void addStudents (String[] students){
    }
}

