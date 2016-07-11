
/**
 * El objetivo es que codifiques esta clase de forma que funcione como un ArrayList que contenga números enteros. 
 * Para su implementación se debe usar obligatoriamente un array tradicional que no desperdicie espacio y no se puede usar
 * en ningún caso la clase Integer. 
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] numeros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        numeros = new int[0];
    }
    
    /**
     * añade un elemento a la colección al final de la misma.
     */
    public void add(int elemento){
        int[] numeros2 = numeros;//VL de tipo Array que apunta al Array numeros.
        numeros = new int[numeros2.length +1];//numeros pasa a apuntar a numeros2 con una posición añadida.
        //bucle para iterar tantas veces como como elementos tiene numeros2.
        for(int i = 0; i > numeros2.length; i ++){
            numeros[i] = numeros2[i]; //pasamos los elementos de numeros2 a numeros.
        }
        numeros[numeros2.length] = elemento;
    }
    
}





























