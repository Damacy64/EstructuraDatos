/*
 * Metodo principal, para probar las estructuras de datos creadas con
 * anterioridad
 */
package estructurasdatos;

import javax.swing.JOptionPane;

/**
 *
 * @author pzx64
 */
public class MainEstructuras {
    public static void main(String[] args) {
        int opcion = 0,el;
        Lista lista = new Lista();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Elemento al inicio de la lista\n"
                      + "2. Agregar un Elemento al final de la lista\n"
                      + "3. Mostrar los Datos de la lista\n"
                      + "4. Salir", "Menu de opciones",3));
                switch(opcion){
                    case 1:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "Insertando al inicio",3));
                            //agregando el elemento
                            lista.agregarAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "Insertando al final",3));
                            //agregando el elemento
                            lista.agregarAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 3:
                        lista.mostrarLista();
                        System.out.println("");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                        break;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion!=4);
    }
}
