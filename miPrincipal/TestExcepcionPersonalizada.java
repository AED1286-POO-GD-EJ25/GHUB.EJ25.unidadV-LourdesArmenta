package miPrincipal;

public class TestExcepcionPersonalizada {
    public static void main(String[] args) {
       try{
            //simular una condicion que lanza la nueva exepcion
            lanzarMiExcepcion();
        }catch(MiExceptionPersonalizada ex){
            System.out.println("MiExcepcion personalizada capturada: "+ex.getMessage());
        }
        
    }
    public static void lanzarMiExcepcion() throws MiExceptionPersonalizada{
        throw new MiExceptionPersonalizada("Este es un mensaje de excepcion personalizado");
    }
    
}
