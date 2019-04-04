
package seminario2;

public class PruebaEmpleados {
    
    public static void main(String[] args){
        
       Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new Empleado ( "Juan", 1000, 2001);
        Jefe jefe = new Jefe ("Pedro", 1200, 1999, 0.5f);
        empleados[1] = jefe;
        empleados[2] = new Administrativo ("Enrique", 900, 2003, jefe);
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof Jefe) {
                Jefe jefe2 = (Jefe) jefe;
                jefe.setBonificacion(0.8f);
                System.out.println("Bonificacion para: " + jefe.getNombre());
                
        }
        }
        
        /* Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new Empleado ( "Juan", 1000, 2001);
        Jefe jefe = new Jefe ("Pedro", 1200, 1999, 0.5f);
        empleados[1] = jefe;
        empleados[2] = new Administrativo ("Enrique", 900, 2003, jefe);
        
        for (Empleado empleado : empleados) {
            System.out.println("Soy " + empleado.getNombre() +
                    " y gano " + empleado.getSalario());
        } */
        
        
      /*  Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado ("Juan", 1000, 2001);
        Jefe jefe = new Jefe ("Pedro", 1200, 1999, 0.5f);
        empleados[1] = jefe;
        empleados[2] = new Administrativo ("Enrique", 900, 2003, jefe);
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof Jefe){
            Jefe jefe2 = (Jefe) empleado;
            System.out.println("Soy " + jefe2.getNombre() + 
                    " y gano " + jefe2.getSalario());
        } else if (empleado instanceof Administrativo) {
                Administrativo admin = (Administrativo) empleado;
                System.out.println("Soy " + admin.getNombre() +
                      "y gano " + empleado.getSalario());
                } else {//se aplica el metodo de la clase Empleado
                System.out.println("Soy " + empleado.getNombre() +
                      " y gano " + empleado.getSalario());
        }
    }*/
        
        
        
     /*   Empleado empleado = new Empleado ("Juan", 1000, 2001);
        
        empleado = new Jefe("Pedro", 1200, 1999, 0.5f);
        
        if (empleado instanceof Jefe){
                   
        Jefe jefe = (Jefe)empleado;
        jefe.setBonificacion(0.7f);
        System.out.println(jefe.getNombre());
        } else
            System.out.println("El empleado no es un jefe");
        */
        
        /*System.out.println("Empleado: " + empleado.getNombre());
        
        Jefe jefe = new Jefe ("Pedro", 1200, 1999, 0.5f);
        System.out.println("Jefe: " + jefe.getNombre());
        
        Administrativo admin = new Administrativo("Pedro", 900, 2003, jefe);
        
        System.out.println("Administrativo: " + admin.getNombre());
        System.out.println("Gana: " + admin.getSalario());
        */
    }
    
}
