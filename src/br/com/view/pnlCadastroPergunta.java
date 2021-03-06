/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.dao.impl.AlternativaDaoImpl;
import br.com.dao.impl.PerguntaDaoImpl;
import br.com.entidade.Alternativa;
import br.com.entidade.Pergunta;
import br.com.manter.manterTeste;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe-Sistema
 */
public class pnlCadastroPergunta extends javax.swing.JPanel {

    private Pergunta pergunta;
    private List<Alternativa> alternativas;

    /**
     * Creates new form pnlCadastroPergunta
     */
    public pnlCadastroPergunta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                ImageIcon bgIcon = new ImageIcon("bgTop.png"); //getClass().getResource("/imagem/loginbg.jpg")
                Image bg = bgIcon.getImage();
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jPanel3 = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSair = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                ImageIcon bgIcon = new ImageIcon("bgDown.png"); //getClass().getResource("/imagem/loginbg.jpg")
                Image bg = bgIcon.getImage();
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        epPergunta = new javax.swing.JEditorPane();
        lbPergunta = new javax.swing.JLabel();
        txA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txB = new javax.swing.JTextField();
        txC = new javax.swing.JTextField();
        txD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        rbD = new javax.swing.JRadioButton();
        btSalvar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuario.setText("Nome Usuário");
        jPanel3.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 30));

        lbPontos.setForeground(new java.awt.Color(255, 255, 255));
        lbPontos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPontos.setText("Pontos: 000");
        jPanel3.add(lbPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 46, 160, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/infoUsuario.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 10, 260, 71));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/logoTop.png"))); // NOI18N

        lbSair.setForeground(new java.awt.Color(153, 204, 255));
        lbSair.setText("Sair");
        lbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSair)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addComponent(lbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/senacMenor.png"))); // NOI18N
        jLabel3.setText("Desenvolvido por: Felipe Stahlhofer, Érick Miguel Costa e Robson Pfleger");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/retornar.png"))); // NOI18N
        jLabel5.setText("Retornar ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        epPergunta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(epPergunta);

        lbPergunta.setText("Teste:");

        jLabel4.setText("A)");

        jLabel6.setText("B)");

        jLabel7.setText("C)");

        jLabel8.setText("D)");

        rbA.setSelected(true);
        rbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAActionPerformed(evt);
            }
        });

        rbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBActionPerformed(evt);
            }
        });

        rbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCActionPerformed(evt);
            }
        });

        rbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPergunta)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txB)
                                        .addComponent(txC)
                                        .addComponent(txD)
                                        .addComponent(txA))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbA)
                                        .addComponent(rbB)
                                        .addComponent(rbC, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbD)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rbB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbC)
                    .addComponent(txC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbD)
                    .addComponent(txD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btSalvar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        // TODO add your handling code here:
        pnlLogin pnl = new pnlLogin();
        FrmPrincipal.frmPrincipal.setContentPane(pnl);
        FrmPrincipal.frmPrincipal.setVisible(true);
    }//GEN-LAST:event_lbSairMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pnlJavaTeste pnl = new pnlJavaTeste();
        FrmPrincipal.frmPrincipal.setContentPane(pnl);
        FrmPrincipal.frmPrincipal.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void rbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCActionPerformed
        if (rbC.isSelected()) {
            rbD.setSelected(false);
            rbA.setSelected(false);
            rbB.setSelected(false);
        }
    }//GEN-LAST:event_rbCActionPerformed

    private void rbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAActionPerformed
        if (rbA.isSelected()) {
            rbB.setSelected(false);
            rbC.setSelected(false);
            rbD.setSelected(false);
        }
    }//GEN-LAST:event_rbAActionPerformed

    private void rbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBActionPerformed
        if (rbB.isSelected()) {
            rbC.setSelected(false);
            rbD.setSelected(false);
            rbA.setSelected(false);
        }
    }//GEN-LAST:event_rbBActionPerformed

    private void rbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDActionPerformed
        if (rbD.isSelected()) {
            rbA.setSelected(false);
            rbB.setSelected(false);
            rbC.setSelected(false);
        }
    }//GEN-LAST:event_rbDActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        PerguntaDaoImpl perguntaDao = new PerguntaDaoImpl();
        AlternativaDaoImpl alternativaDao = new AlternativaDaoImpl();
        if (epPergunta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira os dados do teste!");
            return;
        } else if (txA.getText().equals("") || txB.getText().equals("") || txC.getText().equals("") || txD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira as respostas do teste!");
            return;
        }
        if (pergunta == null) {
            try {
                pergunta = new Pergunta();
                pergunta.setDescricao(epPergunta.getText());
                pergunta.setNivel(manterTeste.getNumPerguntaTotal() + 1);
                pergunta.setId(perguntaDao.salvarId(pergunta));

                alternativas = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    Alternativa alternativa = new Alternativa();
                    alternativa.setPergunta(pergunta);
                    switch (i) {
                        case 0:
                            alternativa.setDescricao(txA.getText());
                            alternativa.setVerdadeiro(rbA.isSelected());
                            break;
                        case 1:
                            alternativa.setDescricao(txB.getText());
                            alternativa.setVerdadeiro(rbB.isSelected());
                            break;
                        case 2:
                            alternativa.setDescricao(txC.getText());
                            alternativa.setVerdadeiro(rbC.isSelected());
                            break;
                        case 3:
                            alternativa.setDescricao(txD.getText());
                            alternativa.setVerdadeiro(rbD.isSelected());
                            break;
                    }
                    alternativa.setId(alternativaDao.salvarId(alternativa));
                    alternativas.add(alternativa);
                }
                JOptionPane.showMessageDialog(null, "Teste Cadastrado com sucesso!");
                pnlJavaTeste pnl = new pnlJavaTeste();
                FrmPrincipal.frmPrincipal.setContentPane(pnl);
                FrmPrincipal.frmPrincipal.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(pnlCadastroPergunta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                pergunta = new Pergunta();
                pergunta.setDescricao(epPergunta.getText());
                pergunta.setNivel(manterTeste.getNumPerguntaTotal() + 1);
                perguntaDao.alterar(pergunta);

                alternativas = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    Alternativa alternativa = alternativas.get(i);
                    switch (i) {
                        case 0:
                            alternativa.setDescricao(txA.getText());
                            alternativa.setVerdadeiro(rbA.isSelected());
                            break;
                        case 1:
                            alternativa.setDescricao(txB.getText());
                            alternativa.setVerdadeiro(rbB.isSelected());
                            break;
                        case 2:
                            alternativa.setDescricao(txC.getText());
                            alternativa.setVerdadeiro(rbC.isSelected());
                            break;
                        case 3:
                            alternativa.setDescricao(txD.getText());
                            alternativa.setVerdadeiro(rbD.isSelected());
                            break;
                    }
                    alternativaDao.alterar(alternativa);
                }

            } catch (SQLException ex) {
                Logger.getLogger(pnlCadastroPergunta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JEditorPane epPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPergunta;
    private javax.swing.JLabel lbPontos;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbD;
    private javax.swing.JTextField txA;
    private javax.swing.JTextField txB;
    private javax.swing.JTextField txC;
    private javax.swing.JTextField txD;
    // End of variables declaration//GEN-END:variables
}
