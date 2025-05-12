package miPrincipal;
public class Usuario{
    private String nombre;
    private String email;
    public Usuario(){

    }
    public Usuario(String nombre,String email){
        this.nombre = nombre;
        this.email = email;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }


}