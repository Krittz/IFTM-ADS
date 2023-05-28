package view;

import controller.ClienteController;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author crist
 */
public final class ScreenClient extends javax.swing.JInternalFrame {

    private final ArrayList<Cliente> clientes;
    private ClienteController controller;

    /**
     * Creates new form ScreenClient
     */
    public ScreenClient() {
        initComponents();
        clientes = new ArrayList<Cliente>();
        controller = new ClienteController(clientes);
        estadoInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputCnh = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputTelefone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        labelAvisos = new javax.swing.JLabel();
        btnSalvarEdicao = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("CLIENTES");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(9, 13, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));

        inputCnh.setBackground(new java.awt.Color(18, 20, 31));
        inputCnh.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCnh.setForeground(new java.awt.Color(218, 31, 79));
        inputCnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCnh.setBorder(null);
        inputCnh.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCnh.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCnh.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputNome.setBackground(new java.awt.Color(18, 20, 31));
        inputNome.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(218, 31, 79));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNome.setBorder(null);
        inputNome.setPreferredSize(new java.awt.Dimension(260, 50));
        inputNome.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputNome.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputEmail.setBackground(new java.awt.Color(18, 20, 31));
        inputEmail.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(218, 31, 79));
        inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEmail.setBorder(null);
        inputEmail.setPreferredSize(new java.awt.Dimension(260, 50));
        inputEmail.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputEmail.setSelectionColor(new java.awt.Color(218, 31, 79));

        tabelaClientes.setBackground(new java.awt.Color(18, 20, 31));
        tabelaClientes.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(218, 31, 79));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "CNH", "EMAIL", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setFocusable(false);
        tabelaClientes.setGridColor(new java.awt.Color(18, 20, 31));
        tabelaClientes.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaClientes.setRowSelectionAllowed(false);
        tabelaClientes.setSelectionBackground(new java.awt.Color(218, 31, 79));
        tabelaClientes.setSelectionForeground(new java.awt.Color(18, 20, 31));
        tabelaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaClientes);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("CLIENTES");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CNH");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("TELEFONE");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("EMAIL");

        btnNovo.setBackground(new java.awt.Color(9, 13, 25));
        btnNovo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(218, 31, 79));
        btnNovo.setText("NOVO");
        btnNovo.setBorder(null);
        btnNovo.setBorderPainted(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setMaximumSize(new java.awt.Dimension(110, 45));
        btnNovo.setMinimumSize(new java.awt.Dimension(110, 45));
        btnNovo.setOpaque(true);
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(218, 31, 79));
        btnSalvar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(9, 13, 25));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(9, 13, 25));
        btnEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(218, 31, 79));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnEditar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnEditar.setOpaque(true);
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(102, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(18, 20, 31));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setMaximumSize(new java.awt.Dimension(110, 45));
        btnExcluir.setMinimumSize(new java.awt.Dimension(110, 45));
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        inputTelefone.setBackground(new java.awt.Color(18, 20, 31));
        inputTelefone.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(218, 31, 79));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTelefone.setBorder(null);
        inputTelefone.setPreferredSize(new java.awt.Dimension(260, 50));
        inputTelefone.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputTelefone.setSelectionColor(new java.awt.Color(218, 31, 79));

        btnCancelar.setBackground(new java.awt.Color(9, 13, 25));
        btnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(218, 31, 79));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setOpaque(true);
        btnCancelar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");

        btnSalvarEdicao.setBackground(new java.awt.Color(218, 31, 79));
        btnSalvarEdicao.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvarEdicao.setForeground(new java.awt.Color(9, 13, 25));
        btnSalvarEdicao.setText("SALVAR");
        btnSalvarEdicao.setBorder(null);
        btnSalvarEdicao.setBorderPainted(false);
        btnSalvarEdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarEdicao.setFocusPainted(false);
        btnSalvarEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarEdicao.setMaximumSize(new java.awt.Dimension(110, 45));
        btnSalvarEdicao.setMinimumSize(new java.awt.Dimension(110, 45));
        btnSalvarEdicao.setPreferredSize(new java.awt.Dimension(110, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAvisos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnNovoPressionado();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();
        if (nome.isEmpty() || cnh.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
            labelAvisos.setText("Preencha todos os campos corretamente!");
        } else {
            labelAvisos.setText(" ");
            Cliente c = new Cliente(nome, cnh, email, telefone);
            controller.cadastrar(c);
            ArrayList<Cliente> listaClientes = controller.getClientes();
            if (!listaClientes.isEmpty()) {
                atualizarTabela(listaClientes);
                limparCampos();
                btnNovo.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                habilitarCampos(false);
            } else {
                estadoInicial();
            }
        }
        btnSalvar.setEnabled(false);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String cnh = JOptionPane.showInputDialog(this, "Informe a CNH do cliente: ");
        if (!cnh.trim().isEmpty() && cnh.trim() != null) {
            habilitarCampos(true);
            inputCnh.setEditable(false);
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnCancelar.setEnabled(true);
            ArrayList<Cliente> clientela = controller.getClientes();
            for (Cliente c : clientela) {
                if (c.getCnh().equals(cnh.trim())) {
                    inputNome.setText(c.getNome());
                    inputCnh.setText(c.getCnh());
                    inputEmail.setText(c.getEmail());
                    inputTelefone.setText(c.getTelefone());
                    btnSalvarEdicao.setVisible(true);
                    btnSalvarEdicao.addActionListener((var evt1) -> {
                        c.setNome(inputNome.getText().trim());
                        c.setCnh(inputCnh.getText().trim());
                        c.setEmail(inputEmail.getText().trim());
                        c.setTelefone(inputTelefone.getText().trim());
                        ArrayList<Cliente> cli = controller.getClientes();
                        atualizarTabela(cli);
                        limparCampos();
                        btnNovo.setEnabled(true);
                        btnCancelar.setEnabled(false);
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                        habilitarCampos(false);
                        btnSalvarEdicao.setVisible(false);
                    });
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado", "Invalid Format", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor inválido", "Invalid format!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cnh = JOptionPane.showInputDialog(this, "Informe a CNH do cliente: ");
        if (!cnh.trim().isEmpty()) {
            Cliente cliente = controller.buscarPorCnh(cnh);
            if (cliente != null) {
                int op = JOptionPane.showConfirmDialog(this, "Confirma exclusão?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
                if (op == JOptionPane.OK_OPTION) {
                    controller.excluir(cliente);
                    ArrayList<Cliente> clientes = controller.getClientes();
                    atualizarTabela(clientes);
                    if (clientes.isEmpty()) {
                        estadoInicial();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Valor inválido", "Invalid Format", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor inválido", "Invalid Format", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnSalvarEdicao.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void estadoInicial() {
        habilitarCampos(false);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvarEdicao.setVisible(false);

    }

    public void btnNovoPressionado() {
        habilitarCampos(true);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        inputNome.requestFocus();
        btnNovo.setEnabled(false);
    }

    public void habilitarCampos(boolean status) {
        inputNome.setEditable(status);
        inputCnh.setEditable(status);
        inputEmail.setEditable(status);
        inputTelefone.setEditable(status);
    }

    public void limparCampos() {
        inputNome.setText("");
        inputCnh.setText("");
        inputEmail.setText("");
        inputTelefone.setText("");
    }

    public void atualizarTabela(ArrayList<Cliente> clientes) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NOME");
        model.addColumn("CNH");
        model.addColumn("EMAIL");
        model.addColumn("TELEFONE");

        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            Object[] linha = {cliente.getNome(), cliente.getCnh(), cliente.getEmail(), cliente.getTelefone()};
            model.addRow(linha);
        }
        tabelaClientes.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdicao;
    private javax.swing.JTextField inputCnh;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
