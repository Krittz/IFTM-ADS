package view;

import model.Usuario;
import controller.UsuarioController;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author crist
 */
public class TelaRegistro extends javax.swing.JInternalFrame {

    private UsuarioController controller;

    public TelaRegistro() {
        initComponents();
        controller = new UsuarioController();

        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                clear();
                labelAvisos.setText("");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        labelAvisos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputPassword1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("REGISTRE-SE");
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 159, 224));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-bold.png"))); // NOI18N
        jLabel3.setText("USUÁRIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        inputUsername.setBackground(new java.awt.Color(23, 28, 31));
        inputUsername.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(1, 159, 224));
        inputUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        inputUsername.setDisabledTextColor(new java.awt.Color(43, 52, 57));
        inputUsername.setMaximumSize(new java.awt.Dimension(250, 50));
        inputUsername.setMinimumSize(new java.awt.Dimension(250, 50));
        inputUsername.setPreferredSize(new java.awt.Dimension(250, 50));
        inputUsername.setSelectedTextColor(new java.awt.Color(43, 52, 57));
        inputUsername.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 250, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 159, 224));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/password-bold.png"))); // NOI18N
        jLabel2.setText("SENHA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        inputPassword.setBackground(new java.awt.Color(23, 28, 31));
        inputPassword.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(1, 159, 224));
        inputPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        inputPassword.setDisabledTextColor(new java.awt.Color(43, 52, 57));
        inputPassword.setMaximumSize(new java.awt.Dimension(250, 50));
        inputPassword.setMinimumSize(new java.awt.Dimension(250, 50));
        inputPassword.setPreferredSize(new java.awt.Dimension(250, 50));
        inputPassword.setSelectedTextColor(new java.awt.Color(43, 52, 57));
        inputPassword.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 250, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 159, 224));
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        inputPassword1.setBackground(new java.awt.Color(23, 28, 31));
        inputPassword1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputPassword1.setForeground(new java.awt.Color(1, 159, 224));
        inputPassword1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPassword1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        inputPassword1.setDisabledTextColor(new java.awt.Color(43, 52, 57));
        inputPassword1.setMaximumSize(new java.awt.Dimension(250, 50));
        inputPassword1.setMinimumSize(new java.awt.Dimension(250, 50));
        inputPassword1.setPreferredSize(new java.awt.Dimension(250, 50));
        inputPassword1.setSelectedTextColor(new java.awt.Color(43, 52, 57));
        inputPassword1.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 159, 224));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/password-bold.png"))); // NOI18N
        jLabel4.setText("REPETIR SENHA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(1, 159, 224));
        btnRegistrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setMaximumSize(new java.awt.Dimension(100, 45));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(100, 45));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(100, 45));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 45));

        btnVoltar.setBackground(new java.awt.Color(1, 159, 224));
        btnVoltar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR AO LOGIN");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setMaximumSize(new java.awt.Dimension(100, 45));
        btnVoltar.setMinimumSize(new java.awt.Dimension(100, 45));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 45));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 130, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String username = inputUsername.getText().trim();
        if (!username.isEmpty()) {
            labelAvisos.setText("");
            String pass = new String(inputPassword.getPassword()).trim();
            if (pass.length() < 8) {
                labelAvisos.setText("Senha mínima de 8 caracteres");
            } else {
                String confirmPass = new String(inputPassword1.getPassword()).trim();
                if (!confirmPass.equals(pass)) {
                    labelAvisos.setText("Senhas incompatíveis");
                } else {
                    labelAvisos.setText("");
                    controller.cadastrar(username, pass);
                    labelAvisos.setText("Usuário cadastrado com sucesso");
                    clear();
                }
            }
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void clear() {
        inputUsername.setText("");
        inputPassword.setText("");
        inputPassword1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JPasswordField inputPassword1;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAvisos;
    // End of variables declaration//GEN-END:variables
}
