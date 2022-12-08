package ejercicios.tema.pkg3;
import javax.swing.JOptionPane;
public class EjerciciosTema3 {
    public static void main(String[] args) {
        int pr1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer parametro")),
            pr2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo parametro")),
            pr3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer parametro"));
        JOptionPane.showMessageDialog(null,"Suma: " + SUM(pr1,pr2,pr3));
        
        
        coche miCoche = new coche();
        miCoche.setPuerta();
        miCoche.setPuerta();
        miCoche.setPuerta();
        miCoche.setPuerta();
        miCoche.setPuerta();
        JOptionPane.showMessageDialog(null,"Puertas del coche: " + miCoche.getPuertas());
    }
    /*
        Primera parte:
            -Crear una función con tres parámetros que sean números que se suman entre sí.
            -Llamar a la función en el main y darle valores.
    */
    static int SUM(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
    
    /*
        Segunda parte:
            -Crear una clase coche.
            -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
            -Una función que incremente el número de puertas que tiene el coche.
            -Crear un objeto miCoche en el main y añadirle una puerta.
            -Mostrar el número de puertas que tiene el objeto.
    */
    static class coche{
        int puertas;
        public coche() {
            this.puertas=0;
            JOptionPane.showMessageDialog(null,"El Coche ha sido creado");
        }

        public int getPuertas() {
            return puertas;
        }

        public void setPuerta() {
            this.puertas++;
        }
        
   }       
}
