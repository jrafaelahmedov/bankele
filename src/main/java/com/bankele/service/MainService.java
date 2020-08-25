package com.bankele.service;

import com.bankele.entity.Atm;
import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import com.bankele.repository.AtmRepository;
import com.bankele.repository.BranchRepository;
import com.bankele.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rashid Shiralizade
 */

@Service
@RequiredArgsConstructor
public class MainService {

    private final AtmRepository atmRepository;
    private final BrandRepository brandRepository;
    private final BranchRepository branchRepository;


    public List<Brand> brandList() {
        return (List<Brand>) brandRepository.findAll();
    }

    public List<Branch> branchList(Long id) {
        return branchRepository.findAllByBrandId(id);
    }

    public List<Atm> atmList(Long id) {
        return atmRepository.findAllByBrandId(id);
    }

    public void saveAtm(Atm atm) {
        atmRepository.save(atm);
    }

    public void saveBranch(Branch branch) {
        branchRepository.save(branch);
    }

    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }

}
