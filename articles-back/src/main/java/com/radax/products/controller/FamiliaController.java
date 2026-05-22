package com.radax.products.controller;

import com.radax.products.configuration.JsonNullableUtils;
import com.radax.products.domain.Article;
import com.radax.products.domain.Familia;
import com.radax.products.model.FamiliaModel;
import com.radax.products.model.Product;
import com.radax.products.repository.FamiliaRepository;
import com.radax.products.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Log4j2
public class FamiliaController {

    private final FamiliaRepository familiaRepository;

    @GetMapping("/familia")
    public List<FamiliaModel> getFamilia() {
        return familiaRepository.findAll().stream().map(this::mapToFamily).collect(Collectors.toList());
    }

    private FamiliaModel mapToFamily(Familia familia) {
        return FamiliaModel.builder()
                .nombre(familia.getNombre())
                .fechaNacimiento(familia.getFechaNacimiento())
                .sexo(familia.getSexo())
                .build();
    }

}
