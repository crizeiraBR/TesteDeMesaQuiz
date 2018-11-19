/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.dao.impl.TesteDaoImpl;
import br.com.dao.impl.Usuario_perguntaDaoImpl;
import br.com.entidade.Pergunta;
import br.com.entidade.Teste;
import br.com.entidade.Usuario_pergunta;
import br.com.manter.manterTeste;
import br.com.manter.manterUsuarioLogado;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Felipe-Sistema
 */
public class pnlJavaTeste extends javax.swing.JPanel {

    Integer numBotao;

    /**
     * Creates new form pnlJavaTeste
     */
    public pnlJavaTeste() {
        initComponents();
        TesteDaoImpl testeDao = new TesteDaoImpl();
        try {
            manterTeste.setTeste((Teste) testeDao.pesquisarPorId(manterTeste.getTeste().getId()));
        } catch (SQLException ex) {
            Logger.getLogger(pnlJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbUsuario.setText(manterUsuarioLogado.getUsuario().getNome());
        lbPontos.setText(manterUsuarioLogado.getUsuario().getPontos().toString());
        numBotao = 0;
        addPerguntas();
        if (manterUsuarioLogado.getUsuario().getAdmin()) {
            btAddPergunta.setVisible(true);
        } else {
            btAddPergunta.setVisible(false);
        }
    }

    private void addPerguntas() {
        Teste teste = manterTeste.getTeste();
        Boolean travado;
        Boolean ultimo = true;
        for (Pergunta pergunta : teste.getPerguntas()) {
            if (ultimo) {
                if (pergunta.getUsuario_pergunta() == null) {
                    ultimo = false;
                }
                travado = false;
            } else {
                travado = true;
            }
            numBotao++;
            addBotao(numBotao, pergunta, travado);
        }
        manterTeste.setNumPerguntaTotal(numBotao);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btAddPergunta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
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
        jLabel3.setText("Desenvolvido por: Felipe Stahlhofer. Está no grupo: Érick Miguel Costa e Robson Pfleger");
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
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        jScrollPane2.setViewportView(jPanel4);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/javaLogo.png"))); // NOI18N

        btAddPergunta.setText("Adicionar Pergunta");
        btAddPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPerguntaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/retornar.png"))); // NOI18N
        jLabel5.setText("Retornar ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAddPergunta)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        pnlLogin pnl = new pnlLogin();
        FrmPrincipal.frmPrincipal.setContentPane(pnl);
        FrmPrincipal.frmPrincipal.setVisible(true);

    }//GEN-LAST:event_lbSairMouseClicked

    private void btAddPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPerguntaActionPerformed
        pnlCadastroPergunta pnl = new pnlCadastroPergunta();
        FrmPrincipal.frmPrincipal.setContentPane(pnl);
        FrmPrincipal.frmPrincipal.setVisible(true);
    }//GEN-LAST:event_btAddPerguntaActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pnlTestes pnl = new pnlTestes();
        FrmPrincipal.frmPrincipal.setContentPane(pnl);
        FrmPrincipal.frmPrincipal.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void addBotao(Integer num, Pergunta pergunta, Boolean travado) {
        java.awt.GridBagConstraints gridBagConstraints;
        javax.swing.JButton botaoNivel = new javax.swing.JButton();
        botaoNivel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        if (travado) {
            botaoNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/cadeado.png")));
            botaoNivel.setEnabled(false);
        } else {
            botaoNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/descadeado.png"))); // NOI18N            
        }
        botaoNivel.setText(num.toString());
        botaoNivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoNivel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoNivel.setIconTextGap(25);
        botaoNivel.setInheritsPopupMenu(true);
        botaoNivel.setMinimumSize(new java.awt.Dimension(91, 63));
        botaoNivel.setPreferredSize(new java.awt.Dimension(120, 80));
        botaoNivel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterTeste.setNumPerguntaAtual(num - 1);
                pnlJavaPergunta pnl = new pnlJavaPergunta(pergunta);
                FrmPrincipal.frmPrincipal.setContentPane(pnl);
                FrmPrincipal.frmPrincipal.setVisible(true);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        if (num % 10 != 0) {
            gridBagConstraints.gridx = num % 10;
            gridBagConstraints.gridy = num / 10;
        } else {
            gridBagConstraints.gridx = 10;
            gridBagConstraints.gridy = (num / 10) - 1;
        }
        if (pergunta.getUsuario_pergunta() != null) {
            if (pergunta.getUsuario_pergunta().getCorreto()) {
                botaoNivel.setBackground(new java.awt.Color(51, 204, 0));
            } else {
                botaoNivel.setBackground(new java.awt.Color(153, 0, 0));
            }
        }
        jPanel4.add(botaoNivel, gridBagConstraints);
        this.repaint();
        this.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPontos;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
