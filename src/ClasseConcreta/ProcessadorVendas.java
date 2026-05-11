package ClasseConcreta;

import ClasseAbstrata.ProcessadorArquivo;

public class ProcessadorVendas extends ProcessadorArquivo {
    @Override
    protected void validarEstrutura() {
        System.out.println("[2] Validando estrutura...");
        System.out.println("====================================");
        System.out.println(" VALIDANDO ARQUIVO DE VENDAS ");
        System.out.println("====================================");
        System.out.println("Campos obrigatorios:");
        System.out.println("- Data da venda");
        System.out.println("- Produto");
        System.out.println("- Quantidade");
        System.out.println("- Valor total");
        System.out.println("Estrutura validada com sucesso!\n");
    }

    @Override
    protected void lerDados() {
        System.out.println("[3] Lendo registros de vendas...");
    }

    @Override
    protected void processarDados() {
        System.out.println("[4] Processando dados das vendas...");
        System.out.println("Calculando faturamento...");
        System.out.println("Gerando relatorio financeiro...\n");
    }
}
