package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    
    private int cargaHorario;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10;
    }


    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHorario=" + cargaHorario + "]";
    }

}
