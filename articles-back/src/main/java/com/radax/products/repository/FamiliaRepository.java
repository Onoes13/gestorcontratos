package com.radax.products.repository;

import com.radax.products.domain.Article;
import com.radax.products.domain.Familia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FamiliaRepository extends CrudRepository<Familia, String> {
    @Override
    List<Familia> findAll();
}
