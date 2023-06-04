/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import model.Bill;
import model.MedicalPractice;
import model.Patient;
import persistence.Persistence;
import model.*;


/**
 *
 * @author Samir
 */
public class CreateBillPat extends javax.swing.JPanel {
	private static final String PATHBILLPATIENT = "src\\persistence\\resources\\outputBillsPatients\\";
	public static MedicalPractice medicalPractice = new MedicalPractice();
	public static Bill bill = new Bill();

	/**
	 * Creates new form CreateBillPat
	 */
	public CreateBillPat() {
		medicalPractice = CreateUser.medicalPractice;
		try {
			initComponents();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 *
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() throws IOException {

		bg = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		idDoc = new javax.swing.JLabel();
		idPat = new javax.swing.JLabel();
		tfidPat = new javax.swing.JTextField();
		btnCheck = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox<>();
		specialitys = new javax.swing.JComboBox<>();
		idPat1 = new javax.swing.JLabel();

		bg.setBackground(new java.awt.Color(255, 255, 255));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null } },
				new String[] { "ID Patient", "Name", "Last Name", "Number Bill", "Bill Date", "Amount", "Treatment" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
		jLabel1.setText("Patient Bill");

		idDoc.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		idDoc.setText("Doctor");

		idPat.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		idPat.setText("Treatment");

		tfidPat.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfidPat.setForeground(new java.awt.Color(153, 153, 153));
		tfidPat.setText("Enter ID Patient");
		tfidPat.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfidPatMousePressed(evt);
			}
		});

		btnCheck.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		btnCheck.setText("Check");
		btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnCheckMouseClicked(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
				getDoctorNames("src/persistence/resources/outputData/Doctors.txt")));

		specialitys.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		specialitys.setModel(new javax.swing.DefaultComboBoxModel<>(TreatmentEnum.values()));

		specialitys.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				specialitysActionPerformed(evt);
			}
		});

		idPat1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		idPat1.setText("ID Patient");

		javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
		bg.setLayout(bgLayout);
		bgLayout.setHorizontalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bgLayout.createSequentialGroup().addGap(80, 80, 80).addComponent(jLabel1))
				.addGroup(bgLayout.createSequentialGroup().addGap(80, 80, 80).addComponent(idDoc).addGap(262, 262, 262)
						.addComponent(idPat1).addGap(237, 237, 237).addComponent(idPat))
				.addGroup(bgLayout.createSequentialGroup().addGap(80, 80, 80)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addComponent(tfidPat, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40).addComponent(specialitys, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(bgLayout.createSequentialGroup().addGap(490, 490, 490).addComponent(btnCheck,
						javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(bgLayout.createSequentialGroup().addGap(90, 90, 90).addComponent(jScrollPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)));
		bgLayout.setVerticalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bgLayout.createSequentialGroup().addGap(30, 30, 30).addComponent(jLabel1).addGap(31, 31, 31)
						.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(idDoc).addComponent(idPat1).addComponent(idPat))
						.addGap(8, 8, 8)
						.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfidPat, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(specialitys, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(50, 50, 50)
						.addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}// </editor-fold>

	public String[] getDoctorNames(String filePath) throws IOException {
		List<String> doctorNames = new ArrayList<>();
		String[] lines = Files.readAllLines(Paths.get(filePath)).toArray(new String[0]);

		for (String line : lines) {
			String[] parts = line.split(";");

			if (parts.length >= 3) {
				String doctorName = parts[1].trim();
				doctorNames.add(doctorName);
			}
		}

		return doctorNames.toArray(new String[0]);
	}

	private void tfidPatMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		if (tfidPat.getText().equals("Enter ID Patient")) {
			tfidPat.setText("");
			tfidPat.setForeground(Color.BLACK);
		}
	}

	private void btnCheckMouseClicked(java.awt.event.MouseEvent evt) {
		Patient patient = existUser();
		// Verificar si el paciente existe
		if (patient != null) {
			// Actualizar los valores en la tabla
			jTable1.setValueAt(patient.getId(), 0, 0); // ID Patient
			jTable1.setValueAt(patient.getName(), 0, 1); // Name
			jTable1.setValueAt(patient.getLastName(), 0, 2); // Last Name
			jTable1.setValueAt(specialitys.getSelectedItem().toString(), 0, 6); // Treatment Selected
			ImprimirFactura(generateBill());
		}
	}

	private void specialitysActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String message = "Select the specialty";
		message = message + specialitys.getSelectedItem().toString();
	}

	private Patient existUser() {
		Patient patient = new Patient();
		int exist = medicalPractice.findPatient(Integer.parseInt(tfidPat.getText()));
		if (exist != -1) {
			patient = medicalPractice.getPatients().get(exist);
		} else {
			JOptionPane.showMessageDialog(null, "Patient does not exists.");
		}
		return patient;

	}
	

	private Bill generateBill() {
	    Patient patient = existUser();
	    
	    if (patient != null) {
	        // Obtener el n�mero de factura
	        int numberBill = medicalPractice.getBills().size() + 1;
	        
	        // Obtener el monto y el tratamiento seleccionado
	        double amount = 0.0;
	        TreatmentEnum treatment = (TreatmentEnum) specialitys.getSelectedItem(); 
	        amount = treatment.getAmount();
	        // Crear la factura
	        bill = new Bill(numberBill, patient, amount, treatment, bill.getConsultationDate());
	        // Agregar la factura a la pr�ctica m�dica
	        medicalPractice.addBill(bill);
	        // Actualizar la tabla
	        jTable1.setValueAt(numberBill, 0, 3); // Number Bill
	        jTable1.setValueAt(bill.getConsultationDate(), 0, 4); // Bill Date
	        jTable1.setValueAt(amount, 0, 5); // Amount
	        
	        return bill;
	    }
	    
	    return null;
	}
	
	private void ImprimirFactura(Bill bill) {
	  String bag = "\t**********\t	BILL PATIENT  " + bill.getPatient().getId() + " "
              + bill.getPatient().getName()
              + "\t" + bill.getPatient().getLastName() + " \t **********\t\n"
              + "Number Bill: " + bill.getNumberBill() + "\n"
              + "Bill Date: " + bill.getConsultationDate() + "\n"
              + "Data patient: " + bill.getPatient().toString() + "\n"
              + "Amount: " + bill.getAmount() + "\n"
              + "Treatment: " + bill.getTreatment()
              + " was the best." + "\nSee you later";
	  Persistence.writeFile(bag, this.generatePathBill(bill));
	}

    private String generatePathBill(Bill bill) {
        String formattedDate = bill.getConsultationDate().replaceAll(":", "-");
        return PATHBILLPATIENT +
                bill.getPatient().getId() + "__" +
                bill.getNumberBill() + "__" +
                formattedDate + "__" +
                bill.getPatient().getLastName() + "__" +
                bill.getPatient().getName();
    }

	// Variables declaration - do not modify
	private javax.swing.JPanel bg;
	private javax.swing.JButton btnCheck;
	private javax.swing.JLabel idDoc;
	private javax.swing.JLabel idPat;
	private javax.swing.JLabel idPat1;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<TreatmentEnum> specialitys;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField tfidPat;
	// End of variables declaration
}
