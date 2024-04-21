package com.example.demo.Perzistent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<AnimeEntity, Long> {
    // Ak potrebujete špecifické metódy pre AnimeRepository, môžete ich pridať tu
}

