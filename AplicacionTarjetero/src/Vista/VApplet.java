package Vista;

import Controlador.CControlador;
import beanimagen.BeanImagen;
import java.applet.Applet;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author marco
 */
public class VApplet extends Applet {
    
    CControlador controlador;

    @Override
    public void init() {
        iniciaComponentes(); 
    }
    
    @Override
    public void start(){
        controlador = new CControlador(this);
    }

    private void iniciaComponentes() {
        vApplet = new java.awt.Panel();
        panelPrincipal = new java.awt.Panel();
        bModificarEmpresa = new javax.swing.JButton();
        bAniadirComercial = new javax.swing.JButton();
        bConsultaComercial = new javax.swing.JButton();
        bAniadirEmpresa = new javax.swing.JButton();
        bEliminarEmpresa = new javax.swing.JButton();
        bListarEmpresas = new javax.swing.JButton();
        bListarComerciales = new javax.swing.JButton();
        bModificarComercial = new javax.swing.JButton();
        bEliminarComercial = new javax.swing.JButton();
        bConsultaEmpresa = new javax.swing.JButton();
        labelTitulo = new java.awt.Label();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        separador3 = new javax.swing.JSeparator();
        separador4 = new javax.swing.JSeparator();
        separador5 = new javax.swing.JSeparator();
        separador6 = new javax.swing.JSeparator();
        panelEmpresa_AniadirMod = new java.awt.Panel();
        separador7 = new javax.swing.JSeparator();
        separador8 = new javax.swing.JSeparator();
        bFileChooser = new javax.swing.JButton();
        tLogoEmp = new javax.swing.JTextField();
        labelCodEmpresa = new java.awt.Label();
        labelNombre = new java.awt.Label();
        labelTlf1 = new java.awt.Label();
        labelCIF = new java.awt.Label();
        labelDir = new java.awt.Label();
        labelTlf2 = new java.awt.Label();
        tNombreEmp = new javax.swing.JTextField();
        tCIFEmp = new javax.swing.JTextField();
        tDirEmp = new javax.swing.JTextField();
        tTlf1Emp = new javax.swing.JTextField();
        tTlf2Emp = new javax.swing.JTextField();
        bRegistrarEmp = new javax.swing.JButton();
        bCancelarEmp = new javax.swing.JButton();
        bModificarEmp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEtiquetasAniadidas = new javax.swing.JList<>();
        bBuscarEmp = new javax.swing.JButton();
        labelEtiqueta = new java.awt.Label();
        bEliminaEtiqueta = new javax.swing.JButton();
        bInsertaEtiqueta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEtiquetas = new javax.swing.JList<>();
        tCodEmp = new javax.swing.JTextField();
        tAniadirEtiqueta = new javax.swing.JTextField();
        tBuscar = new javax.swing.JTextField();
        baniadirEtiqueta = new javax.swing.JButton();
        beanImagen_AniadirModificar = new beanimagen.BeanImagen();
        panelComercial_AniadirMod = new java.awt.Panel();
        separador9 = new javax.swing.JSeparator();
        separador10 = new javax.swing.JSeparator();
        labelCodComercial = new java.awt.Label();
        labelNombreComercial = new java.awt.Label();
        labelTlfComercial = new java.awt.Label();
        labelNIF = new java.awt.Label();
        labelDir1 = new java.awt.Label();
        labelCorreo = new java.awt.Label();
        tBuscarEmp = new javax.swing.JTextField();
        tCodCom = new javax.swing.JTextField();
        tNombreCom = new javax.swing.JTextField();
        tNIFCom = new javax.swing.JTextField();
        tDirCom = new javax.swing.JTextField();
        tTlfCom = new javax.swing.JTextField();
        tCorreoCom = new javax.swing.JTextField();
        bRegistrarCom = new javax.swing.JButton();
        bCancelarCom = new javax.swing.JButton();
        bModificarCom = new javax.swing.JButton();
        bBuscarCom = new javax.swing.JButton();
        labelEmpresa = new java.awt.Label();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEmpresas = new javax.swing.JList<>();
        panelEmpCom_Eliminar = new java.awt.Panel();
        tFiltro = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaEliminar = new javax.swing.JList<>();
        bCancelar_Eliminar = new javax.swing.JButton();
        bEliminarEmp = new javax.swing.JButton();
        labelLeyendaCom = new java.awt.Label();
        labelLeyendaEmp = new java.awt.Label();
        bEliminarCom = new javax.swing.JButton();
        panelEmpCom_Listar = new java.awt.Panel();
        tFiltroCom_B = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaBuscarEmp = new javax.swing.JList<>();
        tFiltroEmp_B = new javax.swing.JTextField();
        separador14 = new javax.swing.JSeparator();
        tcodCom_B = new javax.swing.JTextField();
        tnombreCom_B = new javax.swing.JTextField();
        tNIFCom_B = new javax.swing.JTextField();
        tDirCom_B = new javax.swing.JTextField();
        tTlfCom_B = new javax.swing.JTextField();
        tcorreoCom_B = new javax.swing.JTextField();
        labelTlf1Emp_B = new java.awt.Label();
        labelCIFEmp_B = new java.awt.Label();
        labelCodEmp_B = new java.awt.Label();
        labelNombre_B = new java.awt.Label();
        labelNIFCom_B = new java.awt.Label();
        labelDir_B = new java.awt.Label();
        labelTlfCom_B = new java.awt.Label();
        labelTlf2Emp_B = new java.awt.Label();
        labelCorreoCom_B = new java.awt.Label();
        tTlf2Emp_B = new javax.swing.JTextField();
        tcodEmp_B = new javax.swing.JTextField();
        tnombreEmp_B = new javax.swing.JTextField();
        tCIFEmp_B = new javax.swing.JTextField();
        tDirEmp_B = new javax.swing.JTextField();
        tTlf1Emp_B = new javax.swing.JTextField();
        labelCodCom_B = new java.awt.Label();
        bAtras = new javax.swing.JButton();
        labelEmpCom_B = new java.awt.Label();
        tEmpCom_B = new javax.swing.JTextField();
        labelEtiquetas = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        tAreaEtiquetas = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaBuscarCom = new javax.swing.JList<>();
        panelCom_Buscar = new java.awt.Panel();
        labelCodComercial_Consulta = new java.awt.Label();
        tcodComercial_Consulta = new javax.swing.JTextField();
        bCom_Consulta = new javax.swing.JButton();
        separator16 = new javax.swing.JSeparator();
        labelnomCom_Consulta = new java.awt.Label();
        tnombreCom_Consulta = new javax.swing.JTextField();
        labelNIFCom_Consulta = new java.awt.Label();
        tNIFCom_Consulta = new javax.swing.JTextField();
        labeldirCom_Consulta = new java.awt.Label();
        tDirCom_Consulta = new javax.swing.JTextField();
        labelTlfCom_Consulta = new java.awt.Label();
        tTlfCom_Consulta = new javax.swing.JTextField();
        labelCorreoCom_Consulta = new java.awt.Label();
        tnombreEmp_Consulta = new javax.swing.JTextField();
        separator17 = new javax.swing.JSeparator();
        labelEmpCom_Consulta = new java.awt.Label();
        tcorreoCom_Consulta = new javax.swing.JTextField();
        labelCodEmp_Consulta = new java.awt.Label();
        tcodEmp_Consulta = new javax.swing.JTextField();
        beanImagenCom_Consulta = new beanimagen.BeanImagen();
        bAtrasCom_Consulta = new javax.swing.JButton();
        panelEmp_Buscar = new java.awt.Panel();
        labelCodEmpresa_Consulta = new java.awt.Label();
        tcodEmpresa_Consulta = new javax.swing.JTextField();
        separator15 = new javax.swing.JSeparator();
        labelnombreEmpresa_Consulta = new java.awt.Label();
        tnombreEmpresa_Consulta = new javax.swing.JTextField();
        labelCIFEmpresa_Consulta = new java.awt.Label();
        tCIFEmpresa_Consulta = new javax.swing.JTextField();
        labelDirEmpresa_Consulta = new java.awt.Label();
        tDirEmpresa_Consulta = new javax.swing.JTextField();
        labelTlf1Empresa_Consulta = new java.awt.Label();
        tTlf1Empresa_Consulta = new javax.swing.JTextField();
        labelTlf2Empresa_Consulta = new java.awt.Label();
        tTlf2_Consulta = new javax.swing.JTextField();
        labelEtiquetasEmpresa_Consulta = new java.awt.Label();
        jScrollPane8 = new javax.swing.JScrollPane();
        tEtiquetasEmpresa_Consulta = new javax.swing.JTextArea();
        beanImagenEmp_Consulta = new beanimagen.BeanImagen();
        bAtrasEmp_Consulta = new javax.swing.JButton();
        bEmp_Consulta = new javax.swing.JButton();
        modeloLista1 = new DefaultListModel();
        modeloLista2 = new DefaultListModel();
        modeloLista3 = new DefaultListModel();
        modeloLista4 = new DefaultListModel();

        vApplet.setLayout(null);

        panelPrincipal.setLayout(null);

        bModificarEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        bModificarEmpresa.setText("MODIFICAR EMPRESA");
        bModificarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarEmpresaActionPerformed(evt);
            }
        });
        panelPrincipal.add(bModificarEmpresa);
        bModificarEmpresa.setBounds(350, 130, 200, 40);

        bAniadirComercial.setBackground(new java.awt.Color(204, 204, 204));
        bAniadirComercial.setText("AÑADIR COMERCIAL");
        bAniadirComercial.setToolTipText("");
        bAniadirComercial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAniadirComercialActionPerformed(evt);
            }
        });
        panelPrincipal.add(bAniadirComercial);
        bAniadirComercial.setBounds(140, 230, 168, 40);

        bConsultaComercial.setBackground(new java.awt.Color(204, 204, 204));
        bConsultaComercial.setText("CONSULTA COMERCIAL");
        bConsultaComercial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaComercialActionPerformed(evt);
            }
        });
        panelPrincipal.add(bConsultaComercial);
        bConsultaComercial.setBounds(520, 500, 200, 40);

        bAniadirEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        bAniadirEmpresa.setText("AÑADIR EMPRESA");
        bAniadirEmpresa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAniadirEmpresaActionPerformed(evt);
            }
        });
        panelPrincipal.add(bAniadirEmpresa);
        bAniadirEmpresa.setBounds(140, 130, 170, 40);

        bEliminarEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        bEliminarEmpresa.setText("ELIMINAR EMPRESA");
        bEliminarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarEmpresaActionPerformed(evt);
            }
        });
        panelPrincipal.add(bEliminarEmpresa);
        bEliminarEmpresa.setBounds(590, 130, 200, 40);

        bListarEmpresas.setBackground(new java.awt.Color(204, 204, 204));
        bListarEmpresas.setText("LISTAR EMPRESAS");
        bListarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarEmpresasActionPerformed(evt);
            }
        });
        panelPrincipal.add(bListarEmpresas);
        bListarEmpresas.setBounds(200, 400, 190, 40);

        bListarComerciales.setBackground(new java.awt.Color(204, 204, 204));
        bListarComerciales.setText("LISTAR COMERCIALES");
        bListarComerciales.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarComercialesActionPerformed(evt);
            }
        });
        panelPrincipal.add(bListarComerciales);
        bListarComerciales.setBounds(200, 500, 190, 40);

        bModificarComercial.setBackground(new java.awt.Color(204, 204, 204));
        bModificarComercial.setText("MODIFICAR COMERCIAL");
        bModificarComercial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarComercialActionPerformed(evt);
            }
        });
        panelPrincipal.add(bModificarComercial);
        bModificarComercial.setBounds(350, 230, 200, 40);

        bEliminarComercial.setBackground(new java.awt.Color(204, 204, 204));
        bEliminarComercial.setText("ELIMINAR COMERCIAL");
        bEliminarComercial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarComercialActionPerformed(evt);
            }
        });
        panelPrincipal.add(bEliminarComercial);
        bEliminarComercial.setBounds(590, 230, 200, 40);

        bConsultaEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        bConsultaEmpresa.setText("CONSULTA EMPRESA");
        bConsultaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaEmpresaActionPerformed(evt);
            }
        });
        panelPrincipal.add(bConsultaEmpresa);
        bConsultaEmpresa.setBounds(520, 400, 200, 40);

        labelTitulo.setAlignment(java.awt.Label.CENTER);
        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo.setText("APLICACIÓN TARJETERO");
        panelPrincipal.add(labelTitulo);
        labelTitulo.setBounds(0, 0, 950, 80);

        separador1.setForeground(new java.awt.Color(0, 0, 0));
        separador1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separador1);
        separador1.setBounds(570, 120, 20, 170);

        separador2.setBackground(new java.awt.Color(0, 0, 0));
        separador2.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(separador2);
        separador2.setBounds(0, 330, 950, 10);

        separador3.setForeground(new java.awt.Color(0, 0, 0));
        separador3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separador3);
        separador3.setBounds(460, 390, 20, 170);

        separador4.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(separador4);
        separador4.setBounds(160, 470, 590, 20);

        separador5.setForeground(new java.awt.Color(0, 0, 0));
        separador5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPrincipal.add(separador5);
        separador5.setBounds(330, 120, 20, 170);

        separador6.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(separador6);
        separador6.setBounds(130, 200, 680, 20);

        vApplet.add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 949, 641);

        panelEmpresa_AniadirMod.setLayout(null);

        separador7.setForeground(new java.awt.Color(0, 0, 0));
        panelEmpresa_AniadirMod.add(separador7);
        separador7.setBounds(40, 520, 860, 20);

        separador8.setForeground(new java.awt.Color(0, 0, 0));
        panelEmpresa_AniadirMod.add(separador8);
        separador8.setBounds(40, 202, 860, 20);

        bFileChooser.setBackground(new java.awt.Color(204, 204, 204));
        bFileChooser.setText("Añadir imagen ...");
        bFileChooser.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFileChooserActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bFileChooser);
        bFileChooser.setBounds(260, 150, 170, 25);

        tLogoEmp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tLogoEmp.setEnabled(false);
        panelEmpresa_AniadirMod.add(tLogoEmp);
        tLogoEmp.setBounds(440, 150, 250, 19);

        labelCodEmpresa.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCodEmpresa.setText("* Código empresa:");
        panelEmpresa_AniadirMod.add(labelCodEmpresa);
        labelCodEmpresa.setBounds(40, 230, 150, 19);

        labelNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelNombre.setText("Nombre:");
        panelEmpresa_AniadirMod.add(labelNombre);
        labelNombre.setBounds(40, 270, 80, 19);

        labelTlf1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlf1.setName(""); // NOI18N
        labelTlf1.setText("Teléfono 1:");
        panelEmpresa_AniadirMod.add(labelTlf1);
        labelTlf1.setBounds(40, 390, 90, 19);

        labelCIF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCIF.setName(""); // NOI18N
        labelCIF.setText("CIF:");
        panelEmpresa_AniadirMod.add(labelCIF);
        labelCIF.setBounds(40, 310, 40, 19);

        labelDir.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelDir.setName(""); // NOI18N
        labelDir.setText("Dirección: ");
        panelEmpresa_AniadirMod.add(labelDir);
        labelDir.setBounds(40, 350, 80, 19);

        labelTlf2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlf2.setName(""); // NOI18N
        labelTlf2.setText("Teléfono 2:");
        panelEmpresa_AniadirMod.add(labelTlf2);
        labelTlf2.setBounds(300, 390, 90, 19);
        panelEmpresa_AniadirMod.add(tNombreEmp);
        tNombreEmp.setBounds(120, 270, 400, 19);
        panelEmpresa_AniadirMod.add(tCIFEmp);
        tCIFEmp.setBounds(80, 310, 260, 19);
        panelEmpresa_AniadirMod.add(tDirEmp);
        tDirEmp.setBounds(130, 350, 390, 19);
        panelEmpresa_AniadirMod.add(tTlf1Emp);
        tTlf1Emp.setBounds(140, 390, 120, 19);
        panelEmpresa_AniadirMod.add(tTlf2Emp);
        tTlf2Emp.setBounds(400, 390, 120, 19);

        bRegistrarEmp.setBackground(new java.awt.Color(204, 204, 204));
        bRegistrarEmp.setText("REGISTRAR");
        bRegistrarEmp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarEmpActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bRegistrarEmp);
        bRegistrarEmp.setBounds(500, 540, 120, 50);

        bCancelarEmp.setBackground(new java.awt.Color(204, 204, 204));
        bCancelarEmp.setText("ATRÁS");
        bCancelarEmp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarEmpActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bCancelarEmp);
        bCancelarEmp.setBounds(330, 540, 120, 50);

        bModificarEmp.setBackground(new java.awt.Color(204, 204, 204));
        bModificarEmp.setText("MODIFICAR");
        bModificarEmp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarEmpActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bModificarEmp);
        bModificarEmp.setBounds(500, 540, 120, 50);

        listaEtiquetasAniadidas.setToolTipText("");
        listaEtiquetasAniadidas.setFocusable(false);
        jScrollPane2.setViewportView(listaEtiquetasAniadidas);

        panelEmpresa_AniadirMod.add(jScrollPane2);
        jScrollPane2.setBounds(540, 300, 170, 110);

        bBuscarEmp.setBackground(new java.awt.Color(204, 204, 204));
        bBuscarEmp.setText("Buscar");
        bBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarEmpActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bBuscarEmp);
        bBuscarEmp.setBounds(540, 220, 94, 30);

        labelEtiqueta.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEtiqueta.setText("Etiquetas añadidas:");
        panelEmpresa_AniadirMod.add(labelEtiqueta);
        labelEtiqueta.setBounds(540, 270, 170, 23);

        bEliminaEtiqueta.setBackground(new java.awt.Color(204, 204, 204));
        bEliminaEtiqueta.setText("Eliminar");
        bEliminaEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminaEtiquetaActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bEliminaEtiqueta);
        bEliminaEtiqueta.setBounds(570, 420, 110, 25);

        bInsertaEtiqueta.setBackground(new java.awt.Color(204, 204, 204));
        bInsertaEtiqueta.setText("Insertar");
        bInsertaEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertaEtiquetaActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(bInsertaEtiqueta);
        bInsertaEtiqueta.setBounds(760, 420, 110, 25);

        listaEtiquetas.setFocusable(false);
        jScrollPane1.setViewportView(listaEtiquetas);

        panelEmpresa_AniadirMod.add(jScrollPane1);
        jScrollPane1.setBounds(730, 300, 170, 110);
        panelEmpresa_AniadirMod.add(tCodEmp);
        tCodEmp.setBounds(200, 230, 320, 19);
        panelEmpresa_AniadirMod.add(tAniadirEtiqueta);
        tAniadirEtiqueta.setBounds(540, 480, 190, 19);

        baniadirEtiqueta.setBackground(new java.awt.Color(204, 204, 204));
        baniadirEtiqueta.setText("Añadir etiqueta");
        baniadirEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baniadirEtiquetaActionPerformed(evt);
            }
        });
        panelEmpresa_AniadirMod.add(baniadirEtiqueta);
        baniadirEtiqueta.setBounds(750, 480, 150, 25);

        beanImagen_AniadirModificar.setBackground(new java.awt.Color(255, 255, 255));
        panelEmpresa_AniadirMod.add(beanImagen_AniadirModificar);
        beanImagen_AniadirModificar.setBounds(270, 30, 410, 110);

        vApplet.add(panelEmpresa_AniadirMod);
        panelEmpresa_AniadirMod.setBounds(0, 0, 949, 641);

        panelComercial_AniadirMod.setLayout(null);

        separador9.setForeground(new java.awt.Color(0, 0, 0));
        panelComercial_AniadirMod.add(separador9);
        separador9.setBounds(30, 420, 860, 20);

        separador10.setForeground(new java.awt.Color(0, 0, 0));
        panelComercial_AniadirMod.add(separador10);
        separador10.setBounds(40, 140, 860, 20);

        labelCodComercial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCodComercial.setText("* Código comercial:");
        panelComercial_AniadirMod.add(labelCodComercial);
        labelCodComercial.setBounds(40, 110, 150, 19);

        labelNombreComercial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelNombreComercial.setText("Nombre:");
        panelComercial_AniadirMod.add(labelNombreComercial);
        labelNombreComercial.setBounds(40, 200, 80, 19);

        labelTlfComercial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlfComercial.setName(""); // NOI18N
        labelTlfComercial.setText("Teléfono:");
        panelComercial_AniadirMod.add(labelTlfComercial);
        labelTlfComercial.setBounds(40, 320, 80, 19);

        labelNIF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelNIF.setName(""); // NOI18N
        labelNIF.setText("NIF:");
        panelComercial_AniadirMod.add(labelNIF);
        labelNIF.setBounds(40, 240, 40, 19);

        labelDir1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelDir1.setName(""); // NOI18N
        labelDir1.setText("Dirección: ");
        panelComercial_AniadirMod.add(labelDir1);
        labelDir1.setBounds(40, 280, 80, 19);

        labelCorreo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCorreo.setName(""); // NOI18N
        labelCorreo.setText("Correo:");
        panelComercial_AniadirMod.add(labelCorreo);
        labelCorreo.setBounds(40, 360, 60, 19);

        panelComercial_AniadirMod.add(tBuscarEmp);
        panelComercial_AniadirMod.add(tCodCom);
        tCodCom.setBounds(200, 110, 170, 19);
        panelComercial_AniadirMod.add(tNombreCom);
        tNombreCom.setBounds(120, 200, 400, 19);
        panelComercial_AniadirMod.add(tNIFCom);
        tNIFCom.setBounds(80, 240, 260, 19);
        panelComercial_AniadirMod.add(tDirCom);
        tDirCom.setBounds(130, 280, 390, 19);
        panelComercial_AniadirMod.add(tTlfCom);
        tTlfCom.setBounds(120, 320, 220, 19);
        panelComercial_AniadirMod.add(tCorreoCom);
        tCorreoCom.setBounds(110, 360, 410, 19);

        bRegistrarCom.setBackground(new java.awt.Color(204, 204, 204));
        bRegistrarCom.setText("REGISTRAR");
        bRegistrarCom.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarComActionPerformed(evt);
            }
        });
        panelComercial_AniadirMod.add(bRegistrarCom);
        bRegistrarCom.setBounds(500, 490, 120, 50);

        bCancelarCom.setBackground(new java.awt.Color(204, 204, 204));
        bCancelarCom.setText("ATRÁS");
        bCancelarCom.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarComActionPerformed(evt);
            }
        });
        panelComercial_AniadirMod.add(bCancelarCom);
        bCancelarCom.setBounds(330, 490, 120, 50);

        bModificarCom.setBackground(new java.awt.Color(204, 204, 204));
        bModificarCom.setText("MODIFICAR");
        bModificarCom.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarComActionPerformed(evt);
            }
        });
        panelComercial_AniadirMod.add(bModificarCom);
        bModificarCom.setBounds(500, 490, 120, 50);

        bBuscarCom.setBackground(new java.awt.Color(204, 204, 204));
        bBuscarCom.setText("Buscar");
        bBuscarCom.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarComActionPerformed(evt);
            }
        });
        panelComercial_AniadirMod.add(bBuscarCom);
        bBuscarCom.setBounds(380, 100, 94, 30);

        labelEmpresa.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEmpresa.setText("Seleccionar empresa:");
        panelComercial_AniadirMod.add(labelEmpresa);
        labelEmpresa.setBounds(540, 200, 170, 23);

        jScrollPane4.setViewportView(listaEmpresas);

        panelComercial_AniadirMod.add(jScrollPane4);
        jScrollPane4.setBounds(540, 230, 360, 150);

        vApplet.add(panelComercial_AniadirMod);
        panelComercial_AniadirMod.setBounds(0, 0, 949, 641);

        panelEmpCom_Eliminar.setLayout(null);

        listaEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaEliminarMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(listaEliminar);

        panelEmpCom_Eliminar.add(jScrollPane7);
        jScrollPane7.setBounds(80, 80, 790, 410);

        bCancelar_Eliminar.setBackground(new java.awt.Color(204, 204, 204));
        bCancelar_Eliminar.setText("ATRÁS");
        bCancelar_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelar_EliminarActionPerformed(evt);
            }
        });
        panelEmpCom_Eliminar.add(bCancelar_Eliminar);
        bCancelar_Eliminar.setBounds(350, 520, 120, 50);

        bEliminarEmp.setBackground(new java.awt.Color(204, 204, 204));
        bEliminarEmp.setText("ELIMINAR");
        bEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarEmpActionPerformed(evt);
            }
        });
        panelEmpCom_Eliminar.add(bEliminarEmp);
        bEliminarEmp.setBounds(510, 520, 120, 50);

        labelLeyendaCom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelLeyendaCom.setText("[CÓDIGO COMERCIAL] -  NOMBRE  //  NOMBRE EMPRESA");
        panelEmpCom_Eliminar.add(labelLeyendaCom);
        labelLeyendaCom.setBounds(80, 49, 380, 30);

        labelLeyendaEmp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelLeyendaEmp.setText("[CÓDIGO EMPRESA] -  NOMBRE");
        panelEmpCom_Eliminar.add(labelLeyendaEmp);
        labelLeyendaEmp.setBounds(80, 49, 380, 30);

        bEliminarCom.setBackground(new java.awt.Color(204, 204, 204));
        bEliminarCom.setText("ELIMINAR");
        bEliminarCom.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarComActionPerformed(evt);
            }
        });
        panelEmpCom_Eliminar.add(bEliminarCom);
        bEliminarCom.setBounds(510, 520, 120, 50);

        vApplet.add(panelEmpCom_Eliminar);
        panelEmpCom_Eliminar.setBounds(0, 0, 949, 641);

        panelEmpCom_Listar.setLayout(null);

        

        listaBuscarEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaBuscarEmpMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(listaBuscarEmp);

        panelEmpCom_Listar.add(jScrollPane5);
        jScrollPane5.setBounds(20, 80, 480, 380);

        separador14.setForeground(new java.awt.Color(0, 0, 0));
        separador14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelEmpCom_Listar.add(separador14);
        separador14.setBounds(520, 80, 20, 380);

        tcodCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tcodCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tcodCom_B);
        tcodCom_B.setBounds(690, 80, 230, 19);

        tnombreCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tnombreCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tnombreCom_B);
        tnombreCom_B.setBounds(620, 120, 300, 19);

        tNIFCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tNIFCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tNIFCom_B);
        tNIFCom_B.setBounds(580, 160, 250, 19);

        tDirCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tDirCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tDirCom_B);
        tDirCom_B.setBounds(630, 200, 290, 19);

        tTlfCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tTlfCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tTlfCom_B);
        tTlfCom_B.setBounds(640, 240, 140, 19);

        tcorreoCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tcorreoCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tcorreoCom_B);
        tcorreoCom_B.setBounds(610, 280, 310, 19);

        labelTlf1Emp_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlf1Emp_B.setText("Teléfono 1:");
        panelEmpCom_Listar.add(labelTlf1Emp_B);
        labelTlf1Emp_B.setBounds(540, 240, 90, 23);

        labelCIFEmp_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCIFEmp_B.setText("CIF:");
        panelEmpCom_Listar.add(labelCIFEmp_B);
        labelCIFEmp_B.setBounds(540, 160, 40, 23);

        labelCodEmp_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCodEmp_B.setText("Código empresa:");
        panelEmpCom_Listar.add(labelCodEmp_B);
        labelCodEmp_B.setBounds(540, 80, 140, 23);

        labelNombre_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelNombre_B.setText("Nombre:");
        panelEmpCom_Listar.add(labelNombre_B);
        labelNombre_B.setBounds(540, 120, 70, 23);

        labelNIFCom_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelNIFCom_B.setText("NIF:");
        panelEmpCom_Listar.add(labelNIFCom_B);
        labelNIFCom_B.setBounds(540, 160, 40, 23);

        labelDir_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelDir_B.setText("Dirección:");
        panelEmpCom_Listar.add(labelDir_B);
        labelDir_B.setBounds(540, 200, 90, 23);

        labelTlfCom_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlfCom_B.setText("Teléfono:");
        panelEmpCom_Listar.add(labelTlfCom_B);
        labelTlfCom_B.setBounds(540, 240, 90, 23);

        labelTlf2Emp_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTlf2Emp_B.setText("Teléfono 2:");
        panelEmpCom_Listar.add(labelTlf2Emp_B);
        labelTlf2Emp_B.setBounds(540, 280, 90, 23);

        labelCorreoCom_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCorreoCom_B.setText("Correo:");
        panelEmpCom_Listar.add(labelCorreoCom_B);
        labelCorreoCom_B.setBounds(540, 280, 70, 23);

        tTlf2Emp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tTlf2Emp_B.setEnabled(false);
        panelEmpCom_Listar.add(tTlf2Emp_B);
        tTlf2Emp_B.setBounds(640, 280, 140, 19);

        tcodEmp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tcodEmp_B.setEnabled(false);
        panelEmpCom_Listar.add(tcodEmp_B);
        tcodEmp_B.setBounds(690, 80, 230, 19);

        tnombreEmp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tnombreEmp_B.setEnabled(false);
        panelEmpCom_Listar.add(tnombreEmp_B);
        tnombreEmp_B.setBounds(620, 120, 300, 19);

        tCIFEmp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tCIFEmp_B.setEnabled(false);
        panelEmpCom_Listar.add(tCIFEmp_B);
        tCIFEmp_B.setBounds(580, 160, 250, 19);

        tDirEmp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tDirEmp_B.setEnabled(false);
        panelEmpCom_Listar.add(tDirEmp_B);
        tDirEmp_B.setBounds(630, 200, 290, 19);

        tTlf1Emp_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tTlf1Emp_B.setEnabled(false);
        panelEmpCom_Listar.add(tTlf1Emp_B);
        tTlf1Emp_B.setBounds(640, 240, 140, 19);

        labelCodCom_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCodCom_B.setText("Código comercial:");
        panelEmpCom_Listar.add(labelCodCom_B);
        labelCodCom_B.setBounds(540, 80, 140, 23);

        bAtras.setBackground(new java.awt.Color(204, 204, 204));
        bAtras.setText("ATRÁS");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });
        panelEmpCom_Listar.add(bAtras);
        bAtras.setBounds(440, 520, 150, 50);

        labelEmpCom_B.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEmpCom_B.setText("Empresa:");
        panelEmpCom_Listar.add(labelEmpCom_B);
        labelEmpCom_B.setBounds(540, 320, 90, 23);

        tEmpCom_B.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tEmpCom_B.setEnabled(false);
        panelEmpCom_Listar.add(tEmpCom_B);
        tEmpCom_B.setBounds(630, 320, 290, 19);

        labelEtiquetas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEtiquetas.setText("Etiquetas:");
        panelEmpCom_Listar.add(labelEtiquetas);
        labelEtiquetas.setBounds(540, 320, 80, 23);

        tAreaEtiquetas.setColumns(20);
        tAreaEtiquetas.setRows(5);
        tAreaEtiquetas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tAreaEtiquetas.setEnabled(false);
        jScrollPane3.setViewportView(tAreaEtiquetas);

        panelEmpCom_Listar.add(jScrollPane3);
        jScrollPane3.setBounds(540, 350, 380, 110);

        listaBuscarCom.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaBuscarComMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(listaBuscarCom);

        panelEmpCom_Listar.add(jScrollPane6);
        jScrollPane6.setBounds(18, 80, 480, 380);

        vApplet.add(panelEmpCom_Listar);
        panelEmpCom_Listar.setBounds(0, 0, 949, 641);

        labelCodComercial_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCodComercial_Consulta.setText("Código comercial:");

        bCom_Consulta.setBackground(new java.awt.Color(204, 204, 204));
        bCom_Consulta.setText("Buscar");
        bCom_Consulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCom_ConsultaActionPerformed(evt);
            }
        });

        separator16.setForeground(new java.awt.Color(0, 0, 0));

        labelnomCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelnomCom_Consulta.setText("Nombre:");

        tnombreCom_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tnombreCom_Consulta.setBorder(null);
        tnombreCom_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tnombreCom_Consulta.setEnabled(false);
        tnombreCom_Consulta.setOpaque(false);

        labelNIFCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNIFCom_Consulta.setText("NIF:");

        tNIFCom_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tNIFCom_Consulta.setBorder(null);
        tNIFCom_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tNIFCom_Consulta.setEnabled(false);
        tNIFCom_Consulta.setOpaque(false);

        labeldirCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labeldirCom_Consulta.setText("Dirección:");

        tDirCom_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tDirCom_Consulta.setBorder(null);
        tDirCom_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tDirCom_Consulta.setEnabled(false);
        tDirCom_Consulta.setOpaque(false);

        labelTlfCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTlfCom_Consulta.setText("Teléfono:");

        tTlfCom_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tTlfCom_Consulta.setBorder(null);
        tTlfCom_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tTlfCom_Consulta.setEnabled(false);
        tTlfCom_Consulta.setOpaque(false);

        labelCorreoCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCorreoCom_Consulta.setText("Correo:");

        tnombreEmp_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tnombreEmp_Consulta.setBorder(null);
        tnombreEmp_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tnombreEmp_Consulta.setEnabled(false);
        tnombreEmp_Consulta.setOpaque(false);

        separator17.setForeground(new java.awt.Color(0, 0, 0));

        labelEmpCom_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEmpCom_Consulta.setText("Empresa asociada:");

        tcorreoCom_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tcorreoCom_Consulta.setBorder(null);
        tcorreoCom_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tcorreoCom_Consulta.setEnabled(false);
        tcorreoCom_Consulta.setOpaque(false);

        labelCodEmp_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCodEmp_Consulta.setText("Código:");

        tcodEmp_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tcodEmp_Consulta.setBorder(null);
        tcodEmp_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tcodEmp_Consulta.setEnabled(false);
        tcodEmp_Consulta.setOpaque(false);

        bAtrasCom_Consulta.setBackground(new java.awt.Color(204, 204, 204));
        bAtrasCom_Consulta.setText("ATRÁS");
        bAtrasCom_Consulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasCom_ConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCom_BuscarLayout = new javax.swing.GroupLayout(panelCom_Buscar);
        panelCom_Buscar.setLayout(panelCom_BuscarLayout);
        panelCom_BuscarLayout.setHorizontalGroup(
            panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separator16))
                    .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                        .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelCodComercial_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tcodComercial_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCom_Consulta))
                            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelCodEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tcodEmp_Consulta))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelEmpCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tnombreEmp_Consulta))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labeldirCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tDirCom_Consulta))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelNIFCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tNIFCom_Consulta))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelnomCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tnombreCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelTlfCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tTlfCom_Consulta))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCom_BuscarLayout.createSequentialGroup()
                                                .addComponent(labelCorreoCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tcorreoCom_Consulta))
                                            .addComponent(separator17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(beanImagenCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 240, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(bAtrasCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCom_BuscarLayout.setVerticalGroup(
            panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCom_BuscarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodComercial_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tcodComercial_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bCom_Consulta)))
                .addGap(18, 18, 18)
                .addComponent(separator16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnomCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnombreCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNIFCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNIFCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeldirCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDirCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTlfCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTlfCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCorreoCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcorreoCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmpCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnombreEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCom_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcodEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beanImagenCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bAtrasCom_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        vApplet.add(panelCom_Buscar);
        panelCom_Buscar.setBounds(0, 0, 949, 641);

        labelCodEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCodEmpresa_Consulta.setText("Código empresa:");

        separator15.setForeground(new java.awt.Color(0, 0, 0));

        labelnombreEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelnombreEmpresa_Consulta.setText("Nombre: ");

        tnombreEmpresa_Consulta.setEditable(false);
        tnombreEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tnombreEmpresa_Consulta.setBorder(null);
        tnombreEmpresa_Consulta.setOpaque(false);

        labelCIFEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCIFEmpresa_Consulta.setText("CIF:");

        tCIFEmpresa_Consulta.setEditable(false);
        tCIFEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tCIFEmpresa_Consulta.setBorder(null);
        tCIFEmpresa_Consulta.setOpaque(false);

        labelDirEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelDirEmpresa_Consulta.setText("Dirección:");

        tDirEmpresa_Consulta.setEditable(false);
        tDirEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tDirEmpresa_Consulta.setBorder(null);
        tDirEmpresa_Consulta.setOpaque(false);

        labelTlf1Empresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTlf1Empresa_Consulta.setText("Teléfono 1:");

        tTlf1Empresa_Consulta.setEditable(false);
        tTlf1Empresa_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tTlf1Empresa_Consulta.setBorder(null);
        tTlf1Empresa_Consulta.setOpaque(false);

        labelTlf2Empresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTlf2Empresa_Consulta.setText("Teléfono 2:");

        tTlf2_Consulta.setEditable(false);
        tTlf2_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tTlf2_Consulta.setBorder(null);
        tTlf2_Consulta.setOpaque(false);

        labelEtiquetasEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEtiquetasEmpresa_Consulta.setText("Etiquetas:");

        jScrollPane8.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setEnabled(false);
        jScrollPane8.setOpaque(false);

        tEtiquetasEmpresa_Consulta.setEditable(false);
        tEtiquetasEmpresa_Consulta.setColumns(20);
        tEtiquetasEmpresa_Consulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tEtiquetasEmpresa_Consulta.setRows(5);
        tEtiquetasEmpresa_Consulta.setBorder(null);
        tEtiquetasEmpresa_Consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tEtiquetasEmpresa_Consulta.setEnabled(false);
        tEtiquetasEmpresa_Consulta.setOpaque(false);
        tEtiquetasEmpresa_Consulta.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(tEtiquetasEmpresa_Consulta);

        bAtrasEmp_Consulta.setBackground(new java.awt.Color(204, 204, 204));
        bAtrasEmp_Consulta.setText("ATRÁS");
        bAtrasEmp_Consulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasEmp_ConsultaActionPerformed(evt);
            }
        });

        bEmp_Consulta.setBackground(new java.awt.Color(204, 204, 204));
        bEmp_Consulta.setText("Buscar");
        bEmp_Consulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmp_ConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmp_BuscarLayout = new javax.swing.GroupLayout(panelEmp_Buscar);
        panelEmp_Buscar.setLayout(panelEmp_BuscarLayout);
        panelEmp_BuscarLayout.setHorizontalGroup(
            panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelCodEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tcodEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(beanImagenEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelnombreEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tnombreEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelCIFEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tCIFEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelDirEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tDirEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelTlf1Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(tTlf1Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelTlf2Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(tTlf2_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelEtiquetasEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(bAtrasEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(separator15)
                .addContainerGap())
        );
        panelEmp_BuscarLayout.setVerticalGroup(
            panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCodEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tcodEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmp_BuscarLayout.createSequentialGroup()
                        .addComponent(bEmp_Consulta)
                        .addGap(2, 2, 2)))
                .addComponent(separator15, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(beanImagenEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnombreEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnombreEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCIFEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCIFEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDirEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDirEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTlf1Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTlf1Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelEmp_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTlf2Empresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTlf2_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(labelEtiquetasEmpresa_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bAtrasEmp_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        vApplet.add(panelEmp_Buscar);
        panelEmp_Buscar.setBounds(0, 0, 949, 641);

        vApplet.setBounds(0, 0, 949, 641);
        this.add(vApplet);

    }
    
    //----------------------- ACTIONS PERFORMED ------------------------------//

    private void bCancelarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controlador.accionCancelar_Panel();
    }                                            

    private void bInsertaEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        controlador.accionInsertaEtiqueta();
    }                                                

    private void bCancelarComActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controlador.accionCancelar_Panel();
    }                                            

    private void bAniadirComercialActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        controlador.accionAniadirComercial_Panel();
    }                                                 

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {                                       
        controlador.accionCancelar_Panel();
    }                                      

    private void bRegistrarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionRegistrarEmpresa();
    }                                             

    private void bEliminaEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        controlador.accionEliminaEtiqueta();
    }                                                

    private void baniadirEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        controlador.accionAniadeEtiqueta();
    }                                                

    private void bRegistrarComActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionRegistraComercial();
    }                                             

    private void bBuscarComActionPerformed(java.awt.event.ActionEvent evt) {                                           
        controlador.accionBuscarComercial_Listar();
    }                                          

    private void bBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                           
        controlador.accionBuscarEmpresa_Listar();
    }                                          

    private void bModificarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionModificarEmpresa();
    }                                             

    private void bModificarComActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionModificarComercial();
    }                                             

    private void bCancelar_EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionCancelar_Panel();
    }                                                  

    private void listaEliminarMousePressed(java.awt.event.MouseEvent evt) {                                           
        controlador.seleccionLista_El();
    }                                          

    private void bEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controlador.accionEliminar("empresa");
    }                                            

    private void bEliminarComActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controlador.accionEliminar("comercial");
    }                                            

    private void listaBuscarEmpMousePressed(java.awt.event.MouseEvent evt) {                                            
        controlador.seleccionLista_Buscar("empresa");
    }                                           

    private void listaBuscarComMousePressed(java.awt.event.MouseEvent evt) {                                            
        controlador.seleccionLista_Buscar("comercial");
    }                                           

    private void bAtrasEmp_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionCancelar_Panel();
    }                                                  

    private void bEmp_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionBuscarEmpresa_Consulta();
    }                                             

    private void bCom_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        controlador.accionBuscarComercial_Consulta();
    }                                             

    private void bAtrasCom_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionCancelar_Panel();
    }   
    
    private void bModificarComercialActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        controlador.accionModificarComercial_Panel();
    }                                                   

    private void bAniadirEmpresaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        controlador.accionAniadirEmpresa_Panel();
    }                                               

    private void bConsultaComercialActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionConsultaComercial();
    }                                                  

    private void bModificarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        controlador.accionModificarEmpresa_Panel();
    }                                                 

    private void bEliminarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        controlador.accionEliminarEmpresa_Panel();
    }                                                

    private void bEliminarComercialActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionEliminarComercial_Panel();
    }                                                  

    private void bConsultaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        controlador.accionConsultaEmpresa();
    }                                                

    private void bListarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {                                                
        controlador.accionListaEmpresas();
    }                                               

    private void bListarComercialesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        controlador.accionListaComercial();
    }                                                  

    private void bFileChooserActionPerformed(java.awt.event.ActionEvent evt) {                                             
    //Como es una ventana gráfica el JFileChooser y sólo controlamos la selección de la imagen no enviaré un método al controlador
    //que me haga abrirla.  
        
        fc = new JFileChooser();
        int opcion = fc.showOpenDialog(this);
        
            //Si el usuario pulsa sobre el botón aceptar ...
            if(opcion == JFileChooser.APPROVE_OPTION){
                beanImagen_AniadirModificar.update(beanImagen_AniadirModificar.getGraphics());
                //Selección de fichero en JFileChooser
                File fichero = fc.getSelectedFile();
                //Ponemos la ruta de la imagen seleccionada en el JTextField de la ruta.
                tLogoEmp.setText(fichero.getAbsolutePath());
                //Le enviamos al Bean la ruta de la imagen.
                beanImagen_AniadirModificar.setRutaImagen(fichero.getAbsolutePath()); 
                //Repintamos el panel con la imagen.
                beanImagen_AniadirModificar.update(beanImagen_AniadirModificar.getGraphics());
            }
            
    } 


    //------------------------------------------------------------------------//
    //---------------------- MOSTRAR Y OCULTAR PANELES -----------------------//
    
     /**
     * Abre panel menú principal.
     */
    public void abreMenuPrincipal() {
        //this.setTitle("Aplicación Tarjetero - Menú Principal");
        panelEmpCom_Listar.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelPrincipal.setVisible(true);
        beanImagen_AniadirModificar.setRutaImagen("");
    }
    
    
    /**
     * Abre panel añadir empresa.
     */
    public void abreAniadirEmpresa() {
        //this.setTitle("Aplicación Tarjetero - Añadir empresa");
        panelPrincipal.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(true);

        beanImagen_AniadirModificar.update(beanImagen_AniadirModificar.getGraphics());
        
        bBuscarEmp.setVisible(false);
        bRegistrarEmp.setVisible(true);
        bModificarEmp.setVisible(false);

        limpiaRegistrosEmp(); //Limpia registros al abrir de nuevo este panel.
    }


    /**
     * Abre panel modificar empresa.
     */
    public void abreModificarEmpresa() {   
        //Ocultamos y visualizamos el panel modificar empresa.
        //this.setTitle("Aplicación Tarjetero - Modificar empresa");
        panelEmpresa_AniadirMod.setVisible(true);
        panelPrincipal.setVisible(false);
        bBuscarEmp.setVisible(true);
        
        //Visualizar botón Registrar y ocultar Modificar.
        bRegistrarEmp.setVisible(false);
        bModificarEmp.setVisible(true);
        
        //Limpia registros al abrir de nuevo este panel.
        limpiaRegistrosEmp(); 
    }

    
    /**
     * Abre panel añadir comercial.
     */
    public void abreAniadirComercial() {
        //this.setTitle("Aplicación Tarjetero - Añadir comercial");
        panelPrincipal.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelComercial_AniadirMod.setVisible(true);
        
        //Visualizar botón Añadir y ocultar Modificar.
        bRegistrarCom.setVisible(true);
        bModificarCom.setVisible(false);
        
        //No estamos en el panel modificar, por lo tanto ocultamos el botón Buscar.
        bBuscarCom.setVisible(false);
        limpiaRegistrosCom();
        
        modeloLista4.removeAllElements();
        controlador.rellenaListaEmpresas();
        getListaEmpresas().setModel(getModeloLista4());
    }
    
    
    /**
     * Abre panel modificar comercial.
     */
    public void abreModificarComercial() {
        //Ocultamos y visualizamos el panel modificar comercial.
        panelEmpresa_AniadirMod.setVisible(false);
        panelComercial_AniadirMod.setVisible(true);
        panelPrincipal.setVisible(false);
        
        //Visualizar botón Registrar, Buscar y ocultar Modificar.
        bRegistrarCom.setVisible(false);
        bModificarCom.setVisible(true);   
        bBuscarCom.setVisible(true);
        
        //Limpia registros al abrir de nuevo este panel.
        limpiaRegistrosCom(); 
        
        modeloLista4.removeAllElements();
        controlador.rellenaListaEmpresas();
        getListaEmpresas().setModel(getModeloLista4());
    }
    
    /**
     * Abre panel eliminar empresa.
     */
    public void abreEliminarEmpresa() {
        //Ocultamos y visualizamos el panel eliminar empresa.
        panelComercial_AniadirMod.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelPrincipal.setVisible(false);
        panelEmpCom_Listar.setVisible(false);
        panelEmpCom_Eliminar.setVisible(true);
        
        labelLeyendaCom.setVisible(false);     labelLeyendaEmp.setVisible(true);
        bEliminarEmp.setVisible(true);       bEliminarCom.setVisible(false);

        modeloLista4.removeAllElements();
        controlador.rellenaListaEmpresas();
        getListaEliminar().setModel(getModeloLista4());
    }
    
    
    /**
     * Abre panel eliminar comercial.
     */
    public void abreEliminarComercial(){
        //Ocultamos y visualizamos el panel eliminar comercial.
        panelComercial_AniadirMod.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelPrincipal.setVisible(false);
        panelEmpCom_Listar.setVisible(false);
        panelEmpCom_Eliminar.setVisible(true);
        
        labelLeyendaCom.setVisible(true);     labelLeyendaEmp.setVisible(false);
        bEliminarEmp.setVisible(false);       bEliminarCom.setVisible(true);
        
        modeloLista4.removeAllElements();
        controlador.rellenaListaComerciales(); 
        getListaEliminar().setModel(getModeloLista4());
    }
    
    
    /**
     * Abre panel eliminar comercial.
     */
    public void abreListarComercial() {       
        //Ocultamos y visualizamos el panel eliminar comercial.
        panelComercial_AniadirMod.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelPrincipal.setVisible(false);
        panelEmpCom_Eliminar.setVisible(false);
        panelEmpCom_Listar.setVisible(true);
        
        jScrollPane5.setVisible(true);         
        tFiltroCom_B.setVisible(true);        tFiltroEmp_B.setVisible(false);
        labelCodCom_B.setVisible(true);       labelCodEmp_B.setVisible(false);
        labelNIFCom_B.setVisible(true);       labelCIFEmp_B.setVisible(false);
        labelTlfCom_B.setVisible(true);       labelTlf1Emp_B.setVisible(false);
        labelCorreoCom_B.setVisible(true);    labelTlf2Emp_B.setVisible(false);
        labelEmpCom_B.setVisible(true);       labelEtiquetas.setVisible(false);
        labelLeyendaCom.setVisible(true);     labelLeyendaEmp.setVisible(false);
        //Campos JTextfield
        tcodCom_B.setVisible(true);           tcodEmp_B.setVisible(false);
        tnombreCom_B.setVisible(true);        tnombreEmp_B.setVisible(false);
        tNIFCom_B.setVisible(true);           tCIFEmp_B.setVisible(false);
        tDirCom_B.setVisible(true);           tDirEmp_B.setVisible(false);
        tTlfCom_B.setVisible(true);           tTlf1Emp_B.setVisible(false);
        tcorreoCom_B.setVisible(true);        tTlf2Emp_B.setVisible(false);
        tEmpCom_B.setVisible(true);           tAreaEtiquetas.setVisible(false);
                                              jScrollPane3.setVisible(false);
                                              jScrollPane5.setVisible(false);
                                              jScrollPane6.setVisible(true);
                                              
        listaBuscarEmp.setVisible(false);     listaBuscarCom.setVisible(true);
                                              
        modeloLista4.removeAllElements();
        controlador.rellenaListaComerciales(); 
        getListaBuscarCom().setModel(getModeloLista4());
        
        limpiaRegistrosEmp_Listar();
    }
    
    /**
     * Abre panel buscar empresa.
     */
    public void abreListarEmpresa(){       
        //Ocultamos y visualizamos el panel eliminar empresa.
        panelComercial_AniadirMod.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelPrincipal.setVisible(false);
        panelEmpCom_Eliminar.setVisible(false);
        panelEmpCom_Listar.setVisible(true);
        
        //Ocultamos elementos de comercial y visualizamos los de la empresa.
        //Etiquetas y lista       
        tFiltroCom_B.setVisible(false);        tFiltroEmp_B.setVisible(true);   
        labelCodCom_B.setVisible(false);       labelCodEmp_B.setVisible(true);
        labelNIFCom_B.setVisible(false);       labelCIFEmp_B.setVisible(true);
        labelTlfCom_B.setVisible(false);       labelTlf1Emp_B.setVisible(true);
        labelCorreoCom_B.setVisible(false);    labelTlf2Emp_B.setVisible(true);
        labelEmpCom_B.setVisible(false);       labelEtiquetas.setVisible(true);
                                         
        //Campos JTextfield
        tcodCom_B.setVisible(false);           tcodEmp_B.setVisible(true);
        tnombreCom_B.setVisible(false);        tnombreEmp_B.setVisible(true);
        tNIFCom_B.setVisible(false);           tCIFEmp_B.setVisible(true);
        tDirCom_B.setVisible(false);           tDirEmp_B.setVisible(true);
        tTlfCom_B.setVisible(false);           tTlf1Emp_B.setVisible(true);
        tcorreoCom_B.setVisible(false);        tTlf2Emp_B.setVisible(true);
        tEmpCom_B.setVisible(false);           tAreaEtiquetas.setVisible(true);
                                               jScrollPane3.setVisible(true);
                                               jScrollPane5.setVisible(true);
                                               jScrollPane6.setVisible(false);
                                               
        listaBuscarEmp.setVisible(true);     listaBuscarCom.setVisible(false);
        
        modeloLista4.removeAllElements();
        controlador.rellenaListaEmpresas();
        getListaBuscar().setModel(getModeloLista4());
        
        limpiaRegistrosEmp_Listar();
    }
    
    
    /**
     * Abre panel Consulta Empresa.
     */
    public void abreConsultaEmpresa() {
        panelPrincipal.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelComercial_AniadirMod.setVisible(false);
        panelEmpCom_Eliminar.setVisible(false);
        panelEmpCom_Listar.setVisible(false);
        panelCom_Buscar.setVisible(false);
        panelEmp_Buscar.setVisible(true);
        
        limpiaRegistrosEm_Consulta();
    }
  
    
    /**
     * Abre panel Consulta Comercial.
     */
    public void abreConsultaComercial() {
        panelPrincipal.setVisible(false);
        panelEmpresa_AniadirMod.setVisible(false);
        panelComercial_AniadirMod.setVisible(false);
        panelEmpCom_Eliminar.setVisible(false);
        panelEmpCom_Listar.setVisible(false);
        panelEmp_Buscar.setVisible(false);
        panelCom_Buscar.setVisible(true);
        
        limpiaRegistrosCom_Consulta();
    }
    
     
    
    /**
     * Resetea los campos de datos de empresa.
     */
    public void limpiaRegistrosEmp(){
        beanImagen_AniadirModificar.setRutaImagen("");
        tLogoEmp.setText("");
        tCodEmp.setText("");
        tNombreEmp.setText("");
        tCIFEmp.setText("");
        tDirEmp.setText("");
        tTlf2Emp.setText("");
        tTlf1Emp.setText("");
        listaEtiquetas.setSelectedIndex(0);
        modeloLista2.clear();
    }
   
    
    /**
     * Resetea los campos de datos de comercial.
     */
    public void limpiaRegistrosCom(){
        tCodCom.setText("");
        tNombreCom.setText("");
        tDirCom.setText("");
        tNIFCom.setText("");
        tTlfCom.setText("");
        tCorreoCom.setText("");
    }
    
    
    /**
     * Resetea los campos de datos de empresa (Listar empresas).
     */
    public void limpiaRegistrosEmp_Listar(){
        tcodEmp_B.setText("");
        tnombreEmp_B.setText("");
        tCIFEmp_B.setText("");
        tDirEmp_B.setText("");
        tTlf1Emp_B.setText("");
        tTlf2Emp_B.setText("");
        tAreaEtiquetas.setText("");
    }
    
    
    /**
     * Resetea los campos de datos de comercial (Listar comerciales).
     */
    public void limpiaRegistrosCom_Listar(){
        tcodCom_B.setText("");
        tnombreCom_B.setText("");
        tNIFCom_B.setText("");
        tDirCom_B.setText("");
        tTlfCom_B.setText("");
        tcorreoCom_B.setText("");
        tnombreEmp_B.setText("");
    }
    
    /**
     * Resetea los campos de datos de empresa (Consulta empresa).
     */
    public void limpiaRegistrosEm_Consulta(){
        tcodEmpresa_Consulta.setText("");
        tnombreEmpresa_Consulta.setText("");
        tCIFEmpresa_Consulta.setText("");
        tDirEmpresa_Consulta.setText("");
        tTlf1Empresa_Consulta.setText("");
        tTlf2_Consulta.setText("");
        tEtiquetasEmpresa_Consulta.setText("");
        beanImagenEmp_Consulta.setRutaImagen("");
    }
    
    /**
     * Resetea los campos de datos de comercial (Consulta comercial).
     */
    public void limpiaRegistrosCom_Consulta(){
        tcodComercial_Consulta.setText("");
        tnombreCom_Consulta.setText("");
        tNIFCom_Consulta.setText("");
        tDirCom_Consulta.setText("");
        tTlfCom_Consulta.setText("");
        tcorreoCom_Consulta.setText("");
        tcodEmp_Consulta.setText("");
        tnombreEmp_Consulta.setText("");
        beanImagenCom_Consulta.setRutaImagen("");
    }
    
    
    /**
     * Se le pasa del controlador los datos recibidos del modelo de la tabla empresa.
     * Estos campos serán modificados por los datos enviados del controlador.
     * @param datos Con este parámetro conseguimos los datos obtenidos de la BD.
     * @param tipo  Identificamos si es un listado o una consulta.
     */
    public void ponerDatosEmpresa(Object[] datos, String tipo) {
        //Si el parámetro que se la pasa es "listar" irá a los elementos del panel listar.
        if(tipo.equalsIgnoreCase("listar")){
            tNombreEmp.setText((String)datos[1]);
            tCIFEmp.setText((String)datos[2]);
            tDirEmp.setText((String)datos[3]);
            tTlf1Emp.setText((String)datos[4]);
            tTlf2Emp.setText((String)datos[5]);
            beanImagen_AniadirModificar.setImagen((Image) datos[7]);
            beanImagen_AniadirModificar.update(beanImagen_AniadirModificar.getGraphics());
        }else{
            //Si el parámetro que se la pasa es "consulta" irá a los elementos del panel consulta.
            if(tipo.equalsIgnoreCase("consulta")){
                tnombreEmpresa_Consulta.setText((String)datos[1]);
                tCIFEmpresa_Consulta.setText((String)datos[2]);
                tDirEmpresa_Consulta.setText((String)datos[3]);
                tTlf1Empresa_Consulta.setText((String)datos[4]);
                tTlf2_Consulta.setText((String)datos[5].toString());
                tEtiquetasEmpresa_Consulta.setText((String)datos[6]);
                beanImagenEmp_Consulta.setImagen((Image) datos[7]);
                beanImagenEmp_Consulta.update(beanImagenEmp_Consulta.getGraphics());
            }
        }
    }
    
    public void ponerDatosComercial(Object[] datos, String tipo) {
        if(tipo.equalsIgnoreCase("listar")){
            tNombreCom.setText((String)datos[1]);
            tNIFCom.setText((String)datos[2]);
            tDirCom.setText((String)datos[3]);
            tTlfCom.setText((String)datos[4]);
            tCorreoCom.setText((String)datos[5]);
        }else{
            if(tipo.equalsIgnoreCase("consulta")){
                tnombreCom_Consulta.setText((String)datos[1]);
                tNIFCom_Consulta.setText((String)datos[2]);
                tDirCom_Consulta.setText((String)datos[3]);
                tTlfCom_Consulta.setText((String)datos[4]);
                tcorreoCom_Consulta.setText((String)datos[5]);
                tnombreEmp_Consulta.setText((String)datos[7]);
                tcodEmp_Consulta.setText((String)datos[6]);
                beanImagenCom_Consulta.setImagen((Image) datos[8]);
                beanImagenCom_Consulta.update(beanImagenCom_Consulta.getGraphics());
            }
        }
    }
    
    public void ponerDatosEmpresa_Listar(Object[] datos){
        tcodEmp_B.setText((String)datos[0]);
        tnombreEmp_B.setText((String)datos[1]);
        tCIFEmp_B.setText((String)datos[2]);
        tDirEmp_B.setText((String)datos[3]);
        tTlf1Emp_B.setText((String)datos[4]);
        tTlf2Emp_B.setText((String)datos[5]);
        tAreaEtiquetas.setText((String)datos[6]);
    }
    
    public void ponerDatosComercial_Listar(Object[] datos) {
       tcodCom_B.setText((String)datos[0]);
       tnombreCom_B.setText((String)datos[1]);
       tNIFCom_B.setText((String)datos[2]);
       tDirCom_B.setText((String)datos[3]);
       tTlfCom_B.setText((String)datos[4]);
       tcorreoCom_B.setText((String)datos[5]);
       tEmpCom_B.setText((String)datos[6]);
    }
    
    
    /**
     * Lista de mensajes de advertencia al usuario.
     * @param elementoModificado Se le pasa por parámetro un código tipo String para identificar y lanzar el mensaje.
     */
    public void message(String elementoModificado) {
        
        switch(elementoModificado){
            case "comercialInsertado": JOptionPane.showMessageDialog(null, "Comercial registrado correctamente.");
            break;
            
            case "empresaInsertada": JOptionPane.showMessageDialog(null, "Empresa registrada correctamente.");
            break;
            
            case "comercialModificado": JOptionPane.showMessageDialog(null, "Comercial modificado correctamente.");
            break;
            
            case "empresaModificada": JOptionPane.showMessageDialog(null, "Empresa modificada correctamente.");
            break;
            
            case "errorRegistro": JOptionPane.showMessageDialog(null, "Error de registro.  Verifica los datos introducidos.  El código introducido ya puede existir en BD.");
            break;
            
            case "seleccionaUnaEmpresa": JOptionPane.showMessageDialog(this, "Debe seleccionar al menos una empresa.");
            break;
            
            case "seleccionaUnaEtiqueta": JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una etiqueta.");
            break;
            
            case "codComercialVacio": JOptionPane.showMessageDialog(null, "El comercial debe tener un código asignado.");
            break;
            
            case "codEmpresaVacio": JOptionPane.showMessageDialog(null, "La empresa debe tener un código asignado.");
            break;
            
            case "errorInsertaEtiqueta":  JOptionPane.showMessageDialog(null, "Error al insertar la etiqueta.  Compruebe que no esté ya registrada.");
            break;
            
            case "etiquetaVacia": JOptionPane.showMessageDialog(null, "Registre una etiqueta con nombre.");
            break;
                        
            case "errorEliminarEmpresa": JOptionPane.showMessageDialog(null, "Error al eliminar la empresa.  Compruebe que no tenga ningún comercial asociado.");
            break;
            
            case "errorEliminarComercial": JOptionPane.showMessageDialog(null, "Error al eliminar el comercial.");
            break;
            
            case "empresaEliminada": JOptionPane.showMessageDialog(null, "Empresa eliminada con éxito.");
            break;
            
            case "comercialEliminado": JOptionPane.showMessageDialog(null, "Comercial eliminado con éxito.");
            break;
            
            case "empresaNoEncontrada": JOptionPane.showMessageDialog(null, "Empresa no encontrada.");
            break;
            
            case "noImagen": JOptionPane.showMessageDialog(null, "Inserte una imagen para la tarjeta.");
            break;
            
            case "comercialNoEncontrado": JOptionPane.showMessageDialog(null, "Comercial no encontrado.");
            break;

        }
        
    }
    
    //------------------------------------------------------------------------//
    //--------------------- DECLARACIÓN DATOS MIEMBRO ------------------------//
    //------------------------------------------------------------------------//
    
    private javax.swing.JButton bAniadirComercial;
    private javax.swing.JButton bAniadirEmpresa;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bAtrasCom_Consulta;
    private javax.swing.JButton bAtrasEmp_Consulta;
    private javax.swing.JButton bBuscarCom;
    private javax.swing.JButton bBuscarEmp;
    private javax.swing.JButton bCancelarCom;
    private javax.swing.JButton bCancelarEmp;
    private javax.swing.JButton bCancelar_Eliminar;
    private javax.swing.JButton bCom_Consulta;
    private javax.swing.JButton bConsultaComercial;
    private javax.swing.JButton bConsultaEmpresa;
    private javax.swing.JButton bEliminaEtiqueta;
    private javax.swing.JButton bEliminarCom;
    private javax.swing.JButton bEliminarComercial;
    private javax.swing.JButton bEliminarEmp;
    private javax.swing.JButton bEliminarEmpresa;
    private javax.swing.JButton bEmp_Consulta;
    private javax.swing.JButton bFileChooser;
    private javax.swing.JButton bInsertaEtiqueta;
    private javax.swing.JButton bListarComerciales;
    private javax.swing.JButton bListarEmpresas;
    private javax.swing.JButton bModificarCom;
    private javax.swing.JButton bModificarComercial;
    private javax.swing.JButton bModificarEmp;
    private javax.swing.JButton bModificarEmpresa;
    private javax.swing.JButton bRegistrarCom;
    private javax.swing.JButton bRegistrarEmp;
    private javax.swing.JButton baniadirEtiqueta;
    private beanimagen.BeanImagen beanImagenCom_Consulta;
    private beanimagen.BeanImagen beanImagenEmp_Consulta;
    private beanimagen.BeanImagen beanImagen_AniadirModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private java.awt.Label labelCIF;
    private java.awt.Label labelCIFEmp_B;
    private java.awt.Label labelCIFEmpresa_Consulta;
    private java.awt.Label labelCodCom_B;
    private java.awt.Label labelCodComercial;
    private java.awt.Label labelCodComercial_Consulta;
    private java.awt.Label labelCodEmp_B;
    private java.awt.Label labelCodEmp_Consulta;
    private java.awt.Label labelCodEmpresa;
    private java.awt.Label labelCodEmpresa_Consulta;
    private java.awt.Label labelCorreo;
    private java.awt.Label labelCorreoCom_B;
    private java.awt.Label labelCorreoCom_Consulta;
    private java.awt.Label labelDir;
    private java.awt.Label labelDir1;
    private java.awt.Label labelDirEmpresa_Consulta;
    private java.awt.Label labelDir_B;
    private java.awt.Label labelEmpCom_B;
    private java.awt.Label labelEmpCom_Consulta;
    private java.awt.Label labelEmpresa;
    private java.awt.Label labelEtiqueta;
    private java.awt.Label labelEtiquetas;
    private java.awt.Label labelEtiquetasEmpresa_Consulta;
    private java.awt.Label labelLeyendaCom;
    private java.awt.Label labelLeyendaEmp;
    private java.awt.Label labelNIF;
    private java.awt.Label labelNIFCom_B;
    private java.awt.Label labelNIFCom_Consulta;
    private java.awt.Label labelNombre;
    private java.awt.Label labelNombreComercial;
    private java.awt.Label labelNombre_B;
    private java.awt.Label labelTitulo;
    private java.awt.Label labelTlf1;
    private java.awt.Label labelTlf1Emp_B;
    private java.awt.Label labelTlf1Empresa_Consulta;
    private java.awt.Label labelTlf2;
    private java.awt.Label labelTlf2Emp_B;
    private java.awt.Label labelTlf2Empresa_Consulta;
    private java.awt.Label labelTlfCom_B;
    private java.awt.Label labelTlfCom_Consulta;
    private java.awt.Label labelTlfComercial;
    private java.awt.Label labeldirCom_Consulta;
    private java.awt.Label labelnomCom_Consulta;
    private java.awt.Label labelnombreEmpresa_Consulta;
    private javax.swing.JList<String> listaBuscarCom;
    private javax.swing.JList<String> listaBuscarEmp;
    private javax.swing.JList<String> listaEliminar;
    private javax.swing.JList<String> listaEmpresas;
    private javax.swing.JList<String> listaEtiquetas;
    private javax.swing.JList<String> listaEtiquetasAniadidas;
    private java.awt.Panel panelCom_Buscar;
    private java.awt.Panel panelComercial_AniadirMod;
    private java.awt.Panel panelEmpCom_Eliminar;
    private java.awt.Panel panelEmpCom_Listar;
    private java.awt.Panel panelEmp_Buscar;
    private java.awt.Panel panelEmpresa_AniadirMod;
    private java.awt.Panel panelPrincipal;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador10;
    private javax.swing.JSeparator separador14;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    private javax.swing.JSeparator separador6;
    private javax.swing.JSeparator separador7;
    private javax.swing.JSeparator separador8;
    private javax.swing.JSeparator separador9;
    private javax.swing.JSeparator separator15;
    private javax.swing.JSeparator separator16;
    private javax.swing.JSeparator separator17;
    private javax.swing.JTextField tAniadirEtiqueta;
    private javax.swing.JTextArea tAreaEtiquetas;
    private javax.swing.JTextField tBuscar;
    private javax.swing.JTextField tBuscarEmp;
    private javax.swing.JTextField tCIFEmp;
    private javax.swing.JTextField tCIFEmp_B;
    private javax.swing.JTextField tCIFEmpresa_Consulta;
    private javax.swing.JTextField tCodCom;
    private javax.swing.JTextField tCodEmp;
    private javax.swing.JTextField tCorreoCom;
    private javax.swing.JTextField tDirCom;
    private javax.swing.JTextField tDirCom_B;
    private javax.swing.JTextField tDirCom_Consulta;
    private javax.swing.JTextField tDirEmp;
    private javax.swing.JTextField tDirEmp_B;
    private javax.swing.JTextField tDirEmpresa_Consulta;
    private javax.swing.JTextField tEmpCom_B;
    private javax.swing.JTextArea tEtiquetasEmpresa_Consulta;
    private javax.swing.JTextField tFiltro;
    private javax.swing.JTextField tFiltroCom_B;
    private javax.swing.JTextField tFiltroEmp_B;
    private javax.swing.JTextField tLogoEmp;
    private javax.swing.JTextField tNIFCom;
    private javax.swing.JTextField tNIFCom_B;
    private javax.swing.JTextField tNIFCom_Consulta;
    private javax.swing.JTextField tNombreCom;
    private javax.swing.JTextField tNombreEmp;
    private javax.swing.JTextField tTlf1Emp;
    private javax.swing.JTextField tTlf1Emp_B;
    private javax.swing.JTextField tTlf1Empresa_Consulta;
    private javax.swing.JTextField tTlf2Emp;
    private javax.swing.JTextField tTlf2Emp_B;
    private javax.swing.JTextField tTlf2_Consulta;
    private javax.swing.JTextField tTlfCom;
    private javax.swing.JTextField tTlfCom_B;
    private javax.swing.JTextField tTlfCom_Consulta;
    private javax.swing.JTextField tcodCom_B;
    private javax.swing.JTextField tcodComercial_Consulta;
    private javax.swing.JTextField tcodEmp_B;
    private javax.swing.JTextField tcodEmp_Consulta;
    private javax.swing.JTextField tcodEmpresa_Consulta;
    private javax.swing.JTextField tcorreoCom_B;
    private javax.swing.JTextField tcorreoCom_Consulta;
    private javax.swing.JTextField tnombreCom_B;
    private javax.swing.JTextField tnombreCom_Consulta;
    private javax.swing.JTextField tnombreEmp_B;
    private javax.swing.JTextField tnombreEmp_Consulta;
    private javax.swing.JTextField tnombreEmpresa_Consulta;
    private java.awt.Panel vApplet;
    private JFileChooser fc;
    private DefaultListModel modeloLista1;
    private DefaultListModel modeloLista2;
    private DefaultListModel modeloLista3;
    private DefaultListModel modeloLista4;
    
    
    //------------------------------------------------------------------------//
    //------------------------- GETTERS & SETTERS ----------------------------//
    //------------------------------------------------------------------------//

    public JTextField gettCodCom() {
        return tCodCom;
    }

    public JTextField gettCorreoCom() {
        return tCorreoCom;
    }

    public JTextField gettDirCom() {
        return tDirCom;
    }

    public JTextField gettNIFCom() {
        return tNIFCom;
    }

    public JTextField gettNombreCom() {
        return tNombreCom;
    }

    public JTextField gettTlfCom() {
        return tTlfCom;
    }

    public JTextField gettCIFEmp() {
        return tCIFEmp;
    }

    public JTextField gettCodEmp() {
        return tCodEmp;
    }

    public JTextField gettDirEmp() {
        return tDirEmp;
    }

    public JTextField gettLogoEmp() {
        return tLogoEmp;
    }

    public JTextField gettNombreEmp() {
        return tNombreEmp;
    }

    public JTextField gettTlf1Emp() {
        return tTlf1Emp;
    }

    public JTextField gettTlf2Emp() {
        return tTlf2Emp;
    }

    public JList<String> getLista2() {
        return listaEtiquetasAniadidas;
    }

    public DefaultListModel getModeloLista1() {
        return modeloLista1;
    }

    public DefaultListModel getModeloLista2() {
        return modeloLista2;
    }

    public DefaultListModel getModeloLista3() {
        return modeloLista3;
    }
    
    public JTextField gettAniadirEtiqueta() {
        return tAniadirEtiqueta;
    }

    public JList<String> getListaEmpresas() {
        return listaEmpresas;
    }
    
    public JList<String> getLista1() {
        return listaEtiquetas;
    }

    public DefaultListModel getModeloLista4() {
        return modeloLista4;
    }

    public JList<String> getListaBuscar() {
        return listaBuscarEmp;
    }
    
    public JList<String> getListaEliminar() {
        return listaEliminar;
    }  

    public JList<String> getListaBuscarCom() {
        return listaBuscarCom;
    }

    public JList<String> getListaBuscarEmp() {
        return listaBuscarEmp;
    }

    public BeanImagen getBeanImagen() {
        return beanImagen_AniadirModificar;
    }

    public JTextField gettBuscarEmp() {
        return tBuscarEmp;
    }

    public JTextField getTcodEmpresa_Consulta() {
        return tcodEmpresa_Consulta;
    }

    public JTextField getTcodComercial_Consulta() {
        return tcodComercial_Consulta;
    }

    public Panel getvApplet() {
        return vApplet;
    }

}
