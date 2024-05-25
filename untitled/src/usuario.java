public class usuario {
    private String Nombre;
    private String Contraseña;

    public usuario(String nombre, String contraseña) {
        Nombre = nombre;
        Contraseña = contraseña;
    }

    public usuario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
