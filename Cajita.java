import javax.swing.JOptionPane;
public class Cajita {
    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog ("Ingresa tu nombre");
        System.out.println("Tu nombre es: "+nombreUsuario);

        String numero1 = JOptionPane.showInputDialog ("Ingresa un numero");
        String numero2 = JOptionPane.showInputDialog ("Ingresa un numero");

        int numeroEntero1 = Integer.parseInt(numero1);
        int numeroEntero2 = Integer.parseInt(numero2);

        String numero3 = JOptionPane.showInputDialog ("Ingresa un numero");
        String numero4 = JOptionPane.showInputDialog ("Ingresa un numero");

        double numeroDecimal1 = Double.parseDouble(numero3;)  //Casting es para la conversion de numeros
        double numeroDecimal2 = Double.parseDouble(numero4;)



    }
}

