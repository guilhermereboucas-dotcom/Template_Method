package ClasseConcreta;

import ClasseAbstrata.ProcessadorArquivo;

public class ProcessadorClientes extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("[2] Validando estrutura...");
        System.out.println("====================================");
        System.out.println(" VALIDANDO ARQUIVO DE CLIENTES ");
        System.out.println("====================================");
        System.out.println("Campos obrigatorios:");
        System.out.println("- Nome");
        System.out.println("- CPF");
        System.out.println("- Email");
        System.out.println("- Telefone");
        System.out.println("Estrutura validada com sucesso!\n");
    }

    @Override
    protected void lerDados() {
        System.out.println("[3] Lendo registros de clientes...");
    }

    @Override
    protected void processarDados() {
        System.out.println("[4] Processando dados dos clientes...");
        System.out.println("Verificando duplicidades de CPF...");
        System.out.println("Atualizando cadastro de clientes...\n");
    }
}
