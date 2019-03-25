package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlMyFirstWindow;
	private Text vorname;
	private Text nachname;
	private Text PLZ;
	private Text ort;
	private Text straﬂe;
	private Text hausnummer;

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
		btnMeineErsterKnopf.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println("Maus auf " + me.x + "/" + me.y);
			}
		});
		btnMeineErsterKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Deine Daten wurden abgeschickt!");
				System.out.println(vorname.getText() + " " + nachname.getText());
				System.out.println(PLZ.getText());
				System.out.println(ort.getText());
				System.out.println(straﬂe.getText());
				System.out.println(hausnummer.getText());
			}
		});
		btnMeineErsterKnopf.setBounds(188, 199, 246, 73);
		btnMeineErsterKnopf.setText("Klick mich!");

		vorname = new Text(shlMyFirstWindow, SWT.BORDER);
		vorname.setBounds(65, 10, 185, 21);

		Label lblVorname = new Label(shlMyFirstWindow, SWT.NONE);
		lblVorname.setBounds(10, 10, 47, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachname.setBounds(10, 37, 64, 15);
		lblNachname.setText("Nachname");

		nachname = new Text(shlMyFirstWindow, SWT.BORDER);
		nachname.setBounds(75, 37, 175, 21);

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

		PLZ = new Text(shlMyFirstWindow, SWT.BORDER);
		PLZ.setBounds(39, 68, 211, 21);

		ort = new Text(shlMyFirstWindow, SWT.BORDER);
		ort.setBounds(37, 99, 213, 21);

		straﬂe = new Text(shlMyFirstWindow, SWT.BORDER);
		straﬂe.setBounds(47, 126, 203, 21);

		hausnummer = new Text(shlMyFirstWindow, SWT.BORDER);
		hausnummer.setBounds(89, 153, 161, 21);

	}
}
