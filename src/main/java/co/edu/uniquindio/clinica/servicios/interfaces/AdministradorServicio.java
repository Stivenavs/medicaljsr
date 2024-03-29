package co.edu.uniquindio.clinica.servicios.interfaces;

import co.edu.uniquindio.clinica.dto.*;
import co.edu.uniquindio.clinica.dto.admin.DetalleMedicoDTO;
import co.edu.uniquindio.clinica.dto.admin.ItemMedicoDTO;
import co.edu.uniquindio.clinica.dto.admin.RegistroMedicoDTO;
import co.edu.uniquindio.clinica.dto.RegistroRespuestaDTO;
import co.edu.uniquindio.clinica.dto.admin.*;
import co.edu.uniquindio.clinica.enums.EstadoPQRS;


import java.util.List;

public interface AdministradorServicio {

    int crearDoctor(RegistroMedicoDTO medico) throws Exception;

    int actualizarDoctor(DetalleMedicoDTO medicoDTO) throws Exception;

    void eliminarDoctor(int codigo) throws Exception;
    List <ItemMedicoDTO> listarDoctores() throws Exception;

    DetalleMedicoDTO obtenerDoctor(int codigo) throws Exception;

    List<ItemPQRSDTO> listarPQRS() throws Exception;

    DetallePQRSDTO verDetallePQRS(int codigo) throws Exception;

    int contestarPQRS(RegistroRespuestaDTO registroRespuestaDTO) throws Exception;


    void cambiarEstadoPQRS(int codigoPQRS, EstadoPQRS estadoPQRS) throws Exception;


    List<ItemCitaAdminDTO> listarCitas() throws Exception;
}
