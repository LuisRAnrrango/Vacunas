/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.FacTabEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FacTabEmpleadoFacadeLocal {

    void create(FacTabEmpleado facTabEmpleado);

    void edit(FacTabEmpleado facTabEmpleado);

    void remove(FacTabEmpleado facTabEmpleado);

    FacTabEmpleado find(Object id);

    List<FacTabEmpleado> findAll();

    List<FacTabEmpleado> findRange(int[] range);

    int count();
    
}
