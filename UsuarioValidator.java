public class UsuarioValidator extends Exception
{
    public class NombreInvalidoException extends Exception{
    public NombreInvalidoException(String mensaje)
    {
        super(mensaje);
    }
    }

    public class EdadInvalidaException extends Exception{
    public EdadInvalidaException(String mensaje)
    {
        super(mensaje);
    }
    }

    public class CorreoInvalidoException extends Exception{
    public CorreoInvalidoException(String mensaje)
    {
        super(mensaje);
    }
    }
    public class SalarioInvalidoException extends Exception{
    public SalarioInvalidoException(String mensaje)
    {
        super(mensaje);
    }
    }
}