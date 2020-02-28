package lab5_sebastianramirez;
public class Villanos {
    private String nombre,planeta;
    private int edad,altura,muedes_causadas;
    private boolean carcel;
    private Superpoderes superpoder1,superpoder2,superpoder3;

    public Villanos() {
    }
    
    public Villanos(String nombre, String planeta, int edad, int altura, int muedes_causadas, boolean carcel, Superpoderes superpoder1, Superpoderes superpoder2) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.muedes_causadas = muedes_causadas;
        this.carcel = carcel;
        this.superpoder1 = superpoder1;
        this.superpoder2 = superpoder2;
    }

    public Villanos(String nombre, String planeta, int edad, int altura, int muedes_causadas, boolean carcel, Superpoderes superpoder1, Superpoderes superpoder2, Superpoderes superpoder3) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.muedes_causadas = muedes_causadas;
        this.carcel = carcel;
        this.superpoder1 = superpoder1;
        this.superpoder2 = superpoder2;
        this.superpoder3 = superpoder3;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getMuedes_causadas() {
        return muedes_causadas;
    }

    public void setMuedes_causadas(int muedes_causadas) {
        this.muedes_causadas = muedes_causadas;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    @Override
    public String toString() {
        return "Villanos";
    }
    
}
