package me.julia.sacola.service;

import me.julia.sacola.model.Item;
import me.julia.sacola.model.Sacola;
import me.julia.sacola.resource.dto.ItemDto;

public interface SacolaService {

    Item incluirItemSacola (ItemDto itemDto);
    Sacola verSacola (Long id);
    Sacola finalizarSacola (Long id, int formaPagamento);


}
