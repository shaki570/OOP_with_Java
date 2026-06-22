class Person {

    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {

    void work() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {

    void work() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {

    void work() {
        System.out.println("Engineer designs systems.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Doctor Object
        Doctor d = new Doctor();
        d.displayInfo();
        d.work();

        System.out.println();

        // Teacher Object
        Teacher t = new Teacher();
        t.displayInfo();
        t.work();

        System.out.println();

        // Engineer Object
        Engineer e = new Engineer();
        e.displayInfo();
        e.work();
    }
}

