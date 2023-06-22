package edu.cibertec.pc3postgresql.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Ubigeo {

    @Id
    @Column(name = "idubigeo")
    private Integer idUbigeo;//id_ubigeo

    private String departamento;

    private String provincia;

    private String distrito;
}
