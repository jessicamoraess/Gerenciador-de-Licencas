package BancoDeDados;

import java.sql.*;

public class conexao {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando o banco de dados");
            return DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "1234");

        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
