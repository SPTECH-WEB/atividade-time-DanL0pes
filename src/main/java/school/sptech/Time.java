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

    public Integer getTotalPartidas(){
        return vitorias + derrotas + empates;
    }

    public Integer getAproveitamento(){
        double aproveitamento = (double)vitorias / getTotalPartidas()*100;
        return(int) aproveitamento;
    }

    public void compararAproveitamento(Time adversario){
        if(this.getAproveitamento() > adversario.getAproveitamento()){
            System.out.println("O time "+this.nome+" tem um aproveitamento maior que o time "+adversario.nome+".");
        } else{
            System.out.println("O time "+adversario.nome+" tem um aproveitamento maior que o time "+this.nome+".");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Time: "+this.nome);
        System.out.println("Vitórias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
        System.out.println("\nPontos: "+this.getPontos());
        System.out.println("Total de Partidas: "+this.getTotalPartidas());
        System.out.println("Aproveitamento: "+this.getAproveitamento()+"%");
        System.out.println("---");

    }
}
