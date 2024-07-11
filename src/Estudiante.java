public class Estudiante {
    String nombre;
    String cedula;
    int b1;
    int b2;

    public Estudiante(String nombre, String cedula, int b1, int b2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getB2() {
        return b2;
    }

    public int getB1() {
        return b1;
    }

    public String getCedula() {
        return cedula;
    }
    public int getPromedio() {
        return (b1+ b2) / 2;
    }
}
