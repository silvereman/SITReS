package com.sonabel.SITReS.servicedevis.controller;

import com.sonabel.SITReS.servicedevis.dto.AgentDto;
import com.sonabel.SITReS.servicedevis.dto.AgentRespDto;
import com.sonabel.SITReS.servicedevis.service.AgentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/agent")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class AgentController {

    private final AgentService agentService;

//   function to create a Agent
    @PostMapping("/create")
    public ResponseEntity<AgentDto> createAgent(@RequestBody AgentDto agentDto) {
        log.info("inside createAgent method of AgentController");
        return ResponseEntity.status(CREATED).body(agentService.createAgent(agentDto));
    }

//    function to a get all agents
    @GetMapping("/all")
    public ResponseEntity<List<AgentRespDto>> getAllAgent() {
        log.info("inside getAgent method of AgentController");
        return ResponseEntity.status(OK).body(agentService.getAllAgent());
    }

//    function to find a single agent
    @GetMapping("/find/{id}")
    public ResponseEntity<AgentRespDto> getAgent(@PathVariable("id") Long agentId) {
        log.info("inside getAgent method of AgentController");
        return ResponseEntity.status(OK).body(agentService.getAgent(agentId));
    }

//    function to find a agent by it's name, work in progress

//    function fonction to update a agent
    @PutMapping("/update")
    public ResponseEntity<AgentDto> updateAgent(@RequestBody AgentDto agentDto) {
        log.info("inside updateAgent method of AgentController");
        return ResponseEntity.status(OK).body(agentService.createAgent(agentDto));
    }

//    function to delete an Agent
    @DeleteMapping("/delete/{id}")
    public void deleteAgent(@PathVariable("id") Long agentId) {
        log.info("inside deleteAgent method of AgentController");
        agentService.deleteAgent(agentId);
    }

}
