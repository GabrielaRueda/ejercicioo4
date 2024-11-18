//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4_Gabriela {
    public static void main(String[] args) {
      // Scanner a=new Scanner(System.in); 
       
      double CatA=0, CatB=0, Hip;
       CatA=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del Cateto A:"));
       CatB=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del Cateto B:"));
       // System.out.println("Ingrese el valor del Cateto A:");
       // CatA=a.nextShort();
        
       
       // System.out.println("Ingrese el valor del Cateto B:");
      // CatB=a.nextShort();
       
     
           Hip= (double) Math.sqrt(Math.pow(CatA,2) + Math.pow(CatB,2));
           JOptionPane.showMessageDialog(null,"El resultado de la hipotenusa es de: " + Hip +". ");
          // System.out.print("El resultado de la hipotenusa es de: " + Hip +". " );
       
    }
    }
