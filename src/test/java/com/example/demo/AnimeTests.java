package com.example.demo;

import com.example.demo.Service.AnimeDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeTests {
    @Test
    void createAnimeInstance() {
        // Vytvoriť inštanciu Anime
        AnimeDTO anime;
        anime = new AnimeDTO(3,"Naruto", 2021, "PROANIME", "Sport");
        // Overiť, že inštancia nie je null
        assertNotNull(anime);

        // Overenie, že ID štúdia sa nastavilo správne
        assertEquals(3, anime.getId());

        // Overiť, že názov anime sa nastavil správne
        assertEquals("Naruto", anime.getNazov());

        // Overiť, že rok vydania anime sa nastavil správne
        assertEquals(2021, anime.getRokVydania());

        // Overiť, že štúdio anime sa nastavilo správne
        assertEquals("PROANIME", anime.getNazovStudio());

        // Overenie, že ID štúdia sa nastavilo správne
        assertEquals("Sport", anime.getNazovZaner());


    }
}