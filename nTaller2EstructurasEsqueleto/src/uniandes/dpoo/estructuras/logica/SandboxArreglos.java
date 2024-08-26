package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        
    	int[]copiaEnteros= new int[arregloEnteros.length];
    	for (int i = 0; i < arregloEnteros.length; i++) {
            copiaEnteros[i] = arregloEnteros[i];
        }
        return copiaEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        String[]copiaCadenas= new String[arregloCadenas.length];
        for (int i = 0; i < arregloCadenas.length; i++) {
        	copiaCadenas[i] = arregloCadenas[i];
        }
        return copiaCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[]NuevoValor = new int[arregloEnteros.length + 1];
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		NuevoValor[i] = arregloEnteros[i];
    	}
    	NuevoValor[NuevoValor.length-1]=entero;
    	arregloEnteros=NuevoValor;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[]NuevoValor = new String[arregloCadenas.length + 1];
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		NuevoValor[i] = arregloCadenas[i];
    	}
    	NuevoValor[NuevoValor.length-1]=cadena;
    	arregloCadenas=NuevoValor;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero(int valor) 
    {
        int cont = 0;
        
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                cont++;
            }
        }
    
    int [] NuevoArreglo = new int[arregloEnteros.length - cont];
    
    int j =0;
    for ( int  i =0; i<arregloEnteros.length; i++) {
    	if (arregloEnteros[i] != valor) {
    		NuevoArreglo[j] = arregloEnteros[i];
    		j++;
    	}
    }
    arregloEnteros = NuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
        int cont = 0;
        
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i] == cadena) {
                cont++;
            }
        }
    
    String[] NuevoArreglo = new String[arregloCadenas.length - cont];
    
    int j =0;
    for ( int  i =0; i<arregloCadenas.length; i++) {
    	if (arregloCadenas[i] != cadena) {
    		NuevoArreglo[j] = arregloCadenas[i];
    		j++;
    	}
    }
    arregloCadenas = NuevoArreglo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	if (posicion<0) {
    		posicion = 0;
    	} else if (posicion > arregloEnteros.length) {
    		posicion= arregloEnteros.length;
    	}
    	int[]NuevoValor=new int[arregloEnteros.length+1];
    	for (int i=0, j=0; i<NuevoValor.length; i++) {
    		if (i==posicion) {
    			NuevoValor[i]=entero;
    		}else {
    			NuevoValor[i]=arregloEnteros[j];
    			j++;
    		}
    	}
    	arregloEnteros=NuevoValor;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion<0) {
    	return;
    } 
    if (posicion>=arregloEnteros.length) {
    	return;
    }
    int[]NuevoValor= new int[arregloEnteros.length-1];
    for (int i=0, j=0; i<arregloEnteros.length; i++) {
    	if(i!=posicion) {
    		NuevoValor[j]=arregloEnteros[i];
    		j++;
    	}
    }
    	arregloEnteros=NuevoValor;}

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int ReiniciarArreglo[]=new int[valores.length];
    	for (int i =0; i<valores.length; i++) {
    		ReiniciarArreglo[i]=(int)valores[i];
    	}
    	arregloEnteros=ReiniciarArreglo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String ReiniciarArreglo[]=new String[objetos.length];
    	for (int i =0; i<objetos.length; i++) {
    		ReiniciarArreglo[i]=objetos[i].toString();
    	}
    	arregloCadenas=ReiniciarArreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i=0; i<arregloEnteros.length; i++) {
    		if(arregloEnteros[i]<0) {
    			arregloEnteros[i]=arregloEnteros[i]*-1;
    		}
    	}

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros() 
    {
        for (int i = 0; i < arregloEnteros.length - 1; i++) {
            for (int j = 0; j < arregloEnteros.length - 1; j++) {
                if (arregloEnteros[j] > arregloEnteros[j + 1]) {
                    int guardartemporal = arregloEnteros[j];
                    arregloEnteros[j] = arregloEnteros[j + 1];
                    arregloEnteros[j + 1] = guardartemporal;
                }
            }
        }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas() {
        for (int i = 0; i < arregloCadenas.length - 1; i++) {
            for (int j = 0; j < arregloCadenas.length - 1; j++) { 
                if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                    String guardartemporal = arregloCadenas[j];
                    arregloCadenas[j] = arregloCadenas[j + 1];
                    arregloCadenas[j + 1] = guardartemporal;
                }
            }
        }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor ){
    	int cont= 0;
    	
    	for (int i= 0; i< arregloEnteros.length; i++ ) {
    		if (arregloEnteros[i] == valor) {
    			cont ++;
    		}
    	}
        return cont;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    int cont = 0;

    String c = cadena.toLowerCase();

    
    for (int i = 0; i < arregloCadenas.length; i++) {
        
        if (arregloCadenas[i].toLowerCase().equals(c)) {
            
            cont++;
        }
    }

    return cont;
}



    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero(int valor) {
        int cont = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                cont++;
            }
        }

        if (cont == 0) {
            return new int[0];
        }

        int[] p = new int[cont];
        int indicador = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                p[indicador] = i; 
                indicador++;
            }
        }

        return p;
    }


    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    	{
        	if(arregloEnteros.length == 0) {
        		return new int[0];
        		
        	}
        	 
        	int minimo= arregloEnteros[0];
        	int maximo= arregloEnteros[0];
        	
        	for (int i= 1; i< arregloEnteros.length; i++) {
        		if (arregloEnteros[i]> maximo) {
        			maximo= arregloEnteros[i];
        		}
        		if (arregloEnteros[i]< minimo) {
        			minimo= arregloEnteros[i];	
        		}
        		
        	}
        	int[]rangos= new int[2];
        	rangos[0]= minimo;
        	rangos[1]= maximo;
        	
        		
            return rangos;
        }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histo = new HashMap<>();
    	
    	for (int i= 0; i< arregloEnteros.length; i++) {
    		int valor= arregloEnteros[i];
    		
    		if (histo.containsKey(valor)) {
    			histo.put(valor, histo.get(valor) + 1);
    			
    		} else {
    			histo.put(valor, 1);
    			
    			
    		}
    	}
        return histo;
    }


    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> histo = new HashMap<>();

        
        for (int i = 0; i < arregloEnteros.length; i++) {
            int valor = arregloEnteros[i];
            
            
            if (histo.containsKey(valor)) {
            	histo.put(valor, histo.get(valor) + 1);
            } else {
                
            	histo.put(valor, 1);
            }
        }

        
        int contadorRepetidos = 0;
        for (int conteo : histo.values()) {
            
            if (conteo > 1) {
                contadorRepetidos++;
            }
        }

        return contadorRepetidos;
    }


    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros(int[] otroArreglo) {
        if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) { 
                return false;
            }
        }

        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }
    	
    	Arrays.sort(arregloEnteros);
        Arrays.sort(otroArreglo);

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) {
                return false; 
            }
        }

        return true;
    } 


    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros(int cantidad, int minimo, int maximo) 
    {
        arregloEnteros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            arregloEnteros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        }
    }
}

