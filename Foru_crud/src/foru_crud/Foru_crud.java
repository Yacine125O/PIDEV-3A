/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foru_crud;

import entities.Reclamation_admin;
import utils.DataSource;
import entities.Reclamation_user ;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import service.UserService;
import service.AdminService ;

public class Foru_crud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserService service = new UserService();
        AdminService service_admin = new AdminService() ;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        DataSource ds1 = DataSource.getInstance();
        
        Reclamation_user rec = new Reclamation_user ("test","hassen");
        Reclamation_admin rep = new Reclamation_admin (1,"test") ;
        
            
           
           //service.ajouterReclamation(rec);
           //service.suppRec(rec);
           //service.modifierRec(rec);
           //service.readAll().forEach(e->System.out.println(e));
           //service_admin.ajouterRep(rep);
           //service_admin.suppRep(rep);
           //service_admin.modifierRep(rep);
           //service_admin.readAll().forEach(e->System.out.println(e));
        }
        
         //ps.modifierUserPst(u1);
         //ps.suppUserPst(u1);
      
    
    
}
