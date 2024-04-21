package com.example.demo.Service;

import com.example.demo.Perzistent.ZanerEntity;
import com.example.demo.Perzistent.ZanerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ZanerService {

    private final ZanerRepository zanerRepository;

    @Autowired
    public ZanerService(ZanerRepository zanerRepository) {
        this.zanerRepository = zanerRepository;
    }

    public List<ZanerDTO> getAllZaners() {
        List<ZanerEntity> zanerEntities = zanerRepository.findAll();
        return zanerEntities.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public ZanerDTO getZanerById(Long id) {
        Optional<ZanerEntity> zanerEntityOptional = zanerRepository.findById(id);
        return zanerEntityOptional.map(this::mapToDTO).orElse(null);
    }

    public ZanerDTO createZaner(ZanerDTO zanerDTO) {
        ZanerEntity zanerEntity = mapToEntity(zanerDTO);
        ZanerEntity savedZanerEntity = zanerRepository.save(zanerEntity);
        return mapToDTO(savedZanerEntity);
    }

    public ZanerDTO updateZaner(Long id, ZanerDTO zanerDTO) {
        return zanerRepository.findById(id)
                .map(existingZanerEntity -> {
                    existingZanerEntity.setNazov(zanerDTO.getNazov());
                    // pokud máte další atributy k aktualizaci, tak je aktualizujte podobně jako nazov
                    return mapToDTO(zanerRepository.save(existingZanerEntity));
                })
                .orElse(null);
    }

    public void deleteZaner(Long id) {
        zanerRepository.deleteById(id);
    }

    private ZanerDTO mapToDTO(ZanerEntity zanerEntity) {
        return new ZanerDTO(
                zanerEntity.getId(),
                zanerEntity.getNazov(),
                zanerEntity.getPocetAnimeTotohoZanru(),
                zanerEntity.getNajlepsieHodnoteneAnime());
    }

    private ZanerEntity mapToEntity(ZanerDTO zanerDTO) {
        ZanerEntity zanerEntity = new ZanerEntity();
        zanerEntity.setId(zanerDTO.getId());
        zanerEntity.setNazov(zanerDTO.getNazov());
        zanerEntity.setPocetAnimeTotohoZanru(zanerDTO.getPocetAnimeTohtoZanru());
        zanerEntity.setNajlepsieHodnoteneAnime(zanerDTO.getNajlepsieHodnoteneAnime());
        return zanerEntity;
    }
}

