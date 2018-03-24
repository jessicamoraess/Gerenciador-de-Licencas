package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BD {

    public static Connection con;
    public static PreparedStatement statement;

    public static ResultSet rs;

    public Connection conectando() throws SQLException, ClassNotFoundException {

        //Fazer a conexão com o MYSQL
        //Procura por uma classe no projeto
        Class.forName("com.mysql.jdbc.Driver");
        //Pega uma conexão com o mysql
        System.out.println("Conectou");
        return con = DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "1234");

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

    public static void executaSQL(String sql) {
        try {
            statement = con.prepareStatement(sql);
            rs = statement.executeQuery(sql);

        } catch (SQLException erro) {

            System.out.println("Não foi possivel realizar a consulta, o comando digitado está errado" + erro + "," + sql);

            erro.printStackTrace();
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

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
