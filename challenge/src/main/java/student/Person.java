package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){
        this.id=nextId++;
    }
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
    }
    public int getId(){
        return id;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;

    }
    public void getSecondName(String secondName){
        this.secondName=secondName;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }

    @Override 
    public String toString() {
        return "Person= id: " + id+ ", first name: "+ firstName+ ", second name: " + secondName+ ", phone: " + phone+ ", email: " + email ;

    }

}

