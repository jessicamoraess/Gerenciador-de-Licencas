package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ResumosDao {

    public void inserirResumo(ResumosBean rb) {
        try { //aqui começa a inserir na adobe
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into Resumo (ID, Contratado, Utilizando"
                        + ") values (?,?,?)";

                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, rb.getIdField());
                stm.setString(2, rb.getContratadoField());
                stm.setString(3, rb.getUtilizandoField());
                stm.execute();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
