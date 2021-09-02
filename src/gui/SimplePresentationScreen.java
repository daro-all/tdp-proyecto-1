package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entities.Student;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lbl_lu;
	private JLabel lbl_apellido;
	private JLabel lbl_nombre;
	private JLabel lbl_email;
	private JLabel lbl_github;
	private JTextField tf_lu;
	private JTextField tf_apellido;
	private JTextField tf_nombre;
	private JTextField tf_email;
	private JTextField tf_github;
	private JLabel lbl_timeStamp;
	private JLabel lbl_foto;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);

		//Seteo de icono de aplicacion.
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/tdp.png")));
		
		setContentPane(contentPane);
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		//Seteo de layout.
		
		GridBagLayout gbl_tabInformation = new GridBagLayout();
		gbl_tabInformation.columnWidths = new int[]{0, 0, 0};
		gbl_tabInformation.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_tabInformation.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_tabInformation.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		tabInformation.setLayout(gbl_tabInformation);

		//Labels y textfields para los datos del alumno.
		
		lbl_lu = new JLabel("LU:");
		GridBagConstraints gbc_lbl_lu = new GridBagConstraints();
		gbc_lbl_lu.anchor = GridBagConstraints.EAST;
		gbc_lbl_lu.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_lu.gridx = 0;
		gbc_lbl_lu.gridy = 0;
		tabInformation.add(lbl_lu, gbc_lbl_lu);
		
		tf_lu = new JTextField( Integer.toString(studentData.getId()) );
		tf_lu.setMargin(new Insets(2, 7, 2, 2));
		tf_lu.setBackground(Color.WHITE);
		tf_lu.setEditable(false);
		GridBagConstraints gbc_tf_lu = new GridBagConstraints();
		gbc_tf_lu.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_lu.insets = new Insets(5, 0, 5, 5);
		gbc_tf_lu.gridx = 1;
		gbc_tf_lu.gridy = 0;
		tabInformation.add(tf_lu, gbc_tf_lu);
		tf_lu.setColumns(10);
		
		lbl_apellido = new JLabel("Apellido:");
		GridBagConstraints gbc_lbl_apellido = new GridBagConstraints();
		gbc_lbl_apellido.anchor = GridBagConstraints.EAST;
		gbc_lbl_apellido.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_apellido.gridx = 0;
		gbc_lbl_apellido.gridy = 1;
		tabInformation.add(lbl_apellido, gbc_lbl_apellido);
		
		tf_apellido = new JTextField(studentData.getLastName());
		tf_apellido.setMargin(new Insets(2, 7, 2, 2));
		tf_apellido.setBackground(Color.WHITE);
		tf_apellido.setEditable(false);
		GridBagConstraints gbc_tf_apellido = new GridBagConstraints();
		gbc_tf_apellido.insets = new Insets(5, 0, 5, 5);
		gbc_tf_apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_apellido.gridx = 1;
		gbc_tf_apellido.gridy = 1;
		tabInformation.add(tf_apellido, gbc_tf_apellido);
		tf_apellido.setColumns(10);
		
		lbl_nombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lbl_nombre = new GridBagConstraints();
		gbc_lbl_nombre.anchor = GridBagConstraints.EAST;
		gbc_lbl_nombre.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_nombre.gridx = 0;
		gbc_lbl_nombre.gridy = 2;
		tabInformation.add(lbl_nombre, gbc_lbl_nombre);
		
		tf_nombre = new JTextField(studentData.getFirstName());
		tf_nombre.setMargin(new Insets(2, 7, 2, 2));
		tf_nombre.setBackground(Color.WHITE);
		tf_nombre.setEditable(false);
		GridBagConstraints gbc_tf_nombre = new GridBagConstraints();
		gbc_tf_nombre.insets = new Insets(5, 0, 5, 5);
		gbc_tf_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_nombre.gridx = 1;
		gbc_tf_nombre.gridy = 2;
		tabInformation.add(tf_nombre, gbc_tf_nombre);
		tf_nombre.setColumns(10);
		
		lbl_email = new JLabel("e-mail:");
		GridBagConstraints gbc_lbl_email = new GridBagConstraints();
		gbc_lbl_email.anchor = GridBagConstraints.EAST;
		gbc_lbl_email.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_email.gridx = 0;
		gbc_lbl_email.gridy = 3;
		tabInformation.add(lbl_email, gbc_lbl_email);
		
		tf_email = new JTextField(studentData.getMail());
		tf_email.setMargin(new Insets(2, 7, 2, 2));
		tf_email.setBackground(Color.WHITE);
		tf_email.setEditable(false);
		GridBagConstraints gbc_tf_email = new GridBagConstraints();
		gbc_tf_email.insets = new Insets(5, 0, 5, 5);
		gbc_tf_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_email.gridx = 1;
		gbc_tf_email.gridy = 3;
		tabInformation.add(tf_email, gbc_tf_email);
		tf_email.setColumns(10);
		
		lbl_github = new JLabel("Github URL:");
		GridBagConstraints gbc_lbl_github = new GridBagConstraints();
		gbc_lbl_github.anchor = GridBagConstraints.EAST;
		gbc_lbl_github.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_github.gridx = 0;
		gbc_lbl_github.gridy = 4;
		tabInformation.add(lbl_github, gbc_lbl_github);
		
		tf_github = new JTextField(studentData.getGithubURL());
		tf_github.setMargin(new Insets(2, 7, 2, 2));
		tf_github.setBackground(Color.WHITE);
		tf_github.setEditable(false);
		GridBagConstraints gbc_tf_github = new GridBagConstraints();
		gbc_tf_github.insets = new Insets(5, 0, 5, 5);
		gbc_tf_github.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_github.gridx = 1;
		gbc_tf_github.gridy = 4;
		tabInformation.add(tf_github, gbc_tf_github);
		tf_github.setColumns(10);
		
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		//Seteo de imagen personal.
		
		ImageIcon ii_foto = new ImageIcon(getClass().getResource( studentData.getPathPhoto() ));
		lbl_foto = new JLabel(ii_foto, SwingConstants.CENTER);

		contentPane.add(lbl_foto, BorderLayout.EAST);

		//Seteo de fecha y hora de la ejecucion.
		
		DateTimeFormatter formato_fecha = DateTimeFormatter.ofPattern("d/M/y");
		DateTimeFormatter formato_hora = DateTimeFormatter.ofPattern("H:mm:ss");
		
		lbl_timeStamp = new JLabel("Esta ventana fue generada el " + LocalDate.now().format(formato_fecha) + " a las " + LocalTime.now().format(formato_hora));
		lbl_timeStamp.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lbl_timeStamp, BorderLayout.SOUTH);
	}
}