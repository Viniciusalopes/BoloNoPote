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
 * ---------------------------------------------------------------------------------------
 */
package mesa2.bll;

/**
 *
 * @author vovostudio
 */
public class Sobre {

    public static String txt_sobre(double custo_maximo) {
        String texto = String.format("\n    Este sofware tem a finalidade de informar se é "
                + "possível produzir uma receita de bolo no pote, com rendimento de 15 "
                + "unidades, ao custo máximo de R$ %.2f por receita, além de calcular "
                + "automaGicamente o valor de custo de cada bolo no pote e ainda, "
                + "calcular o lucro previsto em R$ (reais) e em %% (porcentagem)."
                + "\n", custo_maximo);

        texto += "INSTRUÇÕES DE USO:\n"
                + "• Digite o código de uma das receitas disponíveis\n"
                + "• Informe o preço de venda de 1(um) Bolo no Pote\n"
                + "• Escolha a opção do menu '2. Simular compra'\n"
                + "• Entre com as quantidades e os valores dos ingredientes.\n"
                + "-- Ao final o software exibirá as informações necessárias para sua "
                + "avaliação de viabilidade da receita.\n";

        texto += " ---------------------------------------------------------------------------------------\n"
                + " Licença MIT\n"
                + " Copyright 2019 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>.\n"
                + " Projeto    : Projeto Bolo no Pote - Matemática e Estatística - ADS1/2019 - Grupo A2\n"
                + " Criado em  : 07/11/2019\n"
                + " Autores    : Anisberto Reis, Calebe Cabral da Costa, Jhonathan dos Reis, Marcos Paulo Pereira da Paixão e Vinicius Araujo Lopes."
                + "\n"
                + " Professor  : Ujeverson Tavares Sampaio\n"
                + " Instituição: Senai Fatesg - Goiânia GO\n"
                + "\n"
                + " Finalidade: Composição da nota N2.\n"
                + " ---------------------------------------------------------------------------------------";

        return texto;
    }
}
