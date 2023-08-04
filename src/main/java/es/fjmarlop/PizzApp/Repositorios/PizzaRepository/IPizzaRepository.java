package es.fjmarlop.PizzApp.Repositorios.PizzaRepository;

import es.fjmarlop.PizzApp.Entidades.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Long> {


}
