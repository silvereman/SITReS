package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.BonDeSortit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonDeSortitRepo extends JpaRepository<BonDeSortit, Long> {
}
