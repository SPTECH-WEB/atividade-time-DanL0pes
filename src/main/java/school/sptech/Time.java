package school.sptech;

public class Time {
    String nome;
    int vitorias, empates, derrotas;

    public void Time(String nome){
        this.nome = nome;
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }

    public void registrarVitoria(){
        this.vitorias++;
    }
    public void registrarEmpate(){
        this.empates++;
    }
    public void registrarDerrota(){
        this.derrotas++;
    }
}
