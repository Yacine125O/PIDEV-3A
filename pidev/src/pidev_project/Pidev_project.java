/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev_project;

import entite.user;
import utils.DataSource;
import service.UserService;

/**
 *
 * @author Nayrouz
 */
public class Pidev_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //DataSource ds1 = DataSource.getInstance();
         user u1=new user(5,"karim","boubaker","elGhazella",55881122,"karim.boubaker@esprit.tn","karim123");
         UserService ps=new UserService();
         //ps.ajouterUser(u1);
         //ps.ajouterUserPst(u1);
         //ps.modifierUserPst(u1);
         //ps.suppUserPst(u1);
         ps.readAll().forEach(e->System.out.println(e));
    }
    
}
