package com.sonabel.SITReS.servicedevis.mapper;

import com.sonabel.SITReS.servicedevis.dto.AgentDto;
import com.sonabel.SITReS.servicedevis.dto.AgentRespDto;
import com.sonabel.SITReS.servicedevis.entity.Agent;
import com.sonabel.SITReS.servicedevis.entity.Poste;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class AgentMapper {

//    mapping a agent to the response DTO
    @Mapping(target = "posteId", expression = "java(agent.getPoste().getPosteId())")
    @Mapping(target = "posteNom", expression = "java(agent.getPoste().getNom())")
    @Mapping(target = "posteType", expression = "java(agent.getPoste().getType())")
//    @Mapping(target = "nom", source = "nom_agt")
//    @Mapping(target = "prenom", source = "prenom_agt")
    public abstract AgentRespDto mapToRespDto(Agent agent);

//    mapping a agentDto to an agent
    @Mapping(target = "poste", source = "poste")
    @Mapping(target = "agentId", ignore = true)
//    @Mapping(target = "nom_agt", source = "nom")
//    @Mapping(target = "prenom_agt", source = "prenom")
    public abstract Agent mapDtoToAgent(AgentDto agentDto, Poste poste);

}
