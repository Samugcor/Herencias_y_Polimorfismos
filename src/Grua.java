public class Grua extends Vehiculo{
    boolean gancho=false;
    boolean poleas=false;
    boolean joystick=false;
    boolean limpia=false;
    boolean radiador=false;
    
    public Grua(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    
    @Override
    public String toString() {
        return "Grua con matricula:" + matricula + ", color:" + color + " y marca:" + marca+ "\nEstado de las piezas:\n gancho:" + gancho + "\n poleas:" + poleas
                + "\n joystick:" + joystick  + "\n limpia:" + limpia + "\n radiador:" + radiador;
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
                System.out.println("Lista de piezas:\n1.Gancho\n2.Poleas\n3.Joystick\n4.Limpia parabrisas\n5.Radiador");
                int piezaAveriada=fun.getInputInt("Indique el numero de la pieza averiada");
                fun.cleanInputBuffer();

                switch (piezaAveriada) {
                    case 1:
                        this.gancho=true;
                        break;
                    case 2:
                        this.poleas=true;
                        break;
                    case 3:
                        this.joystick=true;
                        break;
                    case 4:
                        this.limpia=true;
                        break;
                    case 5:
                        this.radiador=true;
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
