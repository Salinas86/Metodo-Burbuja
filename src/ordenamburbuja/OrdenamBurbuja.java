package ordenamburbuja;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class OrdenamBurbuja {

    public static void main(String[] args) {
        int arreglo[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
        String titulo = "Ordenamiento Burbuja";
        String salida = """
                       Elementos de datos en su orden original                       
                       """;
        JTextArea areaSalida;
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += " " + arreglo[contador];
        }
        Burbuja(arreglo); // ordenar arreglo
        salida += """
                  
                  
                  Elementos de arreglo en orden ascendente
                  """;
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += " " + arreglo[contador];
        }
        
        areaSalida = new JTextArea(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida, titulo, JOptionPane.CLOSED_OPTION);
        
    }

    // ordenar elementos del arreglo con el metodo burbuja
    public static void Burbuja(int arreglo2[]) {
        //ciclo para controlar numero de pasadas
        for (int pasada = 1; pasada < arreglo2.length; pasada++) {
            // ciclo para controlar numero de comparaciones
            for (int elemento = 0; elemento < arreglo2.length - 1; elemento++) {
                // comparar elementos uno a uno e intercambiarlos si el primer
                // elemento es mayor que el segundo
                if (arreglo2[elemento] > arreglo2[elemento + 1]) {
                    intercambiar(arreglo2, elemento, elemento + 1);
                }
            } // fin del ciclo para controlar las comparaciones
        } // findel ciclo para controlar las pasadas
    } // fin del metodo ordenamBurbuja
    
    // intercambiar dos elementos de un arregl
    public static void intercambiar(int arreglo3[], int primero, int segundo) {
        int almacen; // area de almacenamiento para intercambiar
        almacen = arreglo3[primero];
        arreglo3[primero] = arreglo3[segundo];
        arreglo3[segundo] = almacen;
    }
} // fin de la clase OrdenamBurbuja
