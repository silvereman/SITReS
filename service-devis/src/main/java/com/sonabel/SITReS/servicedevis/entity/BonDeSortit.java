package com.sonabel.SITReS.servicedevis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BonDeSortit {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long bonId;
    private String reference;
    private String position;
    private Instant dateCreation;
    @OneToMany(fetch = LAZY)
    private List<Composition> compositions;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "devisId", referencedColumnName = "devisId")
    private Devis devis;
}
