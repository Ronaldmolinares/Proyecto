package paneles;

import model.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import model.TreatmentEnum;

public class CreateBillPat extends javax.swing.JPanel {
    public static MedicalPractice medicalPractice = new MedicalPractice();
    public static Bill bill = new Bill();

    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JComboBox<TreatmentEnum> treatmentComboBox;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel treatmentLabel;
    private javax.swing.JLabel patientIdLabel;

    public CreateBillPat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        bg = new javax.swing.JPanel();
        doctorComboBox = new javax.swing.JComboBox<>();
        treatmentComboBox = new javax.swing.JComboBox<>();
        patientIdTextField = new javax.swing.JTextField();
        doctorLabel = new javax.swing.JLabel();
        treatmentLabel = new javax.swing.JLabel();
        patientIdLabel = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        // Configurar el JComboBox para los doctores
        doctorComboBox
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor 1", "Doctor 2", "Doctor 3" }));

        // Configurar el JComboBox para los tratamientos
        treatmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(TreatmentEnum.values()));

        doctorLabel.setText("Seleccione un doctor:");
        treatmentLabel.setText("Seleccione un tratamiento:");
        patientIdLabel.setText("Digite el ID del paciente:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(doctorLabel)
                                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(treatmentLabel)
                                        .addComponent(treatmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientIdLabel)
                                        .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(358, Short.MAX_VALUE)));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(doctorLabel)
                                        .addComponent(treatmentLabel)
                                        .addComponent(patientIdLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treatmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(428, Short.MAX_VALUE)));

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
