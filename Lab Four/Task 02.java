public class IDCard {

    String name;
    String id;
    String department;
    String institution;

    // Constructor
    public IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    // Method to show ID details
    public void showID() {
        System.out.println("    ID CARD   ");
        System.out.println("Name: " + name);
        System.out.println("ID No: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }

    public static void main(String[] args) {

        IDCard studentID = new IDCard("Kazi Shaki Jawhar", "E253026", "CCE", "IIUC");

        studentID.showID();
    }
}
