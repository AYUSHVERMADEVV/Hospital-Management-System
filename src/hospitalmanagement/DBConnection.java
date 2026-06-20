package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    Connection con;
    public Connection connect(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db",
            "root",
            "9628744987"
    );
    System.out.println("database connected succesfully");
}catch(ClassNotFoundException | SQLException e){
    System.out.println("Error: "+e.getMessage());
}
    return con;
}
}
