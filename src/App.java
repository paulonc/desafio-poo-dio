import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();

        curso1.setTiutlo("Curso Java");
        curso1.setDescricao("Um curso de Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();

        curso2.setTiutlo("Curso Python");
        curso2.setDescricao("Um curso de Python");
        curso2.setCargaHorario(8);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Uma mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
