
public class Librocalificaciones {
    //Atributos del curso
    private String nombreDelCurso;
    private String nombreDelInstructor;
    
    public Librocalificaciones(String n, String i){
        nombreDelCurso = n; 
        nombreDelInstructor = i;
    }
    public void setNombreDelCurso(String n){
        this.nombreDelCurso = n;
    }
    public String getNombreDelCurso(){
        return nombreDelCurso;
    }
    public void setNombreDelInstructor(String i){
        this.nombreDelInstructor = i;
    }
    public String getNombreDelInstructor(){
        return nombreDelInstructor;
    }
    //Indica qué se va a mostrar
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al Libro de calificaciones para \n%s!\n",
                getNombreDelCurso());
        System.out.printf("Este curso será impartido por: \n%s!\n",
                getNombreDelInstructor());
    }
}
