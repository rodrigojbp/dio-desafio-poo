import br.com.dio.desafio.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bootcamp novoBootcamp = new Bootcamp();

        boolean var = true;
        do {
            System.out.println("1 - Criar curso | 2 - Criar bootcamp | 3 - Criar mentoria | 4 - Criar inscrição | 5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Curso novoCurso = new Curso();
                    System.out.println("Nome do curso: ");
                    String nomeCurso = scanner.next();
                    novoCurso.setTitulo(nomeCurso);

                    System.out.println("Descrição do curso: ");
                    String descricaoCurso = scanner.next();
                    novoCurso.setDescricao(descricaoCurso);

                    System.out.println("Carga horária: ");
                    int chCurso = scanner.nextInt();
                    novoCurso.setCargaHoraria(chCurso);

                    novoBootcamp.getConteudos().add(novoCurso);

                    System.out.println("Novo curso criado: " + novoCurso);
                    System.out.println(novoBootcamp);
                    break;
                case 2:
//                    Bootcamp novoBootcamp = new Bootcamp();
                    System.out.println("Nome do bootcamp: ");
                    String nomeBootcamp = scanner.next();
                    novoBootcamp.setTitulo(nomeBootcamp);

                    System.out.println("Descrição do bootcamp: ");
                    String desBootcamp = scanner.next();
                    novoBootcamp.setDescricao(desBootcamp);

                    System.out.println("Bootcamp criado: " + novoBootcamp);
                    break;
                case 3:
                    Mentoria novaMentoria = new Mentoria();
                    System.out.println("Nome da mentoria: ");
                    String nomeMentoria = scanner.next();
                    novaMentoria.setTitulo(nomeMentoria);

                    System.out.println("Descrição da mentoria: ");
                    String desMentoria = scanner.next();
                    novaMentoria.setDescricao(desMentoria);

                    System.out.println("Daqui quantos dias: ");
                    int dataMentoria = scanner.nextInt();
                    novaMentoria.setData(LocalDate.now().plusDays(dataMentoria));

                    novoBootcamp.getConteudos().add(novaMentoria);

                    System.out.println("Mentoria criada: " + novaMentoria);
                    break;
                case 4:
                    Dev novoDev = new Dev();
                    System.out.println("Nome: ");
                    String nomeDev = scanner.next();
                    novoDev.setNome(nomeDev);
                    System.out.println("Dev cadastrado: " + novoDev.getNome());

                    novoDev.inscreverBootcamp(novoBootcamp);
                    System.out.println("Dev inscrito no bootcamp: " + novoDev.getConteudoInscritos());

                    break;
                case 5:
                    var = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }while (var == true);
        // Criação do curso1 - Java
        /*Curso curso1 = new Curso();
        curso1.setTitulo("Java - Primeira vista");
        curso1.setDescricao("Primeira vista sobre essa linguagem de programação Orientada a Objetos.");
        curso1.setCargaHoraria(10);*/

        // Criação do curso2 - JavaScript
        /*Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript - Uma introdução");
        curso2.setDescricao("Introdução aos conceitos de JavaScript, assim como suas funções e aplicabilidade.");
        curso2.setCargaHoraria(10);*/

        // Criação da mentoria
        /*Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Acompanhamento e tiragem de dúvidas no curso de Java");
        mentoria.setData(LocalDate.now());*/


        // -- Criação do bootcamp1 - Java Developer
        /*Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Java developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Exibe os cursos
        System.out.println("--- BOOTCAMP: " + bootcamp.getTitulo() + " ---");
        System.out.println("Curso: " + curso1.getTitulo());
        System.out.println("Descrição: " + curso1.getDescricao());
        System.out.println("Curso: " + curso2.getTitulo());
        System.out.println("Descrição: " + curso2.getDescricao());
        System.out.println("Mentoria: " + mentoria.getTitulo());*/




        // Inscrição de um Dev
        /*Dev devCharley = new Dev();
        devCharley.setNome("Charley");
        devCharley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCharley.getConteudoInscritos());
        devCharley.progredir();
        devCharley.progredir();
        System.out.println("Conteúdos inscritos: " + devCharley.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devCharley.getConteudosConcluidos());
        System.out.println("XP: " + devCharley.calcularTotalXp());


        Dev devOutro = new Dev();
        devOutro.setNome("João");
        devOutro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devOutro.getConteudoInscritos());
        devOutro.progredir();
        devOutro.progredir();
        devOutro.progredir();
        System.out.println("Conteúdos inscritos: " + devOutro.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devOutro.getConteudosConcluidos());
        System.out.println("XP: " + devOutro.calcularTotalXp());

        for (Dev devInscritos : bootcamp.getDevsInscritos()){
            System.out.println(devInscritos);// TODO - Corrigir a exibição
        }*/

    }

}
