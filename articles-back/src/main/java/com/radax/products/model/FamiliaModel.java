package com.radax.products.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FamiliaModel {
    private String nombre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate fechaNacimiento;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sexo;
}
