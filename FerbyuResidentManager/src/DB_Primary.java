
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.* ;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class DB_Primary {
    
    private int id;
    private String name;
    private String surname;
    private String address;
    
    //crete the gets and sets
    public Integer getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
  
    public void setName(String NAME)
    {
        this.name = NAME;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public void setSurname (String SURNAME)
    {
        this.surname = SURNAME;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAdress(String ADDRESS)
    {
        this.address = ADDRESS;
    }
    
    
    //create the class constructors
    public DB_Primary(){}
    
    public DB_Primary(Integer ID, String NAME, String SURNAME, String ADDRESS)
    {
        this.id = ID;
        this.name = NAME;
        this.surname = SURNAME;
        this.address = ADDRESS;
    }
    
    
    //create a function to insert - edit - remove type
    public boolean addNewOwner(DB_Primary owner)
    {
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `primary_db`(`name`, `surname`, `address`) VALUES (?,?,?)";
        
            try {
                    ps = Connect_to_DB.getTheConnection().prepareStatement(addQuery);
                    ps.setString(1, owner.getName());
                    ps.setString(2, owner.getSurname());
                    ps.setString(3, owner.getAddress());
                    
                    return (ps.executeUpdate() > 0);
                   
                    
                } catch (SQLException ex) {
                    Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
        }
        
    //function that edit resident info
    public boolean editOwnerInfo(DB_Primary owner)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `primary_db` SET `id`=? ,`name`=? ,`surname`=? ,`address`=? WHERE `id`=?";
        
            try {
                    ps = Connect_to_DB.getTheConnection().prepareStatement(editQuery);
                    ps.setString(1, owner.getName());
                    ps.setString(2, owner.getSurname());
                    ps.setString(3, owner.getAddress());
                    ps.setInt(4, owner.getID());
                    
                    return (ps.executeUpdate() > 0);
                   
                    
                } catch (SQLException ex) {
                    Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            
    }
    
    //function that delete the selected resident
    public boolean deleteOwner(int ownerId)
    {
         PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `primary_db` WHERE `id`=?";
        
            try {
                    ps = Connect_to_DB.getTheConnection().prepareStatement(deleteQuery);
                
                    ps.setInt(1, ownerId);
                    
                    return (ps.executeUpdate() > 0);
                   
                    
                } catch (SQLException ex) {
                    Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            
    }
    




//function that returns an arraylist of residents
    public ArrayList<DB_Primary> ownersList()
    {
        ArrayList<DB_Primary> list = new ArrayList<>();
    
        Statement st;
        ResultSet rs;
       
        String selectQuery = "SELECT * FROM `primary_db`";
        
        try {
            
            st = Connect_to_DB.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            DB_Primary owner;
            
            while (rs.next()) {
                
                owner = new DB_Primary(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getString(4));
                
                list.add(owner);
                        
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
        }
       


        return list;
    }
}