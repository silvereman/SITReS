package com.sonabel.SITReS.servicedevis.mapper;

import com.sonabel.SITReS.servicedevis.dto.ObservationDto;
import com.sonabel.SITReS.servicedevis.entity.Agent;
import com.sonabel.SITReS.servicedevis.entity.Devis;
import com.sonabel.SITReS.servicedevis.entity.Observation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ObservationMapper {

//    mapping dto to entity
    @Mapping(target = "ObservationId", ignore = true)
    @Mapping(target = "devis", source = "devis")
    @Mapping(target = "observation", source = "observationDto.observation")
    @Mapping(target = "etat_obs", constant = "")
    @Mapping(target = "auteur_obs", source = "auteur_obs")
    @Mapping(target = "correcteur_obs", ignore = true)
    public abstract Observation map(ObservationDto observationDto, Devis devis, Agent auteur_obs);

//    mapping dto to entity, case of the correction
    @Mapping(target = "ObservationId", ignore = true)
    @Mapping(target = "devis", source = "devis")
    @Mapping(target = "observation", source = "observationDto.observation")
    @Mapping(target = "etat_obs", constant = "")
    @Mapping(target = "auteur_obs", source = "auteur_obs")
    @Mapping(target = "correcteur_obs", ignore = true)
    public abstract Observation mapCor(ObservationDto observationDto, )
}
