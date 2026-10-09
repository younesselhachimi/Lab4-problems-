package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static final Major COMPUTER_SCIENCE = new Major("23", "Computer Science");

    public Major(){
        this("23", "Computer Science");

    }

    public Major(String code, String name) {
        this.id=nextId++;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
        students = new Student[50] ;

    }
// Method to add a student
    public void addStudent(Student s) {
        if(studentCount==50){
            System.out.println("This major is full!");
            return;
        }
        students[studentCount]=s;
        studentCount++;
    }
// Getters
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getStudentCount() {
        return studentCount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Major= code: " + this.code+ ", name: "+ this.name+ ", number of students: " + this.studentCount;
    }

// Display all students in the major
    public void displayStudents() {
        System.out.println("The list of the students in the "+name+" major is:");
        for(int i=0;i<studentCount;i++){
            Student s = students[i];
            System.out.println((i+1)+". "+s.getCne()+" "+s.getSecondName()+" "+ s.getFirstName());
        }
    }

    public Student  findStudentByCNE(String cne){
        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        Student student=findStudentByCNE(cne);
        if(student!=null){
            int idx_found =-1;
            for(int i=0;i<studentCount;i++){
                if(students[i]==student){
                    idx_found=i;
                }
            }
            for(int i=idx_found;i<studentCount-1;i++){
                students[i]=students[i+1];
            }
            studentCount--;
            students[studentCount]=null;
            return true;
        }
        return false;
    }
    public void getOccupancyRate(){
        double rate=((double)studentCount/50) *100;
        System.out.println(name+" capacity: 50 students");
        System.out.println("Current enrollment: "+ studentCount+" students");
        System.out.println("Occupancy rate= " + rate+ "%" );
    }

    public String getStudentListAsString(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<studentCount;i++){
            s.append(students[i].getFullNameFormatted());
            s.append('\n');
        }
        return s.toString();
    }

}
