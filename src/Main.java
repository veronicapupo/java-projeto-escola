import java.util.*;
// Criar Função
//uma função pode possuir retorno ou não
//uma função precisa de um nome
//uma função pode possuir parametros ou não

//Como declarar variavel
//uma variavel precisa de um tipo
//uma variavel precisa de um nome
//uma variavel pode ter inicialização ou não ex.(int x = 0; ou int x;)
public class Main {

    static void menu() {
        System.out.println();
        System.out.println("SELECIONE UMA DAS OPÇÕES");
        System.out.println("(1) - CADASTRAR ALUNO");
        System.out.println("(2) - LISTAR CURSOS DISPONIVEIS");
        System.out.println("(0) - SAIR DO PROGRAMA");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1 -> {
                imprimirNomeIdade(perguntaNome(), perguntaIdade());
                menu();
            }
            case 2 -> {
                listaCursosDisponiveis();
                menu();
            }
            case 0 -> {
                break;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Inicio do programa");
        menu();
    }


    static List<String> listaCursosDisponiveis() {
        List<String> cursos = new ArrayList<>();
        cursos.add("Medicina");
        cursos.add("Odontologia");
        cursos.add("Veterinaria");
        System.out.println(cursos);
        return cursos;
    }

    static void imprimirNomeIdade(String nome, int idade) {
        System.out.println("Nome = " + nome + " " + "Idade = " + idade);
    }

    static String perguntaNome() {
        System.out.println("Qual é o seu nome?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static int perguntaIdade() {
        System.out.println("Qual a sua idade?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}

