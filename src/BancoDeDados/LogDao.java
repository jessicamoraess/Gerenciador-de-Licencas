/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogDao {

    public void inserirHistórico(LogBean lb) {

        try (Connection con = conexao.getConnection()) {
            String sql, sql2;
            sql = "insert into log (Id, User, Chamado, Data, Horario"
                    + ") values (?,?,?,?,?)";

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, lb.getIdField());
            stm.setString(2, lb.getUserField());
            stm.setString(3, lb.getChamadoField());
            stm.setString(4, lb.getDataField());
            stm.setString(5, lb.getHorarioField());
            stm.execute();
            ResultSet rs = stm.getResultSet();

            rs.first();

            /*aqui começa a inserir na tabela telefone
             sql2 = "insert into log(Id, User, Chamado, Histórico)"
             + "values (?,?,?,?)";

             PreparedStatement stm2 = con.prepareStatement(sql2);
             stm2.setInt(1, rs.getInt("Id"));
             stm2.setString(2, lb.userField);
             stm2.setString(3, lb.chamadoField);
             stm2.setString(4, lb.históricoField);
             stm2.execute();*/
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
