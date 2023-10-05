package com.sonabel.SITReS.servicedevis.controller;

import com.sonabel.SITReS.servicedevis.entity.Poste;
import com.sonabel.SITReS.servicedevis.service.PosteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/poste")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class PosteController {

    private final PosteService posteService;

//    create function poste
    @PostMapping("/create")
    public ResponseEntity<Poste> createPoste(@RequestBody Poste poste) {
        log.info("inside createPoste method of PosteController");
        return ResponseEntity.status(CREATED).body(posteService.createPoste(poste));
    }

//    update a poste
    @PutMapping("/update")
    public ResponseEntity<Poste> updatePoste(@RequestBody Poste poste) {
        log.info("inside updatePoste method of PosteController");
        return ResponseEntity.status(CREATED).body(posteService.updatePoste(poste));
    }

//    get All poste
    @GetMapping("/all")
    public ResponseEntity<List<Poste>> getAll() {
        log.info("inside getAll method of PosteController");
        return ResponseEntity.status(OK).body(posteService.getAll());
    }

//    get a single poste by its id
    @GetMapping("/by-id/{id}")
    public ResponseEntity<Poste> getPosteById(@PathVariable("id") Long posteId) {
        log.info("inside getPosteById method of PosteController");
        return ResponseEntity.status(OK).body(posteService.getById(posteId));
    }

//    get a single poste using the name
    @GetMapping("/by-name/{name}")
    public ResponseEntity<Poste> getPosteByName(@PathVariable("name") String name) {
        log.info("inside getPosteByName method of PosteController");
        return ResponseEntity.status(OK).body(posteService.getByName(name));
    }

//    delete a poste
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Poste> deletePoste(@PathVariable("id") Long posteId) {
        log.info("inside deletePoste method of PosteController");
        return ResponseEntity.status(OK).body(posteService.deletePoste(posteId));
    }
}
