/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface RecInterface <T> {
    public void ajouterReclamation(T o);
    public void suppRec (T o);
    public void modifierRec(T o);
    public List <T> readAll();
    
}
