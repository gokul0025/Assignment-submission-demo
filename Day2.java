/*
Packages: Consists of sub-packages and class files.

Types:
1) Built-in package - lang, util, sql, net, io, awt etc.
    java.lang -> default package
    java.lang -> String, Math, System etc.
2) User defined package
creating:
package <package_name>

javac -d . Day2.java
javac -d e://code/ Day2.java

Execute:
java package_name.ClassName

Taking Input:
int     -> nextInt()
float   -> nextFloat()
String  -> nextLine()

nextInt(), nextFloat(), nextLine() -> members of Scanner class
Scanner class -> present in "java.util" package

*/

/*

Mini Project: Maintain employee records.

*/
package emp;
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
