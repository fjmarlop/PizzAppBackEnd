package es.fjmarlop.PizzApp.Servicios;

import es.fjmarlop.PizzApp.Entidades.Ingrediente;
import es.fjmarlop.PizzApp.Repositorios.IngredienteRepository.IngredienteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service
public class IngredienteService {

    private final IngredienteRepository ingredienteRepository;


    public List<Ingrediente> getIngredientesPizzaPorNombre(){
        return ingredienteRepository.getIngredientes();
    }


}
