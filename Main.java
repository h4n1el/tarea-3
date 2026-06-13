import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Menu m = new Menu();
        Scanner boton = new Scanner(System.in);
        
        

        
        int op;

        do{
            System.out.println("elije la opcion: ");
        
            System.out.println("=== Menu ===");
            System.out.println("1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("elije la opcion: ");
            op = boton.nextInt();
            boton.nextLine();

            switch(op){
                case 1:
                    m.Registrar();
                    break;
                case 2:
                    m.Mostrar();
                    break;
                case 3:
                    System.out.println("saliendo apa");
                    break;
                    default:
                    System.out.println("termino");        
            }
         }while(op != 3);
    }
}