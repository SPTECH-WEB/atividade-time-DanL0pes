package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0, empates = 0, derrotas = 0;

    public void Time(String nome){
        this.nome = nome;
    }

    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarEmpate(){
        empates++;
    }
    public void registrarDerrota(){
        derrotas++;
    }

    public Integer getPontos(){
        return vitorias * 3 + empates;
    }
}
