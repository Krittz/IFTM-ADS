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
public class TelaPagamento extends javax.swing.JInternalFrame {

    private AluguelController aluguelController;
    private PagamentoController pagamentoController;
    private int codPg;

    public TelaPagamento() {
        initComponents();

        aluguelController = new AluguelController();
        pagamentoController = new PagamentoController();
        estiloBtn();
        estadoInicial();
        TableCellRenderer headerRenderer = new TelaPagamento.CustomHeaderRenderer();
        tabelaPagamentos.getTableHeader().setDefaultRenderer(headerRenderer);
        preencherTabela();

        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                estadoInicial();
            }
        });
        scroll.getViewport().setBackground(new Color(34, 34, 34));
        scrollParcelas.getViewport().setBackground(new Color(34, 34, 34));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabelaPagamentos = new javax.swing.JTable();
        inputAluguel = new javax.swing.JTextField();
        separatorAluguel = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        btnOkAluguel = new javax.swing.JButton();
        btnCancelarEscolha = new javax.swing.JButton();
        btnBuscarAluguel = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        separatoTotal = new javax.swing.JSeparator();
        inputValorTotal = new javax.swing.JTextField();
        btnOkParcelas = new javax.swing.JButton();
        scrollParcelas = new javax.swing.JScrollPane();
        inputParcelas = new javax.swing.JList<>();
        labelParcelas = new javax.swing.JLabel();
        labelValorParcela = new javax.swing.JLabel();
        inputValorParcela = new javax.swing.JTextField();
        separatorValorParcela = new javax.swing.JSeparator();
        separatorVencimento = new javax.swing.JSeparator();
        inputVencimento = new javax.swing.JTextField();
        labelVencimento = new javax.swing.JLabel();

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
        jPanel2.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 80, 80));

        btnRelatorio.setBackground(new java.awt.Color(23, 28, 31));
        btnRelatorio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(1, 159, 224));
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/file-text.png"))); // NOI18N
        btnRelatorio.setText("RELATÓRIO");
        btnRelatorio.setBorder(null);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 80, 80));

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
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 80, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        scroll.setBorder(null);

        tabelaPagamentos.setBackground(new java.awt.Color(34, 34, 34));
        tabelaPagamentos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaPagamentos.setForeground(new java.awt.Color(1, 159, 224));
        tabelaPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaPagamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaPagamentos.setGridColor(new java.awt.Color(1, 159, 224));
        tabelaPagamentos.setRowHeight(40);
        tabelaPagamentos.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabelaPagamentos.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabelaPagamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaPagamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaPagamentos.setShowGrid(true);
        tabelaPagamentos.setShowVerticalLines(false);
        scroll.setViewportView(tabelaPagamentos);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 940, 340));

        inputAluguel.setEditable(false);
        inputAluguel.setBackground(new java.awt.Color(34, 34, 34));
        inputAluguel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputAluguel.setForeground(new java.awt.Color(1, 159, 224));
        inputAluguel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputAluguel.setBorder(null);
        inputAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputAluguel.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputAluguel.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 480, 50));

        separatorAluguel.setBackground(new java.awt.Color(1, 159, 224));
        separatorAluguel.setForeground(new java.awt.Color(1, 159, 224));
        separatorAluguel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorAluguel.setOpaque(true);
        jPanel1.add(separatorAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 480, 2));

        labelNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(1, 159, 224));
        labelNome.setText("*Aluguel");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(34, 34, 34));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setNextFocusableComponent(inputAluguel);
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
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 300, 80));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 620, 30));

        btnOkAluguel.setBackground(new java.awt.Color(34, 34, 34));
        btnOkAluguel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkAluguel.setForeground(new java.awt.Color(1, 159, 224));
        btnOkAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkAluguel.setText("OK");
        btnOkAluguel.setBorder(null);
        btnOkAluguel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkAluguel.setMaximumSize(new java.awt.Dimension(98, 51));
        btnOkAluguel.setMinimumSize(new java.awt.Dimension(98, 51));
        btnOkAluguel.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkAluguel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAluguelActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 100, -1));

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

        btnBuscarAluguel.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscarAluguel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarAluguel.setForeground(new java.awt.Color(1, 159, 224));
        btnBuscarAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/magnifying-glass.png"))); // NOI18N
        btnBuscarAluguel.setText("Buscar aluguel");
        btnBuscarAluguel.setBorder(null);
        btnBuscarAluguel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAluguel.setPreferredSize(new java.awt.Dimension(70, 70));
        btnBuscarAluguel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAluguelActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 100, 60));

        labelTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(1, 159, 224));
        labelTotal.setText("Total");
        jPanel1.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        separatoTotal.setBackground(new java.awt.Color(1, 159, 224));
        separatoTotal.setForeground(new java.awt.Color(1, 159, 224));
        separatoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatoTotal.setOpaque(true);
        jPanel1.add(separatoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 2));

        inputValorTotal.setEditable(false);
        inputValorTotal.setBackground(new java.awt.Color(34, 34, 34));
        inputValorTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputValorTotal.setForeground(new java.awt.Color(1, 159, 224));
        inputValorTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputValorTotal.setBorder(null);
        inputValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputValorTotal.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputValorTotal.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 50));

        btnOkParcelas.setBackground(new java.awt.Color(34, 34, 34));
        btnOkParcelas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkParcelas.setForeground(new java.awt.Color(1, 159, 224));
        btnOkParcelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkParcelas.setBorder(null);
        btnOkParcelas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkParcelas.setMaximumSize(new java.awt.Dimension(98, 51));
        btnOkParcelas.setMinimumSize(new java.awt.Dimension(98, 51));
        btnOkParcelas.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkParcelas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkParcelasActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 60, 50));

        scrollParcelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));

        inputParcelas.setBackground(new java.awt.Color(34, 34, 34));
        inputParcelas.setBorder(null);
        inputParcelas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inputParcelas.setForeground(new java.awt.Color(1, 159, 224));
        inputParcelas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputParcelas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inputParcelas.setSelectionBackground(new java.awt.Color(1, 159, 224));
        inputParcelas.setSelectionForeground(new java.awt.Color(34, 34, 34));
        scrollParcelas.setViewportView(inputParcelas);

        jPanel1.add(scrollParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 90, 70));

        labelParcelas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelParcelas.setForeground(new java.awt.Color(1, 159, 224));
        labelParcelas.setText("*Parcelas");
        jPanel1.add(labelParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 70, -1));

        labelValorParcela.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelValorParcela.setForeground(new java.awt.Color(1, 159, 224));
        labelValorParcela.setText("Valor da parcela");
        jPanel1.add(labelValorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 110, -1));

        inputValorParcela.setEditable(false);
        inputValorParcela.setBackground(new java.awt.Color(34, 34, 34));
        inputValorParcela.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputValorParcela.setForeground(new java.awt.Color(1, 159, 224));
        inputValorParcela.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputValorParcela.setBorder(null);
        inputValorParcela.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputValorParcela.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputValorParcela.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputValorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, 50));

        separatorValorParcela.setBackground(new java.awt.Color(1, 159, 224));
        separatorValorParcela.setForeground(new java.awt.Color(1, 159, 224));
        separatorValorParcela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorValorParcela.setOpaque(true);
        jPanel1.add(separatorValorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 170, 2));

        separatorVencimento.setBackground(new java.awt.Color(1, 159, 224));
        separatorVencimento.setForeground(new java.awt.Color(1, 159, 224));
        separatorVencimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorVencimento.setOpaque(true);
        jPanel1.add(separatorVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 170, 2));

        inputVencimento.setEditable(false);
        inputVencimento.setBackground(new java.awt.Color(34, 34, 34));
        inputVencimento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputVencimento.setForeground(new java.awt.Color(1, 159, 224));
        inputVencimento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputVencimento.setBorder(null);
        inputVencimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputVencimento.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputVencimento.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 170, 50));

        labelVencimento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelVencimento.setForeground(new java.awt.Color(1, 159, 224));
        labelVencimento.setText("Vencimento primeira parcela");
        jPanel1.add(labelVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 190, -1));

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
        preencherTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String aluguelEscolhido = inputAluguel.getText().trim();
        String qtdeParcelasString = inputParcelas.getSelectedValue();
        String valorParcelaString = inputValorParcela.getText().trim();
        String vencimentoString = inputVencimento.getText().trim();
        if (!aluguelEscolhido.isEmpty() && !qtdeParcelasString.isEmpty() && !valorParcelaString.isEmpty() && !vencimentoString.isEmpty()) {
            Aluguel aluguel = aluguelController.buscarAluguel(Character.getNumericValue(aluguelEscolhido.charAt(0)));
            int qtdeParcelas = Integer.parseInt(qtdeParcelasString);
            double valorParcela = aluguel.getValor() / qtdeParcelas;
            List<Parcela> parcelas = new ArrayList<>();

            if (qtdeParcelas > 1) {
                for (int i = 0; i < qtdeParcelas; i++) {
                    Parcela p = new Parcela();
                    p.setValor(valorParcela);
                    p.setDataVencimento(aluguel.getDevolucao().plusMonths(i));
                    parcelas.add(p);
                }
            } else {
                Parcela p = new Parcela();
                p.setValor(valorParcela);
                p.setDataVencimento(aluguel.getDevolucao().plusDays(1));
                parcelas.add(p);
            }
            Pagamento pagamento = new Pagamento();
            pagamento.setAluguel(aluguel);
            pagamento.setValorTotal(aluguel.getValor());
            pagamento.setParcelas(parcelas);
            pagamentoController.salvar(pagamento);
            preencherTabela();
            estadoInicial();
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaPagamentos.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaPagamentos.getSelectedRow();
            int codigoPagamento = (int) tabelaPagamentos.getValueAt(linhaSelecionada, 0);
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir pagamento #" + codigoPagamento, "Confirma exclusão?", JOptionPane.OK_CANCEL_OPTION);
            if (confirma == JOptionPane.OK_OPTION) {
                pagamentoController.excluirPagamento(codigoPagamento);
                preencherTabela();
            } else {
                estadoInicial();
            }

        } else {
            labelAvisos.setText("Selecione um pagamento na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAluguelActionPerformed
        preencherTabelaAluguel();
        btnOkAluguel.setVisible(true);
        btnCancelarEscolha.setVisible(true);
        labelAvisos.setText("Selecione um aluguel na tabela");
    }//GEN-LAST:event_btnBuscarAluguelActionPerformed

    private void btnOkAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAluguelActionPerformed

        if (tabelaPagamentos.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaPagamentos.getSelectedRow();
            int codigo = (int) tabelaPagamentos.getValueAt(linhaSelecionada, 0);
            Aluguel aluguel = aluguelController.buscarAluguel(codigo);
            String periodoAluguel = aluguel.getRetirada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + aluguel.getDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            inputAluguel.setText(String.valueOf(aluguel.getCodigo()) + " - " + aluguel.getCliente().getNome() + ", " + aluguel.getVeiculo().getMarca() + " " + aluguel.getVeiculo().getModelo() + " (" + periodoAluguel + ")");
            DecimalFormat formatarDecimal = new DecimalFormat("#0.00");
            String valorFormatadoStr = String.valueOf(formatarDecimal.format(aluguel.getValor())).replaceAll("\\.", "").replace(",", ".");
            inputValorTotal.setText(valorFormatadoStr);
            btnOkAluguel.setVisible(false);
            btnCancelarEscolha.setVisible(false);
            preencherTabela();
        } else {
            labelAvisos.setText("Selecione um aluguel na tabela");
        }
    }//GEN-LAST:event_btnOkAluguelActionPerformed

    private void btnCancelarEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEscolhaActionPerformed
        tabelaPagamentos.clearSelection();
    }//GEN-LAST:event_btnCancelarEscolhaActionPerformed

    private void btnOkParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkParcelasActionPerformed
        String aluguelEscolhido = inputAluguel.getText().trim();
        if (!aluguelEscolhido.isEmpty()) {
            labelAvisos.setText("");
            char codigoAluguel = aluguelEscolhido.charAt(0);
            Aluguel aluguel = aluguelController.buscarAluguel(Character.getNumericValue(codigoAluguel));

            if (!inputParcelas.isSelectionEmpty()) {
                labelAvisos.setText("");
                int qtdeParcelas = Integer.parseInt(inputParcelas.getSelectedValue());
                double valorParcela = aluguel.getValor() / qtdeParcelas;
                DecimalFormat formatarDecimal = new DecimalFormat("#0.00");
                inputValorParcela.setText(String.valueOf(formatarDecimal.format(valorParcela)).replaceAll("\\.", "").replace(",", "."));
                if (qtdeParcelas > 1) {
                    LocalDate primeiraParcela = aluguel.getDevolucao().plusMonths(1);
                    String dataFormatada = primeiraParcela.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    inputVencimento.setText(dataFormatada);
                } else {
                    String dataParcelaUnica = aluguel.getDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    inputVencimento.setText(dataParcelaUnica);
                }

            } else {
                labelAvisos.setText("Selecione ao menos uma parcela");
            }

        } else {
            labelAvisos.setText("Informe um aluguel válido");
        }
    }//GEN-LAST:event_btnOkParcelasActionPerformed

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

        btnBuscarAluguel.setVisible(false);
        btnOkAluguel.setVisible(false);
        btnCancelarEscolha.setVisible(false);

        inputParcelas.setEnabled(false);
        btnOkParcelas.setVisible(false);

    }

    public void clear() {
        labelAvisos.setText("");
        inputAluguel.setText("");
        inputValorTotal.setText("");
        inputParcelas.clearSelection();
        inputValorParcela.setText("");
        inputVencimento.setText("");
    }

    public void estadoCadastrando() {
        habilitarBtnsMenu(false);

        btnSalvar.setVisible(true);
        btnCancelar.setVisible(true);
        btnBuscarAluguel.setVisible(true);

        inputParcelas.setEnabled(true);
        btnOkParcelas.setVisible(true);
    }

    public void estadoEditando() {
        habilitarBtnsMenu(false);

        btnCancelar.setVisible(true);
        btnBuscarAluguel.setVisible(true);

        inputParcelas.setEnabled(true);
        btnOkParcelas.setVisible(true);
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnNovo, btnExcluir, btnRelatorio};
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
        model.addColumn("PARCELAS");
        model.addColumn("STATUS");
        model.addColumn("CÓD.ALUGUEL");

        List<Pagamento> pagamentos = pagamentoController.buscarPagamentos();

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
        tabelaPagamentos.setModel(model);
    }

    public void preencherTabelaAluguel() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("PERÍODO");
        model.addColumn("VALOR TOTAL");
        model.addColumn("CÓD. VEÍCULO");
        model.addColumn("CÓD. CLIENTE");
        model.addColumn("CÓD. AGÊNCIA");
        List<Aluguel> alugueis = aluguelController.alugueisAtivos();
        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel aluguel = it.next();
            String periodoAluguel = aluguel.getRetirada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + aluguel.getDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Object[] row = {
                aluguel.getCodigo(),
                periodoAluguel,
                aluguel.getValor(),
                aluguel.getVeiculo().getCodigo(),
                aluguel.getCliente().getCodigo(),
                aluguel.getAgencia().getCodigo()
            };
            model.addRow(row);
        }
        tabelaPagamentos.setModel(model);

    }

    public final void estiloBtn() {
        JButton[] btns = {btnNovo, btnExcluir, btnRelatorio, btnSalvar, btnCancelar, btnOkAluguel, btnCancelarEscolha, btnBuscarAluguel, btnOkParcelas};

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
    private javax.swing.JButton btnBuscarAluguel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEscolha;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOkAluguel;
    private javax.swing.JButton btnOkParcelas;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputAluguel;
    private javax.swing.JList<String> inputParcelas;
    private javax.swing.JTextField inputValorParcela;
    private javax.swing.JTextField inputValorTotal;
    private javax.swing.JTextField inputVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelParcelas;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelValorParcela;
    private javax.swing.JLabel labelVencimento;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scrollParcelas;
    private javax.swing.JSeparator separatoTotal;
    private javax.swing.JSeparator separatorAluguel;
    private javax.swing.JSeparator separatorValorParcela;
    private javax.swing.JSeparator separatorVencimento;
    private javax.swing.JTable tabelaPagamentos;
    // End of variables declaration//GEN-END:variables
}
