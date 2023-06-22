package edu.cibertec.pc3postgresql.controller;

import edu.cibertec.pc3postgresql.entity.Ubigeo;
import edu.cibertec.pc3postgresql.service.UbigeoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ubigeos")
@AllArgsConstructor
public class UbigeoController {

    private UbigeoService ubigeoService;

    @GetMapping
    public List<Ubigeo> listar() {
        return ubigeoService.listar();
    }
}
