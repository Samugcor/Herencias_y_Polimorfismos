import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
        /*El programa debe permitirnos ingresar un vehiculo para su reparación, marcar que pieza o piezas estan averiadas y mostrar la informacion de un vehiculo */
        ArrayList<Vehiculo> vehiculosEnTaller = new ArrayList<>();
        
       
        Funciones fun = new Funciones();
        int opcion;

        while (true) {
            System.out.println("\n1.Ingresar Vehiculo\n2.Cambiar dato\n3.Mostrar información de vehiculo\n4.Salir");
            opcion = fun.getInputInt("Ingrese la opcion: ");

            fun.getInputString("");
            
            switch (opcion) {
                case 1:
                    System.out.println("\nPara ingresar un vehiculo rellene los siguientes datos: ");
                    String matricula=fun.getInputString("Matricula: ");
                    String color=fun.getInputString("Color");
                    String marca=fun.getInputString("Marca: ");
                    String tipo=fun.getInputString("Tipo de vehiculo: ");

                    

                    if (tipo.equalsIgnoreCase("Camion")) {
                        vehiculosEnTaller.add(new Camion(matricula, color, marca));
                    }
                    else if (tipo.equalsIgnoreCase("Coche")) {
                        vehiculosEnTaller.add(new Coche(matricula, color, marca));
                    }
                    else if (tipo.equalsIgnoreCase("Grua")) {
                        vehiculosEnTaller.add(new Grua(matricula, color, marca));
                    }
                    else if (tipo.equalsIgnoreCase("Moto")) {
                        vehiculosEnTaller.add(new Moto(matricula, color, marca));
                    }
                    else if (tipo.equalsIgnoreCase("Tractor")) {
                        vehiculosEnTaller.add(new Tractor(matricula, color, marca));
                    }
                    else if (tipo.length()==0) {
                        System.out.println("Tenga en cuenta que los cambios ha vehiculos sin tipo especificado son limitados");
                        vehiculosEnTaller.add(new Vehiculo(matricula, color, marca));
                    }
                    else{
                        System.err.println("No se reconoce el tipo de vehiculo");
                    }
                    break;
            
                default:
                case 2:
                    System.out.println("\nLista de vehiculos en taller: ");

                    for (Vehiculo vehiculo : vehiculosEnTaller) {
                        System.out.println((vehiculosEnTaller.indexOf(vehiculo)+1) +". "+vehiculo.getMatricula()+", "+vehiculo.getClass().getSimpleName());
                    }

                    int vehiculoSeleccionado= fun.getInputInt("Escoja uno de los vehiculos anteriores: ");
                    vehiculosEnTaller.get(vehiculoSeleccionado-1).modificarDato(fun);
                    break;
            }
        }
    
    }
}

//System.out.println("Saliendo...");
//System.exit(0);
