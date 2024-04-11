public class Vehiculo {
    protected String matricula;
    protected String color;
    protected String marca;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void modificarDato(Funciones fun){
        int dato=fun.getInputInt("Elija el dato que desee modificar: \n1.Matricula\n2.Color\n3.Marca");
        fun.getInputString("");
        fun.cleanInputBuffer();
        
        switch (dato) {
            case 1:
                this.matricula=fun.getInputString("Introduzca nueva metricula: ");
                break;
            
            case 2:
                this.color=fun.getInputString("Introduzca nuevo color: ");
                break;

            case 3:
                this.marca=fun.getInputString("Introduzca nueva marca: ");
                break;
    
            default:
                break;
        }
    }

    


}
