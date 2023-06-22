package edu.cibertec.pc3postgresql.service.impl;

import edu.cibertec.pc3postgresql.entity.Ubigeo;
import edu.cibertec.pc3postgresql.repository.UbigeoRepository;
import edu.cibertec.pc3postgresql.service.UbigeoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UbigeoServiceImpl implements UbigeoService {

    private UbigeoRepository repo;

    @Override
    public List<Ubigeo> listar() {
        return repo.findAll();
    }
}
