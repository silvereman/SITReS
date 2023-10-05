package com.sonabel.SITReS.servicedevis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MaterielDto {
    private Long materielId;
    private String reference;
    private String type;
    private String nom;
    private String unite;
    private Long prixUnitaire;
}
