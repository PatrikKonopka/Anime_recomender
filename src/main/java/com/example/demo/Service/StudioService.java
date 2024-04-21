package com.example.demo.Service;

import com.example.demo.Perzistent.StudioEntity;
import com.example.demo.Perzistent.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudioService {

    private final StudioRepository studioRepository;

    @Autowired
    public StudioService(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }

    public List<StudioDTO> getAllStudios() {
        List<StudioEntity> studioEntities = studioRepository.findAll();
        return studioEntities.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public StudioDTO getStudioById(Long id) {
        Optional<StudioEntity> studioEntityOptional = studioRepository.findById(id);
        return studioEntityOptional.map(this::mapToDTO).orElse(null);
    }

    public StudioDTO createStudio(StudioDTO studioDTO) {
        StudioEntity studioEntity = mapToEntity(studioDTO);
        StudioEntity savedStudioEntity = studioRepository.save(studioEntity);
        return mapToDTO(savedStudioEntity);
    }

    public StudioDTO updateStudio(Long id, StudioDTO studioDTO) {
        return studioRepository.findById(id)
                .map(existingStudioEntity -> {
                    existingStudioEntity.setNazov(studioDTO.getNazov());
                    existingStudioEntity.setPocet_vydanych_anime(studioDTO.getPocet_vydanych_anime());
                    existingStudioEntity.setHodnotenie(studioDTO.getHodnotenie());

                    return mapToDTO(studioRepository.save(existingStudioEntity));
                })
                .orElse(null);
    }

    public void deleteStudio(Long id) {
        studioRepository.deleteById(id);
    }

    private StudioDTO mapToDTO(StudioEntity studioEntity) {
        return new StudioDTO(
                studioEntity.getId(),
                studioEntity.getNazov(),
                studioEntity.getPocet_vydanych_anime(),
                studioEntity.getHodnotenie());
    }

    private StudioEntity mapToEntity(StudioDTO studioDTO) {
        StudioEntity studioEntity = new StudioEntity();
        studioEntity.setId(studioDTO.getId());
        studioEntity.setNazov(studioDTO.getNazov());
        studioEntity.setPocet_vydanych_anime(studioDTO.getPocet_vydanych_anime());
        studioEntity.setHodnotenie(studioDTO.getHodnotenie());
        return studioEntity;
    }
}

