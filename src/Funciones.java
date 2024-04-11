import java.util.Scanner;


public class Funciones {
    Scanner scanner = new Scanner(System.in);

    public String getInputString(String pregunta){
        System.out.println(pregunta);
        return scanner.nextLine();
    }
    public int getInputInt(String pregunta){
        System.out.println(pregunta);
        return scanner.nextInt();
    }
    public void cleanInputBuffer(){
        scanner.nextLine();
    }
}
