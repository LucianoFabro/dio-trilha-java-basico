package arrays;

import java.util.Random;

import javax.swing.BoundedRangeModel;

/*
Ex3 Faça um prograna que leia 20 números aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
            
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("Numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");         
        }

        System.out.print("\nSucessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1 + " ");         
        }
    }
}
