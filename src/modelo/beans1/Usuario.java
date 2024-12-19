package modelo.beans1;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
*Crea objetos de tipo usuario.
 **/
 public class Usuario {
    private String nombre;
    private String usuario;
    private String contraseña;
    private String correo;
    private ArrayList<Tarea> tareas;
   /**
    * Constructor usuario.
     * @param nombre.
     * @param contraseña.
     * @param correo.
     * @param usuario. 
     **/
    public Usuario(String nombre, String usuario, String contraseña, String correo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        tareas = new ArrayList<Tarea>();
    }
    /**
     * @return lista con todas las tareas que tiene el usuario.
     **/
    public ArrayList<Tarea> lista(){
        return tareas;
    }
    /**
     * Agregar una tarea a la lista de tareas.
     * @param tarea.
     **/
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    /**
     * Buscar una tarea por su nombre.
     * @param tarea.
     * @return posición en la que se encuentra la tarea en la lista de tareas.
     **/
    public int buscar(String tarea){
        int n = -1;
        for(int i = 0 ; i < tareas.size();i++){
            if(tareas.get(i).getNombre().equals(tarea)){
                n = i ;
                break;
            }
                }
        return n;
    }
    /**
     * Obtener una tarea de la lista de tareas del usuario.
     * @param tarea.
     * @return la tarea con el nombre ingresado en el parametro.
     **/
    public Tarea obtener(String tarea){
         if(buscar(tarea) != -1){
            return tareas.get(buscar(tarea));
        }else{return null;}
    }
    /**
     * Eliminar una tarea de la lista de tareas.
     * @param tarea.
     * @return boolean la terea se elimino.
     **/
   public boolean eliminar(String tarea){
        if(buscar(tarea)!= -1){
            tareas.remove(buscar(tarea));
            return true;
        }else{
            return false;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }
}