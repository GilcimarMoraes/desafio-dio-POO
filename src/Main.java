import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGil = new Dev();
        devGil.setNome("Gil");
        devGil.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gil: " +  devGil.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos Gil: " +  devGil.getConteudosConcluidos());

        devGil.progredir();
        System.out.println("------------");
        System.out.println("Conteúdos Inscritos Gil: " +  devGil.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gil: " +  devGil.getConteudosConcluidos());

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("Xp: " + devGil.calcularTotalXp());

        devGabriel.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosConcluidos());
    }
}
