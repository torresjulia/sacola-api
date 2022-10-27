package me.julia.sacola.resource.dto;

import lombok.*;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Embeddable
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long sacolaId;

}
