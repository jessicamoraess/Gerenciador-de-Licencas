package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LicencasDao {

    public void inserirCliente(LicencasBean ab) {
        try { //aqui começa a inserir na adobe
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into Licenças (ID, Contrato, Fornecedor, Tipo, Produto, Sistema, Linguagem, Aquisição, Vencimento, Chave, User"
                        + ") values (?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, ab.getIdField());
                stm.setString(2, ab.getContratoField());
                stm.setString(3, ab.getFornecedorField());
                stm.setString(4, ab.getTipoField());
                stm.setString(5, ab.getProdutoField());
                stm.setString(6, ab.getSistemaField());
                stm.setString(7, ab.getLinguagemField());
                stm.setString(8, ab.getAquisiçãoField());
                stm.setString(9, ab.getVencimentoField());
                stm.setString(10, ab.getChaveField());
                stm.setString(11, ab.getUserField());
                stm.execute();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
