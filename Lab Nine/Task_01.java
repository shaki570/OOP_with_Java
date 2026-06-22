class Student {

    private String name;
    private int id;
    private double cgpa;

    // Setter Methods
    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public void setCgpa(double c) {
        cgpa = c;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shaki");
        s1.setId(253026);
        s1.setCgpa(3.00);

        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student ID   : " + s1.getId());
        System.out.println("Student CGPA : " + s1.getCgpa());
    }
}

