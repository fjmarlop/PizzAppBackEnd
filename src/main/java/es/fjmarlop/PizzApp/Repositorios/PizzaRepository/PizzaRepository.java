package es.fjmarlop.PizzApp.Repositorios.PizzaRepository;

import es.fjmarlop.PizzApp.Entidades.Pizza;
import lombok.Data;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Data
@Repository
public class PizzaRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final IPizzaRepository pizzaRepository;

    public List<Pizza> getAllPizzas() {
        String sql = "SELECT * FROM pizzas";
        return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pizza.class));
    }

    public List<Pizza> todasLasPizzas() {
        return pizzaRepository.findAll();
    }

    public void guardarPizza(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    public Pizza pizzaporId(long id) {
        return pizzaRepository.findById(id).get();
    }

    public void eliminarPizza(long id){
        pizzaRepository.deleteById(id);
    }
}
