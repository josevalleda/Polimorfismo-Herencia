
package seminario2;


public class Empleado {
    String nombre;
    private float salario;
    private int anyoAlta;

    public Empleado(String nombre, float salario, int anyoAlta) {
        this.nombre = nombre;
        this.salario = salario;
        this.anyoAlta = anyoAlta;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }

    public int getAnyoAlta() {
        return anyoAlta;
    }
    
    public void incSalario(float subida){
        
        salario += subida;
    }
}
