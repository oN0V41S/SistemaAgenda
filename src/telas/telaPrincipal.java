package telas;

import javax.swing.JOptionPane;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnContatos = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenu();
        opcaoSair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastrar");

        btnContatos.setText("Contatos");
        btnContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContatosActionPerformed(evt);
            }
        });
        jMenu1.add(btnContatos);

        jMenuBar1.add(jMenu1);

        btnSair.setText("Opções");

        opcaoSair.setText("Sair");
        opcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSairActionPerformed(evt);
            }
        });
        btnSair.add(opcaoSair);

        jMenuBar1.add(btnSair);

        jMenu4.setText("Sobre");

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jMenu4.add(btnSobre);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
        // Instância nova tela Sobre
        telaSobre sobre = new telaSobre();
        // Remove a tela atual e mostra a tela Sobre
        this.setVisible(false);
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        // TODO add your handling code here:
        //Exibe diálogo para confirmar saída
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção",JOptionPane.YES_OPTION);
        // Se a opção for sim saia da aplicação
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_opcaoSairActionPerformed

    private void btnContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContatosActionPerformed
        // TODO add your handling code here:
        // Instância nova tela Cadastro
        telaCadastro cadastro = new telaCadastro();
        // Remove a tela atual e mostra a tela Sobre
        this.setVisible(false);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnContatosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnContatos;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opcaoSair;
    // End of variables declaration//GEN-END:variables
}