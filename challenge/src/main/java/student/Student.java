package student;
public class Student extends Person {
    private String cne;
    private Major major;
    public Student(){
        super();
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom, telephone, email);
        this.cne=cne;
        this.major = major;
        major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email,cne,Major.COMPUTER_SCIENCE);
    }


     //Getters
    public String getCne(){
        return this.cne;
    }
    public Major getMajor(){
        return this.major;
    }


     //Setters
    

    public void setCne(String cne){
        this.cne=cne;
    }
    public void setMajor(Major major){
        this.major=major;
    }

     public String getFullNameFormatted(){
        String firstName = this.firstName;
        String secondName = this.secondName.toUpperCase();
        return String.format("%s, %s",secondName,firstName);
    }

    @Override 
    public String toString() {
        return "Student{id=" + id
                + ", cne='" + cne 
                + ", lastName='" + secondName 
                + ", firstName='" + firstName 
                + ", phone='" + phone 
                + ", email='" + email 
                + ", Major=" + major
                + '}';
    }

}

