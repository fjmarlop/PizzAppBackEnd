package es.fjmarlop.PizzApp.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfig {

   @Bean
    public JdbcTemplate pizzaAppJdbcTemplate(DataSource dataSource){
       return new JdbcTemplate(dataSource);
   }

   @Bean
    public NamedParameterJdbcTemplate pizzAppNamedParameterJdbcTemplate(JdbcTemplate jdbcTemplate){
       return new NamedParameterJdbcTemplate(jdbcTemplate);
   }

}
