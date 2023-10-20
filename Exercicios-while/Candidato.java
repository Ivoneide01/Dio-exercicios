import java.util.ArrayList;
import java.util.List;

public class Candidato {
    private String nome;
    private int idade;
    private String experiencia;

    public Candidato(String nome, int idade, String experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Experiência: " + experiencia;
    }

    public static void main(String[] args) {
        List<Candidato> listaDeCandidatos = new ArrayList<>();

        // Adicione candidatos à lista
        listaDeCandidatos.add(new Candidato("João", 30, "5 anos de experiência"));
        listaDeCandidatos.add(new Candidato("Maria", 25, "3 anos de experiência"));
        listaDeCandidatos.add(new Candidato("Pedro", 28, "4 anos de experiência"));

        // Selecionar candidatos com base em critérios usando while
        List<Candidato> candidatosSelecionados = new ArrayList<>();
        int index = 0;
        while (index < listaDeCandidatos.size()) {
            Candidato candidato = listaDeCandidatos.get(index);
            if (candidato.getIdade() >= 28 && candidato.getExperiencia().contains("4 anos")) {
                candidatosSelecionados.add(candidato);
            }
            index++;
        }

        // Imprimir os candidatos selecionados
        for (Candidato candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }
    }
}
