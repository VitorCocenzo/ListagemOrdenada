import java.util.GregorianCalendar;

public abstract class PessoaIMC extends Pessoa {
    protected float peso, altura;
    private int idade;
    private GregorianCalendar dataAtual = new GregorianCalendar();
    private long CPF;

    public PessoaIMC(String nome, String sobreNome, int dia, int mes, int ano, float peso, float altura, long CPF) {
        super(nome, sobreNome, dia, mes, ano);
        this.CPF= CPF;
        this.peso = peso;
        this.altura = altura;
        this.dataNasc = new GregorianCalendar(ano, mes-1, dia);
        calcularIdade();
    }

    private void calcularIdade(){
        this.idade = dataAtual.get(GregorianCalendar.YEAR)-dataNasc.get(GregorianCalendar.YEAR);
    }

    public long getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float calculaIMC(){
        float resultado = 0;
        resultado = this.peso/((float)Math.pow(this.altura, 2));
        return resultado;
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString() + "peso = " + peso + "\naltura = " + altura + "\nidade = " + idade + "\nCPF = " + CPF + "\nIMC = " + calculaIMC();
    }

    public GregorianCalendar getDataAtual() {
        return dataAtual;
    }

}
