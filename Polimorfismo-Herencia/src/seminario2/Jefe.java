
package seminario2;


public class Jefe extends Empleado {
    
    private float bonificacion;

    public Jefe(String nombre, float salario, int anyoAlta, float bonificacion) {
       
        super(nombre, salario, anyoAlta);
       
        this.bonificacion = bonificacion;
    }
    
    public String getDescricion(){
        return "Soy " + getNombre() + " y gano " + getSalario();
    }
    
    public float getSalario(){
        
        return super.getSalario() + super.getSalario() * bonificacion;
    }
    
    public float getBonificacion(){
        return bonificacion;
    }
    
    public void setBonificacion(float bonificacion){
        this.bonificacion = bonificacion;
    }
    
}
