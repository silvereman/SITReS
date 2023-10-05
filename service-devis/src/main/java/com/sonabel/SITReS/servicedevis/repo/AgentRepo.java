package com.sonabel.SITReS.servicedevis.repo;

import com.sonabel.SITReS.servicedevis.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Long> {
}
