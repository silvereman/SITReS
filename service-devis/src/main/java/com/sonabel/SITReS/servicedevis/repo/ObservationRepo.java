package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.Observation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservationRepo extends JpaRepository<Observation, Long> {
}
