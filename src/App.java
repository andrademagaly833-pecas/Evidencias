import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"), 
            new Persona("Pedro", 20, "M"), 
            new Persona("Ana", 28, "F"));
    
        
        BusquedaBinaria bBinaria = new BusquedaBinaria(personas);

        int resultado = bBinaria.findByName("Ana");
        if(resultado != 1){
            System.out.println("Se encontró en la pos = " + resultado);
        } else {
            System.out.println("No se encontró");
        }
        int res2 = bBinaria.findByName("Pedro");
        //OPERADOR TERNARIO
        System.out.println(res2 >= 0 ? "Se enccontró en la pos = " + res2 : "No se encontro nada :(");
    
        int res = bBinaria.findByAge(25);
        //OPERADOR TERNARIO
        System.out.println(res >= 0 ? "Se enccontró en la pos = " + res : "No se encontro nada :(");
    
        Persona pBuscar = new Persona("Maria", 30, "f");
        int res3;
    }
}