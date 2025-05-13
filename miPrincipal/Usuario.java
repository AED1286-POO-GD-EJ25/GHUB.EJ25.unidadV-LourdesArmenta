package miPrincipal;
public class Usuario{
    private String nombre;
    private String email;
    private String userName;
    private String password;
    
    public Usuario(){

    }
    public Usuario(String nombre,String email, String userName){
        this.nombre = nombre;
        this.email = email;
        this.userName = userName;
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

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    





}