package paneles;

import javax.swing.JTextField;
import model.*;

public class CreateBillPat extends javax.swing.JPanel {
    private MedicalPractice medicalPractice = new MedicalPractice();
    private Bill bill = new Bill();

    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JComboBox<TreatmentEnum> treatmentComboBox;
    private javax.swing.JTextField patientIdTextField;

    public CreateBillPat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        bg = new javax.swing.JPanel();
        doctorComboBox = new javax.swing.JComboBox<>();
        treatmentComboBox = new javax.swing.JComboBox<>();
        patientIdTextField = new javax.swing.JTextField();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        // Configurar el JComboBox para los doctores
        doctorComboBox
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor 1", "Doctor 2", "Doctor 3" }));

        // Configurar el JComboBox para los tratamientos
        treatmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(TreatmentEnum.values()));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treatmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(502, Short.MAX_VALUE)));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(treatmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(361, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
    }
}
