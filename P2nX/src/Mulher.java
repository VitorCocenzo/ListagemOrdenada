
public class Mulher extends PessoaIMC {
    
    public Mulher(String nome, String sobreNome, int dia, int mes, int ano, float peso, float altura, long CPF) {
        super(nome, sobreNome, dia, mes, ano, peso, altura, CPF);
    }

    @Override
    public String resultIMC() {
        if(calculaIMC()>25.8){
            return "Acima do peso ideal.";
        }else if(calculaIMC()<19){
            return "Abaixo do peso ideal.";
        }else{
            return "Peso ideal";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenero = Mulher" + "\nCategoria = " + resultIMC() +"\n--------------------------";
    }
}

