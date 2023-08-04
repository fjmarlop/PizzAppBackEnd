package es.fjmarlop.PizzApp.Servicios;

import es.fjmarlop.PizzApp.Entidades.Pizza;
import es.fjmarlop.PizzApp.Repositorios.PizzaRepository.PizzaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizzas(){
        return pizzaRepository.getAllPizzas();
    }

    public List<Pizza> todasLasPizzas(){
        return pizzaRepository.todasLasPizzas();
    }

    public void guardarPizza(Pizza pizza) {
        pizzaRepository.guardarPizza(pizza);
    }

    public Pizza pizzaporId(long id) {
        return pizzaRepository.pizzaporId(id);
    }

    public void eliminarPizza(long id){
        pizzaRepository.eliminarPizza(id);
    }
}
