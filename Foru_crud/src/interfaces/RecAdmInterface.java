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
public interface RecAdmInterface <T>{
    public boolean insert(T o);
    public boolean delete(T o);
    public List<T> displayAll(String search);
    public T displayById(int id);
    public boolean update(T os);
    
}
