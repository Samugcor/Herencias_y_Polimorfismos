public class Moto extends Vehiculo{
    boolean apoyo=false;
    boolean tuboEscape=false;
    boolean contacto=false;
    boolean rodamiento=false;
    boolean asiento=false;
    
    public Moto(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public void modificarDato(Funciones fun){
        int dato=fun.getInputInt("Elija el dato que desee modificar: \n1.Matricula\n2.Color\n3.Marca\n4.Reportar averia");
        fun.getInputString("");
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
                System.out.println("Lista de piezas:\n1.Apoyo\n2.Tubo de escape\n3.Contato\n4.Rodamiento\n5.Asiento");
                int piezaAveriada=fun.getInputInt("Indique el numero de la pieza averiada");
                fun.cleanInputBuffer();

                switch (piezaAveriada) {
                    case 1:
                        this.apoyo=true;
                        break;
                    case 2:
                        this.tuboEscape=true;
                        break;
                    case 3:
                        this.contacto=true;
                        break;
                    case 4:
                        this.rodamiento=true;
                        break;
                    case 5:
                        this.asiento=true;
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
