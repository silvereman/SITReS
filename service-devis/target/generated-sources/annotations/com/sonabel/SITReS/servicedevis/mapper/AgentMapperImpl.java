package com.sonabel.SITReS.servicedevis.mapper;

import com.sonabel.SITReS.servicedevis.dto.AgentDto;
import com.sonabel.SITReS.servicedevis.dto.AgentRespDto;
import com.sonabel.SITReS.servicedevis.dto.AgentRespDto.AgentRespDtoBuilder;
import com.sonabel.SITReS.servicedevis.entity.Agent;
import com.sonabel.SITReS.servicedevis.entity.Agent.AgentBuilder;
import com.sonabel.SITReS.servicedevis.entity.Poste;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-15T11:13:09+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 12.0.1 (Oracle Corporation)"
)
@Component
public class AgentMapperImpl extends AgentMapper {

    @Override
    public AgentRespDto mapToRespDto(Agent agent) {
        if ( agent == null ) {
            return null;
        }

        AgentRespDtoBuilder agentRespDto = AgentRespDto.builder();

        agentRespDto.agentId( agent.getAgentId() );
        agentRespDto.nom_agt( agent.getNom_agt() );
        agentRespDto.prenom_agt( agent.getPrenom_agt() );
        agentRespDto.service( agent.getService() );
        agentRespDto.departement( agent.getDepartement() );

        agentRespDto.posteId( agent.getPoste().getPosteId() );
        agentRespDto.posteNom( agent.getPoste().getNom() );
        agentRespDto.posteType( agent.getPoste().getType() );

        return agentRespDto.build();
    }

    @Override
    public Agent mapDtoToAgent(AgentDto agentDto, Poste poste) {
        if ( agentDto == null && poste == null ) {
            return null;
        }

        AgentBuilder agent = Agent.builder();

        if ( agentDto != null ) {
            agent.nom_agt( agentDto.getNom_agt() );
            agent.prenom_agt( agentDto.getPrenom_agt() );
            agent.service( agentDto.getService() );
            agent.departement( agentDto.getDepartement() );
        }
        if ( poste != null ) {
            agent.poste( poste );
        }

        return agent.build();
    }
}
