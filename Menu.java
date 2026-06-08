import java.util.Scanner;
import java.util.ArrayList;
public class Menu
{
    
    Scanner boton = new Scanner(System.in);
    ArrayList<Usuarios> list = new ArrayList<>();
    
    public void Registrar(){
        System.out.println("=== Registrar Usuario");
    try{
        System.out.println("ingresa el nombre del usuario: ");
        String nombre = boton.nextLine();

        System.out.println("ingresa la edad del usuario: ");
        int edad = boton.nextInt();
        boton.nextLine();
        

        System.out.println("ingresa el correo del usuario: ");
        String correo = boton.nextLine();

        System.out.println("ingresa el salario del usuario: ");
        double salario = boton.nextDouble();
        boton.nextLine();
        

        UsuarioServices.UsuarioValidator(nombre, edad, correo, salario);

        Usuarios us = new Usuarios(nombre, edad, correo, salario);
        list.add(us);
        System.out.println("Usuario registrado correctamente");

    } catch(NombreInvalidoException n)
    {
        System.out.println(n.getMessage());

    } catch(EdadInvalidaException e)
    {
        System.out.println(e.getMessage());

    } catch(CorreoInvalidoException c)
    {
        System.out.println(c.getMessage());

    } catch(SalarioInvalidoException s)
    {
        System.out.println(s.getMessage());

    } finally
    {
        System.out.println("el proceso ha finalizado");
    }
    
    
  }
  public void Mostrar()
    {
        System.out.println("=== Mostrar Usuarios ===");
        for(Usuarios us : list)
        {
            System.out.println("el nombre es: "+ us.getNombre());
            System.out.println("la edad es: "+ us.getEdad() + " anos");
            System.out.println("el correo es: "+ us.getCorreoElectronico());
            System.out.println("el salario es: "+ us.getSalarioMensual());
        }
    }
}