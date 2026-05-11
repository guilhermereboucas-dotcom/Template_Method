package ClasseConcreta;

import ClasseAbstrata.ProcessadorArquivo;

public class ProcessadorProdutos extends ProcessadorArquivo {
    @Override
    protected void validarEstrutura() {
        System.out.println("[2] Validando estrutura...");
        System.out.println("====================================");
        System.out.println(" VALIDANDO ARQUIVO DE PRODUTOS ");
        System.out.println("====================================");
        System.out.println("Campos obrigatorios:");
        System.out.println("- Codigo");
        System.out.println("- Descricao");
        System.out.println("- Preco");
        System.out.println("- Estoque");
        System.out.println("Estrutura validada com sucesso!\n");
    }

    @Override
    protected void lerDados() {
        System.out.println("[3] Lendo registros de produtos...");
    }

    @Override
    protected void processarDados() {
        System.out.println("[4] Processando dados dos produtos...");
        System.out.println("Atualizando estoque...");
        System.out.println("Recalculando precos e catalogo...\n");
    }
}
