package com.sonabel.SITReS.servicedevis.dto;

import brave.internal.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompositionDto {
    private Long compositonId;
    private String reference;
    private String nom;
    private String unite;
    private String type;
    @Nullable
    private List<Long> materiels;
    @Nullable
    private List<Long> compositions;
}
