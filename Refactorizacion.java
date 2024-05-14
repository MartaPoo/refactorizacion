package refactorizacion;

/**
 *
 * @author Marta Romero Poo
 */

/**
 * CÓDIGO SIN REFACTORIZAR:
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i] * 3;
            } else {
                sum += nums[i] * 2;
            }
        }
        System.out.println("Suma de los números pares e impares multiplicados por 3 y 2
                            respectivamente: " + sum);
    }    
 */

//CÓDIGO REFACTORIZADO:
public class Refactorizacion {
    private static final int NUM_NUMS = 10;

    public static void main(String[] args) {
        int[] nums = new int[NUM_NUMS];

        for (int i = 0; i < NUM_NUMS; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }//Fin Para
        int sum = 0;
        for (int i = 0; i < NUM_NUMS; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i] * 3;
            } else {
                sum += nums[i] * 2;
            }//Fin Si
        }//Fin Para
        System.out.println("Suma de los números pares e impares multiplicados por"
                           + " 3 y 2 respectivamente: " + sum);
    }
}

    
    
