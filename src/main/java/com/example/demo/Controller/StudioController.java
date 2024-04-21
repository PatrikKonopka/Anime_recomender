package com.example.demo.Controller;

import com.example.demo.Service.StudioDTO;
import com.example.demo.Service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studio")
public class StudioController {

    private final StudioService studioService;

    @Autowired
    public StudioController(StudioService studioService) {
        this.studioService = studioService;
    }

    @GetMapping("/all")
    public List<StudioDTO> getAllStudios() {
        return studioService.getAllStudios();
    }

    @GetMapping("/{id}")
    public StudioDTO getStudioById(@PathVariable Long id) {
        return studioService.getStudioById(id);
    }

    @PostMapping("/create")
    public StudioDTO createStudio(@RequestBody StudioDTO studioDTO) {
        return studioService.createStudio(studioDTO);
    }

    @PutMapping("/{id}")
    public StudioDTO updateStudio(@PathVariable Long id, @RequestBody StudioDTO studioDTO) {
        return studioService.updateStudio(id, studioDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStudio(@PathVariable Long id) {
        studioService.deleteStudio(id);
    }
}

