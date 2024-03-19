package telas.contato;

import dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;
import telas.telaSobre;

public class telaDeletar extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public telaDeletar() {
        initComponents();
        conexao = ModuloConexao.conector();
    }


    @SuppressWarnings("unchecked")
    // Método para excluir contato
    public void excluir(){
        // Validando campo de texto
        if(txtId.getText().equals("") || txtId.getText().equals(" ")){
            JOptionPane.showMessageDialog(null,"Insira um ID!!");
            return;
        }
        
        // Mensagem de Confirmação
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja apagar esse Contato?","Atenção",JOptionPane.YES_NO_OPTION);
        
        // Se Usuário confirmar a ação
        if(confirm == JOptionPane.YES_OPTION){
            String sql = "DELETE FROM tblcontatos WHERE id=?";
            
            // Tenta realizar a instrução
            try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtId.getText());
                pst.executeUpdate();
                
                // Limpando Campo
                txtId.setText(null);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            } 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExcluit = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnInserir1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenu();
        opcaoSair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Deletar Usuário");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel4.setText("ID");

        btnExcluit.setBackground(new java.awt.Color(153, 153, 153));
        btnExcluit.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnExcluit.setText("Excluir");
        btnExcluit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluitActionPerformed(evt);
            }
        });

        jMenu2.setText("Cadastrar");

        btnInserir1.setText("Inserir");
        btnInserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir1ActionPerformed(evt);
            }
        });
        jMenu2.add(btnInserir1);

        jMenuItem2.setText("Editar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Visualizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        btnSair.setText("Opções");

        opcaoSair.setText("Sair");
        opcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSairActionPerformed(evt);
            }
        });
        btnSair.add(opcaoSair);

        jMenuBar2.add(btnSair);

        jMenu4.setText("Sobre");

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jMenu4.add(btnSobre);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExcluit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnExcluit)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluitActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_btnExcluitActionPerformed

    private void btnInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir1ActionPerformed
        telaInserir inserir = new telaInserir();
        this.setVisible(false);
        inserir.setVisible(true);
    }//GEN-LAST:event_btnInserir1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        telaEditar editar = new telaEditar();
        this.setVisible(false);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        telaVisualizar visualizar = new telaVisualizar();
        this.setVisible(false);
        visualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        // TODO add your handling code here:
        //Exibe diálogo para confirmar saída
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção",JOptionPane.YES_OPTION);
        // Se a opção for sim saia da aplicação
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_opcaoSairActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // Instância nova tela Sobre
        telaSobre sobre = new telaSobre();
        // Remove a tela atual e mostra a tela Sobre
        this.setVisible(false);
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeletar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluit;
    private javax.swing.JMenuItem btnInserir1;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem opcaoSair;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
