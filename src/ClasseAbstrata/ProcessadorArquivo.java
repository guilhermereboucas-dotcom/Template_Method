package ClasseAbstrata;

public abstract class ProcessadorArquivo {

    public final void processarArquivo(){
        abrirArquivo();
        validarEstrutura();
        lerDados();
        processarDados();
        salvarResultado();
        fecharArquivo();
    }

    protected void abrirArquivo(){
        System.out.println("[1] Abrindo arquivo...");
    }

    protected abstract void validarEstrutura();

    protected abstract void lerDados();

    protected abstract void processarDados();

    protected void salvarResultado(){
        System.out.println("[5] Salvando resultado...");
    }

    protected void fecharArquivo(){
        System.out.println("[6] Fechando arquivo...");
    }

}
