package boletin9_6;

import javax.swing.JOptionPane;

public class Sueldo {

    float sueldo, menos1000, mas1000, totalEmpleados;
    int porcentaje;

    public void calcularSueldo() {
        do {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introducir sueldo "));
            if (sueldo < 1000) {
                menos1000 = menos1000 + 1;
                totalEmpleados = totalEmpleados + 1;
            } else if (sueldo <= 1750) {
                mas1000 = mas1000 + 1;
                totalEmpleados = totalEmpleados + 1;
            } else if (sueldo < 0) {
                System.out.println("No es un número positivo ");
            } else {
                totalEmpleados = totalEmpleados + 1;
            }

            if (menos1000 != 0) {
                System.out.println("Empleados que cobran entre 1000€ e 1750€ : " + mas1000);
            }
            System.out.println("Porcentaje de empleados que cobran menos de 1000€ : " + (menos1000 / totalEmpleados * 100));
        } while (sueldo != 0);

    }
}
