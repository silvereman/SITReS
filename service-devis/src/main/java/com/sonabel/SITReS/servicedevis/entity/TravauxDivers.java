package com.sonabel.SITReS.servicedevis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravauxDivers {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long travuxDivId;
    private String objet;
    private String reference;
    private Instant dateDebut;
    private Instant dateFin;
}
