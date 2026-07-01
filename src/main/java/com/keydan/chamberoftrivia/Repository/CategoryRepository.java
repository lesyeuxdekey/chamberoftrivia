package com.keydan.chamberoftrivia.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keydan.chamberoftrivia.Model.CategoryModel;

public interface CategoryRepository extends  JpaRepository<CategoryModel, Long>{
    Optional<CategoryModel> findByName(String name);

    boolean existsByName(String name);
}
