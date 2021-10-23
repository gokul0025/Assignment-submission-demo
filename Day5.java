import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*

Scanner sc = new Scanner(System.in);

Scanner class do not have any default constructor.
We need to invoke param constructor.
Scanner Constructor expects InputStream class object

"in" is an object of InputStream class, present as 
static member in System class.
to use "in", we write "System.in"
"System.in" is passed as arg while creating object
to invoke param constructor.


**javap java.lang.System**
- It will show us all members of System class



2. Why System.out.print() / println()

*/

/*
JDBC - Java Database Connectivity

Steps to connect:
1. Load/register the driver.
2. Establish the connection
3. Create Statement
4. Execute Statement
5. Close the connection

*/
import java.sql.*;
class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/essentials", "root", "system");
            Statement st = con.createStatement();
           
            st.executeUpdate("insert Student values(301, 'Atul')");

            ResultSet rs = st.executeQuery("select * from Student");

            while(rs.next()) {
                System.out.println("Data: " + rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}