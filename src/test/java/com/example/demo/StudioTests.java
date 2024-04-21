package com.example.demo;

import com.example.demo.Service.StudioDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudioTests {

    @Test
    void createStudioInstance() {
        // Vytvorenie inštancie Studio
        StudioDTO studio = new StudioDTO(1L, "Studio Pierrot", 10, 7);

        // Overenie, že inštancia nie je null
        assertNotNull(studio);

        // Overenie, že ID štúdia sa nastavilo správne
        assertEquals(1L, studio.getId());

        // Overenie, že názov štúdia sa nastavil správne
        assertEquals("Studio Pierrot", studio.getNazov());

        // Overenie, že počet vydaných anime sa nastavil správne
        assertEquals(10, studio.getPocet_vydanych_anime());

        // Overenie, že hodnotenie štúdia sa nastavilo správne
        assertEquals(7, studio.getHodnotenie());
    }
}
