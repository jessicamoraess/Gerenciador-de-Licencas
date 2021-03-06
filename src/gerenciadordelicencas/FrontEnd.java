package gerenciadordelicencas;

import gerenciadordelicencas.ResumosAdmin;
import gerenciadordelicencas.TrayIconDemo;
import Usuário.Resumos;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jéssica Moraes
 */
public class FrontEnd extends javax.swing.JFrame {

    /**
     * Creates new form FrontEnd
     */
    public FrontEnd() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrontEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        Painel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuAdministrar = new javax.swing.JMenu();
        ItemCadastros = new javax.swing.JMenuItem();
        ItemResumos = new javax.swing.JMenuItem();
        MenuEstatisticas = new javax.swing.JMenu();
        MenuGraficos = new javax.swing.JMenu();
        ItemLicençasContratadas = new javax.swing.JMenuItem();
        ItemLicençasemUso = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        ItemRelatórioCompleto1 = new javax.swing.JMenuItem();
        ItemRelatórioCompleto = new javax.swing.JMenuItem();
        MenuHistórico = new javax.swing.JMenu();
        ItemHistórico = new javax.swing.JMenuItem();
        MenuSuporte = new javax.swing.JMenu();
        ItemManual = new javax.swing.JMenuItem();
        ItemContato = new javax.swing.JMenuItem();
        MenuOpções = new javax.swing.JMenu();
        ItemMinimizar = new javax.swing.JMenuItem();
        ItemLogout = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador de Licenças");
        setBackground(new java.awt.Color(255, 255, 255));

        Painel.setBackground(new java.awt.Color(255, 255, 255));
        Painel.setPreferredSize(new java.awt.Dimension(852, 472));
        Painel.setLayout(new java.awt.GridBagLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Netshoes.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(327, 470, 11, 10);
        Painel.add(Logo, gridBagConstraints);

        MenuAdministrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        MenuAdministrar.setText("Administrar");

        ItemCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ItemCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CadastrarLicenças.png"))); // NOI18N
        ItemCadastros.setText("Cadastros");
        ItemCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCadastrosActionPerformed(evt);
            }
        });
        MenuAdministrar.add(ItemCadastros);

        ItemResumos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        ItemResumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report.png"))); // NOI18N
        ItemResumos.setText("Resumos");
        ItemResumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemResumosActionPerformed(evt);
            }
        });
        MenuAdministrar.add(ItemResumos);

        BarraDeMenu.add(MenuAdministrar);

        MenuEstatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Estatisticas.png"))); // NOI18N
        MenuEstatisticas.setText("Estatísticas");

        MenuGraficos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/grafico.png"))); // NOI18N
        MenuGraficos.setText("Gráficos");

        ItemLicençasContratadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        ItemLicençasContratadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Contratado.png"))); // NOI18N
        ItemLicençasContratadas.setText("Licenças Contratadas");
        ItemLicençasContratadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLicençasContratadasActionPerformed(evt);
            }
        });
        MenuGraficos.add(ItemLicençasContratadas);

        ItemLicençasemUso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        ItemLicençasemUso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Em uso.png"))); // NOI18N
        ItemLicençasemUso.setText("Licenças em Uso");
        ItemLicençasemUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLicençasemUsoActionPerformed(evt);
            }
        });
        MenuGraficos.add(ItemLicençasemUso);

        MenuEstatisticas.add(MenuGraficos);

        MenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pdf-file.png"))); // NOI18N
        MenuRelatorios.setText("Relatórios");

        ItemRelatórioCompleto1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        ItemRelatórioCompleto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/File.png"))); // NOI18N
        ItemRelatórioCompleto1.setText("Relatório de Resumo");
        ItemRelatórioCompleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRelatórioCompleto1ActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemRelatórioCompleto1);

        ItemRelatórioCompleto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        ItemRelatórioCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/File.png"))); // NOI18N
        ItemRelatórioCompleto.setText("Relatório Completo");
        ItemRelatórioCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRelatórioCompletoActionPerformed(evt);
            }
        });
        MenuRelatorios.add(ItemRelatórioCompleto);

        MenuEstatisticas.add(MenuRelatorios);

        BarraDeMenu.add(MenuEstatisticas);

        MenuHistórico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/datakey.png"))); // NOI18N
        MenuHistórico.setText("Migração de Licenças");

        ItemHistórico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        ItemHistórico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report-3-16.png"))); // NOI18N
        ItemHistórico.setText("Histórico");
        ItemHistórico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemHistóricoActionPerformed(evt);
            }
        });
        MenuHistórico.add(ItemHistórico);

        BarraDeMenu.add(MenuHistórico);

        MenuSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/settings.png"))); // NOI18N
        MenuSuporte.setText("Suporte");

        ItemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        ItemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book.png"))); // NOI18N
        ItemManual.setText("Manual");
        ItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemManualActionPerformed(evt);
            }
        });
        MenuSuporte.add(ItemManual);

        ItemContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        ItemContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/business_contact.png"))); // NOI18N
        ItemContato.setText("Contato");
        ItemContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemContatoActionPerformed(evt);
            }
        });
        MenuSuporte.add(ItemContato);

        BarraDeMenu.add(MenuSuporte);

        MenuOpções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mouse.png"))); // NOI18N
        MenuOpções.setText("Opções");

        ItemMinimizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        ItemMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minimize-window-16.png"))); // NOI18N
        ItemMinimizar.setText("Minimizar");
        ItemMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMinimizarActionPerformed(evt);
            }
        });
        MenuOpções.add(ItemMinimizar);

        ItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit-16.png"))); // NOI18N
        ItemLogout.setText("Logout");
        ItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLogoutActionPerformed(evt);
            }
        });
        MenuOpções.add(ItemLogout);

        BarraDeMenu.add(MenuOpções);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(837, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCadastrosActionPerformed
        JFrame frame = new JFrame();
        frame.setContentPane(new gerenciadordelicencas.Licenças());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false); //desabilita maximizar
        frame.setTitle("Cadastro de Licenças");//titulo
        frame.setLocationRelativeTo(null);  //centraliza Jframe
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //icone
        frame.setVisible(true);

    }//GEN-LAST:event_ItemCadastrosActionPerformed

    private void ItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLogoutActionPerformed
        String message = " Deseja realmente trocar de usuário? ";
        String title = "Mensagem de confirmação:";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_ItemLogoutActionPerformed

    private void ItemMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMinimizarActionPerformed
        dispose();
        new gerenciadordelicencas.TrayIconDemo();
        String[] args = null;
        try {
            TrayIconDemo.run(args);
        } catch (Exception ex) {
            Logger.getLogger(FrontEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemMinimizarActionPerformed

    private void ItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemManualActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("https://drive.google.com/file/d/0B9U3bLG2ybf6Ym9MVFZyVk4wYlU/view?usp=sharing"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ItemManualActionPerformed

    private void ItemContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemContatoActionPerformed
        new Contato().setVisible(true);
    }//GEN-LAST:event_ItemContatoActionPerformed

    private void ItemHistóricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemHistóricoActionPerformed
        JFrame frame = new JFrame();
        frame.setContentPane(new gerenciadordelicencas.LogAdmin());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false); //desabilita maximizar
        frame.setTitle("Histórico");//titulo
        frame.setLocationRelativeTo(null);  //centraliza Jframe
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //icone
        frame.setVisible(true);
    }//GEN-LAST:event_ItemHistóricoActionPerformed

    private void ItemResumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemResumosActionPerformed
        JFrame frame = new JFrame();
        frame.setContentPane(new ResumosAdmin());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false); //desabilita maximizar
        frame.setTitle("Resumos");//titulo
        frame.setLocationRelativeTo(null);  //centraliza Jframe
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //icone
        frame.setVisible(true);
    }//GEN-LAST:event_ItemResumosActionPerformed

    private void ItemLicençasContratadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLicençasContratadasActionPerformed
        GraficoContratado p = new GraficoContratado();
        p.criaGrafico();
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p.pack();
        p.setResizable(false); //desabilita maximizar
        p.setTitle("Licenças Contratadas");//titulo
        p.setLocationRelativeTo(null);  //centraliza Jframe
        p.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //icone
        p.setVisible(true);
    }//GEN-LAST:event_ItemLicençasContratadasActionPerformed

    private void ItemLicençasemUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLicençasemUsoActionPerformed
        GraficoUtilizando p = new GraficoUtilizando();
        p.criaGrafico();
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p.pack();
        p.setResizable(false); //desabilita maximizar
        p.setTitle("Licenças em Uso");//titulo
        p.setLocationRelativeTo(null);  //centraliza Jframe
        p.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //icone
        p.setVisible(true);
    }//GEN-LAST:event_ItemLicençasemUsoActionPerformed

    private void ItemRelatórioCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRelatórioCompletoActionPerformed
        new gerenciadordelicencas.Relatorio();
        String[] args = null;
        try {
            Relatorio.run(args);
        } catch (Exception ex) {
            Logger.getLogger(FrontEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemRelatórioCompletoActionPerformed

    private void ItemRelatórioCompleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRelatórioCompleto1ActionPerformed
        new gerenciadordelicencas.RelatoriodeResumos();
        String[] args = null;
        try {
            RelatoriodeResumos.run(args);
        } catch (Exception ex) {
            Logger.getLogger(FrontEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemRelatórioCompleto1ActionPerformed

    public void run() {
        new FrontEnd().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JMenuItem ItemCadastros;
    private javax.swing.JMenuItem ItemContato;
    private javax.swing.JMenuItem ItemHistórico;
    private javax.swing.JMenuItem ItemLicençasContratadas;
    private javax.swing.JMenuItem ItemLicençasemUso;
    private javax.swing.JMenuItem ItemLogout;
    private javax.swing.JMenuItem ItemManual;
    private javax.swing.JMenuItem ItemMinimizar;
    private javax.swing.JMenuItem ItemRelatórioCompleto;
    private javax.swing.JMenuItem ItemRelatórioCompleto1;
    private javax.swing.JMenuItem ItemResumos;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenu MenuAdministrar;
    private javax.swing.JMenu MenuEstatisticas;
    private javax.swing.JMenu MenuGraficos;
    private javax.swing.JMenu MenuHistórico;
    private javax.swing.JMenu MenuOpções;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSuporte;
    private javax.swing.JPanel Painel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //To change body of generated methods, choose Tools | Templates.
    }

}
