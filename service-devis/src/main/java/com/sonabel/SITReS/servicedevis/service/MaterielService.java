package com.sonabel.SITReS.servicedevis.service;

import com.sonabel.SITReS.servicedevis.dto.MaterielDto;
import com.sonabel.SITReS.servicedevis.entity.Materiel;
import com.sonabel.SITReS.servicedevis.exception.NotFoundException;
import com.sonabel.SITReS.servicedevis.mapper.MaterielMapper;
import com.sonabel.SITReS.servicedevis.repo.MaterielRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class MaterielService {

    private final MaterielRepo materielRepo;
    private final MaterielMapper materielMapper;

//    mathod to save a client
    public MaterielDto createMateriel(MaterielDto materielDto) {
        log.info("inside createMateriel of MaterielService");
        Materiel materiel = materielRepo.save(materielMapper.map(materielDto));
        materielDto.setMaterielId(materiel.getMaterielId());
        return materielDto;
    }

//    mathod to get a list of all clients
    public List<Materiel> getAll() {
        log.info("inside getAll of MaterielService");
        return materielRepo.findAll();
    }

//    method to get a client by its id
    public Materiel getById(Long materielId) {
        log.info("inside getById of MaterielService");
        return materielRepo.findById(materielId)
                .orElseThrow(() -> new NotFoundException("Aucun Materiel trouver"));
    }

//    method to find a client by it's name
    public Materiel getByName(String nom) {
        log.info("inside getByName of MaterielService");
        return materielRepo.findByNom(nom)
                .orElseThrow(() -> new NotFoundException("Aucun Materiel trouver"));
    }

//    method to find a client by it's reference
    public Materiel getByRef(String ref) {
        log.info("inside getByRef of MaterielService");
        return materielRepo.findByReference(ref)
                .orElseThrow(() -> new NotFoundException("Aucun Materiel trouver"));
    }

//    method to find a maeteriel by its type
    public List<Materiel> getByType(String type) {
        log.info("inside getByType of MaterielService");
        return materielRepo.findByType(type)
                .orElseThrow(() -> new NotFoundException("Aucun Materiel trouver"));
    }

//    method to delete a client
    public void deleteById(Long materielId) {
        log.info("inside deleteById of MaterielService");
        materielRepo.deleteById(materielId);
    }
}
