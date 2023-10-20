package co.edu.uniquindio.clinica.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Atencion implements Serializable {

    @Id @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Lob()
    @NotNull private String diagnostico;

    @Lob()
    @NotNull private String tratamiento;

    @Column(name="notasMédicas", length = 100)
    @NotNull private String notasMedicas;

    @OneToOne
    private Cita cita;


}
