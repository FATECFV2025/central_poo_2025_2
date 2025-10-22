public class Veiculo {
    private String marca;
    public String modelo;
    public String cor;   
    
    
    public void cadastrar(){
        validarPlaca();
        System.out.println("A cor é: "+cor);
        System.out.println("O modelo é: "+modelo);
    }

    public void atualizar(){

    }

    public String consultar(){
        return "Teste";
    }

    private void validarPlaca(){

    }

}
