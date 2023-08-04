package es.fjmarlop.PizzApp.Repositorios.IngredienteRepository;

import es.fjmarlop.PizzApp.Entidades.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
