package com.example.demo.Service;

import com.example.demo.Perzistent.AnimeEntity;
import com.example.demo.Perzistent.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    public List<AnimeDTO> getAllAnime() {
        List<AnimeEntity> animeEntities = animeRepository.findAll();
        return animeEntities.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }
    public AnimeDTO getAnimeById(Long id) {
        Optional<AnimeEntity> animeEntityOptional = animeRepository.findById(id);
        return animeEntityOptional.map(this::mapToDTO).orElse(null);
    }
    public AnimeDTO createAnime(AnimeDTO animeDTO) {
        AnimeEntity animeEntity = mapToEntity(animeDTO);
        AnimeEntity savedAnimeEntity = animeRepository.save(animeEntity);
        return mapToDTO(savedAnimeEntity);
    }
    public AnimeDTO updateAnime(Long id, AnimeDTO animeDTO) {
        Optional<AnimeEntity> animeEntityOptional = animeRepository.findById(id);
        if (animeEntityOptional.isPresent()) {
            AnimeEntity existingAnimeEntity = animeEntityOptional.get();

            existingAnimeEntity.setNazov(animeDTO.getNazov());
            existingAnimeEntity.setRokVydania(animeDTO.getRokVydania());
            existingAnimeEntity.setNazovStudio(animeDTO.getNazovStudio());
            existingAnimeEntity.setNazovZaner(animeDTO.getNazovZaner());

            AnimeEntity updatedAnimeEntity = animeRepository.save(existingAnimeEntity);
            return mapToDTO(updatedAnimeEntity);
        } else {
            return null;
        }
    }
    public void deleteAnime(Long id) {
        animeRepository.deleteById(id);
    }
    private AnimeDTO mapToDTO(AnimeEntity animeEntity) {
        return new AnimeDTO(
                animeEntity.getId(),
                animeEntity.getNazov(),
                animeEntity.getRokVydania(),
                animeEntity.getNazovStudio(),
                animeEntity.getNazovZaner()
        );
    }
    private AnimeEntity mapToEntity(AnimeDTO animeDTO) {
        AnimeEntity animeEntity = new AnimeEntity();
        animeEntity.setId(animeDTO.getId());
        animeEntity.setNazov(animeDTO.getNazov());
        animeEntity.setRokVydania(animeDTO.getRokVydania());
        animeEntity.setNazovStudio(animeDTO.getNazovStudio());
        animeEntity.setNazovZaner(animeDTO.getNazovZaner());
        return animeEntity;
    }
}

