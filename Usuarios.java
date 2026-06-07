public class Usuarios
{
    private String nombre;
    private int edad;
    private String correoelectronico;
    private double salarioMensual;

    public void()
    {
        setNombre("");
        setEdad(0);
        setCorreoElectronico("");
        setSalarioMensual(0);
    }

    public void(String Nombre, int Edad, String CorreoElectronico, double SalarioMensual)
    {
        this.nombre = Nombre;
        this.edad = Edad;
        this.correoElectrico = CorreoElectronico;
        this.salarioMensual = SalarioMensual;
    }

    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }
    public void setEdad(int Edad)
    {
        this.edad = Edad;
    }
    public void setCorreoElectronico(String CorreoElectronico)
    {
        this.correoElectronico = CorreoElectronico;
    }
    public void setSalarioMEnsual(double SalarioMensual)
    {
        this.salarioMensual = SalarioMensual;
    }
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public String getCorreoElectronico(){return correoElectronico;}
    public double getSalarioMensual(){return salarioMensual;}

}