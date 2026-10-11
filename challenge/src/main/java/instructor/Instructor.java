package instructor;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    public  Instructor(){
        super();
    }
    public Instructor(String lastName, String firstName, String phone,String email, String employeeNumber){
        super(firstName,lastName,phone,email);
        this.employeeNumber=employeeNumber;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber=employeeNumber;
    }
    public String cleanEmployeeNumber(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<employeeNumber.length();i++){
            if(employeeNumber.charAt(i)!=' '){
                s.append(employeeNumber.charAt(i));
            }
        }
        return s.toString();
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber, secondName,firstName);
    }

    public String toCard(){
        StringBuilder s = new StringBuilder();
        s.append("Instructor\n")
        .append("----------\n")
        .append("Employee #:")
        .append(cleanEmployeeNumber())
        .append("\nName : ")
        .append(getSecondName()).append(" , ").append(getFirstName())
        .append("\nEmail : ").append(email)
        .append("\nPhone : ").append(phone);
        return s.toString();
    }
    public String displayName(){
        StringBuilder s = new StringBuilder();
        if (getFirstName() != null) {
            s.append(firstName);
        }
        if (getSecondName() != null) {
            if (s.length() > 0) {
                s.append(' ');
            }
            s.append(getSecondName());
        }
        return s.toString();
    

    }
    
}
