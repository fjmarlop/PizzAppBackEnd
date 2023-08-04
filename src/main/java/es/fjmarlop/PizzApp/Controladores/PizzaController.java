package es.fjmarlop.PizzApp.Controladores;

import es.fjmarlop.PizzApp.Entidades.Pizza;
import es.fjmarlop.PizzApp.Servicios.PizzaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
public class PizzaController {

    private final PizzaService pizzaService;

    @GetMapping("/pizzas")
    public List<Pizza> getAllPizzas(){
        return pizzaService.getAllPizzas();
    }

    @GetMapping("/todas")
    public List<Pizza> todasLasPizzas(){
        return pizzaService.todasLasPizzas();
    }

    @GetMapping("/pizza/{id}")
    public ResponseEntity<Pizza> obtenerPizza(@PathVariable long id){
        try{
            Pizza pizza = pizzaService.pizzaporId(id);
            return new ResponseEntity<>(pizza, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping("/pizza")
    public void guardarPizza(@RequestBody Pizza pizza){
        pizzaService.guardarPizza(pizza);
    }

    @PutMapping("/pizza/{id}")
    public ResponseEntity<Pizza> actualizarPizza(@RequestBody Pizza pizza, @PathVariable long id){
        try{
            Pizza pizzaActual = pizzaService.pizzaporId(id);
            pizzaActual.setPizza_nombre(pizza.getPizza_nombre());
            pizzaService.guardarPizza(pizzaActual);
            return new ResponseEntity<>(pizza, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/pizza/{id}")
    public void eliminarPizza(@PathVariable long id){
        pizzaService.eliminarPizza(id);
    }
}
