public class UsuarioServices
{
    public static void UsuarioValidator(String nombre, int edad, String correoElectronico, double salarioMensual) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException
    {
       
        if(nombre.isEmpty())
        {
            throw new NombreInvalidoException("el nombre no puede estar vacio bro ");

        }
        if(nombre.length() <= 3)
        {
            throw new NombreInvalidoException("tiene que tener mas de 3 caracteres");
        }
        
        if(edad < 18 || edad > 100)
        {
            throw new EdadInvalidaException("tienes que ser mayor broo");
        }
        
        
        if(correoElectronico == null || correoElectronico.isEmpty())
        {
            throw new CorreoInvalidoException("el correo no puede estar vacio men");
        }else if(!correoElectronico.contains("@") || !correoElectronico.contains(".") )
        {
            throw new CorreoInvalidoException("el correo debe tener arroba y punto");
        }
        
        

        if(salarioMensual <= 0.0)
        {
            throw new SalarioInvalidoException("el salario no puede ser menor o igual a 0");

        }
        System.out.println("salario valido");
        
    } 
}