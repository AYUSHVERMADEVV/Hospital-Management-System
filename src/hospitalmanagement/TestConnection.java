package hospitalmanagement;


public class TestConnection {
    public static void main(String[]args){
        DBConnection db=new DBConnection();
        db.connect();
    }
}
