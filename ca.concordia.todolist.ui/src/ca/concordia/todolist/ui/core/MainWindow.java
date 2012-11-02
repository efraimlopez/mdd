package ca.concordia.todolist.ui.core;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;

import todolistdiag.FoldersManager;

public class MainWindow extends ApplicationWindow {

	/**
	 * The unique instance of the folders manager
	 */
	private static FoldersManager foldersManager = null;
	
	/**
	 * Create the application window.
	 */
	public MainWindow() {
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
		
		TreeViewer treeViewer = new TreeViewer(bodyContainer, SWT.BORDER);
		//treeViewer.setContentProvider(new FolderContentProvider());
		//treeViewer.setLabelProvider(new FolderLabelProvider());
		treeViewer.setInput(EMFManager.getInstance().getFoldersManager());
		
		Tree tree = treeViewer.getTree();
		tree.setBounds(27, 29, 200, 265);
		
		Composite buttonsContainer = new Composite(container, SWT.NONE);
		buttonsContainer.setBounds(0, 349, 853, 39);
		buttonsContainer.setLayout(null);
		
		Button addFolderButton = new Button(buttonsContainer, SWT.NONE);
		addFolderButton.setBounds(371, 10, 122, 29);
		addFolderButton.setText("Create Folder");
		
		Button deleteFolderButton = new Button(buttonsContainer, SWT.NONE);
		deleteFolderButton.setBounds(647, 10, 111, 29);
		deleteFolderButton.setText("Delete Folder");
		
		Button editFolderButton = new Button(buttonsContainer, SWT.NONE);
		editFolderButton.setBounds(511, 10, 128, 29);
		editFolderButton.setText("Edit Folder");
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(0, 329, 853, 14);

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
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
		newShell.setText("New Application");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(853, 457);
	}
}

