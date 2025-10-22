public class Endereco {
    private long cep; 
    private int numero;
    private String logradouro, bairro, cidade, complemento, ponto_ref;

    // Construtor completo: Tem a função em atribuir os valores em todos
    //Ele obriga todos os atributos recebem algum valor na instância do objeto
    public Endereco(long cep, int numero, String logradouro, String bairro, String cidade, String complemento, String ponto_ref) {
        this.cep=cep;
        this.numero=numero;
        this.logradouro=logradouro;
        this.bairro=bairro;
        this.cidade=cidade;
        this.complemento=complemento;
        this.ponto_ref=ponto_ref;
    }

    // Construtor Flexível: Apenas alguns atributos receberam um valor
    public Endereco(long cep, String logradouro, String bairro, String cidade){
        this.cep=cep;
        this.logradouro=logradouro;
        this.bairro=bairro;
        this.cidade=cidade;
    }

    //Construtor vazio: Nenhum atributo recebe valores na inicialização do objeto
    // Esse construtor só faz sentindo quando há metodos Setters
    public Endereco (){

    }

    //Sobrecarga de construtor (Versionamento de Construtores):
    // Constutor completo + Construtor Flexível + Construtor Vazio


    public String getLogradouro(){
        return logradouro;
    }

    public long getCep(){
        return cep;
    }
}
