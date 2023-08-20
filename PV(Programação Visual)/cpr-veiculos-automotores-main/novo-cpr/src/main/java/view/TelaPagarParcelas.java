package view;

import controller.AluguelController;
import controller.PagamentoController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.Aluguel;
import model.Pagamento;
import model.Parcela;

/**
 *
 * @author crist
 */
public class TelaPagarParcelas extends javax.swing.JInternalFrame {

    private AluguelController aluguelController;
    private PagamentoController pagamentoController;

    public TelaPagarParcelas() {
        initComponents();
        aluguelController = new AluguelController();
        pagamentoController = new PagamentoController();
        estiloBtn();
        estadoInicial();
        TableCellRenderer headerRenderer = new TelaPagarParcelas.CustomHeaderRenderer();
        tabela.getTableHeader().setDefaultRenderer(headerRenderer);
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
        btnPagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        inputPagamento = new javax.swing.JTextField();
        separatorAluguel = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelarEscolha = new javax.swing.JButton();
        labelValorParcela = new javax.swing.JLabel();
        inputParcela = new javax.swing.JTextField();
        separatorParcela = new javax.swing.JSeparator();
        separatorValorParcela1 = new javax.swing.JSeparator();
        labelDataPagamento = new javax.swing.JLabel();
        inputDataPagamento = new javax.swing.JFormattedTextField();
        btnOkParcela = new javax.swing.JButton();
        btnConfirmarExcluir = new javax.swing.JButton();

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

        btnPagar.setBackground(new java.awt.Color(23, 28, 31));
        btnPagar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(1, 159, 224));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/currency-dollar-simple-bold.png"))); // NOI18N
        btnPagar.setText("PAGAR");
        btnPagar.setBorder(null);
        btnPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 80, 80));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 159, 224));
        jLabel2.setText("CPR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, -1));

        btnExcluir.setBackground(new java.awt.Color(23, 28, 31));
        btnExcluir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 80, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        scroll.setBorder(null);

        tabela.setBackground(new java.awt.Color(34, 34, 34));
        tabela.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabela.setForeground(new java.awt.Color(1, 159, 224));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setGridColor(new java.awt.Color(1, 159, 224));
        tabela.setRowHeight(40);
        tabela.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabela.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.setShowVerticalLines(false);
        scroll.setViewportView(tabela);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 940, 340));

        inputPagamento.setEditable(false);
        inputPagamento.setBackground(new java.awt.Color(34, 34, 34));
        inputPagamento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputPagamento.setForeground(new java.awt.Color(1, 159, 224));
        inputPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputPagamento.setBorder(null);
        inputPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputPagamento.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputPagamento.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 480, 50));

        separatorAluguel.setBackground(new java.awt.Color(1, 159, 224));
        separatorAluguel.setForeground(new java.awt.Color(1, 159, 224));
        separatorAluguel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorAluguel.setOpaque(true);
        jPanel1.add(separatorAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 480, 2));

        labelNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(1, 159, 224));
        labelNome.setText("*Pagamento");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(34, 34, 34));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setNextFocusableComponent(inputPagamento);
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, -1, -1));

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
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 300, 80));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 620, 30));

        btnOk.setBackground(new java.awt.Color(34, 34, 34));
        btnOk.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOk.setForeground(new java.awt.Color(1, 159, 224));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.setBorder(null);
        btnOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOk.setMaximumSize(new java.awt.Dimension(98, 51));
        btnOk.setMinimumSize(new java.awt.Dimension(98, 51));
        btnOk.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 100, -1));

        btnCancelarEscolha.setBackground(new java.awt.Color(34, 34, 34));
        btnCancelarEscolha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelarEscolha.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelarEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnCancelarEscolha.setText("LIMPAR ESCOLHA");
        btnCancelarEscolha.setBorder(null);
        btnCancelarEscolha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarEscolha.setPreferredSize(new java.awt.Dimension(70, 70));
        btnCancelarEscolha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEscolhaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarEscolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 100, -1));

        labelValorParcela.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelValorParcela.setForeground(new java.awt.Color(1, 159, 224));
        labelValorParcela.setText("*Parcela");
        jPanel1.add(labelValorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, -1));

        inputParcela.setEditable(false);
        inputParcela.setBackground(new java.awt.Color(34, 34, 34));
        inputParcela.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputParcela.setForeground(new java.awt.Color(1, 159, 224));
        inputParcela.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputParcela.setBorder(null);
        inputParcela.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputParcela.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputParcela.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 480, 50));

        separatorParcela.setBackground(new java.awt.Color(1, 159, 224));
        separatorParcela.setForeground(new java.awt.Color(1, 159, 224));
        separatorParcela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorParcela.setOpaque(true);
        jPanel1.add(separatorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 480, 2));

        separatorValorParcela1.setBackground(new java.awt.Color(1, 159, 224));
        separatorValorParcela1.setForeground(new java.awt.Color(1, 159, 224));
        separatorValorParcela1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorValorParcela1.setOpaque(true);
        jPanel1.add(separatorValorParcela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 170, 2));

        labelDataPagamento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDataPagamento.setForeground(new java.awt.Color(1, 159, 224));
        labelDataPagamento.setText("*Data pagamento");
        jPanel1.add(labelDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, -1));

        inputDataPagamento.setEditable(false);
        inputDataPagamento.setBackground(new java.awt.Color(34, 34, 34));
        inputDataPagamento.setBorder(null);
        inputDataPagamento.setForeground(new java.awt.Color(1, 159, 224));
        inputDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        inputDataPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDataPagamento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputDataPagamento.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputDataPagamento.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 50));

        btnOkParcela.setBackground(new java.awt.Color(34, 34, 34));
        btnOkParcela.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkParcela.setForeground(new java.awt.Color(1, 159, 224));
        btnOkParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkParcela.setText("OK");
        btnOkParcela.setBorder(null);
        btnOkParcela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkParcela.setMaximumSize(new java.awt.Dimension(98, 51));
        btnOkParcela.setMinimumSize(new java.awt.Dimension(98, 51));
        btnOkParcela.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkParcela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkParcelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 100, -1));

        btnConfirmarExcluir.setBackground(new java.awt.Color(34, 34, 34));
        btnConfirmarExcluir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnConfirmarExcluir.setForeground(new java.awt.Color(1, 159, 224));
        btnConfirmarExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash.png"))); // NOI18N
        btnConfirmarExcluir.setText("EXCLUIR");
        btnConfirmarExcluir.setBorder(null);
        btnConfirmarExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmarExcluir.setNextFocusableComponent(btnCancelar);
        btnConfirmarExcluir.setPreferredSize(new java.awt.Dimension(70, 70));
        btnConfirmarExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfirmarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEscolhaActionPerformed
        tabela.clearSelection();
    }//GEN-LAST:event_btnCancelarEscolhaActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        estadoPagando();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (tabela.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabela.getSelectedRow();
            int pagamentoEscolhido = (int) tabela.getValueAt(linhaSelecionada, 0);
            Pagamento pagamento = pagamentoController.buscarPagamento(pagamentoEscolhido);
            String pagamentoStr = String.valueOf(pagamento.getCodigo() + " - Total R$:" + pagamento.getValorTotal() + " - Parcelas [" + pagamento.getParcelas().size() + "] - " + pagamento.getAluguel().getCliente().getNome());
            inputPagamento.setText(pagamentoStr);

            preencherTabelaParcelas(pagamento.getCodigo());
            btnOk.setVisible(false);
            btnOkParcela.setVisible(true);

        } else {
            labelAvisos.setText("Selecione um pagamento na tabela");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkParcelaActionPerformed
        if (tabela.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabela.getSelectedRow();
            int parcelaEscolhida = (int) tabela.getValueAt(linhaSelecionada, 0);
            Parcela parcela = pagamentoController.buscarParcela(parcelaEscolhida);
            inputParcela.setText(String.valueOf(parcela.getCodigo()) + "  -  [ Valor R$:" + parcela.getValor() + "]  -  Vencimento (" + parcela.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/y")) + ")");

            btnCancelarEscolha.setVisible(false);
            btnOkParcela.setVisible(false);

            inputDataPagamento.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/y")));
            inputDataPagamento.requestFocus();

        } else {
            labelAvisos.setText("Selecione uma parcela na tabela");
        }
    }//GEN-LAST:event_btnOkParcelaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String pagamentoEscolhido = inputPagamento.getText().trim();
        String parcelaEscolhida = inputParcela.getText().trim();
        String dataPagamento = inputDataPagamento.getText().trim();

        if (!pagamentoEscolhido.isEmpty() && !parcelaEscolhida.isEmpty() && !dataPagamento.isEmpty()) {
            int codigoParcela = Character.getNumericValue(parcelaEscolhida.charAt(0));
            LocalDate dataPg = LocalDate.parse(dataPagamento, DateTimeFormatter.ofPattern("dd/MM/y"));
            pagamentoController.pagarParcela(codigoParcela, dataPg);
            int codigoPagamento = Character.getNumericValue(pagamentoEscolhido.charAt(0));
            List<Parcela> parcelasPendentes = pagamentoController.parcelasPendentes(codigoPagamento);

            if (parcelasPendentes.size() < 1) {
                pagamentoController.finalizarPagamento(codigoPagamento);
            }

            estadoInicial();
            preencherTabela();

        } else {
            labelAvisos.setText("Preencha todos os campos");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != -1) {
            habilitarBtnsMenu(false);
            int linhaSelecionada = tabela.getSelectedRow();
            int pagamentoSelecionado = (int) tabela.getValueAt(linhaSelecionada, 0);
            Pagamento pagamento = pagamentoController.buscarPagamento(pagamentoSelecionado);
            String pagamentoStr = String.valueOf(pagamento.getCodigo() + " - Total R$:" + pagamento.getValorTotal() + " - Parcelas [" + pagamento.getParcelas().size() + "] - " + pagamento.getAluguel().getCliente().getNome());
            inputPagamento.setText(pagamentoStr);
            preencherTabelaParcelas(pagamento.getCodigo());

            btnOkParcela.setVisible(true);
            btnCancelarEscolha.setVisible(true);

            btnConfirmarExcluir.setVisible(true);
            btnCancelar.setVisible(true);
        } else {
            labelAvisos.setText("Selecione um pagamento na tabela");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConfirmarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarExcluirActionPerformed
        String parcelaString = inputParcela.getText().trim();
        if (!parcelaString.isEmpty()) {
            int codigoParcela = Character.getNumericValue(parcelaString.charAt(0));
            pagamentoController.excluirParcela(codigoParcela);
            estadoInicial();
        } else {
            labelAvisos.setText("Valor inválido, selecione uma parcela na tabela");
        }
    }//GEN-LAST:event_btnConfirmarExcluirActionPerformed

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

    public final void estadoInicial() {
        clear();
        habilitarBtnsMenu(true);
        btnSalvar.setVisible(false);
        btnCancelar.setVisible(false);
        btnOk.setVisible(false);
        btnOkParcela.setVisible(false);
        btnCancelarEscolha.setVisible(false);
        inputDataPagamento.setVisible(false);
        btnConfirmarExcluir.setVisible(false);
        preencherTabela();
    }

    public void estadoPagando() {
        clear();
        habilitarBtnsMenu(false);
        btnSalvar.setVisible(true);
        btnCancelar.setVisible(true);
        btnOk.setVisible(true);
        btnCancelarEscolha.setVisible(true);
        inputDataPagamento.setVisible(true);
        preencherTabela();
    }

    public void clear() {
        labelAvisos.setText("");
        inputPagamento.setText("");
        inputParcela.setText("");
        inputDataPagamento.setText("");
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnPagar, btnExcluir};
        for (JButton btn : btns) {
            btn.setEnabled(x);
        }
    }

    public boolean verificaCampos(String nome, String cnh, String email, String telefone) {
        return !nome.isEmpty() && !cnh.isEmpty() && !email.isEmpty() && !telefone.isEmpty();
    }

    public final void preencherTabela() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("TOTAL R$");
        model.addColumn("PARCELAS PENDENTES");
        model.addColumn("STATUS");
        model.addColumn("CÓD.ALUGUEL");

        List<Pagamento> pagamentos = pagamentoController.pagamentosPendentes();

        Iterator<Pagamento> it = pagamentos.iterator();
        while (it.hasNext()) {
            Pagamento pagamento = it.next();
            if (!pagamento.getParcelas().isEmpty()) {
                String status = "Pendente";
                if (pagamento.isFinalizado()) {
                    status = "Finalizado";
                }
                Aluguel aluguel = pagamento.getAluguel();
                Object[] row = {
                    pagamento.getCodigo(),
                    pagamento.getValorTotal(),
                    pagamento.getParcelas().size(),
                    status,
                    aluguel.getCodigo(),};
                model.addRow(row);
            }
        }
        tabela.setModel(model);
    }

    public void preencherTabelaParcelas(int codigoPagamento) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("VALOR R$");
        model.addColumn("VENCIMENTO");
        model.addColumn("CÓD.PAGAMENTO");
        List<Parcela> parcelas = pagamentoController.parcelasPendentes(codigoPagamento);

        Iterator<Parcela> it = parcelas.iterator();
        while (it.hasNext()) {
            Parcela parcela = it.next();
            Object[] row = {
                parcela.getCodigo(),
                parcela.getValor(),
                parcela.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/y")),
                parcela.getFk_pagamento()
            };
            model.addRow(row);
        }
        tabela.setModel(model);
    }

    public final void estiloBtn() {
        JButton[] btns = {btnPagar, btnExcluir, btnSalvar, btnCancelar, btnOk, btnCancelarEscolha, btnOkParcela, btnConfirmarExcluir};

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
    private javax.swing.JButton btnCancelarEscolha;
    private javax.swing.JButton btnConfirmarExcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOkParcela;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField inputDataPagamento;
    private javax.swing.JTextField inputPagamento;
    private javax.swing.JTextField inputParcela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelDataPagamento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelValorParcela;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorAluguel;
    private javax.swing.JSeparator separatorParcela;
    private javax.swing.JSeparator separatorValorParcela1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
