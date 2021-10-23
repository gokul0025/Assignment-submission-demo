/*
Why main() is public static void?

public static void main()

*/

/*
import java.util.Scanner;
class Employee {
    private int eid;
    static int x;
    

    void setEid(int id) {
        eid = id;
    }

    int getEid() {
        return eid;
    }
    static void show() {
        System.out.println("Data: " + x);
    }

}

class GetEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        int eid;
        System.out.print("Enter employee id: ");
        eid = sc.nextInt();
        e.setEid(eid);
        Employee.x = 20;
        System.out.print("Employee id: " + e.getEid());
        Employee.show();

    }
    
}
*/

// Command Line Argument
// public static void main(String[] args)

// add(a, b)

/*
class Test {
    public static void main(String[] args) {
        System.out.println("Hi " + args[0] + " " + args[1]);
    }
}
*/
/*
Scanner sc = new Scanner(System.in)?

Test ob = new Test(); -> Constructor -> creates object

Constructor:
- a method
- its name is same as class name
- no return type (not even void)

class Test {
    //default constructor
    Test() {

    }

    //parameterized constructor
    Test(int x) {

    }
}

Tasks:
- Creates object
- Initializes the object

*/

class Cab {
    int fare;
    Cab() {
        
    }
    Cab(int amt) {
        fare = amt;
    }

    /*
    //default constructor - creates and initializes object
    Cab() {
        fare = 25;
    }
    */
}
class RideCab {
    public static void main(String[] args) {
        Cab ob = new Cab(50); //invokes default constrcutor
        System.out.print("Fare: " + ob.fare);
    }
}
