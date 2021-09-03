
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableConfig extends AbstractTableModel{

    private List rows = null;
    private String[] columns = null;

    public TableConfig(List rows, String[] columns) {
        setRows(rows);
        setColumns(columns);
    } 

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public int getRowCount() {
        return rows.size();
    }

    public int getColumnCount() {
        return columns.length;
    }
    public String getColumnName(int columnId){
        return columns[columnId];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] row = (Object[])getRows().get(rowIndex);
        return row[rowIndex];
    }

    public void setNumRows(int num) {
        rows.clear();
    }
    
   
}
}
