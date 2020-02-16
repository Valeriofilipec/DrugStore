/**
         * Desponibiliza os módulos num menu
         * Faz a validação do acesso ao módulo escolhido,
         * se for validado com sucesso, fazer chamada do metodo principal do 
         * metodo escolhido.
         */
package drugstoresystem;
import GestaoPessoal.TelaGestaoPessoal;
import GestaoStock.TelaGestaoStock;
import GestaoRecursos.TelaGestaoRecursos;
import Contabilidade.TelaContabilidade;
//import static drugstoresystem.DrugStoreSystem.registoAtividade;//Dados do Usuario Ativo
import static drugstoresystem.DrugStoreSystem.registoAtividade;
import static drugstoresystem.TelaLogin.linha;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Valeriano Filipe Calológio
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        jFormattedTextFieldNFuncionario.setText(linha[0]);
        jFormattedTextFieldNome.setText(linha[2]);
        jFormattedTextFieldDepartamento.setText(linha[4]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButtonGestaoPessoal = new javax.swing.JButton();
        jButtonContabilidade = new javax.swing.JButton();
        jButtonGestaoRecursos = new javax.swing.JButton();
        jButtonGestaoStock = new javax.swing.JButton();
        jPanelInformacoesGerais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelNFuncionario = new javax.swing.JLabel();
        jLabelDepartamento = new javax.swing.JLabel();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDepartamento = new javax.swing.JFormattedTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemTerminalSessao = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemManual = new javax.swing.JMenuItem();
        jMenuItemEquipe = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DrugStoreProject - Sistema de Gerenciamento");
        setName("frameTelaPrincipal"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jButtonGestaoPessoal.setText("Gestão de Pessoal");
        jButtonGestaoPessoal.setToolTipText("Gestão de Pessoal");
        jButtonGestaoPessoal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGestaoPessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestaoPessoalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGestaoPessoal);
        jButtonGestaoPessoal.setBounds(30, 20, 150, 50);

        jButtonContabilidade.setText("Contabilidade");
        jButtonContabilidade.setToolTipText("Contabilidade");
        jButtonContabilidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonContabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContabilidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContabilidade);
        jButtonContabilidade.setBounds(240, 20, 150, 50);

        jButtonGestaoRecursos.setText("Gestão de Recursos");
        jButtonGestaoRecursos.setToolTipText("Gestão de Recursos");
        jButtonGestaoRecursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGestaoRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestaoRecursosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGestaoRecursos);
        jButtonGestaoRecursos.setBounds(450, 20, 150, 50);

        jButtonGestaoStock.setText("Gestão de Stock");
        jButtonGestaoStock.setToolTipText("Gestão de Stock");
        jButtonGestaoStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGestaoStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestaoStockActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGestaoStock);
        jButtonGestaoStock.setBounds(660, 20, 150, 50);

        jPanelInformacoesGerais.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPreincipalFundo.jpg"))); // NOI18N
        jPanelInformacoesGerais.add(jLabel1);
        jLabel1.setBounds(-90, 0, 630, 430);

        getContentPane().add(jPanelInformacoesGerais);
        jPanelInformacoesGerais.setBounds(380, 100, 460, 430);

        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(30, 120, 160, 30);

        jLabelNFuncionario.setText("Nº de Funcionário:");
        getContentPane().add(jLabelNFuncionario);
        jLabelNFuncionario.setBounds(30, 160, 160, 30);

        jLabelDepartamento.setText("Departamento:");
        getContentPane().add(jLabelDepartamento);
        jLabelDepartamento.setBounds(30, 210, 160, 30);

        jFormattedTextFieldNome.setEditable(false);
        jFormattedTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldNome);
        jFormattedTextFieldNome.setBounds(110, 120, 250, 30);

        jFormattedTextFieldNFuncionario.setEditable(false);
        getContentPane().add(jFormattedTextFieldNFuncionario);
        jFormattedTextFieldNFuncionario.setBounds(160, 160, 200, 30);

        jFormattedTextFieldDepartamento.setEditable(false);
        getContentPane().add(jFormattedTextFieldDepartamento);
        jFormattedTextFieldDepartamento.setBounds(160, 210, 200, 30);

        jMenu3.setText("Utilizador");

        jMenuItemTerminalSessao.setText("Terminar Sessão");
        jMenuItemTerminalSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTerminalSessaoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTerminalSessao);

        jMenuBar2.add(jMenu3);

        jMenuAjuda.setText("Ajuda");

        jMenuItemManual.setText("Manual DrugStoreProject");
        jMenuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManualActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemManual);

        jMenuItemEquipe.setText("Equipe");
        jMenuAjuda.add(jMenuItemEquipe);

        jMenuBar2.add(jMenuAjuda);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(861, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestaoPessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestaoPessoalActionPerformed
        // chamada da TelaGestaoPessoal verificando a Restrição segundo o cargo
        if(linha[4].equalsIgnoreCase("RH")){
            TelaGestaoPessoal telaGestaoPessoal = new TelaGestaoPessoal();
            telaGestaoPessoal.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_jButtonGestaoPessoalActionPerformed

    private void jButtonGestaoRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestaoRecursosActionPerformed
        // chamada da TelaGestaoPessoal verificando a Restrição segundo o cargo
        if(linha[4].equalsIgnoreCase("Gestão de Recursos") || linha[4].equalsIgnoreCase("RH")){
            TelaGestaoRecursos telaGestaoRecursos = new TelaGestaoRecursos();
            telaGestaoRecursos.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }

    }//GEN-LAST:event_jButtonGestaoRecursosActionPerformed

    private void jButtonContabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContabilidadeActionPerformed
        // chamada da TelaGestaoPessoal verificando a Restrição segundo o cargo
        if(linha[4].equalsIgnoreCase("Contabilidade") || linha[4].equalsIgnoreCase("RH")){
            TelaContabilidade telaContabilidade = new TelaContabilidade();
            telaContabilidade.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }

    }//GEN-LAST:event_jButtonContabilidadeActionPerformed

    private void jButtonGestaoStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestaoStockActionPerformed
        // chamada da TelaGestaoPessoal verificando a Restrição segundo o cargo
        if(linha[4].equalsIgnoreCase("Gestão de Stock") || linha[4].equalsIgnoreCase("RH")){
            TelaGestaoStock telaGestaoStock = new TelaGestaoStock();
            telaGestaoStock.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }

    }//GEN-LAST:event_jButtonGestaoStockActionPerformed

    private void jMenuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemManualActionPerformed

    private void jMenuItemTerminalSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTerminalSessaoActionPerformed
        //Guardar Fim de atividade
        try{
            FileWriter registoAtiv = new FileWriter(registoAtividade.getName(), true);
            BufferedWriter saida = new BufferedWriter(registoAtiv);
            saida.newLine();
            saida.write(new Date().toString()+";"+linha[0]+";"+linha[2]+"; Saida");
            saida.close();
            }
            catch(IOException ex){
            JOptionPane.showConfirmDialog(rootPane, "Foi impssivel registar Saida!");
            }
        // Fechar TelaPrincipal e abrir TelaLogin
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTerminalSessaoActionPerformed

    private void jFormattedTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContabilidade;
    private javax.swing.JButton jButtonGestaoPessoal;
    private javax.swing.JButton jButtonGestaoRecursos;
    private javax.swing.JButton jButtonGestaoStock;
    private javax.swing.JFormattedTextField jFormattedTextFieldDepartamento;
    private javax.swing.JFormattedTextField jFormattedTextFieldNFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelNFuncionario;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemEquipe;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemTerminalSessao;
    private javax.swing.JPanel jPanelInformacoesGerais;
    // End of variables declaration//GEN-END:variables
}
