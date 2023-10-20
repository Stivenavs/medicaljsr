package co.edu.uniquindio.clinica;

import co.edu.uniquindio.clinica.dto.EmailDTO;
import co.edu.uniquindio.clinica.servicios.impl.EmailServicioImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServicioImplTest {

    @Autowired
    EmailServicioImpl emailServicio;
    @Test
    void enviarCorreo(){

        EmailDTO emailDTO = new EmailDTO("juans.rinconm@uqvirtual.edu.co", "Prueba", "Enviado");
        EmailDTO emailDTO2 = new EmailDTO("jhons.restrepor@uqvirtual.edu.co", "Prueba2", "Stiven es gay");

        try {
            emailServicio.enviarCorreo(emailDTO2);
            emailServicio.enviarCorreo(emailDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}