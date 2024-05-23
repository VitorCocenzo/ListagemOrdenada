import java.util.GregorianCalendar;

public class Pessoa {
    private String nome,sobreNome;
    protected GregorianCalendar dataNasc;

    public Pessoa(String nome, String sobreNome, int dia, int mes, int ano){

        this.setNome(nome);
        this.setSobreNome(sobreNome);
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dia, int mes, int ano) {
        this.dataNasc = new GregorianCalendar(ano, mes-1, dia);
    }

    @Override
    public String toString() {
        return "\nNome = " + nome + ", Sobrenome = " + sobreNome + "\nDataNasc =" + dataNasc.get(GregorianCalendar.DAY_OF_MONTH)+ "/" + 
        (dataNasc.get(GregorianCalendar.MONTH)+1)+"/"+ dataNasc.get(GregorianCalendar.YEAR) + "\n";
    }
    
}
