public class Tractor extends Vehiculo {
    boolean remolque=false;
    boolean chimenea=false;
    boolean parabrisas=false;
    boolean filtroGases=false;
    boolean deposito=false;
    
    public Tractor(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }
    

    @Override
    public String toString() {
        return "Tractor con matricula:" + matricula + ", color:" + color + " y marca:" + marca + "\nEstado de las piezas:\n remolque:" + remolque +  "\n chimenea:"
                + chimenea +  "\n parabrisas:" + parabrisas + "\n filtroGases:" + filtroGases
                + "\n deposito:" + deposito;
    }


    @Override
    public void modificarDato(Funciones fun){
        int dato=fun.getInputInt("Elija el dato que desee modificar: \n1.Matricula\n2.Color\n3.Marca\n4.Reportar averia");
        fun.cleanInputBuffer();

        switch (dato) {
            case 1:
                this.matricula=fun.getInputString("Introduzca nueva matricula: ");
                break;
            
            case 2:
                this.color=fun.getInputString("Introduzca nuevo color: ");
                break;

            case 3:
                this.marca=fun.getInputString("Introduzca nueva marca: ");
                break;
                
            case 4:
                System.out.println("Lista de piezas:\n1.Remolque\n2.Chimenea\n3.Parabrisas\n4.Filtro de gases\n5.Deposito");
                int piezaAveriada=fun.getInputInt("Indique el numero de la pieza averiada");
                fun.cleanInputBuffer();

                switch (piezaAveriada) {
                    case 1:
                        this.remolque=true;
                        break;
                    case 2:
                        this.chimenea=true;
                        break;
                    case 3:
                        this.parabrisas=true;
                        break;
                    case 4:
                        this.filtroGases=true;
                        break;
                    case 5:
                        this.deposito=true;
                        break;
                    default:
                        System.err.println("Pieza no reconocida");
                        break;
                }
                break;
    
            default:
                System.err.println("Opción no reconocida");
                break;
        }
    }
}
