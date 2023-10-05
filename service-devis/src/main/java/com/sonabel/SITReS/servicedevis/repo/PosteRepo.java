package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PosteRepo extends JpaRepository<Poste, Long> {
    Optional<Poste> findByPosteId(Long posteId);

    Optional<Poste> findByNom(String name);
}
