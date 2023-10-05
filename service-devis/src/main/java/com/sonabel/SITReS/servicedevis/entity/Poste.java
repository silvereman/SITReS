package com.sonabel.SITReS.servicedevis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Poste {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long posteId;
    private String reference;
    private String nom;
    private String type;
}
