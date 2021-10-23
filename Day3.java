/*
import java.util.Scanner;
class Employee {
    int eid;        //Non-static variable or instance variable
    String ename;   //Non-static variable or instance variable
    String desg;    //Non-static variable or instance variable
    static String dept; //staic variable or class variable
    float salary;   //Non-static variable or instance variable

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter eid: ");
        eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ename = sc.nextLine();
        System.out.print("Enter designation: ");
        desg = sc.nextLine();
        System.out.print("Enter department: ");
        dept = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
    }
    void showDetails() {
        System.out.println("Employee Details: ");
        System.out.println("EID: " + eid);
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desg);
        System.out.println("Salary: " + salary);
    }

    static void displayDetails() {
        System.out.println("Employee Details: ");
        //System.out.println("EID: " + eid);
        //System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        //System.out.println("Designation: " + desg);
        //System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.inputDetails();
        e2.inputDetails();
        e3.inputDetails();

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
        
    }

}
*/

/*
import java.util.Scanner;
class Employee {
    int eid;        //Non-static variable or instance variable
    String ename;   //Non-static variable or instance variable
    String desg;    //Non-static variable or instance variable
    static String dept; //staic variable or class variable
    float salary;   //Non-static variable or instance variable

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter eid: ");
        eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ename = sc.nextLine();
        System.out.print("Enter designation: ");
        desg = sc.nextLine();
        System.out.print("Enter department: ");
        dept = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
    }
    void showDetails() {
        System.out.println("Employee Details: ");
        System.out.println("EID: " + eid);
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desg);
        System.out.println("Salary: " + salary);
    }
}

class DriveEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //Employee e2 = new Employee();
        //Employee e3 = new Employee();

        e1.inputDetails();
        //e2.inputDetails();
        //e3.inputDetails();

        e1.showDetails();
        //e2.showDetails();
        //e3.showDetails();
        
    }
}
*/

/*
Access Modifiers: It specifies how a member can be accessed

- public    -> public int eid;
- private   -> private int eid;
- protected -> protected int eid;
- default   -> int eid;

package one   -> class A, class C -> can access protected eid
package two   -> class B (it can access protected eid of A if B is 
child class of A)
  
                Within             Outside class        Diff class from diff pack
                the class          (same pack)
     
public            Yes               Yes                     Yes      
protected         Yes               Yes                     Yes (Only childm class can access )
default           Yes               Yes                     No
private           Yes               No                      No 

//Class B is child class of class A
class A {
    ......
    .....
}

class B extends A {
    ....
    ....
}




*/

import java.util.Scanner;
class Employee {
    private int eid;

    void setEid(int id) {
        eid = id;
    }

    int getEid() {
        return eid;
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
        System.out.print("Employee id: " + e.getEid());
    }
    
}