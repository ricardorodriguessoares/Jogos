//Algoritimo que Sorteia um número aleatório definido entre 0 até 50
//Autor: Ricardo Rodrigues
//e-mail: ri.rodriguesoares@gmail.com / +55 11 961607406

package SorteioAleatorio;

public class SorteioNumero {
    public static void main(String[] args) {
        System.out.println("Jogo Sorteio Aleatório");
        
        double ale = Math.random();
        int n = (int)  (0 + ale *(50-0));
        System.out.println(n);
        
    }
    
}
