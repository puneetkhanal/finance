package com.finance.ui.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import com.finance.interfaces.IDataSet;

public abstract class AbstractMainView extends JFrame {

	private JButton reportButton;
	private IUIFactory uiFactory;
	private AbstractDynamicPanel crPanel;
	private AbstractDynamicPanel trPanel;
	protected Vector<String> columnNames;
	protected JTable table;
	private List<IDataSet> dataList;

	public AbstractMainView(String title, IUIFactory uiFactory) {
		this.uiFactory = uiFactory;
		crPanel = uiFactory.createCRPanel();
		trPanel = uiFactory.createTRPanel();
		reportButton = uiFactory.createReportButton();
		setTitle(title);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		setSize(575, 310);
		setVisible(false);
		JPanel operationsPanel = new JPanel();
		operationsPanel.setSize(500, 10);
		operationsPanel.setLayout(new BoxLayout(operationsPanel,
				BoxLayout.X_AXIS));
		operationsPanel.add(crPanel);
		operationsPanel.add(reportButton);
		// operationsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		this.getContentPane().add(operationsPanel);

		columnNames = new Vector<String>();
		columnNames.addElement("Name");
		columnNames.addElement("Account Number");
		columnNames.addElement("Balance");
		table = new JTable(new Vector<String>(), columnNames);
		DefaultTableModel model = new DefaultTableModel(new Vector<String>(), columnNames);

		table.setModel(model);
		table.setPreferredScrollableViewportSize(new Dimension(400, 100));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);

		JPanel tablePanel = new JPanel();
		tablePanel.add(scrollPane);
		tablePanel.add(trPanel);
		this.getContentPane().add(tablePanel);
	}

	public AbstractDynamicPanel getCRPanel() {
		return crPanel;
	}

	public AbstractDynamicPanel getTRPanel() {
		return trPanel;
	}

	public void setUIFactory(IUIFactory uiFactory) {
		this.uiFactory = uiFactory;
	}

	public JButton getReportButton() {
		return reportButton;
	}

	public void setTableModel(List<IDataSet> datasetList) {
		this.dataList = datasetList;
		Vector<Vector<String>> vector = new Vector<>();
		for (IDataSet data : datasetList) {
			vector.add(data.toVector());
		}
		DefaultTableModel model = new DefaultTableModel(vector, columnNames);
		table.setModel(model);
	}

	public int getAccountNumber() {
		if (dataList != null && table.getSelectedRow() >= 0) {
			int accNumber = (int) dataList.get(table.getSelectedRow())
					.getData();

			return accNumber;
		} else {
			return 0;
		}
	}
}
