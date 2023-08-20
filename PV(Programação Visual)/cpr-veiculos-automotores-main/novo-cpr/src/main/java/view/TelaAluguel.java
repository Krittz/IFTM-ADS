package view;

import controller.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
import model.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
public class TelaAluguel extends javax.swing.JInternalFrame {

    private AluguelController controller;
    private VeiculoController veiculoController;
    private ClienteController clienteController;
    private AgenciaController agenciaController;
    private DateTimeFormatter formatarData;
    private DateTimeFormatter formatarHoras;

    private int codigoAluguel;

    public TelaAluguel() {
        initComponents();
        controller = new AluguelController();
        formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formatarHoras = DateTimeFormatter.ofPattern("HH:mm");
        veiculoController = new VeiculoController();
        clienteController = new ClienteController();
        agenciaController = new AgenciaController();

        preencherTabela();
        estadoInicial();
        estiloBtn();

        TableCellRenderer headerRenderer = new TelaAluguel.CustomHeaderRenderer();
        tabelaAlugueis.getTableHeader().setDefaultRenderer(headerRenderer);

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
        tabelaAlugueis = new javax.swing.JTable();
        inputVeiculo = new javax.swing.JTextField();
        separatorVeiculo = new javax.swing.JSeparator();
        labelPlaca = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        labelAvisos = new javax.swing.JLabel();
        btnSalvarEdicao = new javax.swing.JButton();
        inputCliente = new javax.swing.JTextField();
        separatorCliente = new javax.swing.JSeparator();
        labelCnh = new javax.swing.JLabel();
        labelCodigoAgencia = new javax.swing.JLabel();
        inputAgencia = new javax.swing.JTextField();
        separatorAgencia = new javax.swing.JSeparator();
        btnBuscarVeiculo = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarAgencia = new javax.swing.JButton();
        separatorRetirada = new javax.swing.JSeparator();
        labelRetirada = new javax.swing.JLabel();
        inputRetirada = new javax.swing.JFormattedTextField();
        labelDevolucao = new javax.swing.JLabel();
        inputDevolucao = new javax.swing.JFormattedTextField();
        separatorDevolucao = new javax.swing.JSeparator();
        inputValorTotal = new javax.swing.JTextField();
        labelValorTotal = new javax.swing.JLabel();
        separatorValorTotal = new javax.swing.JSeparator();
        btnCalcularTotal = new javax.swing.JButton();
        btnOkVeiculo = new javax.swing.JButton();
        btnOkCliente = new javax.swing.JButton();
        btnOkAgencia = new javax.swing.JButton();
        btnCancelarEscolha = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("ALUGUEL");
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

        tabelaAlugueis.setBackground(new java.awt.Color(34, 34, 34));
        tabelaAlugueis.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAlugueis.setForeground(new java.awt.Color(1, 159, 224));
        tabelaAlugueis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "RETIRADA", "DEVOLUÇÃO", "PREÇO", "VEÍCULO", "AGÊNCIA", "CLIETE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAlugueis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaAlugueis.setGridColor(new java.awt.Color(1, 159, 224));
        tabelaAlugueis.setRowHeight(40);
        tabelaAlugueis.setSelectionBackground(new java.awt.Color(1, 159, 224));
        tabelaAlugueis.setSelectionForeground(new java.awt.Color(34, 34, 34));
        tabelaAlugueis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlugueis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlugueis.setShowGrid(false);
        tabelaAlugueis.setShowHorizontalLines(true);
        scroll.setViewportView(tabelaAlugueis);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 940, 300));

        inputVeiculo.setEditable(false);
        inputVeiculo.setBackground(new java.awt.Color(34, 34, 34));
        inputVeiculo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputVeiculo.setForeground(new java.awt.Color(1, 159, 224));
        inputVeiculo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputVeiculo.setBorder(null);
        inputVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputVeiculo.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputVeiculo.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 460, 30));

        separatorVeiculo.setBackground(new java.awt.Color(1, 159, 224));
        separatorVeiculo.setForeground(new java.awt.Color(1, 159, 224));
        separatorVeiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorVeiculo.setOpaque(true);
        jPanel1.add(separatorVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 460, 2));

        labelPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(1, 159, 224));
        labelPlaca.setText("* Veículo");
        jPanel1.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

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
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 300, 80));

        labelAvisos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(1, 159, 224));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 560, 50));

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
        jPanel1.add(btnSalvarEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, -1, -1));

        inputCliente.setEditable(false);
        inputCliente.setBackground(new java.awt.Color(34, 34, 34));
        inputCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputCliente.setForeground(new java.awt.Color(1, 159, 224));
        inputCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputCliente.setBorder(null);
        inputCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputCliente.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputCliente.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 460, 30));

        separatorCliente.setBackground(new java.awt.Color(1, 159, 224));
        separatorCliente.setForeground(new java.awt.Color(1, 159, 224));
        separatorCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorCliente.setOpaque(true);
        jPanel1.add(separatorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 460, 2));

        labelCnh.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCnh.setForeground(new java.awt.Color(1, 159, 224));
        labelCnh.setText("* Cliente");
        jPanel1.add(labelCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        labelCodigoAgencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCodigoAgencia.setForeground(new java.awt.Color(1, 159, 224));
        labelCodigoAgencia.setText("*Código da agência");
        jPanel1.add(labelCodigoAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        inputAgencia.setEditable(false);
        inputAgencia.setBackground(new java.awt.Color(34, 34, 34));
        inputAgencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputAgencia.setForeground(new java.awt.Color(1, 159, 224));
        inputAgencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputAgencia.setBorder(null);
        inputAgencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputAgencia.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputAgencia.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 460, 30));

        separatorAgencia.setBackground(new java.awt.Color(1, 159, 224));
        separatorAgencia.setForeground(new java.awt.Color(1, 159, 224));
        separatorAgencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorAgencia.setOpaque(true);
        jPanel1.add(separatorAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 460, 2));

        btnBuscarVeiculo.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscarVeiculo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarVeiculo.setForeground(new java.awt.Color(1, 159, 224));
        btnBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/magnifying-glass.png"))); // NOI18N
        btnBuscarVeiculo.setText("Buscar veiculos");
        btnBuscarVeiculo.setBorder(null);
        btnBuscarVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarVeiculo.setPreferredSize(new java.awt.Dimension(70, 70));
        btnBuscarVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, 60));

        btnBuscarCliente.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(1, 159, 224));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/magnifying-glass.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar clientes");
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCliente.setPreferredSize(new java.awt.Dimension(70, 70));
        btnBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 100, 50));

        btnBuscarAgencia.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscarAgencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarAgencia.setForeground(new java.awt.Color(1, 159, 224));
        btnBuscarAgencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/magnifying-glass.png"))); // NOI18N
        btnBuscarAgencia.setText("Buscar agências");
        btnBuscarAgencia.setBorder(null);
        btnBuscarAgencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAgencia.setPreferredSize(new java.awt.Dimension(70, 70));
        btnBuscarAgencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAgenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 90, 50));

        separatorRetirada.setBackground(new java.awt.Color(1, 159, 224));
        separatorRetirada.setForeground(new java.awt.Color(1, 159, 224));
        separatorRetirada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorRetirada.setOpaque(true);
        jPanel1.add(separatorRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, 2));

        labelRetirada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelRetirada.setForeground(new java.awt.Color(1, 159, 224));
        labelRetirada.setText("*Data de retirada");
        jPanel1.add(labelRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, -1));

        inputRetirada.setBackground(new java.awt.Color(34, 34, 34));
        inputRetirada.setBorder(null);
        inputRetirada.setForeground(new java.awt.Color(1, 159, 224));
        inputRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputRetirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputRetirada.setCaretColor(new java.awt.Color(1, 159, 224));
        inputRetirada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputRetirada.setMaximumSize(new java.awt.Dimension(150, 30));
        inputRetirada.setMinimumSize(new java.awt.Dimension(150, 30));
        inputRetirada.setPreferredSize(new java.awt.Dimension(150, 30));
        inputRetirada.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputRetirada.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, 30));

        labelDevolucao.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDevolucao.setForeground(new java.awt.Color(1, 159, 224));
        labelDevolucao.setText("*Data de devolução");
        jPanel1.add(labelDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, -1));

        inputDevolucao.setBackground(new java.awt.Color(34, 34, 34));
        inputDevolucao.setBorder(null);
        inputDevolucao.setForeground(new java.awt.Color(1, 159, 224));
        inputDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputDevolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDevolucao.setCaretColor(new java.awt.Color(1, 159, 224));
        inputDevolucao.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputDevolucao.setMaximumSize(new java.awt.Dimension(150, 30));
        inputDevolucao.setMinimumSize(new java.awt.Dimension(150, 30));
        inputDevolucao.setPreferredSize(new java.awt.Dimension(150, 30));
        inputDevolucao.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputDevolucao.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 30));

        separatorDevolucao.setBackground(new java.awt.Color(1, 159, 224));
        separatorDevolucao.setForeground(new java.awt.Color(1, 159, 224));
        separatorDevolucao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorDevolucao.setOpaque(true);
        jPanel1.add(separatorDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 2));

        inputValorTotal.setBackground(new java.awt.Color(34, 34, 34));
        inputValorTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputValorTotal.setForeground(new java.awt.Color(1, 159, 224));
        inputValorTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputValorTotal.setBorder(null);
        inputValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputValorTotal.setDisabledTextColor(new java.awt.Color(1, 159, 224));
        inputValorTotal.setSelectedTextColor(new java.awt.Color(34, 34, 34));
        inputValorTotal.setSelectionColor(new java.awt.Color(1, 159, 224));
        jPanel1.add(inputValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 150, 30));

        labelValorTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelValorTotal.setForeground(new java.awt.Color(1, 159, 224));
        labelValorTotal.setText("Valor total");
        jPanel1.add(labelValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        separatorValorTotal.setBackground(new java.awt.Color(1, 159, 224));
        separatorValorTotal.setForeground(new java.awt.Color(1, 159, 224));
        separatorValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 159, 224)));
        separatorValorTotal.setOpaque(true);
        jPanel1.add(separatorValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 150, 2));

        btnCalcularTotal.setBackground(new java.awt.Color(34, 34, 34));
        btnCalcularTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCalcularTotal.setForeground(new java.awt.Color(1, 159, 224));
        btnCalcularTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/currency-dollar-simple-bold.png"))); // NOI18N
        btnCalcularTotal.setText("CALCULAR TOTAL");
        btnCalcularTotal.setBorder(null);
        btnCalcularTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcularTotal.setPreferredSize(new java.awt.Dimension(70, 70));
        btnCalcularTotal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 110, 50));

        btnOkVeiculo.setBackground(new java.awt.Color(34, 34, 34));
        btnOkVeiculo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkVeiculo.setForeground(new java.awt.Color(1, 159, 224));
        btnOkVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkVeiculo.setText("OK");
        btnOkVeiculo.setBorder(null);
        btnOkVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkVeiculo.setMaximumSize(new java.awt.Dimension(98, 51));
        btnOkVeiculo.setMinimumSize(new java.awt.Dimension(98, 51));
        btnOkVeiculo.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 100, -1));

        btnOkCliente.setBackground(new java.awt.Color(34, 34, 34));
        btnOkCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkCliente.setForeground(new java.awt.Color(1, 159, 224));
        btnOkCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkCliente.setText("OK");
        btnOkCliente.setBorder(null);
        btnOkCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkCliente.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 100, -1));

        btnOkAgencia.setBackground(new java.awt.Color(34, 34, 34));
        btnOkAgencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnOkAgencia.setForeground(new java.awt.Color(1, 159, 224));
        btnOkAgencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-circle-bold.png"))); // NOI18N
        btnOkAgencia.setText("OK");
        btnOkAgencia.setBorder(null);
        btnOkAgencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOkAgencia.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOkAgencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOkAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAgenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 100, -1));

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
        jPanel1.add(btnCancelarEscolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 100, -1));

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

    private void btnSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEdicaoActionPerformed
        Aluguel aluguel = new Aluguel();
        aluguel.setCodigo(codigoAluguel);
        String veiculo = inputVeiculo.getText().trim();
        String dataRetirada = inputRetirada.getText().trim();
        String dataDevolucao = inputDevolucao.getText().trim();
        String valorTotal = inputValorTotal.getText().trim();
        String cliente = inputCliente.getText().trim();
        String agencia = inputAgencia.getText().trim();
        if (verificarCampos(veiculo, cliente, agencia, dataRetirada, dataDevolucao, valorTotal)) {
            char codVeiculo = veiculo.charAt(0);
            char codCliente = cliente.charAt(0);
            char codAgencia = agencia.charAt(0);
            int codigoVeiculo = Character.getNumericValue(codVeiculo);
            int codigoCliente = Character.getNumericValue(codCliente);
            int codigoAgencia = Character.getNumericValue(codAgencia);
            Veiculo v = veiculoController.buscarVeiculo(codigoVeiculo);
            Cliente c = clienteController.buscarCliente(codigoCliente);
            Agencia a = agenciaController.buscarAgencia(codigoAgencia);
            aluguel.setVeiculo(v);
            aluguel.setCliente(c);
            aluguel.setAgencia(a);
            aluguel.setRetirada(LocalDate.parse(dataRetirada, formatarData));
            aluguel.setDevolucao(LocalDate.parse(dataDevolucao, formatarData));
            aluguel.setValor(Double.parseDouble(valorTotal));
            controller.atualizar(aluguel);
            preencherTabela();
            estadoInicial();

        } else {
            labelAvisos.setText("Preencha todos os campos");
        }
    }//GEN-LAST:event_btnSalvarEdicaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String veiculoEscolhido = inputVeiculo.getText().trim();
        String dataRetirada = inputRetirada.getText().trim();
        String dataDevolucao = inputDevolucao.getText().trim();
        String valorTotal = inputValorTotal.getText().trim();
        String clienteEscolhido = inputCliente.getText().trim();
        String agenciaEscolhida = inputAgencia.getText().trim();
        if (verificarCampos(veiculoEscolhido, clienteEscolhido, agenciaEscolhida, dataRetirada, dataDevolucao, valorTotal)) {
            char codVeiculo = veiculoEscolhido.charAt(0);
            char codCliente = clienteEscolhido.charAt(0);
            char codAgencia = agenciaEscolhida.charAt(0);
            int codigoVeiculo = Character.getNumericValue(codVeiculo);
            int codigoCliente = Character.getNumericValue(codCliente);
            int codigoAgencia = Character.getNumericValue(codAgencia);
            Veiculo v = veiculoController.buscarVeiculo(codigoVeiculo);
            Cliente c = clienteController.buscarCliente(codigoCliente);
            Agencia ag = agenciaController.buscarAgencia(codigoAgencia);
            
            LocalDate retirada = LocalDate.parse(dataRetirada, formatarData);
            LocalDate devolucao = LocalDate.parse(dataDevolucao, formatarData);
            Double valor = Double.parseDouble(valorTotal);
            controller.cadastrar(retirada, devolucao, valor, v, ag, c);
            veiculoController.alterarDisponibilidade(v.getCodigo(), false);
            preencherTabela();
            estadoInicial();

        } else {
            labelAvisos.setText("Preencha todos os campos");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaAlugueis.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaAlugueis.getSelectedRow();
            Object cod = tabelaAlugueis.getValueAt(linhaSelecionada, 0);
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir aluguel: #" + cod, "Confirma exclusão?", JOptionPane.OK_CANCEL_OPTION);
            if (confirma == JOptionPane.OK_OPTION) {
                controller.excluir((int) cod);
                Aluguel aluguel = controller.buscarAluguel((int) cod);
                veiculoController.alterarDisponibilidade(aluguel.getVeiculo().getCodigo(), true);
                preencherTabela();
                estadoInicial();
            } else {
                estadoInicial();
            }
        } else {
            labelAvisos.setText("Selecione um aluguel na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaAlugueis.getSelectedRow() != -1) {
            estadoEditando();
            int linhaSelecionada = tabelaAlugueis.getSelectedRow();
            Object cod = tabelaAlugueis.getValueAt(linhaSelecionada, 0);
            Aluguel aluguel = controller.buscarAluguel((int) cod);
            String veiculo = String.valueOf(aluguel.getVeiculo().getCodigo()) + " - (" + aluguel.getVeiculo().getPlaca() + ") " + aluguel.getVeiculo().getMarca() + " - " + aluguel.getVeiculo().getModelo() + " [" + aluguel.getVeiculo().getAno() + "]";
            String cliente = String.valueOf(aluguel.getCliente().getCodigo()) + " - " + aluguel.getCliente().getNome() + " - (" + aluguel.getCliente().getCnh() + ")";
            String funcionamento = String.valueOf(aluguel.getAgencia().getHoraAbre()) + "-" + String.valueOf(aluguel.getAgencia().getHoraFecha());
            String endereco = aluguel.getAgencia().getLogradouro() + ", N:" + String.valueOf(aluguel.getAgencia().getNumero()) + " " + aluguel.getAgencia().getComplemento();
            String agencia = String.valueOf(aluguel.getAgencia().getCodigo()) + " - " + aluguel.getAgencia().getNome() + ", [" + funcionamento + "], " + endereco;

            String dataRetirada = aluguel.getRetirada().format(formatarData);
            String dataDevolucao = aluguel.getDevolucao().format(formatarData);
            double valorTotal = aluguel.getValor();
            inputVeiculo.setText(veiculo);
            inputRetirada.setText(dataRetirada);
            inputDevolucao.setText(dataDevolucao);
            inputValorTotal.setText(String.valueOf(valorTotal));
            inputCliente.setText(cliente);
            inputAgencia.setText(agencia);
            codigoAluguel = aluguel.getCodigo();

        } else {
            labelAvisos.setText("Selecione um aluguel na tabela");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        estadoCriando();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        preencherTabelaVeiculos();
        labelAvisos.setText("Escolha um veículo na tabela");
        btnOkVeiculo.setVisible(true);
        btnCancelarEscolha.setVisible(true);
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        preencherTabelaClientes();
        labelAvisos.setText("Escolha um cliente na tabela");
        btnOkCliente.setVisible(true);
        btnCancelarEscolha.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAgenciaActionPerformed
        preencherTabelaAgencias();
        labelAvisos.setText("Escolha uma agência na tabela");
        btnOkAgencia.setVisible(true);
        btnCancelarEscolha.setVisible(true);

    }//GEN-LAST:event_btnBuscarAgenciaActionPerformed

    private void btnCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalActionPerformed
        String dataR = inputRetirada.getText().trim();
        String dataD = inputDevolucao.getText().trim();
        if (!dataR.isEmpty() && !dataD.isEmpty()) {
            labelAvisos.setText("");
            LocalDate retirada = LocalDate.parse(dataR, formatarData);
            LocalDate devolucao = LocalDate.parse(dataD, formatarData);
            LocalDate hoje = LocalDate.now();
            String veiculoEscolhido = inputVeiculo.getText();
            char codV = veiculoEscolhido.charAt(0);
            int codigoVeiculo = Character.getNumericValue(codV);
            Veiculo v = veiculoController.buscarVeiculo(codigoVeiculo);
            if (!retirada.isBefore(hoje) && !devolucao.isBefore(retirada.plusDays(1))) {
                double total = ChronoUnit.DAYS.between(retirada, devolucao) * v.getDiaria();
                inputValorTotal.setVisible(true);
                DecimalFormat formatarDecimal = new DecimalFormat("#0.00");
                formatarDecimal.setDecimalSeparatorAlwaysShown(true);
                String diariaFormatada = formatarDecimal.format(total);
                inputValorTotal.setText(String.valueOf(total));
                inputCliente.setVisible(true);
                btnBuscarCliente.setVisible(true);
            } else {
                labelAvisos.setText("Datas inválidas");
            }

        } else {
            labelAvisos.setText("Informe datas válidas");
        }


    }//GEN-LAST:event_btnCalcularTotalActionPerformed

    private void btnOkVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkVeiculoActionPerformed
        if (tabelaAlugueis.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaAlugueis.getSelectedRow();
            int codigo = (int) tabelaAlugueis.getValueAt(linhaSelecionada, 0);
            Veiculo v = veiculoController.buscarVeiculo(codigo);
            inputVeiculo.setText(String.valueOf(v.getCodigo()) + " - (" + v.getPlaca() + ") " + v.getMarca() + " - " + v.getModelo() + " [" + v.getAno() + "]");
            btnOkVeiculo.setVisible(false);
            btnCancelarEscolha.setVisible(false);
            labelAvisos.setText("");
            habilitarOrcamento(true);

            preencherTabela();
        } else {
            labelAvisos.setText("Selecione um veículo na tabela");
        }
    }//GEN-LAST:event_btnOkVeiculoActionPerformed

    private void btnOkClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkClienteActionPerformed
        if (tabelaAlugueis.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaAlugueis.getSelectedRow();
            int codigo = (int) tabelaAlugueis.getValueAt(linhaSelecionada, 0);
            Cliente c = clienteController.buscarCliente(codigo);
            inputCliente.setText(String.valueOf(c.getCodigo()) + " - " + c.getNome() + " - (" + c.getCnh() + ")");
            btnOkCliente.setVisible(false);
            btnCancelarEscolha.setVisible(false);
            labelAvisos.setText("");

            inputAgencia.setVisible(true);
            btnBuscarAgencia.setVisible(true);
            preencherTabela();
        } else {
            labelAvisos.setText("Selecione um cliente na tabela");
        }
    }//GEN-LAST:event_btnOkClienteActionPerformed

    private void btnOkAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAgenciaActionPerformed
        if (tabelaAlugueis.getSelectedRow() != -1) {
            labelAvisos.setText("");
            int linhaSelecionada = tabelaAlugueis.getSelectedRow();
            int codigo = (int) tabelaAlugueis.getValueAt(linhaSelecionada, 0);
            Agencia a = agenciaController.buscarAgencia(codigo);
            String endereco = a.getLogradouro() + ", N:" + String.valueOf(a.getNumero()) + " " + a.getComplemento();
            String funcionamento = String.valueOf(a.getHoraAbre()) + "-" + String.valueOf(a.getHoraFecha());
            inputAgencia.setText(String.valueOf(a.getCodigo()) + " - " + a.getNome() + ", [" + funcionamento + "], " + endereco);
            btnOkAgencia.setVisible(false);
            btnCancelarEscolha.setVisible(false);
            preencherTabela();
        } else {
            labelAvisos.setText("Selecione uma agência na tabela");
        }
    }//GEN-LAST:event_btnOkAgenciaActionPerformed

    private void btnCancelarEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEscolhaActionPerformed
        tabelaAlugueis.clearSelection();
    }//GEN-LAST:event_btnCancelarEscolhaActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            List<Aluguel> alugueis = controller.buscarAlugueis();

            // Converter Aluguel para AluguelRelatorio
            List<AluguelRelatorio> alugueisRelatorio = new ArrayList<>();
            for (Aluguel aluguel : alugueis) {
                AluguelRelatorio aluguelRelatorio = new AluguelRelatorio();
                aluguelRelatorio.setCodigo(aluguel.getCodigo());
                aluguelRelatorio.setRetirada(aluguel.convertToLocalDate(aluguel.getRetirada()));
                aluguelRelatorio.setDevolucao(aluguel.convertToLocalDate(aluguel.getDevolucao()));
                aluguelRelatorio.setVeiculo(aluguel.getVeiculo());
                aluguelRelatorio.setAgencia(aluguel.getAgencia());
                aluguelRelatorio.setCliente(aluguel.getCliente());
                aluguelRelatorio.setValor(aluguel.getValor());
                alugueisRelatorio.add(aluguelRelatorio);
            }

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(alugueisRelatorio);

            JasperReport relatorioAluguel = JasperCompileManager.compileReport("src/main/java/report/RelatorioDeAlugueis.jrxml");
            JasperPrint printarRelatorio = JasperFillManager.fillReport(relatorioAluguel, null, dataSource);

            JFrame frame = new JFrame("Relatório de Alugueis");
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
        desabilitarCampos();
        habilitarBtnsMenu(true);
    }

    public void clear() {
        inputVeiculo.setText("");
        labelAvisos.setText(" ");
        inputCliente.setText("");
        inputAgencia.setText("");
        inputRetirada.setText("");
        inputDevolucao.setText("");
        inputValorTotal.setText("");
        labelAvisos.setText("");
    }

    public void estadoCriando() {
        habilitarBtnsMenu(false);
        inputVeiculo.setVisible(true);
        inputVeiculo.requestFocus();
        btnBuscarVeiculo.setVisible(true);
        btnSalvar.setVisible(true);
        btnCancelar.setVisible(true);
    }

    public void estadoEditando() {
        habilitarBtnsMenu(false);
        inputVeiculo.setVisible(true);
        btnBuscarVeiculo.setVisible(true);
        inputCliente.setVisible(true);
        btnBuscarCliente.setVisible(true);
        inputAgencia.setVisible(true);
        btnBuscarAgencia.setVisible(true);

        inputDevolucao.setVisible(true);
        inputRetirada.setVisible(true);
        inputValorTotal.setVisible(true);
        btnCalcularTotal.setVisible(true);

        btnCancelar.setVisible(true);
        btnSalvarEdicao.setVisible(true);
    }

    public boolean verificarCampos(String veiculo, String cliente, String agencia, String dataR, String dataD, String valorTotal) {
        return !veiculo.isEmpty() && !cliente.isEmpty() && !agencia.isEmpty() && !dataR.isEmpty() && !dataD.isEmpty() && !valorTotal.isEmpty();

    }

    public void desabilitarCampos() {
        inputVeiculo.setVisible(false);
        btnBuscarVeiculo.setVisible(false);

        inputCliente.setVisible(false);
        btnBuscarCliente.setVisible(false);

        inputAgencia.setVisible(false);
        btnBuscarAgencia.setVisible(false);

        inputRetirada.setVisible(false);
        inputDevolucao.setVisible(false);
        inputValorTotal.setVisible(false);
        inputValorTotal.setEditable(false);
        btnCalcularTotal.setVisible(false);

        btnSalvar.setVisible(false);
        btnCancelar.setVisible(false);
        btnSalvarEdicao.setVisible(false);
        btnOkAgencia.setVisible(false);
        btnOkVeiculo.setVisible(false);
        btnOkCliente.setVisible(false);
        btnCancelarEscolha.setVisible(false);

    }

    public void habilitarOrcamento(boolean x) {
        inputRetirada.setVisible(x);
        inputRetirada.requestFocus();
        inputDevolucao.setVisible(x);
        inputValorTotal.setVisible(x);
        btnCalcularTotal.setVisible(x);
    }

    public void habilitarBtnsMenu(boolean x) {
        JButton[] btns = {btnNovo, btnEditar, btnExcluir, btnRelatorio};
        for (JButton btn : btns) {
            btn.setEnabled(x);
        }
    }

    public void estiloBtn() {
        JButton[] btns = {btnCalcularTotal, btnNovo, btnEditar, btnExcluir, btnRelatorio, btnSalvar, btnCancelar, btnSalvarEdicao, btnBuscarVeiculo, btnBuscarCliente, btnBuscarAgencia, btnOkAgencia, btnOkCliente, btnOkVeiculo, btnCancelarEscolha};

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

    public void preencherTabelaAgencias() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("NOME");
        model.addColumn("FUNCIONAMENTO");
        model.addColumn("TELEFONE");
        model.addColumn("ENDEREÇO");

        List<Agencia> agencias = agenciaController.agenciasAtivas();
        Iterator<Agencia> it = agencias.iterator();
        while (it.hasNext()) {
            Agencia a = it.next();
            String endereco = a.getLogradouro() + ", N:" + String.valueOf(a.getNumero()) + ", " + a.getBairro() + " - " + a.getComplemento() + " (" + a.getCep() + ")";
            String funcionamento = String.valueOf(a.getHoraAbre()) + " - " + String.valueOf(a.getHoraFecha());
            Object[] row = {
                a.getCodigo(),
                a.getNome(),
                funcionamento,
                a.getTelefone(),
                endereco
            };
            model.addRow(row);
        }
        tabelaAlugueis.setModel(model);
    }

    public void preencherTabelaClientes() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("NOME");
        model.addColumn("CNH");
        model.addColumn("EMAIL");
        model.addColumn("TELEFONE");
        List<Cliente> clientes = clienteController.clientesAtivos();
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            Object[] row = {
                c.getCodigo(), c.getNome(), c.getCnh(), c.getEmail(), c.getTelefone()
            };
            model.addRow(row);
        }
        tabelaAlugueis.setModel(model);
    }

    public void preencherTabelaVeiculos() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("PLACA");
        model.addColumn("MARCA");
        model.addColumn("MODELO");
        model.addColumn("ANO");
        model.addColumn("DIÁRIA R$");

        DecimalFormat df = new DecimalFormat("0.00");
        List<Veiculo> veiculosDisponiveis = controller.veiculosDisponiveis();
        Iterator<Veiculo> it = veiculosDisponiveis.iterator();
        while (it.hasNext()) {
            Veiculo v = it.next();
            String diaria = df.format(v.getDiaria());
            Object[] row = {v.getCodigo(), v.getPlaca(), v.getMarca(), v.getModelo(), v.getAno(), diaria};

            model.addRow(row);
        }
        tabelaAlugueis.setModel(model);

    }

    public void preencherTabela() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("CÓDIGO");
        model.addColumn("DATA RETIRADA");
        model.addColumn("DATA DEVOLUÇÃO");
        model.addColumn("VALOR TOTAL");
        model.addColumn("CÓD. VEÍCULO");
        model.addColumn("CÓD. CLIENTE");
        model.addColumn("CÓD. AGÊNCIA");

        List<Aluguel> alugueis = controller.alugueisAtivos();
        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel aluguel = it.next();
            int codigoVeiculo = aluguel.getVeiculo().getCodigo();
            int codigoCliente = aluguel.getCliente().getCodigo();
            int codigoAgencia = aluguel.getAgencia().getCodigo();
            String retirada = aluguel.getRetirada().format(formatarData);
            String devolucao = aluguel.getDevolucao().format(formatarData);
            DecimalFormat formatarDecimal = new DecimalFormat("#0.00");
            formatarDecimal.setDecimalSeparatorAlwaysShown(true);
            String valorFormatado = formatarDecimal.format(aluguel.getValor());
            Object[] row = {
                aluguel.getCodigo(),
                retirada,
                devolucao,
                valorFormatado,
                codigoVeiculo,
                codigoCliente,
                codigoAgencia};
            model.addRow(row);
        }
        tabelaAlugueis.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAgencia;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEscolha;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOkAgencia;
    private javax.swing.JButton btnOkCliente;
    private javax.swing.JButton btnOkVeiculo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdicao;
    private javax.swing.JTextField inputAgencia;
    private javax.swing.JTextField inputCliente;
    private javax.swing.JFormattedTextField inputDevolucao;
    private javax.swing.JFormattedTextField inputRetirada;
    private javax.swing.JTextField inputValorTotal;
    private javax.swing.JTextField inputVeiculo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelCnh;
    private javax.swing.JLabel labelCodigoAgencia;
    private javax.swing.JLabel labelDevolucao;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelRetirada;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JLabel logo;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorAgencia;
    private javax.swing.JSeparator separatorCliente;
    private javax.swing.JSeparator separatorDevolucao;
    private javax.swing.JSeparator separatorRetirada;
    private javax.swing.JSeparator separatorValorTotal;
    private javax.swing.JSeparator separatorVeiculo;
    private javax.swing.JTable tabelaAlugueis;
    // End of variables declaration//GEN-END:variables
}
