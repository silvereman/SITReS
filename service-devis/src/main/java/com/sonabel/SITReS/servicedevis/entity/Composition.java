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
public class Composition {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long compositionId;
    private String reference;
    private String nom;
    private String unite;
    private String type;
    @OneToMany(fetch = LAZY)
    private List<Materiel> materiels;
    @OneToMany(fetch = LAZY)
    private List<Composition> compositions;
    private Long prix;
}
