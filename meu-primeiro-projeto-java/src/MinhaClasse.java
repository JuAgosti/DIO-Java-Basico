public class MinhaClasse {
public static void main (String [] args){
    String primeiroNome = "Júlia";
    String segundoNome = " Agosti";

    String nomeCompleto = nomeCompelto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

   public static String nomeCompelto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat("").concat(segundoNome);
}


}
