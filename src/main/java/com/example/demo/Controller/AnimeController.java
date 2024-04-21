package com.example.demo.Controller;

import com.example.demo.Service.AnimeDTO;
import com.example.demo.Service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anime")
public class AnimeController {

    private final AnimeService animeService;

    @Autowired
    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/all")
    public List<AnimeDTO> getAllAnime() {
        return animeService.getAllAnime();
    }

    @GetMapping("/{id}")
    public AnimeDTO getAnimeById(@PathVariable Long id) {
        return animeService.getAnimeById(id);
    }

    @PostMapping("/create")
    public AnimeDTO createAnime(@RequestBody AnimeDTO animeDTO) {
        return animeService.createAnime(animeDTO);
    }

    @PutMapping("/update/{id}")
    public AnimeDTO updateAnime(@PathVariable Long id, @RequestBody AnimeDTO animeDTO) {
        return animeService.updateAnime(id, animeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnime(@PathVariable Long id) {
        animeService.deleteAnime(id);
    }
}
