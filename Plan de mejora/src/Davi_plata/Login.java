package Davi_plata;

public class Login extends Inicio {
    private String  nombre, nombreUsuario;
    private int Contraseña;

    public Login() {}

    public Login(String nombre, String nombreUsuario, int contraseña) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public int getContraseña() {
        return Contraseña;
    }
    public void setContraseña(int contraseña) {
        Contraseña = contraseña;
    }

    public void ingresar() {
        System.out.println(nombre);
        System.out.println(nombreUsuario);
        /*System.out.println(Contraseña);*/
    }   
}