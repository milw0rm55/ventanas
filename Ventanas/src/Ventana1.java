import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;

public class Ventana1 extends JFrame{
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JComboBox comboBox;
	private JCheckBox chckbxPregunta;
	private ButtonGroup group;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField pwdPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana1() {
		getContentPane().setBackground(Color.ORANGE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 563, 359);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Hola");
			}
		});
		lblNombre.setBackground(Color.ORANGE);
		lblNombre.setForeground(Color.BLACK);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Con ratón");
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
				if(chckbxPregunta.isSelected()==true) {
					System.out.println("Esta seleccionada");
				}
				else {
					System.out.println("No esta seleccionada");
				}
				System.out.println(comboBox.getSelectedIndex());
				System.out.println(pwdPassword.getPassword());
			}
			
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Primera", "Segunda ", "Tercera", "Cuarta", "Quinta"}));
		
		chckbxPregunta = new JCheckBox("Pregunta");
		chckbxPregunta.setBackground(Color.ORANGE);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnMale.isSelected()) {
					System.out.println("Male");
				}
			}
		});
		buttonGroup.add(rdbtnMale);
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnFemale.isSelected()) {
					System.out.println("Female");
				}
			}
		});
		buttonGroup.add(rdbtnFemale);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
	
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(lblNombre)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxPregunta)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnMale)
									.addGap(18)
									.addComponent(rdbtnFemale))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(164)
							.addComponent(pwdPassword, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
					.addGap(68))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(472, Short.MAX_VALUE)
					.addComponent(btnAceptar)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxPregunta)
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnFemale)
								.addComponent(rdbtnMale))
							.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
							.addComponent(pwdPassword, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(39)))
					.addGap(23)
					.addComponent(btnAceptar))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);
	}
	public Color getLblNewLabelBackground() {
		return lblNombre.getBackground();
	}
	public void setLblNewLabelBackground(Color background) {
		lblNombre.setBackground(background);
	}
}