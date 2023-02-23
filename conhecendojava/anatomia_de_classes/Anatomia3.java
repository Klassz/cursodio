package anatomia_de_classes;

public class Anatomia3 {
    public static void main(String[] args) {
        // String meuNome = "Kayo";
        // int anoDeFabricacao = 2022;
        // boolean verdadeiraOuFalsa = true;
        // anoDeFabricacao = 2023;
        String primeiroNome = "Kayo";
        String segundoNome = "Leanndro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "O resultado do nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
}


}
