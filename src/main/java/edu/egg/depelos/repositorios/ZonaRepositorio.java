
package edu.egg.depelos.repositorios;

import edu.egg.depelos.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaRepositorio extends JpaRepository<Zona, String>{
    
}
