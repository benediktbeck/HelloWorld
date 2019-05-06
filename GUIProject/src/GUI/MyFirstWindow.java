package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.osgi.container.SystemModule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import data.Person;

import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlMyFirstWindow;
	private Text vornameTF;
	private Text nachnameTF;
	private Text PLZTF;
	private Text ortTF;
	private Text straﬂeTF;
	private Text hausnummerTF;
	private Label lblVornameOut;
	private Label lblNachnameOut;
	private Label lblPLZOut;
	private Label lblOrtOut;
	private Label lblStraﬂeOut;
	private Label lblHausnummerOut;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMyFirstWindow.open();
		shlMyFirstWindow.layout();
		while (!shlMyFirstWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMyFirstWindow = new Shell();
		shlMyFirstWindow.setSize(460, 321);
		shlMyFirstWindow.setText("BB Window");

		Button btnMeineErsterKnopf = new Button(shlMyFirstWindow, SWT.NONE);
		
		btnMeineErsterKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Deine Daten wurden abgeschickt!");
				System.out.println("Name: " + vornameTF.getText() + " " + nachnameTF.getText());
				System.out.println("Postleitzahl: " + PLZTF.getText());
				System.out.println("Wohnort: " + ortTF.getText());
				System.out.println("Straﬂe: " + straﬂeTF.getText());
				System.out.println("Hausnummer: " + hausnummerTF.getText());

				getVornameOut().setText(vornameTF.getText());
				getNachnameOut().setText(nachnameTF.getText());
				getPLZOut().setText(PLZTF.getText());
				getOrtOut().setText(ortTF.getText());
				getStraﬂeOut().setText(straﬂeTF.getText());
				getHausnummerOut().setText(hausnummerTF.getText());
			}
		});
		btnMeineErsterKnopf.setBounds(188, 199, 246, 73);
		btnMeineErsterKnopf.setText("Absenden");

		vornameTF = new Text(shlMyFirstWindow, SWT.BORDER);
		vornameTF.setBounds(65, 10, 185, 21);

		Label lblVorname = new Label(shlMyFirstWindow, SWT.NONE);
		lblVorname.setBounds(10, 10, 47, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachname.setBounds(10, 37, 64, 15);
		lblNachname.setText("Nachname");

		nachnameTF = new Text(shlMyFirstWindow, SWT.BORDER);
		nachnameTF.setBounds(75, 37, 175, 21);

		Label lblPlz = new Label(shlMyFirstWindow, SWT.NONE);
		lblPlz.setBounds(10, 71, 25, 15);
		lblPlz.setText("PLZ");

		Label lblOrt = new Label(shlMyFirstWindow, SWT.NONE);
		lblOrt.setBounds(10, 102, 25, 15);
		lblOrt.setText("Ort");

		Label lblStrae = new Label(shlMyFirstWindow, SWT.NONE);
		lblStrae.setBounds(10, 129, 33, 15);
		lblStrae.setText("Stra\u00DFe");

		Label lblHausnummer = new Label(shlMyFirstWindow, SWT.NONE);
		lblHausnummer.setBounds(10, 153, 73, 15);
		lblHausnummer.setText("Hausnummer");

		PLZTF = new Text(shlMyFirstWindow, SWT.BORDER);
		PLZTF.setBounds(39, 68, 211, 21);

		ortTF = new Text(shlMyFirstWindow, SWT.BORDER);
		ortTF.setBounds(37, 99, 213, 21);

		straﬂeTF = new Text(shlMyFirstWindow, SWT.BORDER);
		straﬂeTF.setBounds(47, 126, 203, 21);

		hausnummerTF = new Text(shlMyFirstWindow, SWT.BORDER);
		hausnummerTF.setBounds(89, 153, 161, 21);

		lblVornameOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblVornameOut.setBounds(292, 10, 123, 21);

		lblNachnameOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachnameOut.setBounds(292, 37, 123, 21);

		lblPLZOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblPLZOut.setBounds(292, 68, 123, 21);

		lblOrtOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblOrtOut.setBounds(292, 102, 123, 21);

		lblStraﬂeOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblStraﬂeOut.setBounds(292, 126, 123, 21);

		lblHausnummerOut = new Label(shlMyFirstWindow, SWT.NONE);
		lblHausnummerOut.setBounds(292, 153, 123, 21);
		
		Button btnSaveClean = new Button(shlMyFirstWindow, SWT.NONE);
		btnSaveClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p; // Variablen-Definition
				p = new Person(); // Variablen-Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				//
				System.out.println(p);
			}
		});
		btnSaveClean.setBounds(10, 247, 111, 25);
		btnSaveClean.setText("Save and Clean");

	}

	public Label getVornameOut() {
		return lblVornameOut;
	}

	public Label getNachnameOut() {
		return lblNachnameOut;
	}

	public Label getPLZOut() {
		return lblPLZOut;
	}

	public Label getOrtOut() {
		return lblOrtOut;
	}

	public Label getStraﬂeOut() {
		return lblStraﬂeOut;
	}

	public Label getHausnummerOut() {
		return lblHausnummerOut;
	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getPLZTF() {
		return PLZTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
	public Text getStraﬂeTF() {
		return straﬂeTF;
	}
	public Text getHausnummerTF() {
		return hausnummerTF;
	}
}
