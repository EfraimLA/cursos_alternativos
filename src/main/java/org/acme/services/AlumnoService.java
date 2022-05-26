package org.acme.services;

import org.acme.models.Alumno;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class AlumnoService {

    @Inject
    EntityManager em;

    public List<Alumno> findAll(){
        return Alumno.listAll();
    }

    public Alumno findById(final long id){
        return Alumno.findById(id);
    }

    public void persist(final Alumno alumno){
        Alumno.persist(alumno);
    }

    public Alumno update(final Alumno alumno){
        return em.merge(alumno);
    }

    public boolean delete(final long id){
        return Alumno.deleteById(id);
    }
}
