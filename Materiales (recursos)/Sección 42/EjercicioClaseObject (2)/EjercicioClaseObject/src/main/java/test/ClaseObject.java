package test;

import dominio.Empleado;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 10000);
        Empleado emp2 = new Empleado("juan", 10000);
        compararObjetos(emp1, emp2);
    }
    
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);
        
        //Revision por referencia
        if(emp1 == emp2){
            System.out.println("Los objetos tienen la misma direccion en memoria");
        }
        else{
            System.out.println("Los objetos tienen distinta direccion en memoria");
        }
        
        //Revision del metodo equals
        if(emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido");
        }
        else{
            System.out.println("Los objetos NO tienen el mismo contenido");
        }
        
        //Revisamos el metodo hashCode
        if(emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");
            System.out.println("emp1 = " + emp1.hashCode());
            System.out.println("emp2 = " + emp2.hashCode());
        }
        else{
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
}
