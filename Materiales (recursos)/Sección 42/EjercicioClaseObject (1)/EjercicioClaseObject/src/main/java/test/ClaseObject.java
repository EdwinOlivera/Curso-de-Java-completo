package test;

import dominio.Empleado;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 10000);
        System.out.println("emp1 = " + emp1);
        Empleado emp2 = new Empleado("Juan", 10000);
        System.out.println("emp2 = " + emp2);

        System.out.println("objetos iguales: " + (emp1 == emp2));

        System.out.println("direccion memoria emp1: " + VM.current().addressOf(emp1));
        System.out.println("direccion memoria emp2: " + VM.current().addressOf(emp2));
        
        System.out.println("Detalle emp1:" + GraphLayout.parseInstance(emp1).toPrintable());
        System.out.println("Detalle emp2:" + GraphLayout.parseInstance(emp2).toPrintable());
        
    }
}
