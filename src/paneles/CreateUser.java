/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import exceptions.DuplicateException;
import exceptions.ValueNotFoundException;
import model.Doctor;
import model.MedicalPractice;
import model.Patient;
import persistence.Persistence;

/**
 *
 * @author Samir
 */
public class CreateUser extends javax.swing.JPanel {
	public static MedicalPractice medicalPractice = new MedicalPractice();
	private static final String PATHPATIENT = "src\\persistence\\resources\\outputData\\Patients.txt";

	/**
	 * Creates new form CreateDoc
	 */
	public CreateUser() {
		medicalPractice = CreateDoc.medicalPractice;
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		cargarPatients(PATHPATIENT);
		bg = new javax.swing.JPanel();
		message = new javax.swing.JLabel();
		name = new javax.swing.JLabel();
		tfname = new javax.swing.JTextField();
		lastName = new javax.swing.JLabel();
		tflastName = new javax.swing.JTextField();
		phone = new javax.swing.JLabel();
		tfphone = new javax.swing.JTextField();
		address = new javax.swing.JLabel();
		tfaddress = new javax.swing.JTextField();
		email = new javax.swing.JLabel();
		tfemail = new javax.swing.JTextField();
		birthday = new javax.swing.JLabel();
		tfbirthday = new javax.swing.JTextField();
		jSeparator2 = new javax.swing.JSeparator();
		btnSend = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		id = new javax.swing.JLabel();
		tfid = new javax.swing.JTextField();

		bg.setBackground(new java.awt.Color(255, 255, 255));

		message.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
		message.setText("Create a Patient");

		name.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		name.setText("Name");

		tfname.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfname.setForeground(new java.awt.Color(153, 153, 153));
		tfname.setText("Enter Your Name");
		tfname.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfnameMousePressed(evt);
			}
		});

		lastName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		lastName.setText("Last Name");

		tflastName.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tflastName.setForeground(new java.awt.Color(153, 153, 153));
		tflastName.setText("Enter Your Last Name");
		tflastName.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tflastNameMousePressed(evt);
			}
		});

		phone.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		phone.setText("Phone");

		tfphone.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfphone.setForeground(new java.awt.Color(153, 153, 153));
		tfphone.setText("Enter Your Phone");
		tfphone.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfphoneMousePressed(evt);
			}
		});

		address.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		address.setText("Address");

		tfaddress.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfaddress.setForeground(new java.awt.Color(153, 153, 153));
		tfaddress.setText("Enter Your Address");
		tfaddress.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfaddressMousePressed(evt);
			}
		});

		email.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		email.setText("Email");

		tfemail.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfemail.setForeground(new java.awt.Color(153, 153, 153));
		tfemail.setText("Enter Your Email");
		tfemail.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfemailMousePressed(evt);
			}

		});

		birthday.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		birthday.setText("Birthday");

		tfbirthday.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfbirthday.setForeground(new java.awt.Color(153, 153, 153));
		tfbirthday.setText("DD/MM/AAAA");
		tfbirthday.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfbirthdayMousePressed(evt);
			}

			private void tfbirthdayMousePressed(MouseEvent evt) {
				// TODO add your handling code here:
				if (tfbirthday.getText().equals("DD/MM/AAAA")) {
					tfbirthday.setText("");
					tfbirthday.setForeground(Color.BLACK);
				}

			}
		});

		jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

		btnSend.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		btnSend.setText("Send");
		btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnSend.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSendActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
		jLabel1.setText("- Welcome, please enter the patient's data");

		id.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
		id.setText("ID");

		tfid.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
		tfid.setForeground(new java.awt.Color(153, 153, 153));
		tfid.setText("Enter Your ID");
		tfid.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tfidMousePressed(evt);
			}

			private void tfidMousePressed(MouseEvent evt) {
				// TODO add your handling code here:
				if (tfid.getText().equals("Enter Your ID")) {
					tfid.setText("");
					tfid.setForeground(Color.BLACK);
				}

			}
		});

		javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
		bg.setLayout(bgLayout);
		bgLayout.setHorizontalGroup(
				bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(bgLayout.createSequentialGroup()
								.addGap(30, 30, 30)
								.addComponent(message))
						.addGroup(bgLayout.createSequentialGroup()
								.addGap(50, 50, 50)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 829,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(bgLayout.createSequentialGroup()
								.addGap(50, 50, 50)
								.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(id)
										.addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(name)
										.addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lastName)
										.addComponent(tflastName, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(phone)
										.addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(100, 100, 100)
								.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(70, 70, 70)
								.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(address)
										.addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(email)
										.addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(birthday)
										.addComponent(tfbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(bgLayout.createSequentialGroup()
								.addGap(440, 440, 440)
								.addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		bgLayout.setVerticalGroup(
				bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(bgLayout.createSequentialGroup()
								.addGap(50, 50, 50)
								.addComponent(message)
								.addGap(18, 18, 18)
								.addComponent(jLabel1)
								.addGap(31, 31, 31)
								.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(bgLayout.createSequentialGroup()
												.addComponent(id)
												.addGap(8, 8, 8)
												.addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(25, 25, 25)
												.addComponent(name)
												.addGap(8, 8, 8)
												.addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(25, 25, 25)
												.addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(6, 6, 6)
												.addComponent(tflastName, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(25, 25, 25)
												.addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(6, 6, 6)
												.addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(bgLayout.createSequentialGroup()
												.addGap(10, 10, 10)
												.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(bgLayout.createSequentialGroup()
												.addComponent(address)
												.addGap(8, 8, 8)
												.addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(45, 45, 45)
												.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(6, 6, 6)
												.addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(45, 45, 45)
												.addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(6, 6, 6)
												.addComponent(tfbirthday, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(50, 50, 50)
								.addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}// </editor-fold>

	private void cargarPatients(String filePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(";");
				if (values.length == 7) {
					try {
						int id = Integer.parseInt(values[0]);
						String name = values[1];
						String lastName = values[2];
						String phone = values[3];
						String address = values[4];
						String email = values[5];
						String birthday = values[6];

						if (medicalPractice.findPatient(id) == -1) {
							Patient patient = new Patient(id, name, lastName, phone, address, email, birthday);
							medicalPractice.addPatient(patient);
						} else {
							JOptionPane.showMessageDialog(null, "Patient already exists.");
						}
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid ID format for doctor: " + line);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Invalid data format for doctor: " + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error reading the file.");
		}

	}

	private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String idText = tfid.getText();
			int id = Integer.parseInt(idText);
			String name = tfname.getText();
			String lastName = tflastName.getText();
			String phone = tfphone.getText();
			String address = tfaddress.getText();
			String email = tfemail.getText();
			String birthday = tfbirthday.getText();
			// Validar los campos obligatorios
			if (name.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || email.isEmpty()
					|| idText.isEmpty() || birthday.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill in all the fields");
				return;
			}

			if (medicalPractice.findPatient(id) == -1) {
				Patient patient = new Patient();
				patient.setId(id);
				patient.setName(name);
				patient.setLastName(lastName);
				patient.setPhone(phone);
				patient.setAddress(address);
				patient.setEmail(email);
				patient.setBirthday(birthday);
				medicalPractice.addPatient(patient);
				Persistence.writeFile(medicalPractice.showPatients(), PATHPATIENT);
				JOptionPane.showMessageDialog(null, "Patient created successfully");
			} else {
				Exception e = new DuplicateException("This patient already exists");
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} catch (Exception em) {
			Exception e = new ValueNotFoundException("This patient already exists");
			JOptionPane.showMessageDialog(null, em.getMessage());
		}

	}

	private void tfemailMousePressed(MouseEvent evt) {
		// TODO add your handling code here:
		if (tfemail.getText().equals("Enter Your Email")) {
			tfemail.setText("");
			tfemail.setForeground(Color.BLACK);
		}

	}

	private void tfnameMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		if (tfname.getText().equals("Enter Your Name")) {
			tfname.setText("");
			tfname.setForeground(Color.BLACK);
		}
	}

	private void tflastNameMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		if (tflastName.getText().equals("Enter Your Last Name")) {
			tflastName.setText("");
			tflastName.setForeground(Color.BLACK);
		}
	}

	private void tfphoneMousePressed(java.awt.event.MouseEvent evt) {
		if (tfphone.getText().equals("Enter Your Phone")) {
			tfphone.setText("");
			tfphone.setForeground(Color.BLACK);
		} // TODO add your handling code here:
	}

	private void tfaddressMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		if (tfaddress.getText().equals("Enter Your Address")) {
			tfaddress.setText("");
			tfaddress.setForeground(Color.BLACK);
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel address;
	private javax.swing.JPanel bg;
	private javax.swing.JLabel birthday;
	private javax.swing.JButton btnSend;
	private javax.swing.JLabel email;
	private javax.swing.JLabel id;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel lastName;
	private javax.swing.JLabel message;
	private javax.swing.JLabel name;
	private javax.swing.JLabel phone;
	private javax.swing.JTextField tfaddress;
	private javax.swing.JTextField tfbirthday;
	private javax.swing.JTextField tfemail;
	private javax.swing.JTextField tfid;
	private javax.swing.JTextField tflastName;
	private javax.swing.JTextField tfname;
	private javax.swing.JTextField tfphone;
	// End of variables declaration
}
