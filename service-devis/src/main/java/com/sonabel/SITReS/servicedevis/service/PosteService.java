package com.sonabel.SITReS.servicedevis.service;

import com.sonabel.SITReS.servicedevis.entity.Poste;
import com.sonabel.SITReS.servicedevis.exception.NotFoundException;
import com.sonabel.SITReS.servicedevis.repo.PosteRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class PosteService {

    private final PosteRepo posteRepo;

    //    function to create a poste that will be assigned to the Db
    public Poste createPoste(Poste poste) {
        log.info("inside createPoste method of PosteService");
        Poste save = posteRepo.save(poste);
        poste.setPosteId(save.getPosteId());
        return poste;
    }

//    function to update a poste that already exists in DB
    public Poste updatePoste(Poste poste) {
        log.info("inside createPoste method of PosteService");
        Poste poste1 = posteRepo.save(poste);
        poste.setPosteId(poste1.getPosteId());
        return poste1;
    }

//    function to get all poste
    public List<Poste> getAll() {
        log.info("inside createPoste method of PosteService");
        return posteRepo.findAll();

    }

//    function to get a poste using an Id
    public Poste getById(Long posteId) {
        log.info("inside getById method of PosteService");
        return posteRepo.findByPosteId(posteId)
                .orElseThrow(() -> new NotFoundException("Aucun Poste de cet identifiant trouver" +posteId));
    }

//    function to get a poste by its name
    public Poste getByName(String name) {
        log.info("inside getById method of PosteService");
        return posteRepo.findByNom(name)
                .orElseThrow(() -> new NotFoundException("Aucun poste trove avec le nom" +name));
    }

//    function to delete a poste
    public Poste deletePoste(Long posteId) {
        log.info("inside deletePoste method of PosteService");
        Poste poste = this.getById(posteId);
        posteRepo.delete(poste);
        return poste;
    }
}
