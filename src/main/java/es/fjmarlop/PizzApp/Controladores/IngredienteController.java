package es.fjmarlop.PizzApp.Controladores;

import es.fjmarlop.PizzApp.Entidades.Ingrediente;
import es.fjmarlop.PizzApp.Servicios.IngredienteService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
public class IngredienteController {

    private final IngredienteService ingredienteService;

    @GetMapping("/ing")
    public List<Ingrediente> getIngredientesPizzaPorNombre(){
        return ingredienteService.getIngredientesPizzaPorNombre();
    }
}
