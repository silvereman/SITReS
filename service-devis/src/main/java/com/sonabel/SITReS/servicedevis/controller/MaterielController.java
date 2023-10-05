package com.sonabel.SITReS.servicedevis.controller;

import com.sonabel.SITReS.servicedevis.dto.MaterielDto;
import com.sonabel.SITReS.servicedevis.entity.Materiel;
import com.sonabel.SITReS.servicedevis.service.MaterielService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/materiel")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class MaterielController {

    private final MaterielService materielService;

//    function to create a materiel
    @PostMapping("/create")
    private ResponseEntity<MaterielDto> createMateriel(@RequestBody MaterielDto materielDto) {
        log.info("inside createMateriel of MaterielController");
        return ResponseEntity.status(CREATED).body(materielService.createMateriel(materielDto));
    }

//    function to get all materiel
    @GetMapping("/all")
    private ResponseEntity<List<Materiel>> getAll() {
        log.info("inside getAll of MaterielController");
        return ResponseEntity.status(OK).body(materielService.getAll());
    }

//    function to get a single materiel by it's Id
    @GetMapping("/by-id/{id}")
    private ResponseEntity<Materiel> getById(@PathVariable("id") Long materielId) {
        log.info("inside getById of MaterielController");
        return ResponseEntity.status(OK).body(materielService.getById(materielId));
    }

//    function to get a client by it's name
    @GetMapping("/by-name/{name}")
    private ResponseEntity<Materiel> getByName(@PathVariable("name") String nom) {
        log.info("inside getByName of MaterielController");
        return ResponseEntity.status(OK).body(materielService.getByName(nom));
    }

//    function to get a client by it's reference
    @GetMapping("/by-ref/{ref}")
    private  ResponseEntity<Materiel> getByRef(@PathVariable("ref") String ref) {
        log.info("inside getByRef of MaterielController");
        return ResponseEntity.status(OK).body(materielService.getByRef(ref));
    }

//    function to get a list of materiel by type
    @GetMapping("/by-type/{type}")
    private ResponseEntity<List<Materiel>> getByType(@PathVariable("type") String type) {
        log.info("inside getByType of MaterielController");
        return ResponseEntity.status(OK).body(materielService.getByType(type));
    }

//    function to update a materiel
    @PutMapping("/update")
    public ResponseEntity<MaterielDto> updateMateriel(@RequestBody MaterielDto materielDto) {
        log.info("inside updateMateriel of MaterielController");
        return ResponseEntity.status(OK).body(materielService.createMateriel(materielDto));
    }

//    function to delete a materiel
    @DeleteMapping("/delete/{id}")
    public void deleteMateriel(@PathVariable("id") Long materielId) {
        log.info("inside deleteMateriel of MaterielController");
        materielService.deleteById(materielId);
    }
}
