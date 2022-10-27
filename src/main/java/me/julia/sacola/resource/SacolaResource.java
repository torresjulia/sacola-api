package me.julia.sacola.resource;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.julia.sacola.model.Item;
import me.julia.sacola.model.Sacola;
import me.julia.sacola.resource.dto.ItemDto;
import me.julia.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value="/ifood-devweek/sacolas")
@RestController
@RequestMapping(value = "/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemSacola(@RequestBody ItemDto itemDto) {

        return sacolaService.incluirItemSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola (@PathVariable("id") Long id) {
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola finalizarSacola (@PathVariable("sacolaId") Long sacolaId,
                                   @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.finalizarSacola(sacolaId, formaPagamento);
    }
}
