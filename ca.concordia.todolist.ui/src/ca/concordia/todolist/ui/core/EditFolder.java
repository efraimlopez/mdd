package ca.concordia.todolist.ui.core;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import todolistdiag.Folder;
import todolistdiag.util.TodolistdiagValidator;
import ca.concordia.todolist.util.EMFManager;

public class EditFolder extends TitleAreaDialog {
	private Text text;

	private Folder folder;
	private boolean okFlag = false;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public EditFolder(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Folder's Editor");
		setMessage("Allows you to create or edit a folder");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(26, 62, 94, 27);
		lblNewLabel.setText("Folder Name");
		
		text = new Text(container, SWT.BORDER);
		text.setBounds(131, 62, 263, 27);

		preFillDialog();
		parent.layout();
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		button.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DiagnosticChain diagnosticChain = new BasicDiagnostic();
	          if (isValid(diagnosticChain)) {
	        	    okFlag = true;
		            okPressed();
		      }else{
		    	  Message messageDialog = new Message(EditFolder.this.getShell());
		    	  messageDialog.setMessage(Util.getErrorMessage(diagnosticChain));
		    	  messageDialog.open();
		      }			
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
	
	private void preFillDialog(){
		if(folder!=null){
			if(folder.getName()!=null)
				this.text.setText(folder.getName());	
		}
	}
	/**
	 * @return
	 */
	public boolean isValid(DiagnosticChain diagnostics){
		Folder testedFolder = EMFManager.getInstance().getFactory().createFolder();
		testedFolder.setParent(folder.getParent());
		saveInput(testedFolder);
		return TodolistdiagValidator.INSTANCE.validateFolder(testedFolder, diagnostics, null);
	}
	 /* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		 if(okFlag){
			 saveInput(folder);
			 super.okPressed(); 
		 }
	}
	/**
	 * 
	 */
	private void saveInput(Folder folder){
		folder.setName(text.getText());
	}
	/**
	 * @param folder
	 */
	public void setFolder(Folder folder){
		this.folder = folder;
	}
}
