package edu.gleyson;

public class Operadores {
    public static void main(String[] args) {
        int modulo = 18 % 3;
        System.out.println(modulo);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(- numero); // não altera
        System.out.println(numero);

        numero = - numero; // agora altera
        System.out.println(numero);

        numero = + numero; // não volta positivo
        System.out.println(numero);

        numero = numero * -1; // volta positivo
        System.out.println(numero);

        numero = 5;
        //x repetição
        numero++;
        //numero = numero + 1
        System.out.println(numero);

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++numero);

        System.out.println(--numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        String resultado = ""; // poderia ser int com valor correspondente
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");
        System.out.println(nomeUm.equals(nomeDois)); // quando texto objeto usa equals

        boolean condicao1=true;
        boolean condicao2=true;
        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }




    }
}
