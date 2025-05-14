package miPrincipal;

public class TestException2 {
    public static void main(String[] args) {
        try{
            int x = Math.incrementExact(2147483647);
            
            System.err.println(x);
        }catch(Exception e){
            System.out.println("ocurrio un error");
        }
    }
    
    
}
