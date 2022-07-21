package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Conteudo {
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    @Override
    public double calcularXp() {
        return XP_PADRAO + 100d;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getTitulo(), bootcamp.getTitulo()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) &&
                Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao(), dataInicial, dataFinal, devsInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "título=" + getTitulo() +
                ", descrição=" + getDescricao() +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devsInscritos=" + devsInscritos +
                ", conteúdos=" + conteudos +
                '}';
    }
}
