package paneles;

public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
    }

                         
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setText("The medical office system consists of several components:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel3.setText("can be associated with one or more doctors.");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setText("Medical Office Management System. Control and manage the invoices of your office in an optimal and simple way.");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel5.setText("- Patients: Patients also have individual profiles in the system. Information such ");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel6.setText("- Doctors: The system allows you to create profiles of doctors, where information");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel7.setText("multiple associated patients.");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel8.setText("- Billing for Patients: When a patient visits, an itemized bill is generated that ");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel10.setText("This bill can be printed or electronically sent to the  patient for payment.");

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel11.setText("such as name, specialty, email and telephone is stored. Each doctor can have");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel12.setText("as name, date of birth, address and contact details are stored here. Each patient");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel13.setText("includes services rendered, medications prescribed, and any additional charges.");

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel14.setText("- Billing for the doctor's office: The system is also capable of generating invoices for");

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel15.setText("the doctor's office itself. These invoices include the income generated and other ");

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel16.setText("services ffered by the office. ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2023-06-01 174729.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel9))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel12))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel14))
                    .addComponent(jLabel6)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel15))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel16))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration                   
}
