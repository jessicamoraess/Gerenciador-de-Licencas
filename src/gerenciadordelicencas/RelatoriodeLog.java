/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordelicencas;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatoriodeLog {

    private DefaultTableModel DefaultTableModel;

    private static int cont;
    public static Connection con;
    public static PreparedStatement statement;
    public static ResultSet rs;

    public static conexao bd = new conexao();

    public static void run(String[] args) throws Exception {

        cont++;
        Document doc = new Document(PageSize.A4);

        // Criando o arquivo de saída.
        JFileChooser fileChooser = new JFileChooser();
        int saveValue = fileChooser.showSaveDialog(null);
        if (saveValue == JFileChooser.APPROVE_OPTION) {
            OutputStream os = new FileOutputStream(fileChooser.getSelectedFile().getAbsolutePath() + ".pdf");

            // Associando o doc ao arquivo de saída.
            PdfWriter.getInstance(doc, os);

            // Abrindo o documento para a edição
            doc.open();

            //Não se esqueça de arrumar o caminho para a imagem de sua preferência
            //Image logo = Image.getInstance("netshoes.jpg");
            //Alinhamento p/ a esquerda <<<
            //logo.setAlignment(Image.ALIGN_LEFT);
            //doc.add(logo);
            // Definindo uma fonte, com tamanho 20 e negrito
            Font f = new Font(FontFamily.TIMES_ROMAN, 20, Font.BOLD);

            // Adicionando um parágrafo ao PDF, com a fonte definida acima
            Paragraph p = new Paragraph("Migração de Licenças", f);

            // Setando o alinhamento p/ o centro
            p.setAlignment(Paragraph.ALIGN_CENTER);

            // Definindo
            p.setSpacingAfter(50);
            doc.add(p);

            Paragraph tableHeader = new Paragraph("Histórico");
            PdfPCell header = new PdfPCell(tableHeader);
            header.setColspan(5);
            header.setHorizontalAlignment(Paragraph.ALIGN_CENTER);

            PdfPTable table = new PdfPTable(4); // 3 columns.
            table.setWidthPercentage(100); //Width 100%
            table.setSpacingBefore(7f); //Space before table
            table.setSpacingAfter(7f); //Space after table
            table.addCell(header);
            table.addCell("User");
            table.addCell("Chamado");
            table.addCell("Data");
            table.addCell("Horario");

            con = DriverManager.getConnection("jdbc:mysql://localhost/bd?user=root&password=1234");
            try (Connection con = conexao.getConexao()) {
                String sql = "Select * from log";
                PreparedStatement pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {

                    table.addCell(rs.getString("User"));
                    table.addCell(rs.getString("Chamado"));
                    table.addCell(rs.getString("Data"));
                    table.addCell(rs.getString("Horario"));

                }
                doc.add(table);

                doc.close();
                JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!", "Relatório Concluido", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("ok");

                if (saveValue == JFileChooser.CANCEL_OPTION) {
                }
            }

        }
    }
;

}
