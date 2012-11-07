package ca.concordia.todolist.ui.core;

import java.util.Iterator;

import org.eclipse.jface.action.AbstractAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
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
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;

import ca.concordia.todolist.util.EMFManager;

import todolistdiag.Folder;
import todolistdiag.Task;
import todolistdiag.ToDoListManager;
import org.eclipse.swt.widgets.MenuItem;

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
		columnName.setWidth(100);
		columnName.setText("Name");
		
		TableColumn columnImportance = new TableColumn(table, SWT.NONE);
		columnImportance.setWidth(100);
		columnImportance.setText("Importance");
		
		TableColumn columnStatus = new TableColumn(table, SWT.NONE);
		columnStatus.setWidth(100);
		columnStatus.setText("Status");
		
		TableColumn columnDescription = new TableColumn(table, SWT.NONE);
		columnDescription.setWidth(100);
		columnDescription.setText("Description");
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(0, 329, 853, 14);
		
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
				//EditFolder dialog = new EditFolder(DesktopView.this.getShell(),DesktopView.this.getShellStyle()); 
				//String folderName = (String) dialog.open();
				EditFolder2 dialog = new EditFolder2(DesktopView.this.getShell());
				if(dialog.open()==Window.OK && dialog.getFolderName()!=null)
					EMFManager.getInstance()
						.getToDoListManager()
						.createFolder(dialog.getFolderName(), parentFolder);
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
				EditFolder2 dialog = new EditFolder2(DesktopView.this.getShell());
				if(dialog.open()==Window.OK && dialog.getFolderName()!=null){
					folder.setName(dialog.getFolderName());
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
				if(dialog.open() == Window.OK && dialog.isValid())
					EMFManager.getInstance()
						.getToDoListManager()
						.createTask(dialog.getName(), 
									dialog.getImportance(), 
									dialog.getStatus(), 
									dialog.getDescription(),
									dialog.getFolders());
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
				EditTask dialog = new EditTask(DesktopView.this.getShell());
				dialog.setName(task.getName());
				dialog.setImportance(task.getImportanceLevel());
				dialog.setStatus(task.getStatus());
				dialog.setDescription(task.getDescription());
				dialog.setFolders(task.getParentFolders());
				if(dialog.open() == Window.OK && dialog.isValid()){
					task.setName(dialog.getName());
					task.setImportanceLevel(dialog.getImportance());
					task.setStatus(dialog.getStatus());
					task.setDescription(dialog.getDescription());
					for(Object o : task.getParentFolders()){
						Folder f = (Folder) o;
						f.getTasks().remove(task);
					}
					task.getParentFolders().removeAll(task.getParentFolders());
					task.getParentFolders().addAll(dialog.getFolders());
					EMFManager.getInstance().getToDoListManager().editTask(task);
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
