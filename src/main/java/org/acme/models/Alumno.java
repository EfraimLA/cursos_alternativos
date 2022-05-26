package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@DynamicUpdate
public class Alumno extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 80)
    public String nombre;

    @Column(length = 80)
    public String ap_paterno;

    @Column(length = 80)
    public String ap_materno;

    @ColumnDefault("1")
    public int activo;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.REMOVE)
    public List<Calificacion> calificaciones;

}
