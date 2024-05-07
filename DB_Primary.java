
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.* ;
import java.util.ArrayList;
import java.util.HashMap;
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
    private String type;
    private String name;
    private String surname;
    private String address;
    private String role;
   
    
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
    
    public String getRole()
    {
        return role;
    }
    
    public void setRole(String ROLE)
    {
        this.role = ROLE;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String TYPE)
    {
        this.type = TYPE;
    }
    
    //create the class constructors
    public DB_Primary(){}
    
    public DB_Primary(Integer ID, String NAME, String SURNAME, String TYPE, String ROLE,  String ADDRESS)
    {
        this.id = ID;
        this.name = NAME;
        this.surname = SURNAME;
        this.type = TYPE;
        this.role = ROLE;
        this.address = ADDRESS;
      
    }
    
    
    //create a function to insert - edit - remove type
    public boolean addNewOwner(DB_Primary owner)
    {
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `tempri_db`(`id`, `name`, `surname`, `type`, `role`, `address`) VALUES (?,?,?,?,?,?)";
        
            try {
                    ps = Connect_to_DB.getTheConnection().prepareStatement(addQuery);
                    ps.setInt(1, owner.getID());
                    ps.setString(2, owner.getName());
                    ps.setString(3, owner.getSurname());
                    ps.setString(4, owner.getType());
                    ps.setString(5, owner.getRole());
                    ps.setString(6, owner.getAddress());
                    
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
        
        String editQuery = "UPDATE `tempri_db` SET `id`=? ,`name`=? ,`surname`=? ,`type`=? ,`role`=? ,`address`=? WHERE `id`=?";
        
            try {
                    ps = Connect_to_DB.getTheConnection().prepareStatement(editQuery);
                    ps.setInt(1, owner.getID());
                    ps.setString(2, owner.getName());
                    ps.setString(3, owner.getSurname());
                    ps.setString(4, owner.getType());
                    ps.setString(5, owner.getRole());
                    ps.setString(6, owner.getAddress());
                    ps.setInt(7, owner.getID());
                   
                    
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
        
        String deleteQuery = "DELETE FROM `tempri_db` WHERE `id`=?";
        
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
       
        String selectQuery = "SELECT * FROM `tempri_db`";
        
        try {
            
            st = Connect_to_DB.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            DB_Primary owner;
            
            while (rs.next()) {
                
                
                owner = new DB_Primary(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getString(4),
                                       rs.getString(5),
                                       rs.getString(6));
                
                list.add(owner);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
        }
       


        return list;
    }
    
    
    
//function for jcomboreturn a list of all owners in a hashmap
    public HashMap<String, Integer> getOwnersMap()
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st = Connect_to_DB.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `tempri_db`");
            
            DB_Primary owners;
            
            while(rs.next())
            {
                owners = new DB_Primary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                
                map.put(owners.getSurname(), owners.getID());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return map;
    }
    
  
    public DB_Primary findResident (int ownerId)
    {
        PreparedStatement ps;
        ResultSet rs;
        DB_Primary resident = null;
       
        String searchQuery = "SELECT * FROM `tempri_db` WHERE `id`=?";
        
        try {
           
            ps = Connect_to_DB.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1, ownerId);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                 resident = new DB_Primary(rs.getInt("id"),
                                       rs.getString("Name"),
                                       rs.getString("Surname"),
                                       rs.getString("Type"),
                                       rs.getString("Role"),
                                       rs.getString("Address"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Primary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return resident;
    }
    
    
}
    