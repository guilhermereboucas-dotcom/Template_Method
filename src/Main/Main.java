package Main;

import ClasseAbstrata.ProcessadorArquivo;
import ClasseConcreta.ProcessadorClientes;
import ClasseConcreta.ProcessadorProdutos;
import ClasseConcreta.ProcessadorVendas;

public class Main {
    public static void main(String[] args) {

        System.out.println("------PROCESSADOR CLIENTES------");
        ProcessadorArquivo pc = new ProcessadorClientes();
        pc.processarArquivo();

        System.out.println("\n------PROCESSADOR PRODUTOS------");
        ProcessadorArquivo pp = new ProcessadorProdutos();
        pp.processarArquivo();

        System.out.println("\n------PROCESSADOR VENDAS------");
        ProcessadorArquivo pv = new ProcessadorVendas();
        pv.processarArquivo();
    }
}