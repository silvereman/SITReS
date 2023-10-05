package com.sonabel.SITReS.servicedevis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Devis {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long devisId;
    private String reference;
//    this is where the associated demande will reside
    @OneToMany(fetch = LAZY)
    private List<Composition> compositionList;
    private Long montantTva;
    private Long montantHtc;
    private Long montantTtc;
//    @OneToMany(fetch = LAZY)
//    private List<Observation> observations;
    private Boolean etatDevis;
    private Boolean validationChefSection;
    private Boolean validationChefService;
    private Boolean validationChefDpt;
    @OneToOne(fetch = LAZY)
    private Agent auteur;
    private String position;
    private String codePromo;

}
