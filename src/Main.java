import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");

        LocalDate hoje  = LocalDate.now();
        mentoria.setData(hoje);


        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);

        //rodar Ctrl + Shift + F10

    }

}
