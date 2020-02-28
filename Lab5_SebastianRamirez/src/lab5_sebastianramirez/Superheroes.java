package lab5_sebastianramirez;
public class Superheroes {
    private String nombre,planeta;
    private int edad,altura,villanos_atrapados;
    private Superpoderes superpoder1,superpoder2,superpoder3;

    public Superheroes() {
    }
    
    public Superheroes(String nombre, String planeta, int edad, int altura, int villanos_atrapados, Superpoderes superpoder1) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.villanos_atrapados = villanos_atrapados;
        this.superpoder1 = superpoder1;
    }

    public Superheroes(String nombre, String planeta, int edad, int altura, int villanos_atrapados, Superpoderes superpoder1, Superpoderes superpoder2) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.villanos_atrapados = villanos_atrapados;
        this.superpoder1 = superpoder1;
        this.superpoder2 = superpoder2;
    }

    public Superheroes(String nombre, String planeta, int edad, int altura, int villanos_atrapados, Superpoderes superpoder1, Superpoderes superpoder2, Superpoderes superpoder3) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.villanos_atrapados = villanos_atrapados;
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

    public int getVillanos_atrapados() {
        return villanos_atrapados;
    }

    public void setVillanos_atrapados(int villanos_atrapados) {
        this.villanos_atrapados = villanos_atrapados;
    }

    @Override
    public String toString() {
        return "Superheroes";
    }
    
}
