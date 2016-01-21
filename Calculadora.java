/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    /**
     * Método que imprime por pantalla todos los múltiplos de 5 entre 10 y 95 (ambos no incluidos)
     */
    public void multiplesOfFive(){
        int numero = 5;
        int contador = 0;
        int producto = 0;
        while (producto < 95){
            if (producto > 10){
                System.out.println(producto);                
            }
            contador = contador + 1;
            producto = numero * contador;
        }
    }
    
    /**
     * Método que imprime por pantalla la suma de todos los números comprendidos entre 0 y 10 (ambos incluidos)
     */
    public void sumValues(){
        int suma = 0;
        int contador = 0;
        while(contador <= 10){
            suma = contador + suma;
            contador = contador + 1;
        }
        System.out.println("La suma de todos los números comprendidos entre 0 y 10 (ambos incluidos) es " + suma);
    }
}
