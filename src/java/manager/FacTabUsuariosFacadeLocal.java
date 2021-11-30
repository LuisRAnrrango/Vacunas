/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.FacTabUsuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FacTabUsuariosFacadeLocal {

    void create(FacTabUsuarios facTabUsuarios);

    void edit(FacTabUsuarios facTabUsuarios);

    void remove(FacTabUsuarios facTabUsuarios);

    FacTabUsuarios find(Object id);

    List<FacTabUsuarios> findAll();

    List<FacTabUsuarios> findRange(int[] range);

    int count();
    
}
