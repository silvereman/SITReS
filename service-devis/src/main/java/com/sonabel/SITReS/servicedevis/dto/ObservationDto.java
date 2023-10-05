package com.sonabel.SITReS.servicedevis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObservationDto {
    private Long ObservationId;
    private Long devisId;
    private String observation;
    private Boolean etat_obs;
    private Long auteur_obs;
    private Long correcteur_obs;
}
