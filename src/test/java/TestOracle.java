import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: houjunmei
 * Date: 27/12/12
 * Time: 1:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestOracle
{
    @Test
    public void testConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@192.168.1.108:1521:xe";
        String username = "yuk";
        String password = "yuk";

        Connection conn = DriverManager.getConnection(url, username, password);
        conn.createStatement().executeQuery("select * from Table1");
    }
}
