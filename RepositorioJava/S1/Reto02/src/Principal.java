public class Principal {
    public static void main(String[] args){
        //crear mis objetos
        //1. Clase
        //2. Identificador
        //3. new + constructor
        // Crear un objeto de tipo Producto utilizando el constructor
        Entrada evento1 = new Entrada("Obra de teatro", 149);
        Entrada evento2 = new Entrada("Presentacion de ballet", 75);


        evento1.mostrarInformacion();
        evento2.mostrarInformacion();
    }
}
