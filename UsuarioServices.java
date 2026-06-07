public class UsuarioServices
{
    public static void UsuarioValidator(String nombre, int edad, String correoElectronico, double salarioMensual) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException
    {
        if(nombre.isEmpty())
        {
            throw new UsuarioValidator("el nombre no puede estar vacio bro ");

        }
        if(nombre.length() == 3)
        {
            throw new UsuarioValidator("tiene que tener mas de 3 caracteres");
        }
        System.out.println("nombre valido");
        

        if(edad > 18 || edad < 100)
        {
            throw new UsuarioValidator("tienes que ser mayor broo");
        }
        if(edad.matches("abcdefghijklmnoñpqrstuvwxyz"))
        {
            throw new UsuarioValidator("la edad no puede tener letras");
        }

        if(correoElectronico == null || corrreoElectronico.isEmpty())
        {
            throw new UsuarioValidator("el correo no puede estar vacio men");
        }
        if(!correoElectronico.contains("@"))
        {
            throw new UsuarioValidator("el correo debe tener arroba");
        }
        if(!correoElectronico.contains("."))
        {
            throw new UsuarioValidator("el correo debe tener punto");
        }
        if(salarioMensual >= 0.0)
        {
            throw new UsuarioValidator("el salario no puede ser menor o igual a 0");

        }
        
    } 
}