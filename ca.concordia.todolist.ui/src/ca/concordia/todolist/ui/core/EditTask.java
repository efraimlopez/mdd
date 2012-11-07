package ca.concordia.todolist.ui.core;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
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
import ca.concordia.todolist.util.EMFManager;


public class EditTask extends TitleAreaDialog {
	private Text textName;
	private Text textDescription;
	private Combo comboImportance;
	private Combo comboStatus;
	private CheckboxTreeViewer checkboxTreeViewer;
	
	private String name;
	private String description;
	private Importance importance;
	private Status status;
	private List folders;

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
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Object[] checked = checkboxTreeViewer.getCheckedElements();
				if(checked!=null){
					name = textName.getText();
					description = textDescription.getText();
					importance = Importance.getByName(comboImportance.getText());
					status = Status.getByName(comboStatus.getText());
					folders = new ArrayList();
					for(Object o : checked){
						Folder f = (Folder) o;
						folders.add(f);
					}
				}
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
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return
	 */
	public Importance getImportance() {
		return importance;
	}
	/**
	 * @param importance
	 */
	public void setImportance(Importance importance) {
		this.importance = importance;
	}
	/**
	 * @return
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return
	 */
	public List getFolders() {
		return folders;
	}
	/**
	 * @param folders
	 */
	public void setFolders(List folders) {
		this.folders = folders;
	}
	/**
	 * 
	 */
	private void preFillDialog(){
		if(name!=null)
			this.textName.setText(name);
		if(description!=null)
			this.textDescription.setText(description);
		if(importance!=null)
			this.comboImportance.setText(importance.getName());
		if(status!=null)
			this.comboStatus.setText(status.getName());
		if(folders!=null)
			this.checkboxTreeViewer.setCheckedElements(folders.toArray());
	}
	/**
	 * @return
	 */
	public boolean isValid(){
		if(name==null || name.trim().isEmpty()){
			return false;
		}
		if(folders==null || folders.size()<1){
			return false;
		}
		return true;
	}
}
