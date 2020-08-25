package com.bankele.repository;

import com.bankele.entity.Atm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Rashid Shiralizade
 */
@Repository
public interface AtmRepository extends CrudRepository<Atm, Long> {
    List<Atm> findAllByBrandId(Long brandId);




}
