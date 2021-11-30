/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.FacTabEmpleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class FacTabEmpleadoFacade extends AbstractFacade<FacTabEmpleado> implements FacTabEmpleadoFacadeLocal {

    @PersistenceContext(unitName = "vacunas14PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacTabEmpleadoFacade() {
        super(FacTabEmpleado.class);
    }
    @Override
     public void create(FacTabEmpleado e){
      
         em.persist(e);
      }
     // Este metodo sirve para la busqueda de todos los Empleados
  	public List<FacTabEmpleado> findAll() {

  		List<FacTabEmpleado> listaEmpleados = em.createQuery("SELECT f FROM FacTabEmpleado f").getResultList();
  		return listaEmpleados;
  	}
    
}
