package view;

import controller.UsuarioController;
import dao.ClienteDAO;
import dao.UsuarioDAO;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author crist
 */
public class Main extends javax.swing.JFrame {

    private UsuarioController controller;

    private static TelaRegistro telaRegistro;
    private static TelaCliente telaCliente;
    private static TelaVeiculo telaVeiculo;
    private static TelaAgencia telaAgencia;
    private static TelaAluguel telaAluguel;
    private static TelaPagamento telaPagamento;
    public static TelaPagarParcelas telaPagarParcelas;

    public Main() {
        initComponents();
        estadoInicial(false);
        controller = new UsuarioController();

        telaRegistro = new TelaRegistro();
        telaCliente = new TelaCliente();
        telaVeiculo = new TelaVeiculo();
        telaAgencia = new TelaAgencia();
        telaAluguel = new TelaAluguel();
        telaPagamento = new TelaPagamento();
        telaPagarParcelas = new TelaPagarParcelas();

        custom();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        painelPrincipal = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        separatorUsuario = new javax.swing.JSeparator();
        labelSenha = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        separatorSenha = new javax.swing.JSeparator();
        inputSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        labelAvisos = new javax.swing.JLabel();
        labelSemConta = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        separatorBtns = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        labelUsuarioLogado = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuVeiculos = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        menuAgencias = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();
        menuAlugueis = new javax.swing.JMenuItem();
        menu5 = new javax.swing.JMenu();
        menuPagamentos = new javax.swing.JMenuItem();
        menuPagamentos1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 722));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 722));

        desktop.setBackground(new java.awt.Color(49, 65, 78));
        desktop.setMaximumSize(new java.awt.Dimension(1024, 722));
        desktop.setMinimumSize(new java.awt.Dimension(1024, 722));
        desktop.setOpaque(false);

        painelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        painelPrincipal.setMaximumSize(new java.awt.Dimension(1024, 722));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(1024, 722));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(1024, 722));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLogin.setBackground(new java.awt.Color(23, 28, 31));
        painelLogin.setPreferredSize(new java.awt.Dimension(512, 722));
        painelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(1, 159, 224));
        labelTitulo.setText("LOGIN");
        painelLogin.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 70, 110, -1));

        inputUsuario.setBackground(new java.awt.Color(23, 28, 31));
        inputUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(1, 159, 224));
        inputUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputUsuario.setBorder(null);
        inputUsuario.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputUsuario.setSelectionColor(new java.awt.Color(1, 159, 224));
        painelLogin.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 200, 260, 50));

        separatorUsuario.setBackground(new java.awt.Color(1, 159, 224));
        separatorUsuario.setForeground(new java.awt.Color(1, 159, 224));
        separatorUsuario.setOpaque(true);
        painelLogin.add(separatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 250, 260, 5));

        labelSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(1, 159, 224));
        labelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/password-bold.png"))); // NOI18N
        labelSenha.setText("Senha");
        painelLogin.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 300, -1, -1));

        labelUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(1, 159, 224));
        labelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-bold.png"))); // NOI18N
        labelUsuario.setText("Usuário");
        painelLogin.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 180, -1, -1));

        separatorSenha.setBackground(new java.awt.Color(1, 159, 224));
        separatorSenha.setForeground(new java.awt.Color(1, 159, 224));
        separatorSenha.setOpaque(true);
        painelLogin.add(separatorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 370, 260, 5));

        inputSenha.setBackground(new java.awt.Color(23, 28, 31));
        inputSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(1, 159, 224));
        inputSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputSenha.setBorder(null);
        inputSenha.setMaximumSize(new java.awt.Dimension(260, 50));
        inputSenha.setMinimumSize(new java.awt.Dimension(260, 50));
        inputSenha.setPreferredSize(new java.awt.Dimension(260, 50));
        inputSenha.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputSenha.setSelectionColor(new java.awt.Color(1, 159, 224));
        painelLogin.add(inputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 320, 260, 50));

        btnLogin.setBackground(new java.awt.Color(1, 159, 224));
        btnLogin.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(23, 28, 31));
        btnLogin.setText("ENTRAR");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        painelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 410, 100, 45));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        painelLogin.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 260, -1));

        labelSemConta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        labelSemConta.setForeground(new java.awt.Color(204, 204, 204));
        labelSemConta.setText("Não possui conta?");
        painelLogin.add(labelSemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(34, 34, 34));
        btnCadastrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(1, 159, 224));
        btnCadastrar.setText("CADASTRE-SE");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setMaximumSize(new java.awt.Dimension(100, 45));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(100, 45));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(100, 45));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        painelLogin.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 570, 110, 45));

        separatorBtns.setBackground(new java.awt.Color(1, 159, 224));
        separatorBtns.setForeground(new java.awt.Color(1, 159, 224));
        separatorBtns.setOpaque(true);
        painelLogin.add(separatorBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 400, 3));

        painelPrincipal.add(painelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoGrande.png"))); // NOI18N
        painelPrincipal.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 570, 300));

        btnSair.setBackground(new java.awt.Color(34, 34, 34));
        btnSair.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(1, 159, 224));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sign-out-bold.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        labelUsuarioLogado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelUsuarioLogado.setForeground(new java.awt.Color(1, 159, 224));
        labelUsuarioLogado.setText(" ");
        labelUsuarioLogado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelPrincipal.add(labelUsuarioLogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 80, -1));

        desktop.setLayer(painelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(51, 51, 51));
        menuBar.setBorder(null);
        menuBar.setMaximumSize(new java.awt.Dimension(1024, 22));
        menuBar.setMinimumSize(new java.awt.Dimension(1024, 22));
        menuBar.setPreferredSize(new java.awt.Dimension(1024, 22));

        menu1.setBackground(new java.awt.Color(0, 31, 44));
        menu1.setBorder(null);
        menu1.setForeground(new java.awt.Color(1, 159, 224));
        menu1.setText("CLIENTES");
        menu1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menu1.setMaximumSize(new java.awt.Dimension(75, 22));
        menu1.setPreferredSize(new java.awt.Dimension(50, 22));

        menuClientes.setText("ACESSAR ÁREA");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menu1.add(menuClientes);

        menuBar.add(menu1);

        menu2.setBackground(new java.awt.Color(0, 31, 44));
        menu2.setBorder(null);
        menu2.setForeground(new java.awt.Color(1, 159, 224));
        menu2.setText("VEÍCULOS");
        menu2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menu2.setMaximumSize(new java.awt.Dimension(75, 22));
        menu2.setPreferredSize(new java.awt.Dimension(75, 15));

        menuVeiculos.setText("ACESSAR ÁREA");
        menuVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVeiculosActionPerformed(evt);
            }
        });
        menu2.add(menuVeiculos);

        menuBar.add(menu2);

        menu3.setBackground(new java.awt.Color(0, 31, 44));
        menu3.setBorder(null);
        menu3.setForeground(new java.awt.Color(1, 159, 224));
        menu3.setText("AGÊNCIAS");
        menu3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menu3.setMaximumSize(new java.awt.Dimension(75, 22));
        menu3.setMinimumSize(new java.awt.Dimension(75, 22));
        menu3.setPreferredSize(new java.awt.Dimension(75, 22));

        menuAgencias.setText("ACESSAR ÁREA");
        menuAgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgenciasActionPerformed(evt);
            }
        });
        menu3.add(menuAgencias);

        menuBar.add(menu3);

        menu4.setBackground(new java.awt.Color(0, 31, 44));
        menu4.setBorder(null);
        menu4.setForeground(new java.awt.Color(1, 159, 224));
        menu4.setText("ALUGUÉIS");
        menu4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menu4.setMaximumSize(new java.awt.Dimension(75, 22));
        menu4.setMinimumSize(new java.awt.Dimension(75, 22));
        menu4.setPreferredSize(new java.awt.Dimension(75, 22));

        menuAlugueis.setText("ACESSAR ÁREA");
        menuAlugueis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlugueisActionPerformed(evt);
            }
        });
        menu4.add(menuAlugueis);

        menuBar.add(menu4);

        menu5.setBackground(new java.awt.Color(0, 31, 44));
        menu5.setBorder(null);
        menu5.setForeground(new java.awt.Color(1, 159, 224));
        menu5.setText("PAGAMENTOS");
        menu5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menu5.setMaximumSize(new java.awt.Dimension(85, 22));
        menu5.setMinimumSize(new java.awt.Dimension(85, 22));
        menu5.setPreferredSize(new java.awt.Dimension(85, 22));

        menuPagamentos.setText("ACESSAR ÁREA");
        menuPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPagamentosActionPerformed(evt);
            }
        });
        menu5.add(menuPagamentos);

        menuPagamentos1.setText("INFORMAR PAGAMENTO");
        menuPagamentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPagamentos1ActionPerformed(evt);
            }
        });
        menu5.add(menuPagamentos1);

        menuBar.add(menu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        if (!telaCliente.isVisible()) {
            desktop.add(telaCliente);
            telaCliente.setVisible(true);
        } else {
            telaCliente.toFront();
        }


    }//GEN-LAST:event_menuClientesActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!telaRegistro.isVisible()) {
            desktop.add(telaRegistro);
            telaRegistro.setVisible(true);
            telaRegistro.setLocation(25, 90);
        } else {
            telaRegistro.toFront();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void menuVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVeiculosActionPerformed
        if (!telaVeiculo.isVisible()) {
            desktop.add(telaVeiculo);
            telaVeiculo.setVisible(true);
        } else {
            telaVeiculo.toFront();
        }
    }//GEN-LAST:event_menuVeiculosActionPerformed

    private void menuAgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgenciasActionPerformed
        if (!telaAgencia.isVisible()) {
            desktop.add(telaAgencia);
            telaAgencia.setVisible(true);
        } else {
            telaAgencia.toFront();
        }
    }//GEN-LAST:event_menuAgenciasActionPerformed

    private void menuAlugueisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlugueisActionPerformed

        if (!telaAluguel.isVisible()) {
            desktop.add(telaAluguel);
            telaAluguel.setVisible(true);
        } else {
            telaAluguel.toFront();
        }


    }//GEN-LAST:event_menuAlugueisActionPerformed

    private void menuPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPagamentosActionPerformed
        if (!telaPagamento.isVisible()) {
            desktop.add(telaPagamento);
            telaPagamento.setVisible(true);
        } else {
            telaPagamento.toFront();
        }
    }//GEN-LAST:event_menuPagamentosActionPerformed

    private void menuPagamentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPagamentos1ActionPerformed
        if (!telaPagarParcelas.isVisible()) {
            desktop.add(telaPagarParcelas);
            telaPagarParcelas.setVisible(true);
        } else {
            telaPagarParcelas.setVisible(true);
        }
    }//GEN-LAST:event_menuPagamentos1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = inputUsuario.getText().trim();
        char[] senha = inputSenha.getPassword();
        if (!usuario.isEmpty()) {

            String senhaString = new String(senha);

            boolean autenticado = controller.autenticarUsuario(usuario, senhaString);

            if (autenticado) {
                labelAvisos.setText("");
                acessoLiberado(true);
                labelUsuarioLogado.setVisible(true);
                labelUsuarioLogado.setText(usuario);
                btnSair.setVisible(true);
                estadoLogado(false);

            } else {
                labelAvisos.setText("Credenciais inválidas");
                inputSenha.setText("");
                inputSenha.requestFocus();
            }
        } else {
            labelAvisos.setText("Usuário inválido");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        estadoInicial(false);
        estadoLogado(true);


    }//GEN-LAST:event_btnSairActionPerformed
    private void estadoLogado(boolean x) {
        btnLogin.setEnabled(x);
        btnCadastrar.setEnabled(x);
        inputUsuario.setText("");
        inputUsuario.setEditable(x);
        inputSenha.setText("");
        inputSenha.setEditable(x);
    }

    private void acessoLiberado(boolean op) {
        menu1.setEnabled(op);
        menu2.setEnabled(op);
        menu3.setEnabled(op);
        menu4.setEnabled(op);
        menu5.setEnabled(op);
    }

    private void estadoInicial(boolean op) {
        acessoLiberado(op);
        inputUsuario.requestFocus();
        labelUsuarioLogado.setVisible(false);
        btnSair.setVisible(false);
    }

    public void custom() {
        btnLogin.setUI(new BasicButtonUI());
        btnCadastrar.setUI(new BasicButtonUI());
        btnSair.setUI(new BasicButtonUI());
        menuBar.setUI(new BasicMenuBarUI());

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelSemConta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuarioLogado;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu4;
    private javax.swing.JMenu menu5;
    private javax.swing.JMenuItem menuAgencias;
    private javax.swing.JMenuItem menuAlugueis;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuPagamentos;
    private javax.swing.JMenuItem menuPagamentos1;
    private javax.swing.JMenuItem menuVeiculos;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JSeparator separatorBtns;
    private javax.swing.JSeparator separatorSenha;
    private javax.swing.JSeparator separatorUsuario;
    // End of variables declaration//GEN-END:variables
}
