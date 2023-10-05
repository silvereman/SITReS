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
public class Observation {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long ObservationId;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "devisId", referencedColumnName = "devisId")
    private Devis devis;
    @Lob
    private String observation;
    private Boolean etat_obs;
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "agentId", referencedColumnName = "agentId", insertable = false, updatable = false)
    private Agent auteur_obs;
    private String dateCreation;
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "agentId", referencedColumnName = "agentId", insertable = false, updatable = false)
    private Agent correcteur_obs;
    private String dateCorrection;
}
