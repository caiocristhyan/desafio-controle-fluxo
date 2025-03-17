package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        try{
            if(numero1 > numero2){
                throw new ParametroInvalidoException("O segundo parametro deve ser maior que o primeiro");
            }
            contar(numero1, numero2);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int numero1, int numero2){
        int contagem = numero2 - numero1;

        for(int i = 0; i <= contagem; i++){
            System.out.println("imprimindo o numero " + i);
        }
    }
}
