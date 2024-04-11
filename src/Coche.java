public class Coche extends Vehiculo{
    boolean frenos=false;
    boolean ruedaDD=false;
    boolean ruedaDI=false;
    boolean ruedaTD=false;
    boolean ruedaTI=false;
    
    public Coche(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String toString() {
        return "Coche con matricula:" + matricula +", color:" + color + " y marca:" + marca + "\nEstado de las piezas:\n frenos:" + frenos +
         "\n ruedaDD:" + ruedaDD + "\n ruedaDI:" + ruedaDI  + "\n ruedaTD:" + ruedaTD + "\n ruedaTI:" + ruedaTI;
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
                System.out.println("Lista de piezas:\n1.Frenos\n2.Rueda delantera derecha\n3.Rueda delantera izquierda\n4.Rueda trasera derecha\n5.Rueda trasera izquierda");
                int piezaAveriada=fun.getInputInt("Indique el numero de la pieza averiada");
                fun.cleanInputBuffer();

                switch (piezaAveriada) {
                    case 1:
                        this.frenos=true;
                        break;
                    case 2:
                        this.ruedaDD=true;
                        break;
                    case 3:
                        this.ruedaDI=true;
                        break;
                    case 4:
                        this.ruedaTD=true;
                        break;
                    case 5:
                        this.ruedaTI=true;
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
