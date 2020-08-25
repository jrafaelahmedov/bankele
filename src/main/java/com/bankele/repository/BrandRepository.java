package com.bankele.repository;

import com.bankele.entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Rashid Shiralizade
 */
@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {
    Optional<Brand> findByName(String name);
}
