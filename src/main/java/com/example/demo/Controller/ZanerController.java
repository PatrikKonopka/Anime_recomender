package com.example.demo.Controller;

import com.example.demo.Service.ZanerDTO;
import com.example.demo.Service.ZanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zaner")
public class ZanerController {

    private final ZanerService zanerService;

    @Autowired
    public ZanerController(ZanerService zanerService) {
        this.zanerService = zanerService;
    }

    @GetMapping("/all")
    public List<ZanerDTO> getAllZaners() {
        return zanerService.getAllZaners();
    }

    @GetMapping("/{id}")
    public ZanerDTO getZanerById(@PathVariable Long id) {
        return zanerService.getZanerById(id);
    }

    @PostMapping("/create")
    public ZanerDTO createZaner(@RequestBody ZanerDTO zanerDTO) {
        return zanerService.createZaner(zanerDTO);
    }

    @PutMapping("/{id}")
    public ZanerDTO updateZaner(@PathVariable Long id, @RequestBody ZanerDTO zanerDTO) {
        return zanerService.updateZaner(id, zanerDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteZaner(@PathVariable Long id) {
        zanerService.deleteZaner(id);
    }
}
