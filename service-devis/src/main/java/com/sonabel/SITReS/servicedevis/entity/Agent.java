package com.sonabel.SITReS.servicedevis.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Agent {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long agentId;
    private String nom_agt;
    private String prenom_agt;
    private String service;
    private String departement;
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "posteId", referencedColumnName = "posteId")
    private Poste poste;
}
