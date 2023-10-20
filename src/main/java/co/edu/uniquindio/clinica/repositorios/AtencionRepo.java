package co.edu.uniquindio.clinica.repositorios;

import co.edu.uniquindio.clinica.modelo.entidades.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtencionRepo extends JpaRepository <Atencion, Integer> {

    List<Atencion> findAllByCodigo(int codigoAtencion);

}
