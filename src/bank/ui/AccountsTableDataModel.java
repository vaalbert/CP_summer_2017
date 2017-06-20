package bank.ui;

import bank.Account;
import bank.Bank;
import bank.Customer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by prubac on 5/24/2017.
 */
public class AccountsTableDataModel extends DefaultTableModel {

    static String[] cols = {"ID", "Type", "Currency", "Balance"};

    public AccountsTableDataModel(List<Account> accountList) {
        super(cols, 0);
        addRows(accountList);
    }

    public void addRows(List<Account> accountList) {
        for (Account acc : accountList) {
            addRow(acc);
        }
    }

    public void addRow(Account acc) {
        dataVector.add(acc);
        fireTableDataChanged();
    }

    public void removeAllRows() {
        dataVector.clear();
        fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        dataVector.remove(rowIndex);
        fireTableDataChanged();
    }

    @Override
    public Class getColumnClass(int colIndex) {
        switch (colIndex) {
            case 0:
                return Long.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return BigDecimal.class;
            default:
                return Object.class;
        }
    }

    @Override
    public Object getValueAt(int rowInd, int colInd) {
        Account acc = (Account) dataVector.get(rowInd);
        switch (colInd) {
            case 0:
                return acc.getAccountId();
            case 1:
                return acc.getClass().getSimpleName().
                        replace("Account", "");
            case 2:
                return acc.getCurrency();
            case 3:
                return acc.getBalance();
            default:
                return new Object();
        }
    }

    @Override
    public void setValueAt(Object newVal, int row, int column) {
        Account account = (Account) dataVector.get(row);
        switch (column) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                account.setCurrency((String) newVal);
                return;
            case 3:
                account.setBalance((BigDecimal) newVal);
        }

    }
}