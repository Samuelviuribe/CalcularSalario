package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author Samuel De Jesús Viaña Uribe
 */
public class Salario {

    Scanner sc = new Scanner(System.in);
    long salario;
    long bonifisalario;
    Long salariottl;
    
    public void CalculoSalarial() {
        System.out.println(" Digite el salario : ");
        salario = sc.nextLong();

        long Salarioh = salario / 192;
        System.out.println(" El Valor de una hora laboral en colombia es de : " + Salarioh);

        System.out.println(" Digite el numero de horas extra trabajadas : ");
        long hextra = sc.nextLong();

        /*El límite máximo diario de las horas extraordinarias
        es de 2 horas y su máximo semanal corresponde a 12 horas, */
        if (hextra < 13) {
            long hextrattl = hextra;
            hextrattl = (long) (Salarioh * 0.25);
            System.out.println(" El valor total de las horas extras es : " + hextra * Salarioh);
            System.out.println(" El valor Adicional por las hora extra es : " + hextrattl + ", igual al 25% de una hora trabajada");

            
            salariottl = salario + bonifisalario + (hextra * Salarioh) + hextrattl * hextra;
            System.out.println(" Salario total antes de descuentos : " + salariottl+" Sin bonificacion adicional ");

            System.out.println(" Descuentos para el plan obligatorio de salud :");
            System.out.println(salariottl - (salariottl * 0.035));
            System.out.println(" Descuentos para el aporte a pensión :");
            System.out.println(salariottl - (salariottl * 0.04));
            System.out.println(" Descuentos para caja de compensación :");
            System.out.println(salariottl - (salariottl * 0.01));
            System.out.println(" Salario total despues de descuentos : ");
            System.out.println(salariottl - (salariottl * 0.035) - (salariottl * 0.04) - (salariottl * 0.01));
        }

    }
            /*Debido a buen desempeño de un empleado 
            la empresa ocasionalmente otorga bonificaciones 
            de 0.05% del salario base*/

    public void Bonificacion() {
        bonifisalario = (long) (salario * 0.05);
        System.out.println(" Bonificacion de 0.05% al salario base es: " + bonifisalario);
        long salttmasboni= bonifisalario+salariottl;
        System.out.println(" Salario Total sin descuentos: "+salttmasboni);
        System.out.println("Salatio Total con descuento : ");
        System.out.println(salttmasboni- (salariottl * 0.035) - (salariottl * 0.04) - (salariottl * 0.01));
    }

}
