package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicUpdate
public class Calificacion extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    public Alumno alumno;

    @ManyToOne
    public Materia materia;

    @Column(columnDefinition = "decimal(10,2)")
    public Float calificacion;

    @CreationTimestamp
    public Date fecha_registro;


}
