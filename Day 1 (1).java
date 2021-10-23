
/*
James Arthur Gosling - Sun MicroSystems 

*/
/*
Prog.c
gcc Prog.c -> a.out
.\a.out

Java:

Prog.java -> class Test{.....}
javac Prog.java -> Test.class

Test.class -> Byte Code

java Test
*/
/*
class Test {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("Coders\n");
        System.out.println("Welcome!!!");
    }
}
*/
/*
class Test {
    int x;  //data member
    public static void main(String[] args) {
        Test ob = new Test();
        ob.x = 20;
        System.out.println("Data: " + ob.x);
    }

}
*/

class Test {
    //data member
    int x;

    //method
    void show() {
        System.out.println("Data: " + x);
    }
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test();
        ob1.x = 20;
        ob2.x = 30;
        
        ob1.show();
        ob2.show();
    }

}