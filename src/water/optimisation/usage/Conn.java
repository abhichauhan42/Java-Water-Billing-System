package water.optimisation.usage;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///wms", "root", "310953");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
