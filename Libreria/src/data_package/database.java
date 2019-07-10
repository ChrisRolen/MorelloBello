/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_package;
import java.sql.*;
/**
 *
 * @author matteo
 */
public abstract class database {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt;
    public database() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/database_progetto?" + "user=root&password=cibermatteo98");
         stmt=conn.createStatement();
         

    }
}
