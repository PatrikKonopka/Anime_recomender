package com.example.demo.Perzistent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioRepository extends JpaRepository<StudioEntity, Long> {
    // Ak potrebujete špecifické metódy pre StudioRepository, môžete ich pridať tu
}
