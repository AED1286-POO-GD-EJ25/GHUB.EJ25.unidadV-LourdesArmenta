package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {

        //instanciamos la clase Aplicacion
        Aplicacion app = new Aplicacion();

        //intentamos el login

        Usuario u = app.login("juan", "juan123sito");

        //si los datos son correctos
        if (u == null){
            System.out.println("usuario y contraseña incorrecto")
        }else{
            System.out.println("Felicidades, login exitoso");
            System.out.println("Nombre "+u.getNombre());
            System.out.println("Email "+u.getEmail());
        }
        
    }
}