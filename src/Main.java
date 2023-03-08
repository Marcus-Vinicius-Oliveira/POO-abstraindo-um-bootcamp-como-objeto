import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devMarcus.getConteudosInscritos());

        devMarcus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devMarcus.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Marcus: " + devMarcus.getConteudosConcluidos());
        System.out.println("XP:" + devMarcus.calcularTotalXP());

        System.out.println("-----------");

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devArthur.getConteudosInscritos());

        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Arthur: " + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXP());



    }
}