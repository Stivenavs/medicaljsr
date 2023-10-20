package co.edu.uniquindio.clinica.modelo.entidades;

import co.edu.uniquindio.clinica.enums.EstadoCita;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cita implements Serializable {

    @Id @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCita;

    @Column(name = "motivoConsula", nullable = false)
    private String motivo;

    @Column(nullable = false)
    private EstadoCita estadoCita;

    @Column(name = "fechaCita", nullable = false)
    private LocalDateTime fechadeAtencion;

    @Column(name = "FechaCreación", nullable = false)
    private LocalDateTime fechadeCreacion;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    @OneToMany(mappedBy = "cita")
    private List<Pqrs> pqrs;

    @OneToOne(mappedBy = "cita")
    private Atencion atencion;
}
