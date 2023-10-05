package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MaterielRepo extends JpaRepository<Materiel, Long> {
    Optional<Materiel> findByNom(String nom);

    Optional<Materiel> findByReference(String ref);

    Optional<List<Materiel>> findByType(String type);
}
