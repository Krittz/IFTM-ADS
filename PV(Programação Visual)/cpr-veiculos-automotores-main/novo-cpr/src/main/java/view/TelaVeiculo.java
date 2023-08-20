package view;

import model.Veiculo;
import controller.VeiculoController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
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
public class TelaVeiculo extends javax.swing.JInternalFrame {

    private VeiculoController controller;
    int codigoVeiculo;

    public TelaVeiculo() {
        initComponents();
        estiloBtn();
        estadoInicial();
        controller = new VeiculoController();
        TableCellRenderer headerRenderer = new TelaVeiculo.CustomHeaderRenderer();
        tabelaVeiculos.getTableHeader().setDefaultRenderer(headerRenderer);
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

        btnsDisponivel = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabelaVeiculos = new javax.swing.JTable();
        inputPlaca = new javax.swing.JTextField();
        separatorPlaca = new javax.swing.JSeparator();
        labelMarca = new javax.swing.JLabel();
        separatorMarca = new javax.swing.JSeparator();
        labelPlaca = new javax.swing.JLabel();
        separatorAno = new javax.swing.JSeparator();
        labelAno = new javax.swing.JLabel();
        separatorModelo = new javax.swing.JSeparator();
        inputModelo = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        inputMarca = new javax.swing.JFormattedTextField();
        btnSalvarEdicao = new javax.swing.JButton();
        labelAno1 = new javax.swing.JLabel();
        disponivelTrue = new javax.swing.JCheckBox();
        disponivelFalse = new javax.swing.JCheckBox();
        inputDiaria = new javax.swing.JTextField();
        labelDiaria = new javax.swing.JLabel();
        separatorDiaria = new javax.swing.JSeparator();
        inputAno = new javax.swing.JFormattedTextField();

        setBorder(null);
        setClosable(true);
        setTitle("VEICULOS");
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

        tabelaVeiculos.setBackground(new java.awt.Color(34, 34, 34));
        tabelaVeiculos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaVeiculos.setForeground(new java.awt.Color(1, 159, 224));
        tabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "PLACA", "MARCA", "MODELO", "ANO", "DISPONIVEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaVeiculos.setGridColor(new java.awt.Color(1, 159, 224));
        tabelaVeiculos.setOpaque(false);
        tabelaVeiculos.setRowHeight(40);
        tabelaVeiculos.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabelaVeiculos.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabelaVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaVeiculos.setShowGrid(true);
        tabelaVeiculos.setShowVerticalLines(false);
        scroll.setViewportView(tabelaVeiculos);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 940, 460));

        inputPlaca.setBackground(new java.awt.Color(34, 34, 34));
        inputPlaca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(1, 159, 224));
        inputPlaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputPlaca.setBorder(null);
        inputPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputPlaca.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputPlaca.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, 50));

        separatorPlaca.setBackground(new java.awt.Color(1, 159, 224));
        separatorPlaca.setForeground(new java.awt.Color(1, 159, 224));
        separatorPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorPlaca.setOpaque(true);
        jPanel1.add(separatorPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 2));

        labelMarca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(1, 159, 224));
        labelMarca.setText("*Marca");
        jPanel1.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        separatorMarca.setBackground(new java.awt.Color(1, 159, 224));
        separatorMarca.setForeground(new java.awt.Color(1, 159, 224));
        separatorMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorMarca.setOpaque(true);
        jPanel1.add(separatorMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 2));

        labelPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(1, 159, 224));
        labelPlaca.setText("*Placa");
        jPanel1.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        separatorAno.setBackground(new java.awt.Color(1, 159, 224));
        separatorAno.setForeground(new java.awt.Color(1, 159, 224));
        separatorAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorAno.setOpaque(true);
        jPanel1.add(separatorAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, 2));

        labelAno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAno.setForeground(new java.awt.Color(1, 159, 224));
        labelAno.setText("*Ano(xxxx-xxxx)");
        jPanel1.add(labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        separatorModelo.setBackground(new java.awt.Color(1, 159, 224));
        separatorModelo.setForeground(new java.awt.Color(1, 159, 224));
        separatorModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorModelo.setOpaque(true);
        jPanel1.add(separatorModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 2));

        inputModelo.setBackground(new java.awt.Color(34, 34, 34));
        inputModelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(1, 159, 224));
        inputModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputModelo.setBorder(null);
        inputModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputModelo.setNextFocusableComponent(disponivelTrue);
        inputModelo.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputModelo.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 50));

        labelModelo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(1, 159, 224));
        labelModelo.setText("*Modelo");
        jPanel1.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(34, 34, 34));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        inputMarca.setBackground(new java.awt.Color(34, 34, 34));
        inputMarca.setBorder(null);
        inputMarca.setForeground(new java.awt.Color(1, 159, 224));
        inputMarca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputMarca.setNextFocusableComponent(inputModelo);
        inputMarca.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputMarca.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 200, 50));

        btnSalvarEdicao.setBackground(new java.awt.Color(34, 34, 34));
        btnSalvarEdicao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSalvarEdicao.setForeground(new java.awt.Color(1, 159, 224));
        btnSalvarEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/floppy-disk.png"))); // NOI18N
        btnSalvarEdicao.setText("SALVAR");
        btnSalvarEdicao.setBorder(null);
        btnSalvarEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarEdicao.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSalvarEdicao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        labelAno1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAno1.setForeground(new java.awt.Color(1, 159, 224));
        labelAno1.setText("*Disponível");
        jPanel1.add(labelAno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        btnsDisponivel.add(disponivelTrue);
        disponivelTrue.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        disponivelTrue.setForeground(new java.awt.Color(1, 159, 224));
        disponivelTrue.setText("SIM");
        disponivelTrue.setBorder(null);
        disponivelTrue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disponivelTrue.setNextFocusableComponent(disponivelFalse);
        jPanel1.add(disponivelTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        btnsDisponivel.add(disponivelFalse);
        disponivelFalse.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        disponivelFalse.setForeground(new java.awt.Color(1, 159, 224));
        disponivelFalse.setText("NÃO");
        disponivelFalse.setBorder(null);
        disponivelFalse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(disponivelFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, 30));

        inputDiaria.setBackground(new java.awt.Color(34, 34, 34));
        inputDiaria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputDiaria.setForeground(new java.awt.Color(1, 159, 224));
        inputDiaria.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputDiaria.setBorder(null);
        inputDiaria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputDiaria.setNextFocusableComponent(inputMarca);
        inputDiaria.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputDiaria.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputDiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 130, 50));

        labelDiaria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDiaria.setForeground(new java.awt.Color(1, 159, 224));
        labelDiaria.setText("*Diária(R$ x.xx)");
        jPanel1.add(labelDiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        separatorDiaria.setBackground(new java.awt.Color(1, 159, 224));
        separatorDiaria.setForeground(new java.awt.Color(1, 159, 224));
        separatorDiaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorDiaria.setOpaque(true);
        jPanel1.add(separatorDiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, 2));

        inputAno.setBackground(new java.awt.Color(34, 34, 34));
        inputAno.setBorder(null);
        inputAno.setForeground(new java.awt.Color(1, 159, 224));
        try {
            inputAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputAno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputAno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputAno.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputAno.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 130, 50));

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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaVeiculos.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaVeiculos.getSelectedRow();
            int value = (int) tabelaVeiculos.getValueAt(linhaSelecionada, 0);
            Veiculo v = controller.buscarVeiculo(value);
            codigoVeiculo = v.getCodigo();

            estadoEditando();
            inputPlaca.setText(v.getPlaca());
            inputAno.setText(v.getAno());
            DecimalFormat formatarDecimal = new DecimalFormat("#0.00");
            formatarDecimal.setDecimalSeparatorAlwaysShown(true);
            String diariaFormatada = formatarDecimal.format(v.getDiaria());
            inputDiaria.setText(diariaFormatada);
            inputMarca.setText(v.getMarca());
            inputModelo.setText(v.getModelo());
            if (v.isDisponivel()) {
                disponivelTrue.setSelected(true);
            } else {
                disponivelFalse.setSelected(true);
            }

        } else {
            labelAvisos.setText("Selecione um veículo na tabela");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaVeiculos.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaVeiculos.getSelectedRow();
            Object cod = tabelaVeiculos.getValueAt(linhaSelecionada, 0);
            Object placa = tabelaVeiculos.getValueAt(linhaSelecionada, 1);
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir veículo: (" + cod + ") " + placa, "Confirma exclusão", JOptionPane.OK_CANCEL_OPTION);
            if (confirma == JOptionPane.OK_OPTION) {
                controller.excluir((int) cod);
                preencherTabela();
            } else {
                estadoInicial();
            }

        } else {
            labelAvisos.setText("Selecione um veiculo na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String placa = inputPlaca.getText().trim().toUpperCase();
        String marca = inputMarca.getText().trim();
        String modelo = inputModelo.getText().trim();
        String ano = inputAno.getText().trim();
        String preco = inputDiaria.getText().trim();
        String precoSemMilhar = preco.replaceAll("\\.", "").replace(",", ".");
        String anoSemHifem = ano.replaceAll("\\-", "");
        double diaria = Double.parseDouble(precoSemMilhar);

        boolean disponivel = false;
        if (disponivelTrue.isSelected()) {
            disponivel = true;
        } else if (disponivelFalse.isSelected()) {
            disponivel = false;
        }
        if (validarCampos(placa, marca, modelo, anoSemHifem, diaria)) {
            if (placa.length() > 8) {
                labelAvisos.setText("Placa inválida, máximo 8 caracteres");
            } else {

                if (controller.verificarPlaca(placa)) {
                    labelAvisos.setText("Placa já cadastrada");
                } else {
                    labelAvisos.setText("");
                    controller.cadastrar(placa, marca, modelo, ano, diaria, disponivel);
                    preencherTabela();
                    estadoInicial();
                }
            }
        } else {
            labelAvisos.setText("Preencha todos os campos marcados com *");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEdicaoActionPerformed
        String placa = inputPlaca.getText().trim().toUpperCase();
        String ano = inputAno.getText().trim();
        String preco = inputDiaria.getText().trim();
        String marca = inputMarca.getText().trim();
        String modelo = inputModelo.getText().trim();
        String anoSemHifem = ano.replace("\\-", "");
        boolean disponivel = false;
        String precoSemMilhar = preco.replaceAll("\\.", "").replace(",", ".");
        double diaria = Double.parseDouble(precoSemMilhar);
        if (disponivelTrue.isSelected()) {
            disponivel = true;
        } else if (disponivelFalse.isSelected()) {
            disponivel = false;
        }
        if (!disponivelTrue.isSelected() && !disponivelFalse.isSelected()) {
            labelAvisos.setText("Informa a disponibilidade");
        } else {
            boolean verificar = validarCampos(placa, marca, modelo, anoSemHifem, diaria);
            if (verificar) {
                if (placa.length() > 8) {
                    labelAvisos.setText("Placa inválida, máximo 8 caracteres");
                }
                boolean duplicado = controller.verificarDuplicidade(codigoVeiculo, placa);
                if (duplicado) {
                    labelAvisos.setText("Placa já registrada");
                    inputPlaca.setText("");
                    inputPlaca.requestFocus();
                } else {
                    labelAvisos.setText("");
                    controller.atualizar(codigoVeiculo, placa, marca, modelo, ano, diaria, disponivel);
                    preencherTabela();
                    estadoInicial();
                }
            } else {
                labelAvisos.setText("Preencha todos os campos marcados com *");
            }
        }


    }//GEN-LAST:event_btnSalvarEdicaoActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            List<Veiculo> veiculos = controller.buscarVeiculos();
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(veiculos);

            JasperReport relatorioVeiculo = JasperCompileManager.compileReport("src/main/java/report/RelatorioDeVeiculos.jrxml");
            JasperPrint printarRelatorio = JasperFillManager.fillReport(relatorioVeiculo, null, dataSource);

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

    public void estadoInicial() {
        clear();
        habilitarCampos(false);
        habilitarBtnsMenu(true);
        btnSalvarEdicao.setVisible(false);

    }

    public void clear() {
        inputPlaca.setText("");
        inputMarca.setText("");
        inputModelo.setText("");
        inputAno.setText("");
        inputDiaria.setText("");
        btnsDisponivel.clearSelection();
        labelAvisos.setText("");
    }

    public void habilitarCampos(boolean x) {
        inputPlaca.setVisible(x);
        inputMarca.setVisible(x);
        inputModelo.setVisible(x);
        inputAno.setVisible(x);
        inputDiaria.setVisible(x);
        disponivelFalse.setEnabled(x);
        disponivelTrue.setEnabled(x);

        btnSalvar.setVisible(x);
        btnCancelar.setVisible(x);
    }

    public void estadoCadastrando() {
        habilitarCampos(true);
        inputPlaca.requestFocus();
        habilitarBtnsMenu(false);

    }

    public void estadoEditando() {
        habilitarCampos(true);
        btnSalvar.setVisible(false);
        btnSalvarEdicao.setVisible(true);
        habilitarBtnsMenu(false);

    }

    public boolean validarCampos(String placa, String marca, String modelo, String ano, double diaria) {
        if (!placa.isEmpty() && !marca.isEmpty() && !modelo.isEmpty() && !ano.isEmpty() && !Double.isNaN(diaria)) {
            return true;
        } else {
            return false;
        }
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnNovo, btnEditar, btnExcluir, btnRelatorio};
        for (JButton btn : btns) {
            btn.setEnabled(x);
        }
    }

    public void preencherTabela() {
        List<Veiculo> veiculos = controller.veiculosAtivos();
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CODIGO");
        model.addColumn("PLACA");
        model.addColumn("MARCA");
        model.addColumn("MODELO");
        model.addColumn("ANO");
        model.addColumn("DIARIA");
        model.addColumn("DISPONIVEL");

        DecimalFormat df = new DecimalFormat("0.00");
        Iterator<Veiculo> it = veiculos.iterator();
        while (it.hasNext()) {
            Veiculo v = it.next();
            String diaria = df.format(v.getDiaria());
            String disponivel = "";
            if (v.isDisponivel()) {
                disponivel = "SIM";
            } else {
                disponivel = "NÃO";
            }
            Object[] row = {
                v.getCodigo(),
                v.getPlaca(),
                v.getMarca(),
                v.getModelo(),
                v.getAno(),
                diaria,
                disponivel
            };
            model.addRow(row);
        }
        tabelaVeiculos.setModel(model);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdicao;
    private javax.swing.ButtonGroup btnsDisponivel;
    private javax.swing.JCheckBox disponivelFalse;
    private javax.swing.JCheckBox disponivelTrue;
    private javax.swing.JFormattedTextField inputAno;
    private javax.swing.JTextField inputDiaria;
    private javax.swing.JFormattedTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAno1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelDiaria;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorAno;
    private javax.swing.JSeparator separatorDiaria;
    private javax.swing.JSeparator separatorMarca;
    private javax.swing.JSeparator separatorModelo;
    private javax.swing.JSeparator separatorPlaca;
    private javax.swing.JTable tabelaVeiculos;
    // End of variables declaration//GEN-END:variables
}
