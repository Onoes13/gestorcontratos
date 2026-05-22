package com.radax.products.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "familia")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Familia {
    @Id
    @Column
    private String nombre;

    @Column
    private LocalDate fechaNacimiento;

    @Column
    private String sexo;


}
