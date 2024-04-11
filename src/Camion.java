public class Camion extends Vehiculo{
    boolean paloMarchas=false;
    boolean ganchoRemolque=false;
    boolean radio=false;
    boolean lucesFreno=false;
    boolean lucesPosicion=false;
    
    public Camion(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    
    @Override
    public String toString() {
        return "Camion con matricula:" + matricula + ", color:" + color + " y marca:" + marca+ "\nEstado de las piezas:\n paloMarchas:" + paloMarchas 
                + "\n ganchoRemolque:" + ganchoRemolque  + "\n radio:" + radio + "\n lucesFreno:"
                + lucesFreno + "\n lucesPosicion:" + lucesPosicion;
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
                System.out.println("Lista de piezas:\n1.Cambio de marchas\n2.Gancho del remolque\n3.Radio\n4.Luces de freno\n5.Luces de posicion");
                int piezaAveriada=fun.getInputInt("Indique el numero de la pieza averiada");
                fun.cleanInputBuffer();

                switch (piezaAveriada) {
                    case 1:
                        this.paloMarchas=true;
                        break;
                    case 2:
                        this.ganchoRemolque=true;
                        break;
                    case 3:
                        this.radio=true;
                        break;
                    case 4:
                        this.lucesFreno=true;
                        break;
                    case 5:
                        this.lucesPosicion=true;
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
