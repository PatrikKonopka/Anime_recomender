package com.example.demo;

import com.example.demo.Service.ZanerDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZanerTests {
    @Test
    void createZanerInstance() {
        // Vytvorenie inštancie Zaner
        ZanerDTO zaner = new ZanerDTO(1L, "Akčný", 20, "Naruto");

        // Overenie, že inštancia nie je null
        assertNotNull(zaner);

        // Overenie, že ID žánru sa nastavilo správne
        assertEquals(1L, zaner.getId());

        // Overenie, že názov žánru sa nastavil správne
        assertEquals("Akčný", zaner.getNazov());

        // Overenie, že počet anime tohto žánru sa nastavil správne
        assertEquals(20, zaner.getPocetAnimeTohtoZanru());

        // Overenie, že najlepšie hodnotené anime v tomto žánri sa nastavilo správne
        assertEquals("Naruto", zaner.getNajlepsieHodnoteneAnime());
    }
}
