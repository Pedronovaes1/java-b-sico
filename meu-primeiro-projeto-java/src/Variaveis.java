public class Variaveis {
    
    public static void main(String[] args) {
        
        String meuNome = "Pedro";

        int anoFabricacao = 2024;

        boolean verdadeiro = true;

        String primeiroNome = "Pedro";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    //métodos
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
