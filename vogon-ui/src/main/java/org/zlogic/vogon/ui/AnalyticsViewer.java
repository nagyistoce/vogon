/*
 * Vogon personal finance/expense analyzer.
 * License TBD.
 * Author: Dmitry Zolotukhin <zlogic@gmail.com>
 */
package org.zlogic.vogon.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.zlogic.vogon.analytics.Report;
import org.zlogic.vogon.data.FinanceAccount;
import org.zlogic.vogon.data.FinanceData;

/**
 * Form for viewing analytics reports
 *
 * @author Dmitry Zolotukhin
 */
public class AnalyticsViewer extends javax.swing.JPanel {

	private static final ResourceBundle messages = ResourceBundle.getBundle("org/zlogic/vogon/ui/messages");

	/**
	 * Creates new form AnalyticsViewer
	 */
	public AnalyticsViewer() {
		initComponents();
		initCustomComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStartDate = new javax.swing.JLabel();
        jLabelEndDate = new javax.swing.JLabel();
        jFormattedTextFieldStartDate = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEndDate = new javax.swing.JFormattedTextField();
        jLabelTags = new javax.swing.JLabel();
        jTextFieldTags = new javax.swing.JTextField();
        jCheckBoxExpenseTransactions = new javax.swing.JCheckBox();
        jCheckBoxTransferTransactions = new javax.swing.JCheckBox();
        jScrollPaneAccounts = new javax.swing.JScrollPane();
        jTableAccounts = new javax.swing.JTable();
        jScrollPaneTags = new javax.swing.JScrollPane();
        jTableTags = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        jLabelStartDate.setLabelFor(jFormattedTextFieldStartDate);
        jLabelStartDate.setText(messages.getString("START_DATE")); // NOI18N

        jLabelEndDate.setLabelFor(jFormattedTextFieldEndDate);
        jLabelEndDate.setText(messages.getString("END_DATE")); // NOI18N

        jFormattedTextFieldStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jFormattedTextFieldEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabelTags.setLabelFor(jTextFieldTags);
        jLabelTags.setText("Tags");

        jCheckBoxExpenseTransactions.setSelected(true);
        jCheckBoxExpenseTransactions.setText(messages.getString("EXPENSE_TRANSACTIONS")); // NOI18N

        jCheckBoxTransferTransactions.setText(messages.getString("TRANSFER_TRANSACTIONS")); // NOI18N

        jTableAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Account", "Show"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAccounts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPaneAccounts.setViewportView(jTableAccounts);

        jTableTags.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag", "Show"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTags.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPaneTags.setViewportView(jTableTags);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelStartDate)
                                    .addComponent(jLabelEndDate))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTags)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTags, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBoxTransferTransactions)
                    .addComponent(jCheckBoxExpenseTransactions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTags, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStartDate)
                            .addComponent(jFormattedTextFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEndDate)
                            .addComponent(jFormattedTextFieldEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTags)
                            .addComponent(jTextFieldTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxTransferTransactions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxExpenseTransactions))
                    .addComponent(jScrollPaneTags, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jButton1.setText(messages.getString("GENERATE_REPORT")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(573, 745, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		//Assign report settings
		DateFormat dateFormat = new SimpleDateFormat(messages.getString("PARSER_DATE"));
		try {
			report.setEarliestDate(dateFormat.parse(jFormattedTextFieldStartDate.getText()));
			report.setLatestDate(dateFormat.parse(jFormattedTextFieldEndDate.getText()));
			report.setEnabledExpenseTransactions(jCheckBoxExpenseTransactions.isSelected());
			report.setEnabledTransferTransactions(jCheckBoxTransferTransactions.isSelected());
			DefaultTableModel tagsModel = (DefaultTableModel) jTableTags.getModel();
			List<String> tags = new LinkedList<>();
			for (int i = 0; i < tagsModel.getRowCount(); i++)
				if (tagsModel.getValueAt(i, 1) instanceof Boolean && (Boolean) tagsModel.getValueAt(i, 1))
					tags.add((String) tagsModel.getValueAt(i, 0));
			report.setSelectedTags(tags);
		} catch (ParseException ex) {
			Logger.getLogger(AnalyticsViewer.class.getName()).log(Level.SEVERE, null, ex);
		}
		jTextPane1.setText(report.getTextReport());
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxExpenseTransactions;
    private javax.swing.JCheckBox jCheckBoxTransferTransactions;
    private javax.swing.JFormattedTextField jFormattedTextFieldEndDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldStartDate;
    private javax.swing.JLabel jLabelEndDate;
    private javax.swing.JLabel jLabelStartDate;
    private javax.swing.JLabel jLabelTags;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneAccounts;
    private javax.swing.JScrollPane jScrollPaneTags;
    private javax.swing.JTable jTableAccounts;
    private javax.swing.JTable jTableTags;
    private javax.swing.JTextField jTextFieldTags;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

	/**
	 * Sets the FinanceDate to generate the report
	 *
	 * @param financeData the finance data to generate the report
	 */
	public void setFinanceData(FinanceData financeData) {
		this.financeData = financeData;
		report = new Report(financeData);
		resetForm();
	}

	/**
	 * Completes user configuration of form
	 */
	private void initCustomComponents() {
		jTableTags.getColumnModel().getColumn(1).setMinWidth(30);
		jTableTags.getColumnModel().getColumn(1).setMaxWidth(100);
		jTableTags.getColumnModel().getColumn(1).setPreferredWidth(50);
		jTableAccounts.getColumnModel().getColumn(1).setMinWidth(30);
		jTableAccounts.getColumnModel().getColumn(1).setMaxWidth(100);
		jTableAccounts.getColumnModel().getColumn(1).setPreferredWidth(50);
	}

	/**
	 * Resets all fields to their default values
	 */
	private void resetForm() {
		DateFormat format = new SimpleDateFormat(messages.getString("PARSER_DATE"));
		jFormattedTextFieldStartDate.setText(format.format(report.getEarliestDate()));
		jFormattedTextFieldEndDate.setText(format.format(report.getLatestDate()));

		//Set tags
		DefaultTableModel tagsModel = (DefaultTableModel) jTableTags.getModel();
		while (tagsModel.getRowCount() > 0)
			tagsModel.removeRow(0);
		for (String tag : report.getAllTags())
			if (!tag.isEmpty())
				tagsModel.addRow(new Object[]{tag, new Boolean(true)});

		//Set accounts
		DefaultTableModel accountsModel = (DefaultTableModel) jTableAccounts.getModel();
		while (accountsModel.getRowCount() > 0)
			accountsModel.removeRow(0);
		for (FinanceAccount account : report.getAllAccounts())
			accountsModel.addRow(new Object[]{new AccountDisplay(account), new Boolean(true)});
	}

	/**
	 * Class for displaying an account in a table
	 */
	private class AccountDisplay {

		protected FinanceAccount account;

		public AccountDisplay(FinanceAccount account) {
			this.account = account;
		}

		public FinanceAccount getAccount() {
			return account;
		}

		@Override
		public String toString() {
			return account.getName();
		}
	}
	/**
	 * The report generator
	 */
	protected Report report;
	/**
	 * The finance data reference
	 */
	protected FinanceData financeData;
}
