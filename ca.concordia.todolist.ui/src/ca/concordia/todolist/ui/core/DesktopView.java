package ca.concordia.todolist.ui.core;

import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;

import todolistdiag.Folder;
import todolistdiag.SortingType;
import todolistdiag.Task;
import ca.concordia.todolist.util.EMFManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class DesktopView extends ApplicationWindow {

	/**
	 * the treeviwer in charge of showing the list of folders
	 */
	private TreeViewer treeViewer;
	/**
	 * the tableviewer in charge of showing the list of tasks
	 */
	private TableViewer tableViewer;
	/**
	 * action that allows to open the folder creation panel
	 */
	private Action addFolderAction;
	/**
	 * action that allows to edit a folder
	 */
	private Action editFolderAction;
	/**
	 * action that allows to remove a folder
	 */
	private Action removeFolderAction;

	/**
	 * action that allows to open the task creation panel
	 */
	private Action addTaskAction;
	/**
	 *  action that allows to edit a task
	 */
	private Action editTaskAction;
	/**
	 * action that allows to remove a task
	 */
	private Action removeTaskAction;
	/**
	 * the table being managed by the tableviewer
	 */
	private Table table;
	
	/**
	 * Create the application window.
	 */
	public DesktopView() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		Composite bodyContainer = new Composite(container, SWT.NONE);
		bodyContainer.setBounds(0, 0, 853, 323);
		
		treeViewer = new TreeViewer(bodyContainer, SWT.BORDER);
		treeViewer.setContentProvider(new FolderContentProvider());
		treeViewer.setLabelProvider(new FolderLabelProvider());
		treeViewer.setInput(EMFManager.getInstance().getToDoListManager());
		treeViewer.expandAll();
		
		Tree tree = treeViewer.getTree();
		tree.setLinesVisible(true);
		tree.setBounds(27, 29, 234, 265);
		
		Label label_1 = new Label(bodyContainer, SWT.SEPARATOR | SWT.VERTICAL);
		label_1.setBounds(287, 10, 8, 303);
		
		tableViewer = new TableViewer(bodyContainer, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new TaskContentProvider(EMFManager.getInstance().getToDoListManager()));
		tableViewer.setLabelProvider(new TaskLabelProvider());
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setBounds(315, 29, 528, 265);
		
		TableColumn columnName = new TableColumn(table, SWT.NONE);
		columnName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				Folder folder = (Folder) selection.getFirstElement();
				EMFManager.getInstance().getToDoListManager().sortTasks(SortingType.BY_NAME_LITERAL,folder);
			}
		});
		columnName.setWidth(100);
		columnName.setText("Name");
		
		TableColumn columnImportance = new TableColumn(table, SWT.NONE);
		columnImportance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				Folder folder = (Folder) selection.getFirstElement();
				EMFManager.getInstance().getToDoListManager().sortTasks(SortingType.BY_IMPORTANCE_LITERAL,folder);
			}
		});
		columnImportance.setWidth(100);
		columnImportance.setText("Importance");
		
		TableColumn columnStatus = new TableColumn(table, SWT.NONE);
		columnStatus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				Folder folder = (Folder) selection.getFirstElement();
				EMFManager.getInstance().getToDoListManager().sortTasks(SortingType.BY_STATUS_LITERAL,folder);
			}
		});
		columnStatus.setWidth(100);
		columnStatus.setText("Status");
		
		TableColumn columnDescription = new TableColumn(table, SWT.NONE);
		columnDescription.setWidth(100);
		columnDescription.setText("Description");
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(0, 329, 853, 14);
		
		Button moveUp = new Button(container, SWT.NONE);
		moveUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				IStructuredSelection selectionF = (IStructuredSelection) treeViewer.getSelection();
				Folder folder = (Folder) selectionF.getFirstElement();
				IStructuredSelection selectionT = (IStructuredSelection) tableViewer.getSelection();
				Task task = (Task)selectionT.getFirstElement();
				if(folder!=null && task!=null){
					EMFManager.getInstance().getToDoListManager().moveTask(task,folder,true);
				}
			}
		});
		moveUp.setText("<");
		moveUp.setBounds(859, 76, 32, 29);
		
		Button moveDown = new Button(container, SWT.NONE);
		moveDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				IStructuredSelection selectionF = (IStructuredSelection) treeViewer.getSelection();
				Folder folder = (Folder) selectionF.getFirstElement();
				IStructuredSelection selectionT = (IStructuredSelection) tableViewer.getSelection();
				Task task = (Task)selectionT.getFirstElement();
				if(folder!=null && task!=null){
					EMFManager.getInstance().getToDoListManager().moveTask(task,folder,false);
				}
			}
		});
		moveDown.setText(">");
		moveDown.setBounds(859, 130, 32, 29);
		
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				// if the selection is empty clear the label
				if(event.getSelection().isEmpty()) {
					tableViewer.setInput(null);
					return;
				}
				if(event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection)event.getSelection();
					for (Iterator<Folder> iterator = selection.iterator(); iterator.hasNext();) {
						Folder domain = iterator.next();
						//we need to update the task table here
						tableViewer.setInput(domain);
						break;
					}
				}
			}
		});	
		createMenuManagerFolder();
		createMenuManagerTask();
		parent.layout();
		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		addFolderAction = new Action(){
			@Override
			public String getText(){
				return "Add Subfolder";
			}
			@Override
			public void run(){
				IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				Folder parentFolder = (Folder)selection.getFirstElement();
				EditFolder dialog = new EditFolder(DesktopView.this.getShell());
				Folder mementoFolder = EMFManager.getInstance().getFactory().createFolder();
				mementoFolder.setParent(parentFolder);
				dialog.setFolder(mementoFolder);
				if(dialog.open()==Window.OK)
					EMFManager.getInstance()
						.getToDoListManager()
						.createFolder(mementoFolder.getName(), parentFolder);
			}
		};
		removeFolderAction = new Action(){
			@Override
			public String getText(){
				return "Remove Subfolder";
			}
			@Override
			public void run(){
				IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				Folder folder = (Folder)selection.getFirstElement();
				EMFManager.getInstance().getToDoListManager().deleteFolder(folder);
			}			
		};
		editFolderAction = new Action(){
			@Override
			public String getText(){
				return "Edit Subfolder";
			}
			@Override
			public void run(){
				IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
				Folder folder = (Folder)selection.getFirstElement();
				EditFolder dialog = new EditFolder(DesktopView.this.getShell());
				dialog.setFolder(folder);
				if(dialog.open() == Window.OK){
					EMFManager.getInstance().getToDoListManager().editFolder(folder);	
				}
			}			
		};
		addTaskAction = new Action(){
			@Override
			public String getText(){
				return "Add Task";
			}
			@Override
			public void run(){
				EditTask dialog = new EditTask(DesktopView.this.getShell()); 
				Task mementoTask = EMFManager.getInstance().getFactory().createTask();
				dialog.setTask(mementoTask);
				if(dialog.open() == Window.OK)
					EMFManager.getInstance()
						.getToDoListManager()
						.createTask(mementoTask.getName(), 
									mementoTask.getImportanceLevel(), 
									mementoTask.getStatus(), 
									mementoTask.getDescription(),
									mementoTask.getAssociatedFolders());
			}
		};
		editTaskAction = new Action(){
			@Override
			public String getText(){
				return "Edit Task";
			}
			@Override
			public void run(){		
				IStructuredSelection selection = (IStructuredSelection)tableViewer.getSelection();
				Task task = (Task)selection.getFirstElement();
				Task clone = task.clone();
				EditTask dialog = new EditTask(DesktopView.this.getShell());
				dialog.setTask(clone);
				if(dialog.open() == Window.OK){
					EMFManager.getInstance().getToDoListManager().editTask(task,clone);
				}
			}
		};
		removeTaskAction = new Action(){
			@Override
			public String getText(){
				return "Remove Task";
			}
			@Override
			public void run(){
				IStructuredSelection selection = (IStructuredSelection)tableViewer.getSelection();
				Task task = (Task)selection.getFirstElement();
				EMFManager.getInstance().getToDoListManager().deleteTask(task);
			}
		};
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuMgr = new MenuManager("menu");
		return menuMgr;
	}
	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	protected MenuManager createMenuManagerFolder() {
		MenuManager menuMgr = new MenuManager("menu2");
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				if(treeViewer.getSelection().isEmpty()) {
					return;
				}
				if(treeViewer.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
					Folder folder = (Folder)selection.getFirstElement();
					if (folder.getParent()==null){
						manager.add(addFolderAction);
					}else{
						manager.add(addFolderAction);
						manager.add(editFolderAction);
						manager.add(removeFolderAction);
					}
				}
			}
		});
		menuMgr.setRemoveAllWhenShown(true);
		treeViewer.getControl().setMenu(menu);
		return menuMgr;
	}
	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	protected MenuManager createMenuManagerTask() {
		MenuManager menuMgr = new MenuManager("menu3");
		Menu menu = menuMgr.createContextMenu(tableViewer.getControl());
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				if(tableViewer.getSelection().isEmpty()) {
					manager.add(addTaskAction);
					return;
				}
				if(tableViewer.getSelection() instanceof IStructuredSelection) {
					manager.add(addTaskAction);
					manager.add(editTaskAction);
					manager.add(removeTaskAction);
				}
			}
		});
		menuMgr.setRemoveAllWhenShown(true);
		tableViewer.getControl().setMenu(menu);
		return menuMgr;
	}
	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setSize(900, 400);
		newShell.setText("@ToDoList App");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(951, 509);
	}
}
