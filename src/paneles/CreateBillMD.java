package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import model.MedicalPractice;
import persistence.Persistence;

public class CreateBillMD extends javax.swing.JPanel {
	private static final String PATHBILLSCONSULTORY = "src\\persistence\\resources\\outputBillsMedicalPractice\\BILLSCONSULTORY.txt";
	private javax.swing.JButton btnGenerarFactura;
	private MedicalPractice medicalPractice = new MedicalPractice();

	private Persistence persistence = new Persistence();

	public CreateBillMD() throws IOException {
		initComponents();
		medicalPractice = (CreateBillPat.medicalPractice);
	}

	public String[][] parseText(String filePath) throws IOException {
		String text = new String(Files.readAllBytes(Paths.get(filePath)));
		String[] lines = text.split("\n");
		String[][] matrix = new String[lines.length][7];

		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			String[] parts = line.split(";");

			for (int j = 0; j < 7; j++) {
				if (j < parts.length) {
					matrix[i][j] = parts[j].trim();
				} else {
					matrix[i][j] = null;
				}
			}
		}

		return matrix;
	}

	@SuppressWarnings("unchecked")
	private void initComponents() throws IOException {
		bg = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();

		bg.setBackground(new java.awt.Color(255, 255, 255));
		bg.setPreferredSize(new java.awt.Dimension(772, 497));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				parseText(PATHBILLSCONSULTORY),
				new String[] { "Number Bill", "Id Patient", "Name Patient", "Phone Patient", "Treatment", "Amount",
						"Consultation Date" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24));
		jLabel1.setText("Medical Practice billing history");

		// Crear y configurar el botón
		btnGenerarFactura = new javax.swing.JButton();
		btnGenerarFactura.setText("Generar Factura");
		btnGenerarFactura.setBounds(bg.getWidth() - 150, 20, 130, 30);

		btnGenerarFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al método writeFile al presionar el botón
				writeFile(medicalPractice.showBills(), PATHBILLSCONSULTORY);
			}
		});

		javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
		bg.setLayout(bgLayout);
		bgLayout.setHorizontalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bgLayout.createSequentialGroup().addGap(70, 70, 70)
						.addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGenerarFactura))));

		bgLayout.setVerticalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bgLayout.createSequentialGroup().addGap(50, 50, 50)
						.addComponent(jLabel1).addGap(21, 21, 21)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnGenerarFactura)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE));
	}

	private void writeFile(String content, String path) {
		Persistence.writeFile(content, path);
	}

	private javax.swing.JPanel bg;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
}
