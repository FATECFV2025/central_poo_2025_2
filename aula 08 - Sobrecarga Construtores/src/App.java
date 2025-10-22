public class App {
    public static void main(String[] args) throws Exception {
      //Criando o objeto
      //type nome_variavel

      //Instanciando uma classe com um construtor vazio
      Endereco e = new Endereco();

      //Instanciando uma classe com um construtor completo
      Endereco e1 = new Endereco(123456789,12,"Rua abc","Letras", "Alfa","Nao ha", "N/D");

      //Instanciado uma classe com um construtor flexivel
      Endereco e2 = new Endereco(1234,"Rua Margarida", "Jd Flores", "Ferraz de Vasc.");

      System.out.println(e.getLogradouro());
      System.out.println(e1.getLogradouro());
      System.out.println(e2.getLogradouro());

      
    }
}
