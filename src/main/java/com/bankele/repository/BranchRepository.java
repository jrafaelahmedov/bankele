package com.bankele.repository;

import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rashid Shiralizade
 */
@Repository
public interface BranchRepository extends CrudRepository<Branch, Long> {
    List<Branch> findAllByBrandId(Long brandId);
}
