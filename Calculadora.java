/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    /**
     * Método que imprime por pantalla todos los múltiplos de 5 
     */
    public void multiplesOfFive()
    {
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
}
