package com.sonabel.SITReS.servicedevis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentRespDto {
    private Long agentId;
    private String nom_agt;
    private String prenom_agt;
    private String service;
    private String departement;
    private Long posteId;
    private String posteNom;
    private String posteType;
}
