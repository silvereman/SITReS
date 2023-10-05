package com.sonabel.SITReS.servicedevis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObservationResponse {
    private Long ObservationId;
    private String refDevis;
    private Boolean etatDevis;
    private String positionDevis;
    private String observation;
    private Boolean etat_obs;
    private Long auteur_obs;
    private Instant dateCreation;
    private Long correcteur_obs;
    private Instant dateCorrection;
}
