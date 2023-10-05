package com.sonabel.SITReS.servicedevis.mapper;

import com.sonabel.SITReS.servicedevis.dto.MaterielDto;
import com.sonabel.SITReS.servicedevis.entity.Materiel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MaterielMapper {

    //    mapping to a Dto
    @Mapping(target = "materielId", ignore = true)
    public abstract Materiel map(MaterielDto materielDto);
}
