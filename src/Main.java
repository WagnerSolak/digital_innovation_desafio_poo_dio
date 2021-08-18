import br.com.dio.desafio.dominio.*;

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


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(8);

        //Conteudo conteudo = new Curso(); // conceito de polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        //rodar Ctrl + Shift + F10

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSolak = new Dev();
        devSolak.setNome("Solak´s");
        devSolak.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de: Solak" + devSolak.getConteudosInscritos());

        devSolak.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de: Solak" + devSolak.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de: Solak" + devSolak.getConteudosConcluidos());

        devSolak.progredir();
        System.out.println("XP: " + devSolak.calcularTotalXp());

        System.out.println("----------------------------------------------------------------------------------------------------------");

        Dev devJukis = new Dev();
        devJukis.setNome("Jukis");
        devJukis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de: Jukis" + devSolak.getConteudosInscritos());
        devJukis.progredir();
        devJukis.progredir();
        devJukis.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de: Jukis" + devJukis.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de: Jukis" + devJukis.getConteudosConcluidos());
        System.out.println("XP: " + devJukis.calcularTotalXp());
    }

}
