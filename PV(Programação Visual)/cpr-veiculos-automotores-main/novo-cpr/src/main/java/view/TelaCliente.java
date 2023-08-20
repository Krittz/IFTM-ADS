package view;

import controller.ClienteController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.Cliente;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;


/**
 *
 * @author crist
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    private ClienteController controller;
    int codigoCliente;

    public TelaCliente() {
        initComponents();
        controller = new ClienteController();
        estiloBtn();
        estadoInicial();
        TableCellRenderer headerRenderer = new TelaCliente.CustomHeaderRenderer();
        tabelaClientes.getTableHeader().setDefaultRenderer(headerRenderer);
        preencherTabela();

        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                estadoInicial();
            }
        });
        scroll.getViewport().setBackground(new Color(34, 34, 34));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        inputNome = new javax.swing.JTextField();
        separatorNome = new javax.swing.JSeparator();
        labelCnh = new javax.swing.JLabel();
        separatorCnh = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        separatorEmail = new javax.swing.JSeparator();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        separatorTelefone = new javax.swing.JSeparator();
        inputTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        inputCnh = new javax.swing.JFormattedTextField();
        btnSalvarEdicao = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("CLIENTES");
        setMaximumSize(new java.awt.Dimension(1024, 700));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 28, 31));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo.setBackground(new java.awt.Color(23, 28, 31));
        btnNovo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(1, 159, 224));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setBorder(null);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 80));

        btnEditar.setBackground(new java.awt.Color(23, 28, 31));
        btnEditar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(1, 159, 224));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pencil-line.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, 80));

        btnRelatorio.setBackground(new java.awt.Color(23, 28, 31));
        btnRelatorio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(1, 159, 224));
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/file-text.png"))); // NOI18N
        btnRelatorio.setText("RELATÓRIO");
        btnRelatorio.setBorder(null);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jPanel2.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 80, 80));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 159, 224));
        jLabel2.setText("CPR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, -1));

        btnExcluir.setBackground(new java.awt.Color(23, 28, 31));
        btnExcluir.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 80, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        scroll.setBorder(null);

        tabelaClientes.setBackground(new java.awt.Color(34, 34, 34));
        tabelaClientes.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(1, 159, 224));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "CNH", "EMAIL", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaClientes.setGridColor(new java.awt.Color(1, 159, 224));
        tabelaClientes.setRowHeight(40);
        tabelaClientes.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabelaClientes.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabelaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaClientes.setShowGrid(true);
        tabelaClientes.setShowVerticalLines(false);
        scroll.setViewportView(tabelaClientes);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 940, 460));

        inputNome.setBackground(new java.awt.Color(34, 34, 34));
        inputNome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(1, 159, 224));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputNome.setBorder(null);
        inputNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNome.setNextFocusableComponent(inputEmail);
        inputNome.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputNome.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, 50));

        separatorNome.setBackground(new java.awt.Color(1, 159, 224));
        separatorNome.setForeground(new java.awt.Color(1, 159, 224));
        separatorNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorNome.setOpaque(true);
        jPanel1.add(separatorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 230, 2));

        labelCnh.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCnh.setForeground(new java.awt.Color(1, 159, 224));
        labelCnh.setText("*Cnh");
        jPanel1.add(labelCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        separatorCnh.setBackground(new java.awt.Color(1, 159, 224));
        separatorCnh.setForeground(new java.awt.Color(1, 159, 224));
        separatorCnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorCnh.setOpaque(true);
        jPanel1.add(separatorCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 230, 2));

        labelNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(1, 159, 224));
        labelNome.setText("*Nome");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        separatorEmail.setBackground(new java.awt.Color(1, 159, 224));
        separatorEmail.setForeground(new java.awt.Color(1, 159, 224));
        separatorEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorEmail.setOpaque(true);
        jPanel1.add(separatorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 230, 2));

        inputEmail.setBackground(new java.awt.Color(34, 34, 34));
        inputEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(1, 159, 224));
        inputEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputEmail.setBorder(null);
        inputEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputEmail.setNextFocusableComponent(inputCnh);
        inputEmail.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputEmail.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 230, 50));

        labelEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(1, 159, 224));
        labelEmail.setText("*Email");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        separatorTelefone.setBackground(new java.awt.Color(1, 159, 224));
        separatorTelefone.setForeground(new java.awt.Color(1, 159, 224));
        separatorTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorTelefone.setOpaque(true);
        jPanel1.add(separatorTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 230, 2));

        inputTelefone.setBackground(new java.awt.Color(34, 34, 34));
        inputTelefone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(1, 159, 224));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputTelefone.setBorder(null);
        inputTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputTelefone.setNextFocusableComponent(btnSalvar);
        inputTelefone.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputTelefone.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, 50));

        labelTelefone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(1, 159, 224));
        labelTelefone.setText("*Telefone");
        jPanel1.add(labelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(34, 34, 34));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setNextFocusableComponent(inputNome);
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(34, 34, 34));
        btnSalvar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(1, 159, 224));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/floppy-disk.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setNextFocusableComponent(btnCancelar);
        btnSalvar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 300, 80));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 360, -1));

        inputCnh.setBackground(new java.awt.Color(34, 34, 34));
        inputCnh.setBorder(null);
        inputCnh.setForeground(new java.awt.Color(1, 159, 224));
        inputCnh.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputCnh.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputCnh.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, 50));

        btnSalvarEdicao.setBackground(new java.awt.Color(34, 34, 34));
        btnSalvarEdicao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSalvarEdicao.setForeground(new java.awt.Color(1, 159, 224));
        btnSalvarEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/floppy-disk.png"))); // NOI18N
        btnSalvarEdicao.setText("SALVAR");
        btnSalvarEdicao.setBorder(null);
        btnSalvarEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarEdicao.setNextFocusableComponent(btnCancelar);
        btnSalvarEdicao.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSalvarEdicao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        estadoCadastrando();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        boolean camposVerificados = verificaCampos(nome, cnh, email, telefone);
        if (camposVerificados) {
            boolean verificarCnh = controller.verificarCnh(cnh);
            if (verificarCnh) {
                labelAvisos.setText("CNH já cadastrada");
            } else {
                labelAvisos.setText("");
                controller.cadastrar(nome, cnh, email, telefone);
                preencherTabela();
                estadoInicial();
            }
        } else {
            labelAvisos.setText("Preencha todos os campos marcados com *");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaClientes.getSelectedRow();
            Object cod = tabelaClientes.getValueAt(linhaSelecionada, 0);
            Object nome = tabelaClientes.getValueAt(linhaSelecionada, 1);
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir cliente: (" + cod + ") " + nome, "Confirma exclusão?", JOptionPane.OK_CANCEL_OPTION);
            if (confirma == JOptionPane.OK_OPTION) {
                controller.excluir((int) cod);
                preencherTabela();
            } else {
                estadoInicial();
            }
        } else {
            labelAvisos.setText("Selecione um cliente na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            labelAvisos.setText("");

            int linhaSelecionada = tabelaClientes.getSelectedRow();
            int value = (int) tabelaClientes.getValueAt(linhaSelecionada, 0);

            Cliente c = controller.buscarCliente(value);
            codigoCliente = c.getCodigo();

            estadoEditando();
            inputNome.setText(c.getNome());
            inputCnh.setText(c.getCnh());
            inputEmail.setText(c.getEmail());
            inputTelefone.setText(c.getTelefone());

        } else {
            labelAvisos.setText("Selecione um cliente na tabela");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEdicaoActionPerformed
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        boolean verificacao = verificaCampos(nome, cnh, email, telefone);
        if (verificacao) {
            boolean duplicado = controller.verificarDuplicidade(codigoCliente, cnh);
            if (duplicado) {
                labelAvisos.setText("CNH já registrada");
                inputCnh.setText("");
                inputCnh.requestFocus();
            } else {
                labelAvisos.setText("");
                controller.atualizar(codigoCliente, nome, cnh, email, telefone);
                preencherTabela();
                estadoInicial();
            }
        } else {
            labelAvisos.setText("Preencha todos os campos marcados com *");
        }
    }//GEN-LAST:event_btnSalvarEdicaoActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            List<Cliente> clientes = controller.buscarClientes();
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(clientes);

            JasperReport relatorioCliente = JasperCompileManager.compileReport("src/main/java/report/RelatorioDeClientes.jrxml");
            JasperPrint printarRelatorio = JasperFillManager.fillReport(relatorioCliente, null, dataSource);

            JFrame frame = new JFrame("Relatório de Clientes");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 600);

            JRViewer viewer = new JRViewer(printarRelatorio);
            frame.getContentPane().add(viewer);

            frame.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    public class CustomHeaderRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getHeight(), 60));
            setBackground(new Color(0, 31, 44));
            setForeground(new Color(1, 159, 224));
            setFont(new Font("Roboto", Font.BOLD, 14));

            return this;
        }
    }

    public void estadoInicial() {
        clear();
        habilitarCampos(false);
        habilitarBtnsMenu(true);
        btnSalvarEdicao.setVisible(false);

    }

    public void clear() {
        labelAvisos.setText("");
        inputNome.setText("");
        inputCnh.setText("");
        inputEmail.setText("");
        inputTelefone.setText("");
    }

    public void habilitarCampos(boolean x) {
        inputNome.setVisible(x);
        inputCnh.setVisible(x);
        inputEmail.setVisible(x);
        inputTelefone.setVisible(x);
        btnSalvar.setVisible(x);
        btnCancelar.setVisible(x);

    }

    public void estadoCadastrando() {
        habilitarCampos(true);
        inputNome.requestFocus();
        habilitarBtnsMenu(false);

    }

    public void estadoEditando() {
        habilitarCampos(true);
        btnSalvarEdicao.setVisible(true);
        btnSalvar.setVisible(false);
        habilitarBtnsMenu(false);
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnNovo, btnEditar, btnExcluir, btnRelatorio};
        for (JButton btn : btns) {
            btn.setEnabled(x);
        }
    }

    public boolean verificaCampos(String nome, String cnh, String email, String telefone) {
        return !nome.isEmpty() && !cnh.isEmpty() && !email.isEmpty() && !telefone.isEmpty();
    }

    public void preencherTabela() {
        List<Cliente> clientes = controller.clientesAtivos();

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        model.addColumn("CODIGO");
        model.addColumn("NOME");
        model.addColumn("CNH");
        model.addColumn("EMAIL");
        model.addColumn("TELEFONE");

        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            Object[] row = {
                c.getCodigo(),
                c.getNome(),
                c.getCnh(),
                c.getEmail(),
                c.getTelefone()
            };
            model.addRow(row);
        }
        tabelaClientes.setModel(model);

    }

    public void estiloBtn() {
        JButton[] btns = {btnNovo, btnEditar, btnExcluir, btnRelatorio, btnSalvar, btnCancelar, btnSalvarEdicao};

        for (JButton btn : btns) {
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btn.setBackground(new Color(0, 31, 44));

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    btn.setBackground(new Color(0, 31, 44));

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(34, 34, 34));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(23, 28, 31));

                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdicao;
    private javax.swing.JFormattedTextField inputCnh;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelCnh;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorCnh;
    private javax.swing.JSeparator separatorEmail;
    private javax.swing.JSeparator separatorNome;
    private javax.swing.JSeparator separatorTelefone;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
