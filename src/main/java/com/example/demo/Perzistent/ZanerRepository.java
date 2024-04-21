package com.example.demo.Perzistent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZanerRepository extends JpaRepository<ZanerEntity, Long> {
    // Ak potrebujete špecifické metódy pre ZanerRepository, môžete ich pridať tu
}