package gui;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JPanel;
import paneles.*;


public class MenuFrame extends javax.swing.JFrame {


    public MenuFrame() {
        initComponents();
        this.setExtendedState(this. MAXIMIZED_BOTH);
        initContent();
    }
    
    private void initContent() {
        showJPanel(new Principal());
    }
    
    private void showJPanel(JPanel p){
        p.setSize(1123,684);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        background = new javax.swing.JPanel();
        menus = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        panelBillMD = new javax.swing.JPanel();
        labelBillMD = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        labelMain = new javax.swing.JLabel();
        panelCreatD = new javax.swing.JPanel();
        labelCreateDoc = new javax.swing.JLabel();
        panelCreatePt = new javax.swing.JPanel();
        labelCreatePat = new javax.swing.JLabel();
        panelBillP = new javax.swing.JPanel();
        labelBillPt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menus.setBackground(new java.awt.Color(13, 71, 161));

        title2.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Medical Practice");

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setForeground(new java.awt.Color(255, 255, 255));

        panelBillMD.setBackground(new java.awt.Color(0, 102, 204));

        labelBillMD.setBackground(new java.awt.Color(0, 102, 204));
        labelBillMD.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        labelBillMD.setForeground(new java.awt.Color(255, 255, 255));
        labelBillMD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dollar-circle-regular-24.png"))); // NOI18N
        labelBillMD.setText("Generate Bill to Medical Practice");
        labelBillMD.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 102, 204)));
        labelBillMD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBillMD.setIconTextGap(10);
        labelBillMD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    labelBillMDMouseClicked(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout panelBillMDLayout = new javax.swing.GroupLayout(panelBillMD);
        panelBillMD.setLayout(panelBillMDLayout);
        panelBillMDLayout.setHorizontalGroup(
            panelBillMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillMDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBillMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBillMDLayout.setVerticalGroup(
            panelBillMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBillMDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBillMD, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.setBackground(new java.awt.Color(0, 102, 204));
        panelMain.setPreferredSize(new java.awt.Dimension(229, 62));

        labelMain.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        labelMain.setForeground(new java.awt.Color(255, 255, 255));
        labelMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-regular-24.png"))); // NOI18N
        labelMain.setText("Principal");
        labelMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 102, 204)));
        labelMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMain.setIconTextGap(10);
        labelMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMainMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelCreatD.setBackground(new java.awt.Color(0, 102, 204));
        panelCreatD.setPreferredSize(new java.awt.Dimension(229, 62));

        labelCreateDoc.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        labelCreateDoc.setForeground(new java.awt.Color(255, 255, 255));
        labelCreateDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/first-aid-regular-24.png"))); // NOI18N
        labelCreateDoc.setText("Create Doctor");
        labelCreateDoc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 102, 204)));
        labelCreateDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCreateDoc.setIconTextGap(10);
        labelCreateDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCreateDocMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCreatDLayout = new javax.swing.GroupLayout(panelCreatD);
        panelCreatD.setLayout(panelCreatDLayout);
        panelCreatDLayout.setHorizontalGroup(
            panelCreatDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCreateDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCreatDLayout.setVerticalGroup(
            panelCreatDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCreateDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCreatePt.setBackground(new java.awt.Color(0, 102, 204));
        panelCreatePt.setPreferredSize(new java.awt.Dimension(229, 62));

        labelCreatePat.setBackground(new java.awt.Color(255, 255, 255));
        labelCreatePat.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        labelCreatePat.setForeground(new java.awt.Color(255, 255, 255));
        labelCreatePat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-plus-regular-24.png"))); // NOI18N
        labelCreatePat.setText("Create Patient");
        labelCreatePat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 102, 204)));
        labelCreatePat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCreatePat.setIconTextGap(10);
        labelCreatePat.setPreferredSize(new java.awt.Dimension(159, 32));
        labelCreatePat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCreatePatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCreatePtLayout = new javax.swing.GroupLayout(panelCreatePt);
        panelCreatePt.setLayout(panelCreatePtLayout);
        panelCreatePtLayout.setHorizontalGroup(
            panelCreatePtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatePtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCreatePat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCreatePtLayout.setVerticalGroup(
            panelCreatePtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatePtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCreatePat, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBillP.setBackground(new java.awt.Color(0, 102, 204));
        panelBillP.setPreferredSize(new java.awt.Dimension(229, 62));

        labelBillPt.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        labelBillPt.setForeground(new java.awt.Color(255, 255, 255));
        labelBillPt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallet-solid-24.png"))); // NOI18N
        labelBillPt.setText("Generate Bill to Patient");
        labelBillPt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 102, 204)));
        labelBillPt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBillPt.setIconTextGap(10);
        labelBillPt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBillPtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBillPLayout = new javax.swing.GroupLayout(panelBillP);
        panelBillP.setLayout(panelBillPLayout);
        panelBillPLayout.setHorizontalGroup(
            panelBillPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBillPt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBillPLayout.setVerticalGroup(
            panelBillPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBillPt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addComponent(panelCreatD, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addComponent(panelCreatePt, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addComponent(panelBillP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addComponent(panelBillMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelCreatD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelCreatePt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelBillP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBillMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medical Practice");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administration Medical Practice");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        message.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        message.setText("\"The first wealth is health\" Ralph W Emerson.");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(message)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void labelBillMDMouseClicked(java.awt.event.MouseEvent evt) throws IOException {                                         

        //Panel Y CODIGO PARA MOSTRAR LA GENERACION DE LA FACTURA AL MD
        showJPanel(new CreateBillMD());
    }                                        

    private void labelMainMouseClicked(java.awt.event.MouseEvent evt) {                                       
        //CODIGO PARA REDIRIGIR A LA PANTALLA PRINCIPAL
        showJPanel(new Principal());
        // TODO add your handling code here:
    }                                      

    private void labelCreateDocMouseClicked(java.awt.event.MouseEvent evt) {                                            
        //CODIGO PARA MOSTRAR EL FRAME DE CREAR DOCTOR
        showJPanel(new CreateDoc());
        // TODO add your handling code here:
    }                                           

    private void labelCreatePatMouseClicked(java.awt.event.MouseEvent evt) {                                            
    //CODIGO PARA EL FRAME DE CREAR PACIENTES FRAME 
    showJPanel(new CreateUser());
    
        // TODO add your handling code here:
    }                                           

    private void labelBillPtMouseClicked(java.awt.event.MouseEvent evt) {                                         
        //FRAME Y CODIGO PARA GENERAR LA FACTURA AL PACIENTE
        showJPanel(new CreateBillPat());
        // TODO add your handling code here:
    }                                        


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBillMD;
    private javax.swing.JLabel labelBillPt;
    private javax.swing.JLabel labelCreateDoc;
    private javax.swing.JLabel labelCreatePat;
    private javax.swing.JLabel labelMain;
    private javax.swing.JPanel menus;
    private javax.swing.JLabel message;
    private javax.swing.JPanel panelBillMD;
    private javax.swing.JPanel panelBillP;
    private javax.swing.JPanel panelCreatD;
    private javax.swing.JPanel panelCreatePt;
    private javax.swing.JPanel panelMain;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel title2;
    // End of variables declaration                   


}
