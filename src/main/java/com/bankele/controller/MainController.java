package com.bankele.controller;

import com.bankele.entity.Atm;
import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import com.bankele.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rashid Shiralizade
 */

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping(path = "brand-list", produces = "application/json")
    public ResponseEntity<List<Brand>> brandList() {
        return ResponseEntity.ok(mainService.brandList());
    }

    @GetMapping(path = "branch-list/{brandId}", produces = "application/json")
    public ResponseEntity<List<Branch>> branchList(@PathVariable Long brandId) {
        return ResponseEntity.ok(mainService.branchList(brandId));
    }

    @GetMapping(path = "atm-list/{brandId}", produces = "application/json")
    public ResponseEntity<List<Atm>> atmList(@PathVariable Long brandId) {
        return ResponseEntity.ok(mainService.atmList(brandId));
    }
}
