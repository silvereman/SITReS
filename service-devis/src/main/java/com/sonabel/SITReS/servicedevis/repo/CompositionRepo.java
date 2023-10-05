package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.Composition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositionRepo extends JpaRepository<Composition, Long> {
}
