
public class Homem extends PessoaIMC {
    
    public Homem(String nome, String sobreNome, int dia, int mes, int ano, float peso, float altura, long CPF) {
        super(nome, sobreNome, dia, mes, ano, peso, altura, CPF);
    }

    @Override
    public String resultIMC() {
        if(calculaIMC()>26.4){
            return "Acima do peso ideal.";
        }else if(calculaIMC()<20.7){
            return "Abaixo do peso ideal.";
        }else{
            return "Peso ideal";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenero = Homem" + "\nCategoria = " + resultIMC() + "\n--------------------------";
    }
}

