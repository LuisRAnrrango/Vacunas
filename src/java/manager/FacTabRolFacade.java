/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.FacTabRol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class FacTabRolFacade extends AbstractFacade<FacTabRol> implements FacTabRolFacadeLocal {

    @PersistenceContext(unitName = "vacunas14PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacTabRolFacade() {
        super(FacTabRol.class);
    }
    
}
