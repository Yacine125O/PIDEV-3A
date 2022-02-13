/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entities.MenuCommande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;
public class MenuCommandeService {
     private Statement st;
    private PreparedStatement pst;
    private Connection conn;
    public MenuCommandeService(){
    conn=DataSource.getInstance().getCnx();
    }
    public void ajouterMenuCommande (MenuCommande c){
    String req="insert into menu_commande (date,command_id,menu_id) values (?,?,?)";
     try {
            pst = conn.prepareStatement(req);
            pst.setDate(1, c.getDate());
            pst.setInt(2, c.getCommand_id());
            pst.setInt(3, c.getMenu_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modifiercommande(MenuCommande c)
    {
    String req="update menu_commande set date= ? ,command_id= ? ,menu_id= ?  where id= ? ";
    
     try {
            pst = conn.prepareStatement(req);
          
           
            pst.setDate(1, c.getDate());
            pst.setInt(2, c.getCommand_id());
            pst.setInt(3, c.getMenu_id());
            pst.setInt(4, c.getId());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void supCommande(MenuCommande c)
    {
    String req="delete  from menu_commande where id= ?";
    try {
            pst = conn.prepareStatement(req);
            pst.setInt(1, c.getId());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <MenuCommande> afficherMenuCommande(){
        List <MenuCommande> Menucommandes= new ArrayList<>();
    String sql="select * from commande";
    try { pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
    
    while(rs.next()){
                MenuCommande c = new MenuCommande();
                c.setId(rs.getInt("id"));
                c.setDate(rs.getDate("date"));
                c.setCommand_id(rs.getInt("command_id"));
                c.setMenu_id(rs.getInt("menu_id"));
                Menucommandes.add(c);
            }
    }
    
    
    catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    return  Menucommandes;
    } 
}
