
package Clases;
/**
 *
 * @author Santiago Avendaño y Andres Lopez 
 */
public class Cancion {
    
    private String Titulo;
    private int Id;
    private int Año;
    private double Duracion;
    private String Genero;
    private String Caratula;
    private String Descripcion;
    
    public Cancion(){
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCaratula() {
        return Caratula;
    }

    public void setCaratula(String Caratula) {
        this.Caratula = Caratula;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
     
    public void Mostrar() {
        System.out.println("Titulo de la cancion: "+getTitulo());
        System.out.println("Indetificacion: "+getId());
        System.out.println("Fecha de la cancion: "+getAño());
        System.out.println("Duracion de la cancion: "+getDuracion());
        System.out.println("Genero de la cancion: "+getGenero());
        System.out.println("Caratula: "+getCaratula());
        System.out.println("Descripcion: "+getDescripcion());
        
    }

   
    
       
}
