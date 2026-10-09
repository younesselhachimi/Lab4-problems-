package student;

public class Test {
    public static void main(String[] args) {
        Major medecine = new Major("45", "medecine");
        Major cs  =  Major.COMPUTER_SCIENCE;
        Student s1 = new Student("NOURI", "Adam", "212643......", "Adam.Nouri@gmail.com", "8489446", medecine);
        Student s2 = new Student("RIFKI", "Ali", "074365....", "Ali.Rifki@gmail.com", "48949456", cs);
        Student s3 = new Student("HOUSNI", "Mouna", "06773212..", "Mouna.Housni@gmail.com", "4985925");
        // Display computer science students
        cs.displayStudents();
        medecine.displayStudents();

        System.out.println();
        cs.getOccupancyRate();

        System.out.println("--- Default major ---");
        System.out.println(s3.getMajor());
        System.out.println("Mouna belongs to cs: "+ (s3.getMajor() == cs));

        System.out.println("--- Major getters ---");
        System.out.println("ID: " + cs.getId());
        System.out.println("Code: " + cs.getCode());
        System.out.println("Name: " + cs.getName());
        System.out.println("Student count: " + cs.getStudentCount());
        System.out.println(cs);

        System.out.println("--- Major setters ---");
        medecine.setCode("46");
        medecine.setName("Medicine");
        System.out.println(medecine);

        System.out.println("--- Formatted names ---");
        System.out.println(s1.getFullNameFormatted());
        System.out.println(s2.getFullNameFormatted());
        System.out.println(s3.getFullNameFormatted());

        // Test successful search.
        System.out.println("--- Find an existing student ---");
        Student found = cs.findStudentByCNE(new String("4985925"));
        System.out.println(found);
        System.out.println("Found Mouna: " + (found == s3));

        System.out.println("--- Student list as a string ---");
        System.out.print(cs.getStudentListAsString());

        System.out.println("--- Remove Ali ---");
        System.out.println(cs.removeStudent("48949456")); 
        cs.displayStudents();
        System.out.println("Student count: " + cs.getStudentCount());
        cs.getOccupancyRate(); // 1 student: 2.0%








    }
}

