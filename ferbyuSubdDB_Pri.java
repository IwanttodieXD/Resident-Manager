
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.* ;
import java.util.ArrayList;
import java.util.HashMap;
import static java.util.Locale.filter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author val castro
 */
public class ferbyuSubdDB_Pri extends javax.swing.JFrame {
    
    DB_Types owners = new DB_Types();
    HashMap<String, String> map = owners.getTypesMap();
    printTempID printID = new printTempID();
    
    
    public ferbyuSubdDB_Pri() {
        setResizable(true);
        setExtendedState(MAXIMIZED_BOTH);

        initComponents();
            Toolkit a = Toolkit.getDefaultToolkit();
            int xSize = (int) a.getScreenSize().getWidth();
            int ySize = (int) a.getScreenSize().getHeight();
        setSize (xSize, ySize);

        updateJTableData();
        fillJtableWithOwnersData();
        fillJcomboxwithResidentTypesdata();
        
        jButton_print.setToolTipText("Print ID");
        
        //make data textfield uneditable
        jTextField_idDATA.setEditable(false);
        jTextField_nameDATA.setEditable(false);
        jTextField_surnameDATA.setEditable(false);
        jComboBox_typeDATA.setEditable(false);
        jTextField_roleDATA.setEditable(false);
        jTextArea_addressDATA.setEditable(false);
        
        //make delete textfield uneditable
        jTextField_idDELETE.setEditable(false);
        jTextField_nameDELETE.setEditable(false);
        jTextField_surnameDELETE.setEditable(false);
        jComboBox_typeDELETE.setEditable(false);
        jTextField_roleDELETE.setEditable(false);
        jTextArea_addressDELETE.setEditable(false);
        
        
}
    
    
    
    
    public void updateJTableData() {
    //clear the existing data from the JTable
    DefaultTableModel model = (DefaultTableModel) jTable_DB.getModel();
    model.setRowCount(0);

}
    
    
    public void fillJcomboxwithResidentTypesdata()
    {
             for(String s : map.keySet())
             {
             jComboBox_typeDATA.addItem(s);
             jComboBox_typeADD.addItem(s);
             jComboBox_typeDELETE.addItem(s);
             jComboBox_typeEDIT.addItem(s);
             }
    }
       
    
   
    
        //function to fill jtable with resident data using the arraylist bro
        public void fillJtableWithOwnersData()
        {
            DB_Primary owner = new DB_Primary(); 
            ArrayList<DB_Primary> ownersList = owner.ownersList();
            
            //the jtable columns
            String[] colNames = {"ID","Name","Surname","Resident Type","Role","Address"};
            
            //the jtable row
            //ownerslistsize = size of the arraylist
            //4 number of collumns
            Object[][] rows = new Object[ownersList.size()][6];
            jTable_DB.getRowCount();
            //add data from the list to the rows
            for (int i = 0; i < ownersList.size(); i++)
            {
                rows[i][0] = ownersList.get(i).getID();
                rows[i][1] = ownersList.get(i).getName();
                rows[i][2] = ownersList.get(i).getSurname();
                rows[i][3] = ownersList.get(i).getType();
                rows[i][4] = ownersList.get(i).getRole();
                rows[i][5] = ownersList.get(i).getAddress();
                
                
            }
            
            
            DefaultTableModel model = new DefaultTableModel(rows, colNames);
            // make the table uneditable
            jTable_DB.setDefaultEditor(Object.class, null); 
    
            // Create a table header
            JTableHeader header = jTable_DB.getTableHeader();

            // Set the font of the table header to bold
            Font font = new Font("Arial", Font.BOLD, 14);
            header.setFont(font);
            jTable_DB.setModel(model);
            
            jTable_DB.setRowHeight(30);
            jTable_DB.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable_DB.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable_DB.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable_DB.getColumnModel().getColumn(3).setPreferredWidth(1);
            jTable_DB.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_DB.getColumnModel().getColumn(5).setPreferredWidth(400);
            
         
        }
        

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_DB = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButton_EDIT7 = new javax.swing.JButton();
        jTextField_idEDIT1 = new javax.swing.JTextField();
        jTextField_nameEDIT1 = new javax.swing.JTextField();
        jTextField_surnameEDIT1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jComboBox_typeEDIT1 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        RoleLLEDIT1 = new javax.swing.JLabel();
        jTextField_roleEDIT1 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea_addressEDIT1 = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton_ManagerLock = new javax.swing.JButton();
        jLabel_controls = new javax.swing.JLabel();
        jButton_Refresh = new javax.swing.JButton();
        jTabbedPane_controls = new javax.swing.JTabbedPane();
        dataP = new javax.swing.JPanel();
        jTextField_idDATA = new javax.swing.JTextField();
        jTextField_nameDATA = new javax.swing.JTextField();
        jTextField_surnameDATA = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jComboBox_typeDATA = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        RoleLLDATA = new javax.swing.JLabel();
        jTextField_roleDATA = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea_addressDATA = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton_print = new javax.swing.JButton();
        addP = new javax.swing.JPanel();
        jTextField_nameADD = new javax.swing.JTextField();
        jTextField_surnameADD = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox_typeADD = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        RoleLLADD = new javax.swing.JLabel();
        jTextField_roleADD = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea_addressADD = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton_NEW = new javax.swing.JButton();
        deleteP = new javax.swing.JPanel();
        jButton_DELETE5 = new javax.swing.JButton();
        jTextField_idDELETE = new javax.swing.JTextField();
        jTextField_nameDELETE = new javax.swing.JTextField();
        jTextField_surnameDELETE = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox_typeDELETE = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        RoleLLDELETE = new javax.swing.JLabel();
        jTextField_roleDELETE = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea_addressDELETE = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        editP = new javax.swing.JPanel();
        jButton_EDIT6 = new javax.swing.JButton();
        jTextField_idEDIT = new javax.swing.JTextField();
        jTextField_nameEDIT = new javax.swing.JTextField();
        jTextField_surnameEDIT = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox_typeEDIT = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        RoleLLEDIT = new javax.swing.JLabel();
        jTextField_roleEDIT = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea_addressEDIT = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resident Manager");

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("RESIDENT DATABASE");

        jTable_DB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_DB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable_DB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_DB.getTableHeader().setReorderingAllowed(false);
        jTable_DB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_DBFocusGained(evt);
            }
        });
        jTable_DB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DBMouseClicked(evt);
            }
        });
        jTable_DB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_DBKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_DB);
        jTable_DB.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SEARCH:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusLost(evt);
            }
        });
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton_EDIT7.setBackground(new java.awt.Color(153, 0, 153));
        jButton_EDIT7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_EDIT7.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EDIT7.setText("UPDATE");
        jButton_EDIT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDIT7jButton_EDITActionPerformed(evt);
            }
        });
        jButton_EDIT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_EDIT7KeyPressed(evt);
            }
        });

        jTextField_idEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_idEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_idEDIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idEDIT1jTextField_idActionPerformed(evt);
            }
        });

        jTextField_nameEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_nameEDIT1.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_nameEDIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameEDIT1jTextField_nameActionPerformed(evt);
            }
        });
        jTextField_nameEDIT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nameEDIT1KeyPressed(evt);
            }
        });

        jTextField_surnameEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_surnameEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_surnameEDIT1.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_surnameEDIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_surnameEDIT1jTextField_surnameActionPerformed(evt);
            }
        });
        jTextField_surnameEDIT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_surnameEDIT1KeyPressed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Id:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Name:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Surname:");

        jComboBox_typeEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox_typeEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jComboBox_typeEDIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typeEDIT1jComboBox_typeActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Type of Resident:");

        RoleLLEDIT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleLLEDIT1.setText("Role:");

        jTextField_roleEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_roleEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_roleEDIT1.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_roleEDIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_roleEDIT1jTextField_roleActionPerformed(evt);
            }
        });
        jTextField_roleEDIT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_roleEDIT1KeyPressed(evt);
            }
        });

        jTextArea_addressEDIT1.setColumns(20);
        jTextArea_addressEDIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea_addressEDIT1.setRows(5);
        jTextArea_addressEDIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea_addressEDIT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea_addressEDIT1jTextArea_addressKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(jTextArea_addressEDIT1);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Addresss:");

        jLabel51.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel51.setText("RESIDENT INFO:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nameEDIT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_roleEDIT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addComponent(RoleLLEDIT1)
                    .addComponent(jLabel47)
                    .addComponent(jTextField_surnameEDIT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_typeEDIT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel49))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_idEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jButton_EDIT7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_typeEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField_idEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nameEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_surnameEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoleLLEDIT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_roleEDIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_EDIT7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addGap(35, 35, 35))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton_ManagerLock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_ManagerLock.setText("LOCK");
        jButton_ManagerLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManagerLockActionPerformed(evt);
            }
        });

        jLabel_controls.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel_controls.setText("CONTROLS");
        jLabel_controls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_controlsMouseClicked(evt);
            }
        });

        jButton_Refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Refresh.setText("REFRESH");
        jButton_Refresh.setPreferredSize(new java.awt.Dimension(77, 21));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jTabbedPane_controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane_controls.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane_controls.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane_controlsKeyPressed(evt);
            }
        });

        dataP.setBackground(new java.awt.Color(255, 255, 255));
        dataP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextField_idDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_idDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_idDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idDATAjTextField_idActionPerformed(evt);
            }
        });

        jTextField_nameDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_nameDATA.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_nameDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameDATAjTextField_nameActionPerformed(evt);
            }
        });
        jTextField_nameDATA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nameDATAKeyPressed(evt);
            }
        });

        jTextField_surnameDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_surnameDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_surnameDATA.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_surnameDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_surnameDATAjTextField_surnameActionPerformed(evt);
            }
        });
        jTextField_surnameDATA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_surnameDATAKeyPressed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Id:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Name:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Surname:");

        jComboBox_typeDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox_typeDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jComboBox_typeDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typeDATAjComboBox_typeActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Type of Resident:");

        RoleLLDATA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleLLDATA.setText("Role:");

        jTextField_roleDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_roleDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_roleDATA.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_roleDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_roleDATAjTextField_roleActionPerformed(evt);
            }
        });
        jTextField_roleDATA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_roleDATAKeyPressed(evt);
            }
        });

        jTextArea_addressDATA.setColumns(20);
        jTextArea_addressDATA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea_addressDATA.setRows(5);
        jTextArea_addressDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea_addressDATA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea_addressDATAjTextArea_addressKeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(jTextArea_addressDATA);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Addresss:");

        jLabel57.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel57.setText("RESIDENT INFO:");

        jButton_print.setText("jButton1");
        jButton_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPLayout = new javax.swing.GroupLayout(dataP);
        dataP.setLayout(dataPLayout);
        dataPLayout.setHorizontalGroup(
            dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nameDATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_roleDATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addComponent(RoleLLDATA)
                    .addComponent(jLabel53)
                    .addComponent(jTextField_surnameDATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(dataPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dataPLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_typeDATA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dataPLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel55))
                    .addGroup(dataPLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_idDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(dataPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dataPLayout.setVerticalGroup(
            dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_typeDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField_idDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nameDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_surnameDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoleLLDATA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_roleDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane_controls.addTab("DATA", dataP);

        addP.setBackground(new java.awt.Color(255, 255, 255));
        addP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextField_nameADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_nameADD.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_nameADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });

        jTextField_surnameADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_surnameADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_surnameADD.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_surnameADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_surnameActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Name:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Surname:");

        jComboBox_typeADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox_typeADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jComboBox_typeADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typeActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Type of Resident:");

        RoleLLADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleLLADD.setText("Role:");

        jTextField_roleADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_roleADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_roleADD.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_roleADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_roleActionPerformed(evt);
            }
        });

        jTextArea_addressADD.setColumns(20);
        jTextArea_addressADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea_addressADD.setRows(5);
        jTextArea_addressADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea_addressADD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea_addressKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jTextArea_addressADD);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Addresss:");

        jLabel33.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel33.setText("ADD THE NEW RESIDENT INFO");

        jButton_NEW.setBackground(new java.awt.Color(0, 51, 204));
        jButton_NEW.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButton_NEW.setText("ADD");
        jButton_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEWActionPerformed(evt);
            }
        });
        jButton_NEW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_NEWKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout addPLayout = new javax.swing.GroupLayout(addP);
        addP.setLayout(addPLayout);
        addPLayout.setHorizontalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addPLayout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox_typeADD, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(addPLayout.createSequentialGroup()
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPLayout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addComponent(jLabel33))
                    .addGroup(addPLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nameADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_roleADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30)
                            .addComponent(RoleLLADD)
                            .addComponent(jLabel29)
                            .addComponent(jTextField_surnameADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        addPLayout.setVerticalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_typeADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nameADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_surnameADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoleLLADD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_roleADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane_controls.addTab("ADD", addP);

        deleteP.setBackground(new java.awt.Color(255, 255, 255));
        deleteP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton_DELETE5.setBackground(new java.awt.Color(204, 0, 0));
        jButton_DELETE5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_DELETE5.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE5.setText("DELETE");
        jButton_DELETE5.setMaximumSize(new java.awt.Dimension(72, 23));
        jButton_DELETE5.setMinimumSize(new java.awt.Dimension(72, 23));
        jButton_DELETE5.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton_DELETE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE5jButton_DELETEActionPerformed(evt);
            }
        });
        jButton_DELETE5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_DELETE5KeyPressed(evt);
            }
        });

        jTextField_idDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_idDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_idDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idDELETEjTextField_idActionPerformed(evt);
            }
        });

        jTextField_nameDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_nameDELETE.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_nameDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameDELETEjTextField_nameActionPerformed(evt);
            }
        });

        jTextField_surnameDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_surnameDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_surnameDELETE.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_surnameDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_surnameDELETEjTextField_surnameActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Id:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Name:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Surname:");

        jComboBox_typeDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox_typeDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jComboBox_typeDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typeDELETEjComboBox_typeActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Type of Resident:");

        RoleLLDELETE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleLLDELETE.setText("Role:");

        jTextField_roleDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_roleDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_roleDELETE.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_roleDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_roleDELETEjTextField_roleActionPerformed(evt);
            }
        });

        jTextArea_addressDELETE.setColumns(20);
        jTextArea_addressDELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea_addressDELETE.setRows(5);
        jTextArea_addressDELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea_addressDELETE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea_addressDELETEjTextArea_addressKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(jTextArea_addressDELETE);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Addresss:");

        jLabel39.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel39.setText("REMOVE A RESIDENT");

        javax.swing.GroupLayout deletePLayout = new javax.swing.GroupLayout(deleteP);
        deleteP.setLayout(deletePLayout);
        deletePLayout.setHorizontalGroup(
            deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nameDELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_roleDELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36)
                    .addComponent(RoleLLDELETE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField_surnameDELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(deletePLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(deletePLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(deletePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_DELETE5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addGroup(deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox_typeDELETE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(deletePLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel37))
                        .addGroup(deletePLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel34)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_idDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        deletePLayout.setVerticalGroup(
            deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_typeDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField_idDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nameDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_surnameDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoleLLDELETE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_roleDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_DELETE5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane_controls.addTab("DELETE", deleteP);

        editP.setBackground(new java.awt.Color(255, 255, 255));
        editP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton_EDIT6.setBackground(new java.awt.Color(153, 0, 153));
        jButton_EDIT6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_EDIT6.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EDIT6.setText("UPDATE");
        jButton_EDIT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDIT6jButton_EDITActionPerformed(evt);
            }
        });
        jButton_EDIT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_EDIT6KeyPressed(evt);
            }
        });

        jTextField_idEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_idEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_idEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idEDITjTextField_idActionPerformed(evt);
            }
        });

        jTextField_nameEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_nameEDIT.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_nameEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameEDITjTextField_nameActionPerformed(evt);
            }
        });
        jTextField_nameEDIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nameEDITKeyPressed(evt);
            }
        });

        jTextField_surnameEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_surnameEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_surnameEDIT.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_surnameEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_surnameEDITjTextField_surnameActionPerformed(evt);
            }
        });
        jTextField_surnameEDIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_surnameEDITKeyPressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Id:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Name:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Surname:");

        jComboBox_typeEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox_typeEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jComboBox_typeEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typeEDITjComboBox_typeActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Type of Resident:");

        RoleLLEDIT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleLLEDIT.setText("Role:");

        jTextField_roleEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_roleEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_roleEDIT.setPreferredSize(new java.awt.Dimension(64, 26));
        jTextField_roleEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_roleEDITjTextField_roleActionPerformed(evt);
            }
        });
        jTextField_roleEDIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_roleEDITKeyPressed(evt);
            }
        });

        jTextArea_addressEDIT.setColumns(20);
        jTextArea_addressEDIT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea_addressEDIT.setRows(5);
        jTextArea_addressEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea_addressEDIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea_addressEDITjTextArea_addressKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(jTextArea_addressEDIT);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Addresss:");

        jLabel45.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel45.setText("EDIT A RESIDENT INFO");

        javax.swing.GroupLayout editPLayout = new javax.swing.GroupLayout(editP);
        editP.setLayout(editPLayout);
        editPLayout.setHorizontalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nameEDIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_roleEDIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42)
                    .addComponent(RoleLLEDIT)
                    .addComponent(jLabel41)
                    .addComponent(jTextField_surnameEDIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(editPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_typeEDIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel43))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_idEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(editPLayout.createSequentialGroup()
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_EDIT6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel45)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPLayout.setVerticalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_typeEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField_idEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nameEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_surnameEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoleLLEDIT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_roleEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_EDIT6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane_controls.addTab("EDIT", editP);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_controls)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_ManagerLock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane_controls))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_controls, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_ManagerLock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane_controls)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1352, 783);
    }// </editor-fold>//GEN-END:initComponents
    private static final String REGEX_FILTER_PATTERN = "(?i)%s"; // case-insensitive regex pattern
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        // Get the table model and row sorter
    DefaultTableModel tableModel = (DefaultTableModel) jTable_DB.getModel();
    TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
    jTable_DB.setRowSorter(rowSorter);

    // Define a constant for the regex filter pattern
    

    // Get the search text and convert it to lowercase
    String searchText = jTextField_Search.getText().toLowerCase();

    // Set the row filter with the case-insensitive regex pattern
    rowSorter.setRowFilter(RowFilter.regexFilter(String.format(REGEX_FILTER_PATTERN, searchText)));
        
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    private void jTextField_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusLost
        // TODO add your handling code here:
        if(jTextField_Search.getText().equals("") ||
           jTextField_Search.getText().equals("Search Resident"))
          {
           jTextField_Search.setText("Search Resident");
           jTextField_Search.setForeground(new Color(153,153,153));
          }
    }//GEN-LAST:event_jTextField_SearchFocusLost

    private void jTextField_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusGained
        // TODO add your handling code here:
           if(jTextField_Search.getText().equals("Search Resident"))
           {
            jTextField_Search.setText("");
            jTextField_Search.setForeground(Color.black);
           }
    }//GEN-LAST:event_jTextField_SearchFocusGained

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTable_DBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DBMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTable_DB.getSelectedRow();

        //data
        jTextField_idDATA.setText(jTable_DB.getValueAt(selectedRowIndex, 0).toString());
        jTextField_nameDATA.setText(jTable_DB.getValueAt(selectedRowIndex, 1).toString());
        jTextField_surnameDATA.setText(jTable_DB.getValueAt(selectedRowIndex, 2).toString());
        
        jComboBox_typeDATA.setSelectedItem(jTable_DB.getValueAt(selectedRowIndex, 3).toString());
        
        jTextField_roleDATA.setText(jTable_DB.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_addressDATA.setText(jTable_DB.getValueAt(selectedRowIndex, 5).toString());
        
        //remove

        jTextField_idDELETE.setText(jTable_DB.getValueAt(selectedRowIndex, 0).toString());
        jTextField_nameDELETE.setText(jTable_DB.getValueAt(selectedRowIndex, 1).toString());
        jTextField_surnameDELETE.setText(jTable_DB.getValueAt(selectedRowIndex, 2).toString());
        
        jComboBox_typeDELETE.setSelectedItem(jTable_DB.getValueAt(selectedRowIndex, 3).toString());
        
        jTextField_roleDELETE.setText(jTable_DB.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_addressDELETE.setText(jTable_DB.getValueAt(selectedRowIndex, 5).toString());
        
        //edit
        
        jTextField_idEDIT.setText(jTable_DB.getValueAt(selectedRowIndex, 0).toString());
        jTextField_nameEDIT.setText(jTable_DB.getValueAt(selectedRowIndex, 1).toString());
        jTextField_surnameEDIT.setText(jTable_DB.getValueAt(selectedRowIndex, 2).toString());
        
        jComboBox_typeEDIT.setSelectedItem(jTable_DB.getValueAt(selectedRowIndex, 3).toString());
        
        jTextField_roleEDIT.setText(jTable_DB.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_addressEDIT.setText(jTable_DB.getValueAt(selectedRowIndex, 5).toString());
        
    }//GEN-LAST:event_jTable_DBMouseClicked

    private void jButton_NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEWActionPerformed
        // TODO add your handling code here:
        String type = map.get(jComboBox_typeADD.getSelectedItem().toString());
        String name = jTextField_nameADD.getText();
        String surname =  jTextField_surnameADD.getText();
        String address =  jTextArea_addressADD.getText();
        String role =  jTextField_roleADD.getText();
        
        
        DB_Primary owner = new DB_Primary(0, name, surname, type, role, address);   
     
        //befor insertubg = new owner we need to check if the required info are empty
        //required data -> name, surname, ,role ,address ,type
        
        if(name.trim().equals("") || surname.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Missing Information of the New Resident", "Add Resident", 1);
        }
        else
        {
            if(new DB_Primary().addNewOwner(owner))
            {
            fillJtableWithOwnersData();
            jTextField_nameADD.setText("");
            jTextField_surnameADD.setText("");
            jTextField_roleADD.setText("");
            jTextArea_addressADD.setText("");
            
            JOptionPane.showMessageDialog(null, "New Resident Added :D", "Add Resident", 1);
            
            } 
            else 
            {
            JOptionPane.showMessageDialog(null, "New Resident not Added", "Add Resident", 2);
          
        }
    }                                
    }//GEN-LAST:event_jButton_NEWActionPerformed

    private void jButton_ManagerLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManagerLockActionPerformed
        // TODO add your handling code here:
        ManagerLocked_Window jf2 = new ManagerLocked_Window();
        jf2.show();
        
    }//GEN-LAST:event_jButton_ManagerLockActionPerformed

    private void jTable_DBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_DBKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_P)
        {
            if (jTextField_idDATA.getText().equals("") || jTextField_nameDATA.getText().equals("") || jTextField_surnameDATA.getText().equals("") || jTextArea_addressDATA.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "select a Resident >:t ", "Print Resident ID", 0);
        }
        else
        {
        printTempID jf2 = new printTempID();
        jf2.setVisible(true);
            {
            
            int id = Integer.parseInt(jTextField_idDATA.getText());
            String name = (String)jTextField_nameDATA.getText();
            String surname = (String)jTextField_surnameDATA.getText();        
            String type = (String)jComboBox_typeDATA.getSelectedItem();   
            String role = (String)jTextField_roleDATA.getText();
        
                
            jf2.tempR_id.setText(String.valueOf("ID number: " + id));
            jf2.tempR_name.setText(name);
            jf2.tempR_surname.setText(surname);
            jf2.tempR_type.setText(type);
            jf2.tempR_role.setText(role);
            if (jf2.tempR_type.getText().equals("Primary"))
                {
                    jf2.tempR_type2.setText(null);
                    jf2.tempR_type3.setVisible(false);

                }
       
            }
        }
        }
        
        if (evt.getKeyCode()==KeyEvent.VK_F1)
        {
            jTabbedPane_controls.setSelectedIndex(0);
        }
        else if (evt.getKeyCode()==KeyEvent.VK_F2)
        {
            jTabbedPane_controls.setSelectedIndex(1);
        }
        else if (evt.getKeyCode()==KeyEvent.VK_F3)
        {
            jTabbedPane_controls.setSelectedIndex(2);
        }
        else if (evt.getKeyCode()==KeyEvent.VK_F4)
        {
            jTabbedPane_controls.setSelectedIndex(3);
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_DELETE)
        {
        
        try{
        //deleting the selecyed owner from the system
        DB_Primary owner = new DB_Primary();
        
            int ownerId = Integer.valueOf(jTextField_idDELETE.getText());
    
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to DELETE this Resident?", "Delete Resident", 2);
            
            if(yes_or_no == JOptionPane.YES_OPTION)
            {
                if(owner.deleteOwner(ownerId))
                {
                    jTable_DB.clearSelection();
                    fillJtableWithOwnersData();
                    jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    JOptionPane.showMessageDialog(null, "Resident info Deleted :'< ", "Goodbye", 1);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Operation failed", "Delete Resident", 2);
                }
            }
        
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select a Resident to Delete", "Delete Resident", 0);
        }
        }
        
    }//GEN-LAST:event_jTable_DBKeyPressed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        // TODO add your handling code here:
        fillJtableWithOwnersData();
        jTable_DB.clearSelection();
        jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");
        
        jTextField_nameADD.setText("");
        jTextField_surnameADD.setText("");
        jTextField_roleADD.setText("");
        jTextArea_addressADD.setText("");
        
        jTextField_idDELETE.setText("");
        jTextField_nameDELETE.setText("");
        jTextField_surnameDELETE.setText("");
        jTextField_roleDELETE.setText("");
        jTextArea_addressDELETE.setText("");
        
        jTextField_idEDIT.setText("");
        jTextField_nameEDIT.setText("");
        jTextField_surnameEDIT.setText("");
        jTextField_roleEDIT.setText("");
        jTextArea_addressEDIT.setText("");
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jTextArea_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_addressKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try{
                //deleting the selecyed owner from the system


            String type = map.get(jComboBox_typeADD.getSelectedItem().toString());
            String name = jTextField_nameADD.getText();
            String surname =  jTextField_surnameADD.getText();
            String address =  jTextArea_addressADD.getText();
            String role =  jTextField_roleADD.getText();
        
        
            DB_Primary owner = new DB_Primary(0, name, surname, type, role, address);   
     
            //befor insertubg = new owner we need to check if the required info are empty
            //required data -> name, surname, ,role ,address ,type
        
            if(name.trim().equals("") || surname.trim().equals("") || address.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Missing Information of the New Resident", "Add Resident", 1);
            }
            else
            {
                if(new DB_Primary().addNewOwner(owner))
                {
                fillJtableWithOwnersData();
                jTable_DB.clearSelection();
                jTextField_nameADD.setText("");
                jTextField_surnameADD.setText("");
                jTextField_roleADD.setText("");
                jTextArea_addressADD.setText("");
                
        
                jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");
        
       
        jTextField_idDELETE.setText("");
        jTextField_nameDELETE.setText("");
        jTextField_surnameDELETE.setText("");
        jTextField_roleDELETE.setText("");
        jTextArea_addressDELETE.setText("");
        
        jTextField_idEDIT.setText("");
        jTextField_nameEDIT.setText("");
        jTextField_surnameEDIT.setText("");
        jTextField_roleEDIT.setText("");
        jTextArea_addressEDIT.setText("");
                 
                JOptionPane.showMessageDialog(null, "New Resident Added :D", "Add Resident", 1);
                
                } 
                else 
                {
                JOptionPane.showMessageDialog(null, "New Resident not Added", "Add Resident", 2);
              
            }
        }                            
        }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a Resident to Delete", "Delete Resident", 0);
            }
        }

    }//GEN-LAST:event_jTextArea_addressKeyPressed

    private void jTextField_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleActionPerformed

    private void jComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typeActionPerformed
        // TODO add your handling code here:
        if(jComboBox_typeADD.getSelectedItem().equals("Temporary"))
        {
            RoleLLADD.setVisible(true);
            jTextField_roleADD.setVisible(true);
        }
        else if (jComboBox_typeADD.getSelectedItem().equals("Primary"))
        {
            RoleLLADD.setVisible(false);
            jTextField_roleADD.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_typeActionPerformed

    private void jTextField_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameActionPerformed

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jButton_DELETE5jButton_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE5jButton_DELETEActionPerformed
        // TODO add your handling code here:
        try{
        //deleting the selecyed owner from the system
        DB_Primary owner = new DB_Primary();
        
            int ownerId = Integer.valueOf(jTextField_idDELETE.getText());
    
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to DELETE this Resident?", "Delete Resident", 2);
            
            if(yes_or_no == JOptionPane.YES_OPTION)
            {
                if(owner.deleteOwner(ownerId))
                {
                    jTable_DB.clearSelection();
                    fillJtableWithOwnersData();
                    jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idEDIT.setText("");
        jTextField_nameEDIT.setText("");
        jTextField_surnameEDIT.setText("");
        jTextField_roleEDIT.setText("");
        jTextArea_addressEDIT.setText("");
        jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");
                    JOptionPane.showMessageDialog(null, "Resident info Deleted :'< ", "Goodbye", 1);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Operation failed", "Delete Resident", 2);
                }
            }
        
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select a Resident to Delete", "Delete Resident", 0);
        }
        
    }//GEN-LAST:event_jButton_DELETE5jButton_DELETEActionPerformed

    private void jTextField_idDELETEjTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idDELETEjTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idDELETEjTextField_idActionPerformed

    private void jTextField_nameDELETEjTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameDELETEjTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameDELETEjTextField_nameActionPerformed

    private void jTextField_surnameDELETEjTextField_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_surnameDELETEjTextField_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameDELETEjTextField_surnameActionPerformed

    private void jComboBox_typeDELETEjComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typeDELETEjComboBox_typeActionPerformed
        // TODO add your handling code here:
        if(jComboBox_typeDELETE.getSelectedItem().equals("Temporary"))
        {
            RoleLLDELETE.setVisible(true);
            jTextField_roleDELETE.setVisible(true);
        }
        else if (jComboBox_typeDELETE.getSelectedItem().equals("Primary"))
        {
            RoleLLDELETE.setVisible(false);
            jTextField_roleDELETE.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_typeDELETEjComboBox_typeActionPerformed

    private void jTextField_roleDELETEjTextField_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_roleDELETEjTextField_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleDELETEjTextField_roleActionPerformed

    private void jTextArea_addressDELETEjTextArea_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_addressDELETEjTextArea_addressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea_addressDELETEjTextArea_addressKeyPressed

    private void jButton_EDIT6jButton_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDIT6jButton_EDITActionPerformed
        // TODO add your handling code here:
        try{
                //deleting the selecyed owner from the system
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");
                        
                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
    }//GEN-LAST:event_jButton_EDIT6jButton_EDITActionPerformed

    private void jTextField_idEDITjTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idEDITjTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idEDITjTextField_idActionPerformed

    private void jTextField_nameEDITjTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameEDITjTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameEDITjTextField_nameActionPerformed

    private void jTextField_surnameEDITjTextField_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_surnameEDITjTextField_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameEDITjTextField_surnameActionPerformed

    private void jComboBox_typeEDITjComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typeEDITjComboBox_typeActionPerformed
        // TODO add your handling code here:
         if(jComboBox_typeEDIT.getSelectedItem().equals("Temporary"))
        {
            RoleLLEDIT.setVisible(true);
            jTextField_roleEDIT.setVisible(true);
        }
        else if (jComboBox_typeEDIT.getSelectedItem().equals("Primary"))
        {
            RoleLLEDIT.setVisible(false);
            jTextField_roleEDIT.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_typeEDITjComboBox_typeActionPerformed

    private void jTextField_roleEDITjTextField_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_roleEDITjTextField_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleEDITjTextField_roleActionPerformed

    private void jTextArea_addressEDITjTextArea_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_addressEDITjTextArea_addressKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_INSERT)
        {
          try{
                //deleting the selecyed owner from the system
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();
                

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");

                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
        }
    }//GEN-LAST:event_jTextArea_addressEDITjTextArea_addressKeyPressed

    private void jButton_NEWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_NEWKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try{
                //deleting the selecyed owner from the system


            String type = map.get(jComboBox_typeADD.getSelectedItem().toString());
            String name = jTextField_nameADD.getText();
            String surname =  jTextField_surnameADD.getText();
            String address =  jTextArea_addressADD.getText();
            String role =  jTextField_roleADD.getText();
        
        
            DB_Primary owner = new DB_Primary(0, name, surname, type, role, address);   
     
            //befor insertubg = new owner we need to check if the required info are empty
            //required data -> name, surname, ,role ,address ,type
        
            if(name.trim().equals("") || surname.trim().equals("") || address.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Missing Information of the New Resident", "Add Resident", 1);
            }
            else
            {
                if(new DB_Primary().addNewOwner(owner))
                {
                fillJtableWithOwnersData();
                jTable_DB.clearSelection();
                jTextField_nameADD.setText("");
                jTextField_surnameADD.setText("");
                jTextField_roleADD.setText("");
                jTextArea_addressADD.setText("");
                 
                JOptionPane.showMessageDialog(null, "New Resident Added :D", "Add Resident", 1);
                
                } 
                else 
                {
                JOptionPane.showMessageDialog(null, "New Resident not Added", "Add Resident", 2);
              
            }
        }                            
        }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a Resident to Delete", "Delete Resident", 0);
            }
        }
    }//GEN-LAST:event_jButton_NEWKeyPressed

    private void jButton_DELETE5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_DELETE5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_DELETE)
        {
        
        try{
        //deleting the selecyed owner from the system
        DB_Primary owner = new DB_Primary();
        
            int ownerId = Integer.valueOf(jTextField_idDELETE.getText());
    
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to DELETE this Resident?", "Delete Resident", 2);
            
            if(yes_or_no == JOptionPane.YES_OPTION)
            {
                if(owner.deleteOwner(ownerId))
                {
                    jTable_DB.clearSelection();
                    fillJtableWithOwnersData();
                    jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                  
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        
                        jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");

                    JOptionPane.showMessageDialog(null, "Resident info Deleted :'< ", "Goodbye", 1);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Operation failed", "Delete Resident", 2);
                }
            }
        
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select a Resident to Delete", "Delete Resident", 0);
        }
        }
    }//GEN-LAST:event_jButton_DELETE5KeyPressed

    private void jTextField_nameEDITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nameEDITKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_INSERT)
        {
          try{
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");

                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
        }
    }//GEN-LAST:event_jTextField_nameEDITKeyPressed

    private void jTextField_surnameEDITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_surnameEDITKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_INSERT)
        {
          try{
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");

                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
        }
    }//GEN-LAST:event_jTextField_surnameEDITKeyPressed

    private void jTextField_roleEDITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_roleEDITKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_INSERT)
        {
          try{
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                    jTextField_nameDELETE.setText("");
                    jTextField_surnameDELETE.setText("");
                    jTextField_roleDELETE.setText("");
                    jTextArea_addressDELETE.setText("");
                    jTextField_idDATA.setText("");
        jTextField_nameDATA.setText("");
        jTextField_surnameDATA.setText("");
        jTextField_roleDATA.setText("");
        jTextArea_addressDATA.setText("");

                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
        }
    }//GEN-LAST:event_jTextField_roleEDITKeyPressed

    private void jButton_EDIT6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_EDIT6KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
          try{
                DB_Primary owner = new DB_Primary();

                int id =  Integer.valueOf(jTextField_idEDIT.getText());
                String name = jTextField_nameEDIT.getText();
                String surname = jTextField_surnameEDIT.getText();
                String type = map.get(jComboBox_typeEDIT.getSelectedItem().toString());
                String role = jTextField_roleEDIT.getText();
                String address = jTextArea_addressEDIT.getText();

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to keep this changes?", "Edit Information", 2);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(owner.editOwnerInfo(new DB_Primary (id, name,surname,type, role, address)))
                    {
                        fillJtableWithOwnersData();
                        jTable_DB.clearSelection();
                        jTextField_idEDIT.setText("");
                        jTextField_nameEDIT.setText("");
                        jTextField_surnameEDIT.setText("");
                        jTextField_roleEDIT.setText("");
                        jTextArea_addressEDIT.setText("");
                        jTextField_idDELETE.setText("");
                        jTextField_nameDELETE.setText("");
                        jTextField_surnameDELETE.setText("");
                        jTextField_roleDELETE.setText("");
                        jTextArea_addressDELETE.setText("");
                        jTextField_idDATA.setText("");
                        jTextField_nameDATA.setText("");
                        jTextField_surnameDATA.setText("");
                        jTextField_roleDATA.setText("");
                        jTextArea_addressDATA.setText("");

                        JOptionPane.showMessageDialog(null, "Resident info Updated :D ", "Edit Information", 1);

                    }else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Edit Information", 2);
                    }
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select a resident to Update", "Edit Information", 0);
            }
        }
    }//GEN-LAST:event_jButton_EDIT6KeyPressed

    private void jLabel_controlsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_controlsMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jLabel_controlsMouseClicked

    private void jButton_EDIT7jButton_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDIT7jButton_EDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EDIT7jButton_EDITActionPerformed

    private void jButton_EDIT7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_EDIT7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EDIT7KeyPressed

    private void jTextField_idEDIT1jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idEDIT1jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idEDIT1jTextField_idActionPerformed

    private void jTextField_nameEDIT1jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameEDIT1jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameEDIT1jTextField_nameActionPerformed

    private void jTextField_nameEDIT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nameEDIT1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameEDIT1KeyPressed

    private void jTextField_surnameEDIT1jTextField_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_surnameEDIT1jTextField_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameEDIT1jTextField_surnameActionPerformed

    private void jTextField_surnameEDIT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_surnameEDIT1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameEDIT1KeyPressed

    private void jComboBox_typeEDIT1jComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typeEDIT1jComboBox_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_typeEDIT1jComboBox_typeActionPerformed

    private void jTextField_roleEDIT1jTextField_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_roleEDIT1jTextField_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleEDIT1jTextField_roleActionPerformed

    private void jTextField_roleEDIT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_roleEDIT1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleEDIT1KeyPressed

    private void jTextArea_addressEDIT1jTextArea_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_addressEDIT1jTextArea_addressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea_addressEDIT1jTextArea_addressKeyPressed

    private void jTextField_idDATAjTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idDATAjTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idDATAjTextField_idActionPerformed

    private void jTextField_nameDATAjTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameDATAjTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameDATAjTextField_nameActionPerformed

    private void jTextField_nameDATAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nameDATAKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameDATAKeyPressed

    private void jTextField_surnameDATAjTextField_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_surnameDATAjTextField_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameDATAjTextField_surnameActionPerformed

    private void jTextField_surnameDATAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_surnameDATAKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_surnameDATAKeyPressed

    private void jComboBox_typeDATAjComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typeDATAjComboBox_typeActionPerformed
        // TODO add your handling code here:
        if(jComboBox_typeDATA.getSelectedItem().equals("Temporary"))
        {
            RoleLLDATA.setVisible(true);
            jTextField_roleDATA.setVisible(true);
        }
        else if (jComboBox_typeDATA.getSelectedItem().equals("Primary"))
        {
            RoleLLDATA.setVisible(false);
            jTextField_roleDATA.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_typeDATAjComboBox_typeActionPerformed

    private void jTextField_roleDATAjTextField_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_roleDATAjTextField_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleDATAjTextField_roleActionPerformed

    private void jTextField_roleDATAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_roleDATAKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_roleDATAKeyPressed

    private void jTextArea_addressDATAjTextArea_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_addressDATAjTextArea_addressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea_addressDATAjTextArea_addressKeyPressed

    private void jTable_DBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_DBFocusGained
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTable_DBFocusGained

    private void jButton_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_printActionPerformed
        // TODO add your handling code here:
        if (jTextField_idDATA.getText().equals("") || jTextField_nameDATA.getText().equals("") || jTextField_surnameDATA.getText().equals("") || jTextArea_addressDATA.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "select a Resident >:t ", "Print Resident ID", 0);
        }
        else
        {
        printTempID jf2 = new printTempID();
        jf2.setVisible(true);
            {
            
            int id = Integer.parseInt(jTextField_idDATA.getText());
            String name = (String)jTextField_nameDATA.getText();
            String surname = (String)jTextField_surnameDATA.getText();        
            String type = (String)jComboBox_typeDATA.getSelectedItem();   
            String role = (String)jTextField_roleDATA.getText();
        
                
            jf2.tempR_id.setText(String.valueOf("ID number: " + id));
            jf2.tempR_name.setText(name);
            jf2.tempR_surname.setText(surname);
            jf2.tempR_type.setText(type);
            jf2.tempR_role.setText(role);
            if (jf2.tempR_type.getText().equals("Primary"))
                {
                    jf2.tempR_type2.setText(null);
                    jf2.tempR_type3.setVisible(false);

                }
       
            }
        }
    }//GEN-LAST:event_jButton_printActionPerformed

    private void jTabbedPane_controlsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane_controlsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane_controlsKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ferbyuSubdDB_Pri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RoleLLADD;
    private javax.swing.JLabel RoleLLDATA;
    private javax.swing.JLabel RoleLLDELETE;
    private javax.swing.JLabel RoleLLEDIT;
    private javax.swing.JLabel RoleLLEDIT1;
    private javax.swing.JPanel addP;
    private javax.swing.JPanel dataP;
    private javax.swing.JPanel deleteP;
    private javax.swing.JPanel editP;
    private javax.swing.JButton jButton_DELETE5;
    private javax.swing.JButton jButton_EDIT6;
    private javax.swing.JButton jButton_EDIT7;
    private javax.swing.JButton jButton_ManagerLock;
    private javax.swing.JButton jButton_NEW;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_print;
    private javax.swing.JComboBox<String> jComboBox_typeADD;
    private javax.swing.JComboBox<String> jComboBox_typeDATA;
    private javax.swing.JComboBox<String> jComboBox_typeDELETE;
    private javax.swing.JComboBox<String> jComboBox_typeEDIT;
    private javax.swing.JComboBox<String> jComboBox_typeEDIT1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel_controls;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane_controls;
    private javax.swing.JTable jTable_DB;
    private javax.swing.JTextArea jTextArea_addressADD;
    private javax.swing.JTextArea jTextArea_addressDATA;
    private javax.swing.JTextArea jTextArea_addressDELETE;
    private javax.swing.JTextArea jTextArea_addressEDIT;
    private javax.swing.JTextArea jTextArea_addressEDIT1;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_idDATA;
    private javax.swing.JTextField jTextField_idDELETE;
    private javax.swing.JTextField jTextField_idEDIT;
    private javax.swing.JTextField jTextField_idEDIT1;
    private javax.swing.JTextField jTextField_nameADD;
    private javax.swing.JTextField jTextField_nameDATA;
    private javax.swing.JTextField jTextField_nameDELETE;
    private javax.swing.JTextField jTextField_nameEDIT;
    private javax.swing.JTextField jTextField_nameEDIT1;
    private javax.swing.JTextField jTextField_roleADD;
    private javax.swing.JTextField jTextField_roleDATA;
    private javax.swing.JTextField jTextField_roleDELETE;
    private javax.swing.JTextField jTextField_roleEDIT;
    private javax.swing.JTextField jTextField_roleEDIT1;
    private javax.swing.JTextField jTextField_surnameADD;
    private javax.swing.JTextField jTextField_surnameDATA;
    private javax.swing.JTextField jTextField_surnameDELETE;
    private javax.swing.JTextField jTextField_surnameEDIT;
    private javax.swing.JTextField jTextField_surnameEDIT1;
    // End of variables declaration//GEN-END:variables
}
