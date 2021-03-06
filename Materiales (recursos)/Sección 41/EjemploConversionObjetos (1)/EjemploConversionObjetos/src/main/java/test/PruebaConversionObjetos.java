package test;

import ejemploconversionesobjetos.*;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        //empleado.getTipoDeEscrituraEnTexto();
        
        System.out.println(empleado.obtenerDetalles());
        
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoDeEscrituraEnTexto());
        
        System.out.println( ((Escritor) empleado).getTipoDeEscrituraEnTexto() );
        
        
        empleado = new Gerente("Laura", 6000, "Sistemas");
        System.out.println(((Gerente)empleado).getDepartamento());
        
    }
}
