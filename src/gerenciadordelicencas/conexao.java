package gerenciadordelicencas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {

    private static Connection con;

    public static PreparedStatement statement;

    public ResultSet rs;

    public static Connection getConexao() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bd";
        String login = "root";
        String senha = "1234";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void insercaoSQL(String sql) {
        try {
            statement = con.prepareStatement(sql);

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("falha na inserção do comando para o banco de dados" + e);
        }
    }

    public static void salvarDados(String sql) {
        try {
            statement = con.prepareStatement(sql);

            statement.executeUpdate(sql);

        } catch (SQLException e) {

            System.out.println("falha no update para o banco de dados" + e);
        }

    }

    public void desconecta() {
        try {
            con.close();
            System.out.println("Desconectou");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "não foi possivel desconecta");
        }

    }

}
