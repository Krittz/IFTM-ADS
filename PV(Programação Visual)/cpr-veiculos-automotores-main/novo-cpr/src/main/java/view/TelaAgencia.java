package view;

import controller.AgenciaController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
import model.Agencia;
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
public class TelaAgencia extends javax.swing.JInternalFrame {

    private AgenciaController controller;
    int codigoAgencia;
    DateTimeFormatter formatarHoras;

    public TelaAgencia() {
        initComponents();
        controller = new AgenciaController();
        estiloBtn();
        estadoInicial();
        TableCellRenderer headerRenderer = new CustomHeaderRenderer();
        tabelaAgencias.getTableHeader().setDefaultRenderer(headerRenderer);

        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                estadoInicial();
            }
        });
        preencherTabela();
        formatarHoras = DateTimeFormatter.ofPattern("HH:mm");
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
        tabelaAgencias = new javax.swing.JTable();
        inputNome = new javax.swing.JTextField();
        separatorNome = new javax.swing.JSeparator();
        labelLogradouro = new javax.swing.JLabel();
        separatorLogradouro = new javax.swing.JSeparator();
        labelPlaca = new javax.swing.JLabel();
        separatorAno = new javax.swing.JSeparator();
        labelAbre = new javax.swing.JLabel();
        separatorNumero = new javax.swing.JSeparator();
        inputNumero = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        inputLogradouro = new javax.swing.JFormattedTextField();
        btnSalvarEdicao = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        separatorFecha = new javax.swing.JSeparator();
        inputAbre = new javax.swing.JFormattedTextField();
        inputTelefone = new javax.swing.JTextField();
        separatorTelefone = new javax.swing.JSeparator();
        labelPlaca1 = new javax.swing.JLabel();
        separatorBairro = new javax.swing.JSeparator();
        inputBairro = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        separatorCep = new javax.swing.JSeparator();
        inputCep = new javax.swing.JTextField();
        labelCep = new javax.swing.JLabel();
        separatorComplemento = new javax.swing.JSeparator();
        inputComplemento = new javax.swing.JTextField();
        labelCep1 = new javax.swing.JLabel();
        inputFecha = new javax.swing.JFormattedTextField();

        setBorder(null);
        setClosable(true);
        setTitle("AGÊNCIAS");
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

        tabelaAgencias.setBackground(new java.awt.Color(34, 34, 34));
        tabelaAgencias.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAgencias.setForeground(new java.awt.Color(1, 159, 224));
        tabelaAgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "HORÁRIO", "TELEFONE", "ENDEREÇO", "CEP", "COMPLEMENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAgencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaAgencias.setGridColor(new java.awt.Color(1, 159, 224));
        tabelaAgencias.setRowHeight(40);
        tabelaAgencias.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabelaAgencias.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabelaAgencias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAgencias.setShowGrid(true);
        tabelaAgencias.setShowVerticalLines(false);
        scroll.setViewportView(tabelaAgencias);
        if (tabelaAgencias.getColumnModel().getColumnCount() > 0) {
            tabelaAgencias.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 940, 350));

        inputNome.setBackground(new java.awt.Color(34, 34, 34));
        inputNome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(1, 159, 224));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputNome.setBorder(null);
        inputNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNome.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputNome.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, 50));

        separatorNome.setBackground(new java.awt.Color(1, 159, 224));
        separatorNome.setForeground(new java.awt.Color(1, 159, 224));
        separatorNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorNome.setOpaque(true);
        jPanel1.add(separatorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 2));

        labelLogradouro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelLogradouro.setForeground(new java.awt.Color(1, 159, 224));
        labelLogradouro.setText("*Logradouro");
        jPanel1.add(labelLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        separatorLogradouro.setBackground(new java.awt.Color(1, 159, 224));
        separatorLogradouro.setForeground(new java.awt.Color(1, 159, 224));
        separatorLogradouro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorLogradouro.setOpaque(true);
        jPanel1.add(separatorLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 200, 2));

        labelPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(1, 159, 224));
        labelPlaca.setText("*Nome");
        jPanel1.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        separatorAno.setBackground(new java.awt.Color(1, 159, 224));
        separatorAno.setForeground(new java.awt.Color(1, 159, 224));
        separatorAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorAno.setOpaque(true);
        jPanel1.add(separatorAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 130, 2));

        labelAbre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAbre.setForeground(new java.awt.Color(1, 159, 224));
        labelAbre.setText("*Abre às(xx:xx)");
        jPanel1.add(labelAbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        separatorNumero.setBackground(new java.awt.Color(1, 159, 224));
        separatorNumero.setForeground(new java.awt.Color(1, 159, 224));
        separatorNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorNumero.setOpaque(true);
        jPanel1.add(separatorNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 110, 2));

        inputNumero.setBackground(new java.awt.Color(34, 34, 34));
        inputNumero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputNumero.setForeground(new java.awt.Color(1, 159, 224));
        inputNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputNumero.setBorder(null);
        inputNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNumero.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputNumero.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, 50));

        labelNumero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(1, 159, 224));
        labelNumero.setText("*Numero");
        jPanel1.add(labelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

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

        inputLogradouro.setBackground(new java.awt.Color(34, 34, 34));
        inputLogradouro.setBorder(null);
        inputLogradouro.setForeground(new java.awt.Color(1, 159, 224));
        inputLogradouro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputLogradouro.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputLogradouro.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 50));

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

        labelFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(1, 159, 224));
        labelFecha.setText("*Fecha às(xxx:xx)");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        separatorFecha.setBackground(new java.awt.Color(1, 159, 224));
        separatorFecha.setForeground(new java.awt.Color(1, 159, 224));
        separatorFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorFecha.setOpaque(true);
        jPanel1.add(separatorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 130, 2));

        inputAbre.setBackground(new java.awt.Color(34, 34, 34));
        inputAbre.setBorder(null);
        inputAbre.setForeground(new java.awt.Color(1, 159, 224));
        inputAbre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        inputAbre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputAbre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputAbre.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputAbre.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputAbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, 50));

        inputTelefone.setBackground(new java.awt.Color(34, 34, 34));
        inputTelefone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(1, 159, 224));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputTelefone.setBorder(null);
        inputTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputTelefone.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputTelefone.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 200, 50));

        separatorTelefone.setBackground(new java.awt.Color(1, 159, 224));
        separatorTelefone.setForeground(new java.awt.Color(1, 159, 224));
        separatorTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorTelefone.setOpaque(true);
        jPanel1.add(separatorTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 200, 2));

        labelPlaca1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPlaca1.setForeground(new java.awt.Color(1, 159, 224));
        labelPlaca1.setText("*Telefone");
        jPanel1.add(labelPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        separatorBairro.setBackground(new java.awt.Color(1, 159, 224));
        separatorBairro.setForeground(new java.awt.Color(1, 159, 224));
        separatorBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorBairro.setOpaque(true);
        jPanel1.add(separatorBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 110, 2));

        inputBairro.setBackground(new java.awt.Color(34, 34, 34));
        inputBairro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputBairro.setForeground(new java.awt.Color(1, 159, 224));
        inputBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputBairro.setBorder(null);
        inputBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputBairro.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputBairro.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 110, 50));

        labelBairro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelBairro.setForeground(new java.awt.Color(1, 159, 224));
        labelBairro.setText("*Bairro");
        jPanel1.add(labelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        separatorCep.setBackground(new java.awt.Color(1, 159, 224));
        separatorCep.setForeground(new java.awt.Color(1, 159, 224));
        separatorCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorCep.setOpaque(true);
        jPanel1.add(separatorCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 140, 2));

        inputCep.setBackground(new java.awt.Color(34, 34, 34));
        inputCep.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputCep.setForeground(new java.awt.Color(1, 159, 224));
        inputCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputCep.setBorder(null);
        inputCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputCep.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputCep.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 140, 50));

        labelCep.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCep.setForeground(new java.awt.Color(1, 159, 224));
        labelCep.setText("Cep");
        jPanel1.add(labelCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        separatorComplemento.setBackground(new java.awt.Color(1, 159, 224));
        separatorComplemento.setForeground(new java.awt.Color(1, 159, 224));
        separatorComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorComplemento.setOpaque(true);
        jPanel1.add(separatorComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 140, 2));

        inputComplemento.setBackground(new java.awt.Color(34, 34, 34));
        inputComplemento.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputComplemento.setForeground(new java.awt.Color(1, 159, 224));
        inputComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputComplemento.setBorder(null);
        inputComplemento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputComplemento.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputComplemento.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 140, 50));

        labelCep1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCep1.setForeground(new java.awt.Color(1, 159, 224));
        labelCep1.setText("Complemento");
        jPanel1.add(labelCep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, -1));

        inputFecha.setBackground(new java.awt.Color(34, 34, 34));
        inputFecha.setBorder(null);
        inputFecha.setForeground(new java.awt.Color(1, 159, 224));
        inputFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        inputFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputFecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inputFecha.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputFecha.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 130, 50));

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
        if (tabelaAgencias.getSelectedRow() != -1) {
            int linhaSelecionada = tabelaAgencias.getSelectedRow();
            int value = (int) tabelaAgencias.getValueAt(linhaSelecionada, 0);

            Agencia ag = controller.buscarAgencia(value);
            codigoAgencia = ag.getCodigo();

            estadoEditando();
            inputNome.setText(ag.getNome());
            inputTelefone.setText(ag.getTelefone());
            inputAbre.setText(String.valueOf(ag.getHoraAbre()));
            inputFecha.setText(String.valueOf(ag.getHoraFecha()));
            inputLogradouro.setText(ag.getLogradouro());
            inputNumero.setText(String.valueOf(ag.getNumero()));
            inputBairro.setText(ag.getBairro());
            inputCep.setText(ag.getCep());
            inputComplemento.setText(ag.getComplemento());

        } else {
            labelAvisos.setText("Selecione uma agência na tabela");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaAgencias.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaAgencias.getSelectedRow();
            Object cod = tabelaAgencias.getValueAt(linhaSelecionada, 0);
            Object nome = tabelaAgencias.getValueAt(linhaSelecionada, 1);
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir agência: (" + cod + ") " + nome, "Confirma exclusão?", JOptionPane.OK_CANCEL_OPTION);
            if (confirma == JOptionPane.OK_OPTION) {
                controller.excluir((int) cod);
                preencherTabela();
            } else {
                estadoInicial();
            }
        } else {
            labelAvisos.setText("Selecione uma agência na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = inputNome.getText().trim();
        String abre = inputAbre.getText().trim();
        String fecha = inputFecha.getText().trim();
        String telefone = inputTelefone.getText().trim();
        String logradouro = inputLogradouro.getText().trim();
        String numero = inputNumero.getText().trim();
        String bairro = inputBairro.getText().trim();
        String cep = inputCep.getText().trim();
        String complemento = inputComplemento.getText().trim();
        if (validarCampos(nome, abre, fecha, telefone, logradouro, numero, bairro)) {
            try {
                int num = Integer.parseInt(numero);
                LocalTime abreHrs = LocalTime.parse(abre, formatarHoras);
                LocalTime fechaHrs = LocalTime.parse(fecha, formatarHoras);
                controller.salvar(nome, abreHrs, fechaHrs, telefone, logradouro, num, bairro, cep, complemento);
                preencherTabela();
                estadoInicial();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                labelAvisos.setText("Número inválido");
            }

        } else {
            labelAvisos.setText("Preencha todos os campos marcados com *");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEdicaoActionPerformed
        String nome = inputNome.getText().trim();
        String abre = inputAbre.getText().trim();
        String fecha = inputFecha.getText().trim();
        String telefone = inputTelefone.getText().trim();
        String logradouro = inputLogradouro.getText().trim();
        String numero = inputNumero.getText().trim();
        String bairro = inputBairro.getText().trim();
        String cep = inputCep.getText().trim();
        String complemento = inputComplemento.getText().trim();
        if (validarCampos(nome, abre, fecha, telefone, logradouro, numero, bairro)) {
            try {
                int num = Integer.parseInt(numero);
                LocalTime abreHrs = LocalTime.parse(abre, formatarHoras);
                LocalTime fechaHrs = LocalTime.parse(fecha, formatarHoras);
                controller.atualizar(codigoAgencia, nome, telefone, abreHrs, fechaHrs, logradouro, num, bairro, cep, complemento);
                preencherTabela();
                estadoInicial();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                labelAvisos.setText("Número inválido");
            }
        } else {
            labelAvisos.setText("Preencha todos os campos marcados com *");
        }
    }//GEN-LAST:event_btnSalvarEdicaoActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            List<Agencia> agencias = controller.agenciasAtivas();
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(agencias);

            JasperReport relatorioAgencias = JasperCompileManager.compileReport("src/main/java/report/RelatorioDeAgencias.jrxml");
            JasperPrint printarRelatorio = JasperFillManager.fillReport(relatorioAgencias, null, dataSource);

            JFrame frame = new JFrame("Relatório de Agências");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 600);

            JRViewer viewer = new JRViewer(printarRelatorio);
            frame.getContentPane().add(viewer);
            frame.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    public boolean validarCampos(String nome, String abre, String fecha, String telefone, String logradouro, String numero, String bairro) {
        return !nome.isEmpty() && !abre.isEmpty() && !fecha.isEmpty() && !telefone.isEmpty() && !logradouro.isEmpty() && !numero.isEmpty() && !bairro.isEmpty();

    }

    public void estadoInicial() {
        clear();
        habilitarCampos(false);
        habilitarBtnsMenu(true);
        btnSalvarEdicao.setVisible(false);
    }

    public void habilitarCampos(boolean x) {
        inputNome.setVisible(x);
        inputTelefone.setVisible(x);
        inputAbre.setVisible(x);
        inputFecha.setVisible(x);
        inputLogradouro.setVisible(x);
        inputNumero.setVisible(x);
        inputBairro.setVisible(x);
        inputCep.setVisible(x);
        inputComplemento.setVisible(x);
        btnSalvar.setVisible(x);
        btnCancelar.setVisible(x);
    }

    public void estadoCadastrando() {
        habilitarBtnsMenu(false);
        habilitarCampos(true);
        inputNome.requestFocus();
    }

    public void estadoEditando() {
        habilitarBtnsMenu(false);
        habilitarCampos(true);
        btnSalvar.setVisible(false);
        btnSalvarEdicao.setVisible(true);
    }

    public void clear() {
        inputNome.setText("");
        inputTelefone.setText("");
        inputAbre.setText("");
        inputFecha.setText("");
        inputLogradouro.setText("");
        inputNumero.setText("");
        inputBairro.setText("");
        inputCep.setText("");
        inputComplemento.setText("");
        labelAvisos.setText("");
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnNovo, btnEditar, btnExcluir, btnRelatorio};
        for (JButton btn : btns) {
            btn.setEnabled(x);
        }
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

    public void preencherTabela() {
        List<Agencia> agencias = controller.agenciasAtivas();
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("NOME");
        model.addColumn("HORÁRIO");
        model.addColumn("TEL");
        model.addColumn("ENDEREÇO");
        model.addColumn("CEP");
        model.addColumn("COMPLEMENTO");

        Iterator<Agencia> it = agencias.iterator();
        while (it.hasNext()) {
            Agencia ag = it.next();
            String funcionamento = String.valueOf(ag.getHoraAbre()) + " - " + String.valueOf(ag.getHoraFecha());
            String endereco = ag.getLogradouro() + ", " + String.valueOf(ag.getNumero()) + ", " + ag.getBairro();
            Object[] row = {
                ag.getCodigo(),
                ag.getNome(),
                funcionamento,
                ag.getTelefone(),
                endereco,
                ag.getCep(),
                ag.getComplemento()
            };
            model.addRow(row);
        }
        tabelaAgencias.setModel(model);
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
    private javax.swing.JFormattedTextField inputAbre;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputCep;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JFormattedTextField inputFecha;
    private javax.swing.JFormattedTextField inputLogradouro;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAbre;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCep1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPlaca1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorAno;
    private javax.swing.JSeparator separatorBairro;
    private javax.swing.JSeparator separatorCep;
    private javax.swing.JSeparator separatorComplemento;
    private javax.swing.JSeparator separatorFecha;
    private javax.swing.JSeparator separatorLogradouro;
    private javax.swing.JSeparator separatorNome;
    private javax.swing.JSeparator separatorNumero;
    private javax.swing.JSeparator separatorTelefone;
    private javax.swing.JTable tabelaAgencias;
    // End of variables declaration//GEN-END:variables
}
