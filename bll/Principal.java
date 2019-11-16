/*
 * A licença MIT
 *
 * Copyright 2019 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>.
 *
 * É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia
 * deste software e dos arquivos de documentação associados (o "Software"), para
 * negociar o Software sem restrições, incluindo, sem limitação, os direitos de uso,
 * cópia, modificação e fusão, publicar, distribuir, sublicenciar e/ou vender cópias
 * do Software, e permitir que as pessoas a quem o Software é fornecido o façam,
 * sujeitas às seguintes condições:
 *
 * O aviso de copyright acima e este aviso de permissão devem ser incluídos em
 * todas as cópias ou partes substanciais do Software.
 *
 * O SOFTWARE É FORNECIDO "NO ESTADO EM QUE SE ENCONTRA", SEM NENHUM TIPO DE GARANTIA,
 * EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO,
 * ADEQUAÇÃO A UM FIM ESPECÍFICO E NÃO VIOLAÇÃO. EM NENHUMA CIRCUNSTÂNCIA, OS AUTORES
 * OU PROPRIETÁRIOS DE DIREITOS DE AUTOR PODERÃO SER RESPONSABILIZADOS POR QUAISQUER
 * REIVINDICAÇÕES, DANOS OU OUTRAS RESPONSABILIDADES, QUER EM AÇÃO DE CONTRATO,
 * DELITO OU DE OUTRA FORMA, DECORRENTES DE, OU EM CONEXÃO COM O SOFTWARE OU O USO
 * OU OUTRAS NEGOCIAÇÕES NO PROGRAMAS.
 * ---------------------------------------------------------------------------------------
 * Projeto    : Projeto Bolo no Pote - Matemática e Estatística - ADS1/2019 - Grupo A2
 * Criado em  : 07/11/2019
 * Autores    : Anisberto Reis
 *              Calebe Cabral da Costa
 *              Jhonathan dos Reis
 *              Marcos Paulo Pereira da Paixão
 *              Vinicius Araujo Lopes
 *
 * Professor  : Ujeverson Tavares Sampaio
 * Instituição: Senai Fatesg - Goiânia GO
 *             
 * Finalidade: Projeto Bolos no Pote - Composição da nota N2.
 * 
 * Muitas receitas de bolos no pote não gastam mais do que R$ 30 para fazer uma receita para 15 unidades.
 * E essa é uma das maiores vantagens em começar a vender bolos no pote. Inclusive, com a chegada do natal, 
 * você pode até mesmo apostar em bolos para essa época do ano!
 * Assim, foram reunidas três de receitas de coberturas, de bolos no pote.
 * Desenvolver um software, onde:
 * DESAFIO
 * Desenvolver um software que ao digitar os valores dos ingredientes com suas respectivas medidas, devolva para o 
 * usuário qual/quais receita(s) ele poderá fazer dentro do limite de gasto proposto na contextualização.
 * 1. Resolva a situação problema proposta. Com as três receitas. Os dados podem ser fictícios (valores e medidas).
 * 2. Calcule automaticamente o valor de custo de cada bolo no pote (incluso o valor da embalagem);
 * 3. Calcule quanto o usuário irá ter de lucro (em R$ e em %), dado um valor de venda.
 * 4. O software pode ser rodado no console.
 * 5. O software deverá ser apresentado para o(s) professor(es) da(s) disciplina(s) participante(s). “Rodando”.
 * 
 * Para a massa do bolo:
 * Ingredientes:
 * • 300 g de açúcar
 * • 300 g de margarina gelada
 * • 4 ovos médios
 *  • 300 g de farinha de trigo com fermento
 *  Recheios e Coberturas:
 * 
 *  1. Leite ninho com morangos:
 * 
 *  • 2 latas de leite condensado (300 gramas cada)
 *  • 2 latas de creme de leite (300 gramas cada)
 *  • 6 colheres (de sopa) de leite ninho (100 gramas cada)
 *  • 20 morangos
 * 
 * 2. Dois amores:
 * 
 * • 2 latas de leite condensado (300 gramas cada)
 * • 2 latas de creme de leite (300 gramas cada)
 * • 6 colheres de chocolate em pó (100 gramas cada)
 * 
 * 3. Maracujá:
 * 
 * • 2 xícaras de suco de maracujá (240 ml)
 * • 4 colheres de amido de milho (5 gramas cada)
 * • 6 gemas
 * • 1 xícara de água (250 ml)
 * • 1 e 1/2 xícara de açúcar (200 gramas)
 * • 200 ml de leite
 * • 1 colher (de sopa) de manteiga. (50 gramas)
 * 
 * ---------------------------------------------------------------------------------------
 */
package mesa2.bll;

import java.util.Scanner;
import static mesa2.app.Tela.*;

public class Principal {

    // Fase1_Etapa_1 - Variáveis - Vinicius --------------------------------------------------------
    private static int c = 80;  // Quantidade de colunas para a classe de tela
    private static int l = 18;  // Quantidade de linhas para a classe de tela
    private static char bs = 's'; // Tipo de borda para a classe de tela (s = simples)
    private static char bd = 'd'; // Tipo de borda para a classe de tela (d = dupla)
    private static String versao = "v1.1";
    private static String titulo = "PROJETO MATH - BOLO NO POTE - " + versao;
    private static String subtitulo = "Seja vem vindo!";
    private static String texto = "";
    private static String rodape = " ";
    private static String prompt = "> ";

    private static Scanner input = new Scanner(System.in);
    private static boolean sair = false; // boolean: Para sair do laço de repetição
    private static int opcaoMenu = 0; // int: Opção Menu
    private static int numeroReceita = -1;
    private static String opcao;
    private static String[] receitas = {"Leite ninho com Morangos", "Dois Amores", "Maracujá"};
    private static String[] opcoesReceitas = {"Morango", "Dois Amores", "Maracujá"}; // Vetor String: Opções Sabores       
    private static String opcaoReceita;

    private static double rendimento = 15.0;
    private static double custo_maximo = 30.0;
    private static double total_simulacao = 0.0;
    private static double custo_receita = 0.0;
    private static double custo_unitario = 0.0;
    private static double preco_venda_unitario;
    private static double lucro_unitario_valor;
    private static double lucro_percent;

    private static String massaBolo[] = {"Açúcar", "Margarina Gelada", "Ovos", "Farinha de Trigo com Fermento"}; // Vetor String: Nome dos Ingredientes Massa do bolo
    private static String recheioMorango[] = {"Leite Condensado", "Creme de leite", "Leite Ninho", "Morangos", "Pote 200ml"};  // Vetor String: Nome dos Ingredientes Recheio e Cobertura
    private static String recheioDoisAmores[] = {"Leite Condensado", "Creme de leite", "Chocolate em Pó", "Pote 200ml"};      // Vetor String: Nome dos Ingredientes Recheio e Cobertura
    private static String recheioMaracuja[] = {"Suco de Maracujá", "Amido de Milho", "Água", "Leite", "Manteiga", "Pote 200ml"};  // Vetor String: Nome dos Ingredientes Recheio e Cobertura

    private static double[] qntMassa = new double[massaBolo.length];                // Vetor double:Quantidade dos Ingredientes Massa do bolo
    private static double[] qntMorango = new double[recheioMorango.length];         // Vetor double:Quantidade dos Ingredientes Recheio e Cobertura + potes
    private static double[] qntDoisAmores = new double[recheioDoisAmores.length];   // Vetor double:Quantidade dos Ingredientes Recheio e Cobertura + potes
    private static double[] qntMaracuja = new double[recheioMaracuja.length];       // Vetor double:Quantidade dos Ingredientes Recheio e Cobertura + potes

    private static double[] vlMassa = new double[massaBolo.length];                 // Vetor double:Valor dos Ingredientes Massa do bolo
    private static double[] vlMorango = new double[recheioMorango.length];          // Vetor double:Valor dos Ingredientes Recheio e Cobertura + potes
    private static double[] vlDoisAmores = new double[recheioDoisAmores.length];    // Vetor double:Valor dos Ingredientes Recheio e Cobertura + potes
    private static double[] vlMaracuja = new double[recheioMaracuja.length];        // Vetor double:Valor dos Ingredientes Recheio e Cobertura + potes

    private static String str_ingredientes[];
    private static double valores[][];

    /*
        ingrediente1 [qtd][valor][receita][custo_unit]
        ingrediente2 [qtd][valor][receita][custo_unit]
        ingrediente3 [qtd][valor][receita][custo_unit]
        ingredienteN [qtd][valor][receita][custo_unit]
     */

    // FIM Fase1_Etapa_1 - Variáveis - Vinicius --------------------------------------------------------
    /**
     * Execução principal
     *
     * @param args kiss = executa uma versão simplificada
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        if (args.length == 1 && args[0].equals("kiss")) {
            Kiss.main(args);
        } else {
            sobre();
            do {
                menu_receitas();
                sair = (numeroReceita == 0) ? true : false;
            } while (!sair);
        }
    }

    private static void inicia_valores() {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = 0.0;
            }
        }
    }

    private static void sobre() {
        limpa_tela();
        texto = Sobre.txt_sobre(custo_maximo);
        rodape = "";
        desenha_tela(titulo, subtitulo, texto, rodape, c, l, bs);
        enter_para_("continuar");
    }

    private static void menu_receitas() {
        // Fase2_Etapa_1 - Lista de Receitas - Anisberto --------------------------------------------------------
        texto = "Informe o número da receita: \n\n"
                + " 1. Leite ninho com morangos\n"
                + " 2. Dois amores\n"
                + " 3. Maracujá\n\n"
                + " \n";

        rodape = "0. Sair | 4. Sobre este software";

        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

        // FIM Fase2_Etapa_1 - Lista de Receitas - Anisberto --------------------------------------------------------
        // Fase2_Etapa_2 - Loop Receita - Jhonathan / Vinicius --------------------------------------------
        // A lógica do Jhonathan foi aproveitada, mas o Vinicius implementou outro tipo de validação.
        opcao = input.nextLine();
        if (int_no_intervalo(opcao, 0, 4)) {
            numeroReceita = Integer.parseInt(opcao);

            // Testa a resposta
            if (numeroReceita > 0) {
                if (numeroReceita == 4) {
                    sobre();
                } else {
                    ver_receita();
                    set_preco();
                    if (preco_venda_unitario == 0.0) {
                        prompt = "> ";
                        numeroReceita = -1;
                    } else {
                        opcaoReceita = opcoesReceitas[numeroReceita - 1];
                        menu_ingredientes();
                    }
                }
            }
        } else {
            numeroReceita = -1;
            erro("Opção inválida!");
        }
        // FIM Fase2_Etapa_2 - Loop Receita - Jhonathan / Vinicius --------------------------------------------
    }

    private static void ver_receita() {
        // Fase2_Etapa_2 - Loop Receita - Jhonathan / Calebe / Vinicius --------------------------------------------
        // A lógica do Jhonathan foi implementada pelo Vinicius, utilizando o método de impressão do Calebe

        subtitulo = "Você selecionou a receita '" + receitas[numeroReceita - 1] + "'";

        texto = "Para a massa do bolo:\n"
                + imprimeVetor(massaBolo())
                + "\nRecheio e Cobertura:\n";
        if (numeroReceita == 1) {
            texto += imprimeVetor(recheioNinho());
        } else if (numeroReceita == 2) {
            texto += imprimeVetor(recheioDoisAmores());
        } else {
            texto += imprimeVetor(recheioMaracuja());
        }

        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

        // FIM Fase2_Etapa_2 - Loop Receita - Jhonathan / Calebe / Vinicius --------------------------------------------
    }

    private static void analisa_custo() {
        boolean incompleto = false;
        boolean nenhum;
        try {

            for (int i = 0; i < valores.length; i++) {
                if (valores[i][0] == 0.0) {
                    incompleto = true;
                }
            }
            nenhum = false;

        } catch (NullPointerException e) { // Caso nenhum ingrediente tenha sido informado, matriz valores[][] == NULL
            nenhum = true;
        }

        if (incompleto || nenhum) {
            texto = "Os ingredientes informados até o momento não são suficientes "
                    + "para analisar o custo de uma receita.\n\n"
                    + "Informe todos os ingredientes de uma receita e acesse a essa função novamente.";
        } else {
            texto = String.format("Rendimento  . . . . . . : %.0f unidades\n\n", rendimento)
                    + String.format("Preço de venda total. . : R$ %.2f\n", (preco_venda_unitario * rendimento))
                    + String.format("Custo total da receita. : R$ %.2f\n", (custo_unitario * rendimento))
                    + String.format("Lucro por receita . . . : R$ %.2f\n\n", (preco_venda_unitario - custo_unitario) * rendimento)
                    + String.format("Preço de venda unitário : R$ %.2f\n", preco_venda_unitario)
                    + String.format("Custo unitário  . . . . : R$ %.2f\n", custo_unitario)
                    + String.format("Lucro unitário. . . . . : R$ %.2f\n\n", lucro_unitario_valor)
                    + String.format("Lucro por receita . . . : %.2f%%\n", lucro_percent);

            texto += alerta_custo_maximo();
        }

        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);
    }

    private static void atualiza_tela(String titulo, String subtitulo, String texto, String rodape, String prompt,
            int colunas, int linhas, char borda) {
        limpa_tela();
        desenha_tela(titulo, subtitulo, texto, rodape, colunas, linhas, borda);
        if (!prompt.equals("")) {
            imprime(prompt);
        }
    }

    private static void menu_ingredientes() {
        do {
            if (opcaoReceita.equals("Morango")) { // Condição: Para cada opção de sabor valores diferentes serão atribuidos ao Método menu_operacoes
                menu_operacoes(opcaoReceita, massaBolo, recheioMorango, qntMassa, qntMorango, vlMassa, vlMorango); // Morango
            }
            if (opcaoReceita.equals("Dois Amores")) {
                menu_operacoes(opcaoReceita, massaBolo, recheioDoisAmores, qntMassa, qntDoisAmores, vlMassa, vlDoisAmores); // Dois Amores
            }
            if (opcaoReceita.equals("Maracujá")) {
                menu_operacoes(opcaoReceita, massaBolo, recheioMaracuja, qntMassa, qntMaracuja, vlMassa, vlMaracuja); // Maracujá
            }
        } while (!sair);
    }

    public static void menu_operacoes(String str, String[] vetorS1, String[] vetorS2, double[] vetor1, double[] vetor2, double[] valor1, double[] valor2) {
        // **********************************
        // Fase 3 Etapa 2
        // **********************************

        // Pocessamento: Menu
        do {
            subtitulo = "RECEITA: " + receitas[numeroReceita - 1] + " - Menu de Operações";
            texto = "Informe a opção desejada:\n\n"
                    + " 1. Ver Receita\n"
                    + " 2. Simular compra\n"
                    + " 3. Ver Ingredientes informados\n"
                    + " 4. Analisar custo da receita\n\n";
            rodape = "0. Escolher outra receita";
            prompt = "> ";
            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

            opcaoMenu = validaNumeroInt(); // Opção menu 0 - 1 - 2 - 3 -4
            // if: Caso opção inválida
            if (opcaoMenu < 0 || opcaoMenu > 4) {
                erro("Opção Inválida!");
                // if(3): Mostra Ingredientes, Quantidade, valores e análise
            } else {
                rodape = " ";
                switch (opcaoMenu) {
                    case 0:
                        sair = true;
                        break;
                    case 1:
                        subtitulo = "RECEITA: " + receitas[numeroReceita - 1] + " - Ingredientes";
                        ver_receita();
                        enter_para_("voltar ao menu");
                        opcaoMenu = -1; // Para executar este menu novamente
                        break;
                    case 2:
                        // Informar Ingredientes, Quantidade, valores
                        subtitulo = "RECEITA: " + receitas[numeroReceita - 1] + " - Simulação de compra";
                        informaQntValor(str, vetorS1, vetorS2, vetor1, vetor2, valor1, valor2); // Método Informa Ingredientes, Quantidade, valores
                        prompt = "";
                        desenha_tela(titulo, subtitulo, texto, rodape, c, l, bs);
                        if (opcaoMenu != 0) {
                            mostraIngredientes(str, vetorS1, vetorS2, vetor1, vetor2, valor1, valor2);
                            enter_para_("ver a análise de custos");
                            analisa_custo();
                            enter_para_("voltar ao menu");
                        }
                        opcaoMenu = -1; // Para executar este menu novamente
                        break;
                    case 3:
                        subtitulo = "RECEITA: " + receitas[numeroReceita - 1] + " - Ingredientes informados";
                        mostraIngredientes(str, vetorS1, vetorS2, vetor1, vetor2, valor1, valor2); // Método Imprimi Ingredientes, Quantidade, valores
                        enter_para_("voltar ao menu");
                        opcaoMenu = -1; // Para executar este menu novamente
                        break;
                    case 4:
                        subtitulo = "RECEITA: " + receitas[numeroReceita - 1] + " - Análise de custo";
                        analisa_custo();
                        enter_para_("voltar ao menu");
                        opcaoMenu = -1; // Para executar este menu novamente
                    default:
                        sair = true;
                        break;
                }
            }
        } while (opcaoMenu < 0 || opcaoMenu > 4);
    }

    public static double informaQntValor(String str1, String[] vetorS1, String[] vetorS2, double[] vetor1, double[] vetor2, double[] valor1, double[] valor2) {
        // **************************************************
        // Fase 3 Etapa 2: Método Entrada: Quantidade e Valor
        // **************************************************
        boolean sair = false; // Variaveis // boolean: Sair do informaQntValor
        do { // Processamento
            int verifVetorCheio1 = vetor1.length; // Variaveis de Verificicação: se os vetores MassaBoolo estão totalmente preenchido 
            int verifVetorCheio2 = vetor2.length;// Variaveis de Verificicação: se os vetores RecheiosCobertura estão totalmente preenchido 
            mostraIngredientes(str1, vetorS1, vetorS2, vetor1, vetor2, valor1, valor2);// Imprimir: Códiogo, Nome, Quantidade e Valores
            rodape = "0. Voltar ao menu anterior";
            prompt = "> Digite o código do ingrediente: ";
            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

            opcaoMenu = validaNumeroInt();
            rodape = " ";

            switch (opcaoMenu) {
                case 0:// Caso 0: O programa finaliza o laço "Informe a Quantidade" e vai para o menu.

                    sair = true;
                    break;
                case 1:// Caso 1: Pede a QNT, VLR do Açucar
                    do {
                        prompt = "> Informe a quantidade de Açúcar(g): ";
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);
                        vetor1[0] = validaNumeroDoub(); // Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 300) 
                        if (vetor1[0] < 300) {
                            erro("<<<A quantidade mínima de Açucar para uma receita é (300)gramas!>>>");
                        }
                    } while (vetor1[0] < 300);
                    do {
                        prompt = String.format("> Informe o valor para %.1f gramas de Açúcar: ", vetor1[0]);
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        valor1[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                        if (valor1[0] < 0) {
                            erro("O valor informado é inválido!");
                        }
                    } while (valor1[0] < 0);
                    break;
                case 2:// Caso 2: Pede a QNT, VLR da Magrarina Gelada
                    do {
                        prompt = "> Informe a quantidade da Margarina Gelada(g): ";
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        vetor1[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 300) 
                        if (vetor1[1] < 300) {
                            erro("<<<A quantidade mínima da Margarina Gelada para uma receita é (300)gramas!>>>");
                        }
                    } while (vetor1[1] < 300);
                    do {
                        prompt = String.format("> Informe o valor para %.1f gramas de Margarina Gelada: ", vetor1[1]);
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        valor1[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                        if (valor1[1] < 0) {
                            erro("O valor informado é inválido!");
                        }
                    } while (valor1[1] < 0);
                    break;
                case 3:// Caso 3: Pede a QNT, VLR do Ovo
                    do {
                        prompt = "> Informe a quantidade de Ovos: ";
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        vetor1[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 4) 
                        if (vetor1[2] < 4) {
                            erro("<<<A quantidade mínima de Ovos para uma receita é (4)unidades!>>>");
                        }
                    } while (vetor1[2] < 4);
                    do {
                        prompt = String.format("> Informe o valor para %.0f unidades de Ovos: ", vetor1[2]);
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        valor1[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                        if (valor1[2] < 0) {
                            erro("O valor informado é inválido!");
                        }
                    } while (valor1[2] < 0);
                    break;
                case 4:// Caso 4: Pede a QNT, VLR da Farinha de Trigo Com Fermento
                    do {
                        prompt = "> Informe a quantidade da Farinha de Trigo com Fermento(g): ";
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        vetor1[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.valor >= 300) 
                        if (vetor1[3] < 300) {
                            erro("<<<A quantidade mínima da Farinha de Trigo com Fermento para uma receita é (300)gramas!>>>");
                        }
                    } while (vetor1[3] < 300);
                    do {
                        prompt = String.format("> Informe o valor para %.1f gramas de Farinha de Trigo: ", vetor1[3]);
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        valor1[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                        if (valor1[3] < 0) {
                            erro("O valor informado é inválido!");
                        }
                    } while (valor1[3] < 0);
                    break;
                case 5:// Caso 5: Pede a QNT, VLR do Morango, Dois Amores ou Maracujá
                    if ((str1.equals("Morango")) || (str1.equals("Dois Amores"))) {
                        do {
                            prompt = "> Informe a quantidade do Leite Condensado(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.valor >= 600) 
                            if (vetor2[0] < 600) {
                                erro("<<<A quantidade mínima do Leite Condensado para uma receita é 02 latas (300 g cada)!>>>");
                            }
                        } while (vetor2[0] < 600);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Leite Condensado: ", vetor2[0]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[0] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[0] < 0);
                    }
                    if (str1.equals("Maracujá")) {
                        do {
                            prompt = "> Informe a quantidade de Maracujá(ml): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.valor >= 240) 
                            if (vetor2[0] < 240 * 2) {
                                erro("<<<A quantidade mínima de Maracujá para uma receita é 02 xícaras (240 ml cada)!>>>");
                            }
                        } while (vetor2[0] < 240 * 2);
                        do {
                            prompt = String.format("> Informe o valor para %.1f mililitros de Maracujá: ", vetor2[0]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[0] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[0] < 0);
                    }
                    break;
                case 6:// Caso 6: Pede a QNT, VLR do Morango, Dois Amores ou Maracujá
                    if ((str1.equals("Morango")) || (str1.equals("Dois Amores"))) {
                        do {
                            prompt = "> Informe a quantidade do Creme de Leite(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.valor >= 300) 
                            if (vetor2[1] < 300 * 2) {
                                erro("<<<A quantidade mínima de Creme de Leite para uma receita é 02 latas (300 g cada)!>>>");
                            }
                        } while (vetor2[1] < 300 * 2);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Creme de Leite: ", vetor2[1]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[1] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[1] < 0);
                    }
                    if (str1.equals("Maracujá")) {
                        do {
                            prompt = "> Informe a quantidade do Amido de Milho(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.valor >= 5)  
                            if (vetor2[1] < 4 * 5) {
                                erro("<<<A quantidade mínima do Amido de Milho para uma receita é 04 colheres (5 g cada)!>>>");
                            }
                        } while (vetor2[1] < 4 * 5);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Amido de Milho: ", vetor2[1]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[1] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[1] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[1] < 0);
                    }
                    break;
                case 7:// Caso 7: Pede a QNT, VLR do Morango, Dois Amores
                    if (str1.equals("Morango")) {
                        do {
                            prompt = "> Informe a quantidade de Leite Ninho(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 600) 
                            if (vetor2[2] < 600) {
                                erro("<<<A quantidade mínima de Leite Ninho para uma receita é 06 colheres (100 g cada)!>>>");
                            }
                        } while (vetor2[2] < 600);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Leite Ninho: ", vetor2[2]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[2] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[2] < 0);
                    }
                    if (str1.equals("Dois Amores")) {
                        do {
                            prompt = "> Informe a quantidade do Chocolate em Pó(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 100) 
                            if (vetor2[2] < 100 * 6) {
                                erro("<<<A quantidade mínima de Chocolate em Pó para uma receita é 06 colheres (100 g cada)!>>>");
                            }
                        } while (vetor2[2] < 100 * 6);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Chocolate em Pó: ", vetor2[2]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[2] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[2] < 0);
                    }
                    if (str1.equals("Maracujá")) {
                        do {
                            prompt = "> Informe a quantidade de Água(ml): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 600) 
                            if (vetor2[2] < 250) {
                                erro("<<<A quantidade mínima de Água(ml) para uma receita é 250ml!>>>");
                            }
                        } while (vetor2[2] < 250);
                        do {
                            prompt = String.format("> Informe o valor para %.1f ml de Água: ", vetor2[2]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[2] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[2] < 0);

                    }
                    break;
                case 8:// Caso 8: Pede a QNT, VLR do Morango, Dois Amores
                    if (str1.equals("Dois Amores")) {
                        do {
                            prompt = "> Informe a quantidade de Pote(200ml): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 20) 
                            if (vetor2[3] < rendimento) {
                                erro(String.format("<<<A quantidade de Pote(200ml) não pode ser menor que o rendimento da receita(%s)!>>>", rendimento));
                            }
                        } while (vetor2[3] < rendimento);
                        do {
                            prompt = String.format("> Informe o valor para %.0f unidades do Pote(200ml): ", vetor2[3]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[3] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[3] < 0);
                    }
                    if (str1.equals("Maracujá")) {
                        do {
                            prompt = "> Informe a quantidade de Leite(ml): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 600) 
                            if (vetor2[3] < 200) {
                                erro("<<<A quantidade mínima de Leite(ml) para uma receita é 200ml!>>>");
                            }
                        } while (vetor2[3] < 200);
                        do {
                            prompt = String.format("> Informe o valor para %.1f ml de Leite: ", vetor2[3]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[3] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[3] < 0);

                    }
                    if (str1.equals("Morango")) {
                        do {
                            prompt = "> Informe a quantidade de Morangos: ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 20) 
                            if (vetor2[3] < 20) {
                                erro("<<<A quantidade mínima de Morangos para uma receita é 20 unidades!>>>");
                            }
                        } while (vetor2[3] < 20);
                        do {
                            prompt = String.format("> Informe o valor para %.0f unidades de Morangos: ", vetor2[3]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[3] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[3] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[3] < 0);
                    }
                    break;
                case 9:
                    // {"Suco de Maracujá", "Amido de Milho", "Água", "Leite", "Manteiga", "Pote 200ml"}
                    if (str1.equals("Maracujá")) {
                        do {
                            prompt = "> Informe a quantidade de Manteiga(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[4] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 600) 
                            if (vetor2[4] < 50) {
                                erro("<<<A quantidade mínima de Manteiga para uma receita é 01 colher (50 g cada)!>>>");
                            }
                        } while (vetor2[4] < 50);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Maneteiga: ", vetor2[4]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[4] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[4] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[4] < 0);
                    }
                    if (str1.equals("Morango")) {
                        do {
                            prompt = "> Informe a quantidade de Pote(200ml): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor2[4] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 20) 
                            if (vetor2[4] < rendimento) {
                                erro(String.format("<<<A quantidade de Pote(200ml) não pode ser menor que o rendimento da receita(%s)!>>>", rendimento));
                            }
                        } while (vetor2[4] < rendimento);
                        do {
                            prompt = String.format("> Informe o valor para %.0f unidades do Pote(200ml): ", vetor2[4]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor2[4] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                            if (valor2[4] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor2[4] < 0);
                    }
                    break;
                case 10:
                    do {
                        prompt = "> Informe a quantidade de Pote(200ml): ";
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        vetor2[5] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 20) 
                        if (vetor2[5] < rendimento) {
                            erro(String.format("<<<A quantidade de Pote(200ml) não pode ser menor que o rendimento da receita(%s)!>>>", rendimento));
                        }
                    } while (vetor2[5] < rendimento);
                    do {
                        prompt = String.format("> Informe o valor para %.0f unidades do Pote(200ml): ", vetor2[5]);
                        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                        valor2[5] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0)
                        if (valor2[5] < 0) {
                            erro("O valor informado é inválido!");
                        }
                    } while (valor2[5] < 0);
                    break;
                default:
                    erro("Código Inválido!");
            }

            for (int i = 0; i < vetor1.length; i++) {//Verificicação: se os vetores MassaBoolo estão totalmente preenchido 
                if (vetor1[i] != 0) {
                    verifVetorCheio1--;// Decremento:caso ElementoMassaBolo != 0
                }
            }
            for (int i = 0; i < vetor2.length; i++) {//Verificicação: se os vetores RecheiosCobertura estão totalmente preenchido 
                if (vetor2[i] != 0) {
                    verifVetorCheio2--;// Decremento:caso ElementoRecheioCobertura != 0
                }
            }

            if (verifVetorCheio1 == 0 && verifVetorCheio2 == 0) {// if(vetores == Cheios)>> verificar os vetore
                if (str1.equals("Maracujá")) {// if(opcaoReceita == Maracujá)>>verivicar se a opcao bolo é maracujá
                    if (vetor1[0] < 500) {// if(QNTaçucar < ((200+300)=500))>> verificar se quantidade de açucar é menor do que 
                        //                   500((300)gramas de ovos para a massa e (200)gramas para o Recheio e Cobertura)
                        erro("<<<A quantidade de Açucar é insuficiente para calcular a receita de Maracujá>>>\n"
                                + "<<<                  (300)gramas de Açucar para a massa                     >>>\n"
                                + "<<<          (200)gramas de Açucar para o Recheio e Cobertura               >>>");
                        do {
                            prompt = "> Informe novamente a quantidade de Açúcar(g): ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor1[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 500) 
                            if (vetor1[0] < 500) {
                                erro("<<<A quantidade de Açucar é insuficiente para calcular a receita de Maracujá>>>\n"
                                        + "<<<                  (300)gramas de Açucar para a massa                     >>>\n"
                                        + "<<<          (200)gramas de Açucar para o Recheio e Cobertura               >>>");
                            }
                        } while (vetor1[0] < 500);
                        do {
                            prompt = String.format("> Informe o valor para %.1f gramas de Açúcar: ", vetor1[0]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor1[0] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0) 
                            if (valor1[0] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor1[0] < 0);
                    }
                    if (vetor1[2] < 10) {// if(QNTovo < ((04+06)=10))>> verificar se quantidade de ovos é menor do que
                        //                  10((04)unidades de ovos para a massa e (06)unidades de ovos ara o Recheio e Cobertura)
                        erro("<<<A quantidade de Ovos é insuficiente para calcular a receita de Maracujá>>>\n"
                                + "<<<                  (04)unidades de ovos para a massa                    >>>\n"
                                + "<<<           (06)unidades de ovos para o Recheio e Cobertura:            >>>");
                        do {
                            prompt = "> Informe novamente a quantidade de Ovos: ";
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            vetor1[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorQNT um valor informado.(valor >= 10) 
                            if (vetor1[2] < 10) {// senao((QNTovo < ((04+06)=10)))
                                erro("<<<A quantidade de Ovos é insuficiente para calcular a receita de Maracujá>>>\n"
                                        + "<<<                  (04)unidades de ovos para a massa                    >>>\n"
                                        + "<<<           (06)unidades de ovos para o Recheio e Cobertura:            >>>");
                            }
                        } while (vetor1[2] < 10);
                        do {
                            prompt = String.format("> Informe o valor para %.0f unidades de Ovos: ", vetor1[2]);
                            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);

                            valor1[2] = validaNumeroDoub();// Método Valida NumDouble: Atribui ao 1º elemento do vetorVLR um valor informado.(valor > 0) 
                            if (valor1[2] < 0) {
                                erro("O valor informado é inválido!");
                            }
                        } while (valor1[2] < 0);
                    }
                    sair = true;// Sair do Laço ao validar Açucar e ovoerificar se quantidade de açucar é menor do que 
                } else {// senao(opcaoReceita == Maracujá)>> Sair do Laço
                    sair = true;
                }
            }// senao (vetores == Cheios)>> repete o Laço QNT/VLR 
        } while (!sair);
        //mostraIngredientes(str1, vetorS1, vetorS2, vetor1, vetor2, valor1, valor2);
        return (0);
    }

    public static void mostraIngredientes(String str, String[] vetorS1, String[] vetorS2, double[] vetor1, double[] vetor2, double[] valor1, double[] valor2) {
        // ***************************************************
        // Fase 3 Etapa 2: Método Imprimir codigo dos produtos
        // ***************************************************

        texto = "Para a massa do bolo:\n"; // Imprimir(Para a massa do bolo): Código, Nome, Quantidade, Valores

        for (int i = 0; i < vetorS1.length; i++) {
            switch (i) {
                case 0:
                    texto += String.format("[%d] - %s:. . . . . . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                            i + 1, vetorS1[i], (int) vetor1[i], ((vetor1[i] - (int) vetor1[i]) * 100), valor1[i]);
                    break;
                case 1:
                    texto += String.format("[%d] - %s:. . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                            i + 1, vetorS1[i], (int) vetor1[i], ((vetor1[i] - (int) vetor1[i]) * 100), valor1[i]);
                    break;
                case 2:

                    texto += String.format("[%d] - %s:. . . . . . . . . . . . . .%03d   (un) . .R$ %.2f\n",
                            i + 1, vetorS1[i], (int) vetor1[i], valor1[i]);
                    break;
                case 3:
                    texto += String.format("[%d] - %s: .%03d,%.0f (g). . .R$ %.2f\n",
                            i + 1, vetorS1[i], (int) vetor1[i], ((vetor1[i] - (int) vetor1[i]) * 100), valor1[i]);
                    break;
                default:
                    break;
            }
        }
        texto += "\n";
        texto += String.format("Recheios e Coberturas(%s):\n", str);
        if (str.equals("Morango")) { // Imprimir(Morango): Código, Nome, Quantidade, Valores
            for (int i = 0; i < vetorS2.length; i++) {
                switch (i) {
                    case 0:
                        texto += String.format("[%d] - %s:. . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 1:
                        texto += String.format("[%d] - %s:. . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 2:
                        texto += String.format("[%d] - %s: . . . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 3:
                        texto += String.format("[%d] - %s:. . . . . . . . . . . .%03d   (un) . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], valor2[i]);
                        break;
                    case 4:
                        texto += String.format("[%d] - %s:. . . . . . . . . . .%03d   (un) . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], valor2[i]);
                        break;
                    default:
                        break;
                }
            }
        }
        if (str.equals("Dois Amores")) { // Imprimir(Dois Amores): Código, Nome, Quantidade, Valores

            for (int i = 0; i < vetorS2.length; i++) {
                switch (i) {
                    case 0:
                        texto += String.format("[%d] - %s:. . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 1:
                        texto += String.format("[%d] - %s:. . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 2:
                        texto += String.format("[%d] - %s: . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 3:
                        texto += String.format("[%d] - %s:. . . . . . . . . . .%03d   (un) . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], valor2[i]);
                        break;
                    default:
                        break;
                }
            }
        }
        if (str.equals("Maracujá")) {// Imprimir(Maracujá): Código, Nome, Quantidade, Valores
            for (int i = 0; i < vetorS2.length; i++) {
                switch (i) {
                    case 0:
                        texto += String.format("[%d]  - %s: . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 1:
                        texto += String.format("[%d]  - %s: . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[i], (int) vetor2[i], ((vetor2[i] - (int) vetor2[i]) * 100), valor2[i]);
                        break;
                    case 2:
                        texto += String.format("[%d]  - %s: . . . . . . . . . . . . .%03d,%.0f (ml) . .R$ %.2f\n",
                                i + 5, vetorS2[2], (int) vetor2[2], ((vetor2[2] - (int) vetor2[2]) * 100), valor2[2]);
                        break;
                    case 3:
                        texto += String.format("[%d]  - %s:. . . . . . . . . . . . .%03d,%.0f (ml) . .R$ %.2f\n",
                                i + 5, vetorS2[3], (int) vetor2[3], ((vetor2[3] - (int) vetor2[3]) * 100), valor2[3]);
                        break;
                    case 4:
                        texto += String.format("[%d]  - %s: . . . . . . . . . . .%03d,%.0f (g). . .R$ %.2f\n",
                                i + 5, vetorS2[4], (int) vetor2[4], ((vetor2[4] - (int) vetor2[4]) * 100), valor2[4]);
                        break;
                    case 5:
                        texto += String.format("[%d] - %s: . . . . . . . . . .%03d   (un) . .R$ %.2f\n",
                                i + 5, vetorS2[5], (int) vetor2[5], valor2[5]);
                        break;
                    default:
                        break;
                }
            }
        }
        calcula_totais();
        texto += String.format("\n Total dos ingredientes:. . . . . . . . . . . . . . .R$ %.2f\n", total_simulacao);
        texto += String.format(" Custo de uma receita:. . . . . . . . . . . . . . . .R$ %.2f\n", custo_unitario);
        texto += alerta_custo_maximo();
        atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bd);
    }

    public static int validaNumeroInt() {
        Scanner input = new Scanner(System.in);// Valida Entrada Num Inteiro
        int N = 0;
        boolean Num = false;
        do {
            try {
                N = Integer.parseInt(input.nextLine());
                Num = true;
            } catch (Exception e) {
                erro("O Número digitado não é válido.");
                atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);
            }
        } while (!Num);
        return (N);
    }

    public static double validaNumeroDoub() {
        Scanner input = new Scanner(System.in);// Valida Entrada Num Double
        double N = 0;
        boolean Num = false;
        do {
            try {
                N = Double.parseDouble(input.nextLine());
                Num = true;
            } catch (Exception e) {
                erro("O Número digitado não é válido.");
                atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);
            }
        } while (!Num);
        return (N);
    }

    private static void set_preco() {

        // Fase2_Etapa3 - Rendimento e Preço - Vinicius ----------------------------------------------------------------------
        do {
            rodape = "0. Voltar ao menu anterior";
            prompt = "> Preço de venda do bolo no pote (unitário): R$ ";
            atualiza_tela(titulo, subtitulo, texto, rodape, prompt, c, l, bs);
            opcao = input.nextLine();

            //double_valido(opcao.replace(',', '.')) -> para aceitar vírgula ou pontos para qualquer formato de moeda
            if (double_valido(opcao.replace(',', '.'))) {
                opcao = opcao.replace(',', '.');
                preco_venda_unitario = Double.parseDouble(opcao);
            } else if (double_valido(opcao.replace('.', ','))) {
                opcao = opcao.replace('.', ',');
                preco_venda_unitario = Double.parseDouble(opcao);
            } else {
                preco_venda_unitario = -1;
            }

            if (preco_venda_unitario != 0.0) {
                if (preco_venda_unitario < 0.0) {
                    erro("Valor inválido para o preço de venda.");
                }
            }

        } while (preco_venda_unitario
                < 0.0);

        // FIM Fase2_Etapa3 - Rendimento e Preço - Vinicius ----------------------------------------------------------------------
    }
    // Fase3_Etapa_2 - Marcos Paulo --------------------------------------------------------

    // Fase3_Etapa_1 - Calebe --------------------------------------------------------
    public static String[] massaBolo() {
        String[] massa = new String[4];
        massa[0] = "300 g de açucar";
        massa[1] = "300 g de margarina gelada";
        massa[2] = "4 ovos médios";
        massa[3] = "300 g de farinha de trigo com formento";
        return (massa);
    }

    public static String[] recheioNinho() {
        String[] ninho = new String[4];
        ninho[0] = "2 latas de leite condensado (300g cada)";
        ninho[1] = "2 latas de creme de leite (300g cada) ";
        ninho[2] = "6 colheres (de sopa) de leite ninho (100g cada)";
        ninho[3] = "20 morangos";
        return (ninho);
    }

    public static String[] recheioDoisAmores() {
        String[] doisAmores = new String[3];
        doisAmores[0] = "2 latas de leite condensado (300g cada)";
        doisAmores[1] = "2 latas de creme de leite (300g cada) ";
        doisAmores[2] = "6 colheres de chocolate em pó (100g cada)";
        return (doisAmores);

    }

    public static String[] recheioMaracuja() {
        String[] maracuja = new String[7];
        maracuja[0] = "2 xícaras de suco de maracujá (240 ml cada)";
        maracuja[1] = "4 colheres de amido de milho (5 gramas cada)";
        maracuja[2] = "6 gemas";
        maracuja[3] = "1 xícara de água (250 ml)";
        maracuja[4] = "1 e 1/2 xícara de açúcar (200 gramas)";
        maracuja[5] = "200 ml de leite";
        maracuja[6] = "1 colher (de sopa) de manteiga. (50 gramas)";
        return (maracuja);
    }

    private static String imprimeVetor(String[] vetor) {
        String ret = "";
        for (int i = 0; i < vetor.length; i++) {
            ret += "• " + vetor[i] + "\n";
        }
        return ret;
    }
    // FIM Fase3_Etapa_1 - Calebe --------------------------------------------------------

    /**
     * Verifica se o texto é uma string vazia (Sem caracteres válidos).
     *
     * O caractere de espaço ' ' _é considerado inválido.
     *
     * @param texto Texto a ser analisado.
     * @return true: string vazia; false: string não-vazia.
     */
    public static boolean string_vazia(String texto) {

        texto = texto.trim();

        if (texto.length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * inteiro válido.
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean int_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        try {
            Integer.parseInt(texto);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertido para um número
     * inteiro, e se é uma opção válida.
     *
     * @param texto Texto a ser analisado.
     * @param opcoes Vetor de opções válidas.
     * @return true: opção válida; false: opção inválida.
     */
    public static boolean int_opcao_valida(String texto, int[] opcoes) {

        if (!int_valido(texto)) {
            return false;
        }

        if (opcoes.length > 0) {
            for (int i = 0; i < opcoes.length; i++) {
                if (Integer.parseInt(texto) == opcoes[i]) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertido para um número
     * inteiro, e se o valor está contido em um intervalo.
     *
     * @param texto Texto a ser analisado.
     * @param minimo Menor valor válido.
     * @param maximo Maior valor válido.
     * @return true: no intervalo; false: fora do intervalo.
     */
    public static boolean int_no_intervalo(String texto, int minimo, int maximo) {

        if (!int_valido(texto)) {
            return false;
        }

        if (Integer.parseInt(texto) < minimo || Integer.parseInt(texto) > maximo) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * decimal válido do tipo double.
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean double_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        try {
            Double.parseDouble(texto);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private static void calcula_totais() {
        total_simulacao = 0.0;
        custo_receita = 0.0;
        int qtd_ingredientes = 9;   // 4 para massa + 4 para ninho com morango + 1 do pote
        int lin; // Linha em valores[][]
        double qtd; // Quantidade do ingrediente
        double divisor;

        // Dimensiona matriz de calculo do custo
        if (numeroReceita == 2) {
            qtd_ingredientes -= 1; // 1 ingrediente a menos que a de ninho com morango
        }

        if (numeroReceita == 3) {
            qtd_ingredientes += 2; // 2 ingredientes a mais que a de ninho, 2 ingredientes a menos que já estão na massa (Ovos e Açúcar)
        }

        str_ingredientes = new String[qtd_ingredientes];
        valores = new double[qtd_ingredientes][4];
        inicia_valores();
        /*
        ingrediente1 [qtd][valor][receita][custo_unit]
        ingrediente2 [qtd][valor][receita][custo_unit]
        ingrediente3 [qtd][valor][receita][custo_unit]
        ingredienteN [qtd][valor][receita][custo_unit]
         */
 /*
        // venda_total     = preco_de_venda    * rendimento
        valores_receita[3] = valores_receita[2] * valores_receita[1];

        // lucro_receita_valor  = venda_total - custo_total
        valores_receita[4] = valores_receita[3] - valores_receita[0];

        // lucro_percent_receita   = (lucro_receita_valor / custo_total) *100
        valores_receita[5] = (valores_receita[4] / valores_receita[0]) * 100;

        // custo_unitario = custo_total / rendimento
        valores_receita[6] = valores_receita[0] / valores_receita[1];

        // lucro_unitario_valor = preco_de_venda - custo_unitario
        valores_receita[7] = valores_receita[2] - valores_receita[6];
        
        
         */
        // Popula matriz de cálculo do custo
        // Massa
        for (lin = 0; lin < qntMassa.length; lin++) {
            valores[lin][0] = qntMassa[lin];
            valores[lin][1] = vlMassa[lin];

            if (lin == 2) {
                qtd = 4.0;  // Só muda a quantidade de ovos
            } else {
                qtd = 300.0; // Quantidade do ingrediente
            }
            valores[lin][2] = qtd;

            total_simulacao += valores[lin][1]; // Soma os ingredientes da simulação
            valores[lin][3] = (valores[lin][0] == 0.0) ? 0.0 : ((valores[lin][1] / valores[lin][0]) * valores[lin][2]);
            custo_receita += valores[lin][3]; // Soma os ingredientes para uma receita
        }

        if (numeroReceita == 1) {
            for (int i = 0; i < qntMorango.length; i++) {
                valores[lin + i][0] = qntMorango[i];
                valores[lin + i][1] = vlMorango[i];

                if (lin + i == 7) {
                    qtd = 20.0; // Só muda a quantidade de morangos
                } else if (lin + i == 8) {
                    qtd = rendimento; // Pote 200 ml
                } else {
                    qtd = 600.0; // Quantidade do ingrediente
                }

                valores[lin + i][2] = qtd;

                total_simulacao += valores[lin + i][1]; // Soma os ingredientes da simulação
                valores[lin + i][3] = (valores[lin + i][0] == 0.0) ? 0.0 : ((valores[lin + i][1] / valores[lin + i][0]) * valores[lin + i][2]);
                custo_receita += valores[lin + i][3]; // Soma os ingredientes para uma receita
            }
        } else if (numeroReceita == 2) {
            for (int i = 0; i < qntDoisAmores.length; i++) {
                valores[lin + i][0] = qntDoisAmores[i];
                valores[lin + i][1] = vlDoisAmores[i];
                if (lin + i == 7) {
                    qtd = rendimento; // Pote 200 ml
                } else {
                    qtd = 600.0; // Quantidade do ingrediente
                }
                valores[lin + i][2] = qtd;

                total_simulacao += valores[lin + i][1]; // Soma os ingredientes da simulação
                valores[lin + i][3] = (valores[lin + i][0] == 0.0) ? 0.0 : ((valores[lin + i][1] / valores[lin + i][0]) * valores[lin + i][2]);
                custo_receita += valores[lin + i][3]; // Soma os ingredientes para uma receita

            }
        } else {
            double[] qtds = {240.0, 20.0, 250.0, 200.0, 50.0, rendimento};

            for (int i = 0; i < qntMaracuja.length; i++) {
                valores[lin + i][0] = qntMaracuja[i];
                valores[lin + i][1] = vlMaracuja[i];
                valores[lin + i][2] = qtds[i];
                total_simulacao += valores[lin + i][1]; // Soma os ingredientes da simulação
                valores[lin + i][3] = (valores[lin + i][0] == 0.0) ? 0.0 : ((valores[lin + i][1] / valores[lin + i][0]) * valores[lin + i][2]);
                custo_receita += valores[lin + i][3]; // Soma os ingredientes para uma receita
            }
        }

        custo_unitario = custo_receita / rendimento;
        lucro_unitario_valor = preco_venda_unitario - custo_unitario;
        // lucro_percent_receita   = (lucro_receita_valor / custo_total) *100
        lucro_percent = (lucro_unitario_valor / custo_unitario) * 100;
    }

    private static void erro(String mensagem) {
        desenha_mensagem(mensagem, c, l, bd, true);
        enter_para_("digitar novamente");
    }

    private static String alerta_custo_maximo() {
        String ret = "\n";
        if (custo_unitario == custo_maximo) {
            ret += "O custo de uma receita está no limite de R$ %.2f";
        } else if (custo_unitario > custo_maximo) {
            ret += "*** ALERTA: o custo de uma receita está acima de R$ %.2f ***";
        } else {
            ret += "O custo de uma receita está abaixo de R$ %.2f";
        }
        return String.format(ret, custo_maximo);
    }
}
