import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
class Programa {
    public static int menu(Scanner input){
        System.out.printf("""
        Digitar:
        1- Adiciona algo a lista
        2- Mostra toda a sua lista
        3- Mostra um elemento da lista pela
        posição (Começa em 0)
        4- Remover elemento pela posição 
        5- Encerrar programa
        """
        );
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }
    public static void add_lista(List<String> lista_padrao,Scanner input){
        while (true){
            System.out.println("Digite o elemento a adicionar ou \"sair\" para sair: ");
            String elemento = input.nextLine();
            if (!elemento.equalsIgnoreCase("sair")){
                System.out.printf("Item \"%s\" adicionado com sucesso! %n",elemento);
                lista_padrao.add(elemento);
            }
            else if (elemento.equalsIgnoreCase("sair")){
                break;
            }
        }
    }
    public static void remover_lista(List<String> lista_padrao,Scanner input){
        while (true){
            System.out.println("Digite o elemento a remover ou \"sair\" para sair: ");
            String remover_lista = input.nextLine();
            if (remover_lista.equalsIgnoreCase("sair")){
                break;
            }
            else if (lista_padrao.contains(remover_lista)){
                lista_padrao.remove(remover_lista);
                System.out.printf("Item \"%s\" removido com sucesso! %n",remover_lista);
            }
            else if (!lista_padrao.contains(remover_lista)){
                System.out.printf("O item %s não existe na lista! %n",remover_lista);
            }
        }
    }
    public static void procurar_lista(List<String> lista_padrao,Scanner input){
        while(true){
            System.out.println("Digite o elemento a procurar (começando em 0): ");
            int valor_procurado = input.nextInt();
            if (valor_procurado > -1 && valor_procurado < lista_padrao.size() && !lista_padrao.isEmpty()){
                if (lista_padrao.contains(lista_padrao.get(valor_procurado))){
                    System.out.println("Valor encontrado!");
                    System.out.printf("%s - posição: %d %n",lista_padrao.get(valor_procurado),valor_procurado);
                    System.out.println();
                    break;
                }
                else {
                    System.out.printf("O valor no indice %d não foi encontrado! %n",valor_procurado);
                }
            }
            else {
                System.out.printf("O valor no indice %d não existe na lista! %n",valor_procurado);
            }
        }
    }
    public static void procurar_indice(List<String> lista_padrao){
        if (lista_padrao.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                    } 
                    else{
                        for (int i = 0; i < lista_padrao.size(); i++){
                            System.out.printf("%s - posição: %d%n", lista_padrao.get(i), i);
                        }
                    }
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("---SISTEMA DE COMPRAS ONLINE---");
        Scanner input = new Scanner(System.in);
    
        List<String> lista_padrao = new ArrayList<>();
        Boolean comando = true;
        
        while (comando){
            int opcao = 0;
            while (true){
                try{
                    opcao = Programa.menu(input);
                    break;
                }
                catch (InputMismatchException e){
                    System.out.println("ERRO! Digite um número inteiro entre 1 e 5");
                    input.next();
                }
            }
            switch(opcao){
                case 1:
                    while (true){
                        int opcao_add = 0;
                        while (true){
                            try{
                                System.out.println("""
                                Deseja adicionar algo a lista?
                                1- Sim
                                2- Não
                                """
                                );
                                opcao_add = input.nextInt();
                                input.nextLine();
                                break;
                            }
                            catch (InputMismatchException e){
                                System.out.println("ERRO! Digite um número inteiro entre 1 e 2");
                                input.next();
                            }
                        }
                        if (opcao_add != 1 && opcao_add != 2){
                            System.out.println("Digite 1 ou 2!");
                        }
                        else{
                            if (opcao_add == 1){
                                System.out.println("---INICIANDO SISTEMA DE ADICIONAR ELEMENTOS A LISTA---");
                                Programa.add_lista(lista_padrao, input);
                                break;
                            }
                            else if (opcao_add == 2){
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    if (!lista_padrao.isEmpty()){
                        Programa.procurar_indice(lista_padrao);
                        break;
                    }
                    else if (lista_padrao.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                        System.out.println();
                        break;
                    }
                    break;
                case 3:
                    if (!lista_padrao.isEmpty()){
                        Programa.procurar_lista(lista_padrao,input);
                        break;
                    }
                    else if (lista_padrao.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                        System.out.println();
                        break;
                    }
                    break;
                case 4:
                    int opcao_remover = 0;
                    if (!lista_padrao.isEmpty()){
                        while (true){
                            try{
                                System.out.println("""
                                Deseja remover algo da lista?
                                1- Sim
                                2- Não
                                """
                                );
                                opcao_remover = input.nextInt();
                                input.nextLine();
                                if (opcao_remover != 1 && opcao_remover != 2){
                                    System.out.println("Digite 1 ou 2!");
                                }
                                else{
                                    if (opcao_remover == 1){
                                        System.out.println("---INICIANDO SISTEMA DE REMOVER ELEMENTOS DA LISTA---");
                                        Programa.remover_lista(lista_padrao, input);
                                        break;
                                    }
                                    else if (opcao_remover == 2){
                                        break;
                                    }
                                }
                            }
                            catch (InputMismatchException e){
                                System.out.println("ERRO! Digite um número inteiro entre 1 e 2");
                                input.next();
                            }
                        }
                    }
                    else if (lista_padrao.isEmpty()){
                        System.out.println("Sua lista está vazia! ");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("---SISTEMA ENCERRADO---");
                    comando = false;
                    break;
                default:
                    System.out.println("Digite um número de 1 a 5!");
            }
        }
        input.close();
    }
}