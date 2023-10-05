package com.sonabel.SITReS.servicedevis.service;

import com.sonabel.SITReS.servicedevis.dto.AgentDto;
import com.sonabel.SITReS.servicedevis.dto.AgentRespDto;
import com.sonabel.SITReS.servicedevis.entity.Agent;
import com.sonabel.SITReS.servicedevis.entity.Poste;
import com.sonabel.SITReS.servicedevis.mapper.AgentMapper;
import com.sonabel.SITReS.servicedevis.repo.AgentRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class AgentService {

    private final AgentRepo agentRepo;
    private final AgentMapper agentMapper;
    private final PosteService posteService;

//    methpd to create an agent
    public AgentDto createAgent(AgentDto agentDto) {
        log.info("inside createAgent method of AgentService");
        Poste poste = posteService.getById(agentDto.getPosteId());
        Agent agent = agentRepo.save(agentMapper.mapDtoToAgent(agentDto, poste));
        agentDto.setAgentId(agent.getAgentId());
        return agentDto;
    }

//    method to get a agent
    public AgentRespDto getAgent(Long agentId) {
        log.info("inside getAgent method of AgentService");
        Agent agent = agentRepo.getById(agentId);
        return agentMapper.mapToRespDto(agent);
    }

//    method to delete a agent
    public void deleteAgent(Long agentId) {
        log.info("inside deleteAAgent method of AgentService");
        Agent agent = this.agentRepo.getById(agentId);
        agentRepo.delete(agent);
    }

    public List<AgentRespDto> getAllAgent() {
        log.info("inside deleteAAgent method of AgentService");
        return agentRepo.findAll()
                .stream()
                .map(agentMapper::mapToRespDto)
                .collect(toList());
    }
}
