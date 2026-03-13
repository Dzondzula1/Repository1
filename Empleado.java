import java.time.LocalDate;
import java.util.Objects;

public class Empleado
{
     private static Integer NEempleado;
     private final String DNI;
     private final String nombre;
     private final LocalDate fechaContrato;
     private int numeroHijos = 0;
     private Double sueldo;
     private static final String nombreEmpresa = "Empresa3434";

    public Empleado(String DNI, String nombre, LocalDate fechaContrato, int numeroHijos, Double sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaContrato = fechaContrato;
        this.numeroHijos = numeroHijos;
        this.sueldo = sueldo;
        Empleado.NEempleado++;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaContrato=" + fechaContrato +
                ", numeroHijos=" + numeroHijos +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(DNI, empleado.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
    public double subirSueldo(double porcentaje)
    {
        return this.sueldo * (porcentaje / 100);
    }
    public int actualizarHijos(int numeroHijos)
    {
        return this.numeroHijos = numeroHijos;
    }
    public double calculaSueldoMes(int antiguedadEnAnios)
    {
        this.sueldo += this.sueldo + (this.numeroHijos + 100) + (antiguedadEnAnios + 100);
        return this.sueldo;
    }
}


