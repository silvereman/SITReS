package com.sonabel.SITReS.servicedevis.mapper;

import com.sonabel.SITReS.servicedevis.dto.MaterielDto;
import com.sonabel.SITReS.servicedevis.entity.Materiel;
import com.sonabel.SITReS.servicedevis.entity.Materiel.MaterielBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-15T18:09:27+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 12.0.1 (Oracle Corporation)"
)
@Component
public class MaterielMapperImpl extends MaterielMapper {

    @Override
    public Materiel map(MaterielDto materielDto) {
        if ( materielDto == null ) {
            return null;
        }

        MaterielBuilder materiel = Materiel.builder();

        materiel.reference( materielDto.getReference() );
        materiel.type( materielDto.getType() );
        materiel.nom( materielDto.getNom() );
        materiel.unite( materielDto.getUnite() );
        materiel.prixUnitaire( materielDto.getPrixUnitaire() );

        return materiel.build();
    }
}
