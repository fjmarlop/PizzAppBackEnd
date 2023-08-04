package es.fjmarlop.PizzApp.Repositorios.IngredienteRepository;

import es.fjmarlop.PizzApp.Entidades.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class IngredienteRepository{

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final IIngredienteRepository ingredienteRepository;


    public List<Ingrediente> getIngredientes(){
        String sql = "SELECT i.ingrediente_nombre FROM pizzas p JOIN pizzas_ingredientes pi ON p.pizzaID = pi.pizzaID JOIN ingredientes i ON pi.ingredienteID = i.ingredienteID WHERE p.pizza_nombre = 'Suprema'";
            return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Ingrediente.class));
    }

}



