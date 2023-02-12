package com.bruno.dscatalog.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.dscatalog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
