/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.FacTabRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FacTabRolFacadeLocal {

    void create(FacTabRol facTabRol);

    void edit(FacTabRol facTabRol);

    void remove(FacTabRol facTabRol);

    FacTabRol find(Object id);

    List<FacTabRol> findAll();

    List<FacTabRol> findRange(int[] range);

    int count();
    
}
