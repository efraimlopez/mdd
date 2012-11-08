package ca.concordia.todolist.ui.core;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import todolistdiag.Folder;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.util.TodolistdiagValidator;
import ca.concordia.todolist.util.EMFManager;


public class EditTask extends TitleAreaDialog {
	private Text textName;
	private Text textDescription;
	private Combo comboImportance;
	private Combo comboStatus;
	private CheckboxTreeViewer checkboxTreeViewer;
	
	private Task task;
	private boolean okFlag = false;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public EditTask(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Allows you to create or edit a task");
		setTitle("Task's Editor");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		TabFolder tabFolder = new TabFolder(container, SWT.BORDER);
		
		TabItem tbtmGeneral = new TabItem(tabFolder, SWT.NONE);
		tbtmGeneral.setText("General");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmGeneral.setControl(composite);
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setBounds(24, 29, 70, 17);
		lblName.setText("Name:");
		
		Label lblImportance = new Label(composite, SWT.NONE);
		lblImportance.setBounds(24, 63, 94, 17);
		lblImportance.setText("Importance:");
		
		Label lblStatus = new Label(composite, SWT.NONE);
		lblStatus.setBounds(24, 104, 70, 17);
		lblStatus.setText("Status:");
		
		Label lblDescription = new Label(composite, SWT.NONE);
		lblDescription.setBounds(24, 152, 94, 17);
		lblDescription.setText("Description:");
		
		textName = new Text(composite, SWT.BORDER);
		textName.setBounds(124, 29, 150, 27);
		
		textDescription = new Text(composite, SWT.BORDER);
		textDescription.setBounds(124, 142, 261, 27);
		
		comboImportance = new Combo(composite, SWT.NONE);
		comboImportance.setBounds(124, 63, 189, 29);
		for(Iterator it = Importance.VALUES.iterator(); it.hasNext(); ){
			Importance i = (Importance) it.next();
			comboImportance.add(i.getName());
		}
		
		comboStatus = new Combo(composite, SWT.NONE);
		comboStatus.setBounds(124, 104, 189, 29);
		for(Iterator it = Status.VALUES.iterator(); it.hasNext(); ){
			Status i = (Status) it.next();
			comboStatus.add(i.getName());
		}
		
		TabItem tbtmFolders = new TabItem(tabFolder, SWT.NONE);
		tbtmFolders.setText("Folders");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmFolders.setControl(composite_1);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		checkboxTreeViewer = new CheckboxTreeViewer(composite_1, SWT.BORDER);
		checkboxTreeViewer.setContentProvider(new FolderContentProvider());
		checkboxTreeViewer.setLabelProvider(new FolderLabelProvider());
		checkboxTreeViewer.setInput(EMFManager.getInstance().getToDoListManager());
		checkboxTreeViewer.expandAll();
		Tree tree = checkboxTreeViewer.getTree();
		
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
		    	  Message messageDialog = new Message(EditTask.this.getShell());
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
		return new Point(645, 393);
	}
	/**
	 * 
	 */
	private void preFillDialog(){
		if(task!=null){
			if(task.getName()!=null)
				this.textName.setText(task.getName());
			if(task.getDescription()!=null)
				this.textDescription.setText(task.getDescription());
			if(task.getImportanceLevel()!=null)
				this.comboImportance.setText(task.getImportanceLevel().getName());
			if(task.getStatus()!=null)
				this.comboStatus.setText(task.getStatus().getName());
			this.checkboxTreeViewer.setCheckedElements(task.getParentFolders().toArray());	
		}
	}
	/**
	 * @return
	 */
	public boolean isValid(DiagnosticChain diagnostics){
		Task testedTask = EMFManager.getInstance().getFactory().createTask();
		saveInput(testedTask);
		return TodolistdiagValidator.INSTANCE.validateTask(testedTask, diagnostics, null);
	}
	 /* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		 if(okFlag){
			 saveInput(task);
			 super.okPressed(); 
		 }
	}
	/**
	 * 
	 */
	private void saveInput(Task task){
		task.setName(textName.getText());
		task.setImportanceLevel(Importance.getByName(comboImportance.getText()));
		task.setStatus(Status.getByName(comboStatus.getText()));
		task.setDescription(textDescription.getText());
		List folders = new ArrayList();
		Object[] checked = checkboxTreeViewer.getCheckedElements();
		for(Object o : checked){
			Folder f = (Folder) o;
			folders.add(f);
		}
		for(Object o : task.getParentFolders()){
			Folder f = (Folder) o;
			f.getTasks().remove(task);
		}
		task.getParentFolders().removeAll(task.getParentFolders());
		task.getParentFolders().addAll(folders);
	}
	/**
	 * @param task
	 */
	public void setTask(Task task){
		this.task = task;
	}
	
}
