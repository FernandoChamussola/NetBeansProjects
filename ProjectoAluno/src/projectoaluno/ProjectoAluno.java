/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectoaluno;
package StudentDBMysql;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;



/**
 *
 * @author paul.oamen
 */
public class StudentDBMysql extends javax.swing.JFrame {
    
    private static final String username="root";
    private static final String password="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/studentdata";

    Connection sqlConn =null;
    PreparedStatement pst = null;
    ResultSet rs=null;
     int q, i, id, deleteItem;
    /**
     * Creates new form StudentDBMysql
     */
    public StudentDBMysql() {
        initComponents();
        updateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //===============================Function Declaration======================================
    
    public void updateDB()
    {
        //int q, i;
         try
        {
           
           Class.forName("com.mysql.jdbc.Driver"); 
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from studentdata");
            
            rs =pst.executeQuery();
            ResultSetMetaData StData = rs.getMetaData();
            
            q = StData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for (i = 1; i <= q; i++)
                {
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("studentid"));
                    columnData.add(rs.getString("firstname"));
                    columnData.add(rs.getString("surname"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("mobile"));
                    columnData.add(rs.getString("maths"));
                    columnData.add(rs.getString("games"));
                    columnData.add(rs.getString("datasci"));
                    columnData.add(rs.getString("analysis"));
                    columnData.add(rs.getString("graphic"));
                    columnData.add(rs.getString("database1"));
                    columnData.add(rs.getString("science"));
                    columnData.add(rs.getString("english"));
                }
                    RecordTable.addRow(columnData);                
                
            }
         
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
        
    }
    
    
    
    //=============================================================================================
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3
