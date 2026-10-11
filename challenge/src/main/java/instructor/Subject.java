package instructor;

public class Subject {
    private int id;
    private String code;
    private String title ;
    private Instructor instructor;
    private static int nextId = 1;

    public Subject(){
        this.id=nextId++;
    };
    public Subject(String code, String title, Instructor instructor) {
        this();
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String  normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle() {
        StringBuilder s = new StringBuilder();
        String title_endpoints_space = title.trim();

        for (int i = 0; i < title_endpoints_space.length(); i++) {
            char c = title_endpoints_space.charAt(i);

            if (i == 0 || title_endpoints_space.charAt(i - 1) == ' ') {
                s.append(Character.toUpperCase(c));
            } else {
                s.append(Character.toLowerCase(c));
            }
        }

        return s.toString();
    }
    public boolean isIntroCourse(){
        if(properTitle().startsWith("Intro")||normalizedCode().startsWith("INTRO-")){
            return true;
        }
        return false;
    }
    public String  syllabusLine(){
         StringBuilder s = new StringBuilder();
        s.append(normalizedCode()).append(" - ").append(properTitle())
                .append(" (Instructor: ")
                .append(instructor.getSecondName()).append(' ').append(instructor.getFirstName())
                .append(')');
        return s.toString();
    }
}
