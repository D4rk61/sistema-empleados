package devminicontrolempleados.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor  @AllArgsConstructor
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty @NotNull
    @Column(name = "apellido")
    private String apellido;

    @Email @NotEmpty @NotNull
    private String email;

    @NotEmpty @NotNull
    @Column(name = "telefono")
    private String telefono;

    @Column(name = "genero")
    @NotEmpty @NotNull
    private String sexo;

    @Column(name = "direccion")
    @NotEmpty @NotNull
    private String direccion;

    @Column(name = "puesto")
    @NotEmpty @NotNull
    private String puesto;

    @Column(name = "salario")
    @NotEmpty @NotNull
    private double salario;

    @Column(name = "fecha_inicio")
    @NotEmpty @NotNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime fechaInicio;
}