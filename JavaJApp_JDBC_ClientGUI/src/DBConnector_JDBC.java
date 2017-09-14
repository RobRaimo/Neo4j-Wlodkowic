
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserW7
 */
public class DBConnector_JDBC {
    
    public void execute(String queryCQL) throws SQLException {
        Cursor hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
        setCursor(hourglassCursor);
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        // Connect
        try {
            con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j", "password");
            stmt = con.createStatement();
            rs = stmt.executeQuery(queryCQL);
            while (rs.next()) {
                jtaTextfield.append(rs.getString("n")+ "\n");
            }
        } catch(SQLException ex) {
            jtaTextfield.append("Exception catched...\n" + ex.toString());
            Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
            setCursor(normalCursor);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(normalCursor);
    }
}
