package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Mantemento {
    ArrayList <String> cons = new ArrayList();
    
    public void engadir(){
        String nome = JOptionPane.showInputDialog("Titulo del libro");
        String autor = JOptionPane.showInputDialog("Autor del libro");
        float prezo = Float.parseFloat(JOptionPane.showInputDialog("Precio del libro"));
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades del libro"));
        
        Libro lib = new Libro(nome, autor, prezo, unidades);
       
    }
    
    public void consultar(String nome, float prezo, int unidades){
        nome = JOptionPane.showInputDialog("Titulo del libro a consultar");
        System.out.println(nome + ", " + prezo);
        if (unidades==0)
            JOptionPane.showInputDialog("No hay existencias de este libro");
        
    }
    
    public void escribirFichero(String fichero){
        fichero = JOptionPane.showInputDialog("Escribir el nombre del fichero");
        File f = new File(fichero);
        PrintWriter escribir = null;
        try{
            escribir = new PrintWriter(f);
            for (int i=0; i<3; i++)
                escribir.println(i + " " + cons.get(i));
        } catch (FileNotFoundException ex){
            System.out.println("erro na escritura"+ ex.getMessage());
        }
        finally{
            escribir.close();
    }
    }
    
    public void visualizar(String fichero){
        System.out.println(fichero);
    }
    
    
    public void borrar(int unidades){
        if (unidades==0)
            
        
    }
    
    public void modificar(String prezo){
        prezo = JOptionPane.showInputDialog("introduce el nuevo precio del libro");
        
    }
}
