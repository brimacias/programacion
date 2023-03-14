/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2oTrim.Herencia.SeleccionFutbol;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mrnov
 * @version info
 * 
 */
public class Main {

    
    
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
        
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        for (SeleccionFutbol integrante : integrantes) {
            if (integrante instanceof Entrenador) {
                contador1++;
            } else if (integrante instanceof Futbolista) {
                contador2++;
            } else {
                contador3++;
            }
        }

        //Ejemplo de uso del for normal
        for (int i = 0;i <integrantes.size();i++) {
            System.out.println(integrantes.get(i).getNombre() + " " + integrantes.get(i).getApellidos());
        }

        //ITERADOR para recorrer el array
        Iterator<SeleccionFutbol> iterador = integrantes.iterator();
        while (iterador.hasNext()) {
            SeleccionFutbol sf = iterador.next();
            System.out.println(sf.getNombre()+ " " + sf.getApellidos() + " ,de identificador "
                    + sf.getId() + ", y de " + sf.getEdad() + " años de edad, es " + sf.getClass());
        }

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                integrante.concentrarse();
        }

        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                integrante.viajar();
        }

//      .........
	  
	  // ENTRENAMIENTO
System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
for (SeleccionFutbol integrante : integrantes) {
	System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
	integrante.entrenamiento();
}

// PARTIDO DE FUTBOL
System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
for (SeleccionFutbol integrante : integrantes) {
	System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
	integrante.partidoFutbol();
}
//     ........
	 
//	      ........
// PLANIFICAR ENTRENAMIENTO
System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
((Entrenador) delBosque).planificarEntrenamiento();

// ENTREVISTA
System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
((Futbolista) iniesta).entrevista();

// MASAJE
System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
((Masajista) raulMartinez).darMasaje();
     //	      ........
    }

/**
* This method inputs a number from the user.
* @return The value input as a double.
*/
    public double square(double num) {
        return num * num;
    }
    
    
}

/*
* This method inputs a number from the user.
* @return The value input as a double.
* @exception IOException On input error.
* @see IOException
*/