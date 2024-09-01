package edu.Julia.sinbasica;

public class Operadores {
    public static void main(String[]args){
    // Operador + com palavras
        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);
    //Operador + com números

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    //Operadores unários
      
    int numero = 5;
        numero = - numero;
        System.out.println(- numero);
        System.out.println(numero);
       
        //para deixar positivo
        numero = numero * -1;
        System.out.println(- numero);
        System.out.println(numero);
       
    
        int num = 5;
        int num2 = 5;
        num ++;//num = num + 1
        System.out.println(num);
        System.out.println(num ++);
        System.out.println(num);
        System.out.println(num2 --);
        System.out.println(num2);

        //boolean
        boolean var = true;
        var = !var;
        System.out.println(!var);
        System.out.println(var);
 

        //Ternário
    
        int a,b;
        a=5;
        b=6;
    /*Com o if/else 
        String resultado = "";
    
        if(a==b)
            resultado = "verdadeiro";
        else    
            resultado = "falso";
        System.out.println(resultado);
    */
        //Ternario
        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);
   

    //Operadroes relacionais

        int numero1 = 1;
        int nuemro2 = 2;

        boolean simNao = numero1 == nuemro2;

        System.out.println("Numero 1 é igual a numero 2 " + simNao);

        simNao = numero1 != nuemro2;

        System.out.println("Numero 1 é diferente a numero 2 " + simNao);

        simNao = numero1 > nuemro2;
        
        System.out.println("Numero 1 é maoir a numero 2 " + simNao);

        simNao = numero1 <= nuemro2;
        
        System.out.println("Numero 1 é menor a numero 2 " + simNao);
     

    //Operadores Lógicos
        boolean con1 = true;
        boolean con2 = false;
        if(con1 && con2){
            System.out.println("Duas verdadeiras");
        }
        if (con1 || con2) {
            System.out.println("Uma verdadeira");
        }
        System.out.println("fim");
        }
}
