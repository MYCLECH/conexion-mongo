package edu.cibertec.pc3postgresql.repository;

import edu.cibertec.pc3postgresql.entity.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, Integer> {
}
