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

	/**
	 * Launch the application.
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
		shlMyFirstWindow.setSize(450, 300);
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
				System.out.println("Du hast es geschafft einen Knopf zu drücken! Shampoo!");
				System.out.println(vorname.getText() + nachname.getText());
			}
		});
		btnMeineErsterKnopf.setBounds(10, 10, 246, 73);
		btnMeineErsterKnopf.setText("Meine erster Knopf \\o/");
		
		vorname = new Text(shlMyFirstWindow, SWT.BORDER);
		vorname.setBounds(71, 94, 185, 21);
		
		Label lblVorname = new Label(shlMyFirstWindow, SWT.NONE);
		lblVorname.setBounds(10, 94, 55, 15);
		lblVorname.setText("Vorname");
		
		Label lblNachname = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachname.setBounds(10, 121, 64, 15);
		lblNachname.setText("Nachname");
		
		nachname = new Text(shlMyFirstWindow, SWT.BORDER);
		nachname.setBounds(81, 121, 153, 21);

	}
}
