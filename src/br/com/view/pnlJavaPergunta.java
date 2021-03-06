/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.dao.impl.UsuarioDaoImpl;
import br.com.dao.impl.Usuario_perguntaDaoImpl;
import br.com.entidade.Alternativa;
import br.com.entidade.Pergunta;
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
public class pnlJavaPergunta extends javax.swing.JPanel {

    private Pergunta perguntaAtual;
    private javax.swing.JButton btCorreto;

    /**
     * Creates new form pnlJavaPergunta
     */
    public pnlJavaPergunta(Pergunta pergunta) {
        initComponents();
        perguntaAtual = pergunta;
        lbUsuario.setText(manterUsuarioLogado.getUsuario().getNome());
        lbPontos.setText(manterUsuarioLogado.getUsuario().getPontos().toString());

        jEditorPane1.setText(pergunta.getDescricao());
        Integer numAlternativa = 1;
        for (Alternativa alternativa : pergunta.getAlternativas()) {

            switch (numAlternativa) {
                case 1:
                    if (alternativa.getVerdadeiro()) {
                        btCorreto = btA;
                    }
                    btA.setText(alternativa.getDescricao());
                    btA.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            resposta(alternativa.getVerdadeiro(), btA);
                        }
                    });
                    break;
                case 2:
                    if (alternativa.getVerdadeiro()) {
                        btCorreto = btB;
                    }
                    btB.setText(alternativa.getDescricao());
                    btB.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            resposta(alternativa.getVerdadeiro(), btB);
                        }
                    });
                    break;
                case 3:
                    if (alternativa.getVerdadeiro()) {
                        btCorreto = btC;
                    }
                    btC.setText(alternativa.getDescricao());
                    btC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            resposta(alternativa.getVerdadeiro(), btC);
                        }
                    });
                    break;
                case 4:
                    if (alternativa.getVerdadeiro()) {
                        btCorreto = btD;
                    }
                    btD.setText(alternativa.getDescricao());
                    btD.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            resposta(alternativa.getVerdadeiro(), btD);
                        }
                    });
                    break;
            }
            numAlternativa++;
        }
        if (pergunta.getUsuario_pergunta() != null) {
            lbProximo.setEnabled(true);
            btCorreto.setBackground(new java.awt.Color(51, 204, 0));
        }

    }

    private void resposta(Boolean acertou, javax.swing.JButton botao) {
        if (perguntaAtual.getUsuario_pergunta() == null) {
            Usuario_perguntaDaoImpl usuario_perguntaDao = new Usuario_perguntaDaoImpl();
            Usuario_pergunta usuario_pergunta = new Usuario_pergunta();
            usuario_pergunta.setPergunta(perguntaAtual);
            usuario_pergunta.setUsuario(manterUsuarioLogado.getUsuario());
            usuario_pergunta.setCorreto(acertou);
            try {
                usuario_perguntaDao.salvar(usuario_pergunta);
                perguntaAtual.setUsuario_pergunta(usuario_pergunta);
            } catch (SQLException ex) {
                Logger.getLogger(pnlJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (acertou) {
                botao.setBackground(new java.awt.Color(51, 204, 0));
                Integer pontos = manterUsuarioLogado.getUsuario().getPontos() + 10;
                manterUsuarioLogado.getUsuario().setPontos(pontos);
                UsuarioDaoImpl usuarioDao = new UsuarioDaoImpl();
                try {
                    usuarioDao.alterar(manterUsuarioLogado.getUsuario());
                } catch (SQLException ex) {
                    Logger.getLogger(pnlJavaPergunta.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                botao.setBackground(new java.awt.Color(153, 0, 0));
                btCorreto.setBackground(new java.awt.Color(51, 204, 0));
            }
        }
        lbProximo.setEnabled(true);
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
        lbPergunta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel4 = new javax.swing.JPanel();
        btA = new javax.swing.JButton();
        btB = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        btD = new javax.swing.JButton();
        lbProximo = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
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

        lbPergunta.setText("Teste:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/retornar.png"))); // NOI18N
        jLabel5.setText("Retornar ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/javaLogo.png"))); // NOI18N

        jEditorPane1.setEditable(false);
        jEditorPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        btA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/a.png"))); // NOI18N
        btA.setText("Resposta 01");
        btA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel4.add(btA, gridBagConstraints);

        btB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/b.png"))); // NOI18N
        btB.setText("Resposta 02");
        btB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(btB, gridBagConstraints);

        btC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/c.png"))); // NOI18N
        btC.setText("Resposta 03");
        btC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(btC, gridBagConstraints);

        btD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/d.png"))); // NOI18N
        btD.setText("Resposta 04");
        btD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(btD, gridBagConstraints);

        lbProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/proximo.png"))); // NOI18N
        lbProximo.setText("Próximo");
        lbProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbProximo.setEnabled(false);
        lbProximo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbProximo.setInheritsPopupMenu(false);
        lbProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProximoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPergunta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbProximo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPergunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbProximo))
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

    private void lbProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProximoMouseClicked
        if (this.lbProximo.isEnabled()) {
            Integer num = manterTeste.getNumPerguntaAtual() + 1;
            if (manterTeste.getNumPerguntaTotal() > num) {
                pnlJavaPergunta pnl = new pnlJavaPergunta(manterTeste.getTeste().getPerguntas().get(num));
                manterTeste.setNumPerguntaAtual(num);
                FrmPrincipal.frmPrincipal.setContentPane(pnl);
                FrmPrincipal.frmPrincipal.setVisible(true);
            } else {
                pnlJavaTeste pnl = new pnlJavaTeste();
                FrmPrincipal.frmPrincipal.setContentPane(pnl);
                FrmPrincipal.frmPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_lbProximoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btA;
    private javax.swing.JButton btB;
    private javax.swing.JButton btC;
    private javax.swing.JButton btD;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPergunta;
    private javax.swing.JLabel lbPontos;
    private javax.swing.JLabel lbProximo;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
