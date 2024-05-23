import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class MinhaListaOrdenavel{
    private ArrayList<PessoaIMC> array = new ArrayList<>();

    public void add(PessoaIMC p){
        array.add(p);
    }

    public PessoaIMC get(int i){
        return array.get(i);
    }

    private Comparator<PessoaIMC> pesoC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            return Float.compare(p1.getPeso(), p2.getPeso());
            }
        };

    private Comparator<PessoaIMC> alturaC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            return Float.compare(p1.getAltura(), p2.getAltura());
            }
        };

    private Comparator<PessoaIMC> idadeC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            return Integer.compare(p1.getIdade(), p2.getIdade());
            }
        };

    private Comparator<PessoaIMC> CPFC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            return Long.compare(p1.getCPF(), p2.getCPF());
            }
        };

    private Comparator<PessoaIMC> nomeC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            final int auxiliar = p1.getNome().compareTo(p2.getNome());
            if(auxiliar!=0){
                return p1.getNome().compareTo(p2.getNome());
            }else{
                return p1.getSobreNome().compareTo(p2.getSobreNome());
                }
            }
        };

    private Comparator<PessoaIMC> IMCC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            return Float.compare(p1.calculaIMC(), p2.calculaIMC());
            }
        };

    private Comparator<PessoaIMC> dataNascC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            final int auxAno = Integer.compare(p1.dataNasc.get(GregorianCalendar.YEAR), p2.dataNasc.get(GregorianCalendar.YEAR));
            final int auxMes = Integer.compare(p1.dataNasc.get(GregorianCalendar.MONTH), p2.dataNasc.get(GregorianCalendar.MONTH));

            if(auxAno!=0){
                return Integer.compare(p1.dataNasc.get(GregorianCalendar.YEAR), p2.dataNasc.get(GregorianCalendar.YEAR));
            }else if(auxMes!=0){
                return Integer.compare(p1.dataNasc.get(GregorianCalendar.MONTH), p2.dataNasc.get(GregorianCalendar.MONTH));
            }else{
                return Integer.compare(p1.dataNasc.get(GregorianCalendar.DAY_OF_MONTH), p2.dataNasc.get(GregorianCalendar.DAY_OF_MONTH));
                }
            }
        };

    private Comparator<PessoaIMC> generoC = new Comparator<PessoaIMC> () {
        public int compare (PessoaIMC p1, PessoaIMC p2){
            if(p1 instanceof Homem && p2 instanceof Mulher){
                return 1;
            }else if(p1 instanceof Homem && p2 instanceof Homem){
                return 0;
            }else{
                return -1;
                }
            }
        };

    public ArrayList<PessoaIMC> ordena(int criterio){
        switch (criterio) {
            case 1:
                Collections.sort(this.array , pesoC);
                break;
            case 2:
                Collections.sort(this.array, pesoC.reversed());
                break;
            case 3:
                Collections.sort(this.array, alturaC);
                break;
            case 4:
                Collections.sort(this.array, alturaC.reversed());
                break;
            case 5:
                Collections.sort(this.array , idadeC);
                break;
            case 6:
                Collections.sort(this.array, idadeC.reversed());
                break;
            case 7:
                Collections.sort(this.array, CPFC);
                break;
            case 8:
                Collections.sort(this.array, CPFC.reversed());
                break;
            case 9:
                Collections.sort(this.array, nomeC);
                break;
            case 10:
                Collections.sort(this.array, nomeC.reversed());
                break;
            case 11:
                Collections.sort(this.array, IMCC);
                break;
            case 12:
                Collections.sort(this.array, IMCC.reversed());
                break;
            case 13:
                Collections.sort(this.array, dataNascC);
                break;
            case 14:
                Collections.sort(this.array, dataNascC.reversed());
                break;
            case 15:
                Collections.sort(this.array, generoC);
                break;
            case 16:
                Collections.sort(this.array, generoC.reversed());
            default:
                return this.array;
        }

        return this.array;

        }
    }
