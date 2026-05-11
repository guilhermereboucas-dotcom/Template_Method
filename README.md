[ATIVIDADE PRÁTICA — Padrão Template Method.txt](https://github.com/user-attachments/files/27611936/ATIVIDADE.PRATICA.Padrao.Template.Method.txt)
ATIVIDADE PRÁTICA — Padrão Template Method
Tema: Processamento de Arquivos em um Sistema Corporativo
Disciplina: Padrões de Projeto
Conteúdo: Template Method
Objetivo: Aplicar o padrão Template Method para definir um fluxo padrão de processamento, permitindo que cada tipo de arquivo personalize apenas as etapas específicas.
1. Contexto
Você deve desenvolver um sistema simples para processar arquivos enviados a uma empresa.
O sistema poderá lidar com diferentes tipos de arquivos, como:
* arquivo de clientes;
* arquivo de produtos;
* arquivo de vendas.
Cada tipo de arquivo possui informações próprias e regras específicas. Porém, todos devem seguir uma mesma sequência geral de processamento.
A ideia é evitar repetição de código e garantir que todos os arquivos sejam processados em uma ordem padronizada.


2. Problema
Sem o padrão Template Method, cada classe poderia implementar seu próprio fluxo completo de processamento.
Isso poderia gerar:
* repetição de código;
* etapas fora de ordem;
* dificuldade de manutenção;
* baixa padronização;
* risco de esquecer etapas importantes.
O padrão Template Method resolve esse problema colocando o passo a passo principal em uma classe base, enquanto as subclasses implementam apenas as partes que mudam.


3. O que você deve desenvolver
Classe abstrata
* ProcessadorArquivo
Classes concretas
* ProcessadorClientes
* ProcessadorProdutos
* ProcessadorVendas
Classe de teste
* Main


4. Fluxo obrigatório do processamento
Todo arquivo deve seguir a seguinte ordem:
Ordem
	Etapa
	1
	Abrir arquivo
	2
	Validar estrutura
	3
	Ler dados
	4
	Processar dados
	5
	Salvar resultado
	6
	Fechar arquivo
	Esse fluxo deve estar definido em um único método principal na classe abstrata.
Esse método será o Template Method.


5. Classe abstrata ProcessadorArquivo
A classe abstrata deve possuir um método principal responsável por controlar o fluxo completo:
public final void processarArquivo()


Esse método deve chamar as etapas do processamento na ordem definida na tabela.
A classe também deve possuir métodos para representar cada etapa do fluxo.
Algumas etapas serão comuns para todos os arquivos, enquanto outras deverão ser personalizadas pelas subclasses.


6. Etapas fixas e variáveis
A atividade deve respeitar a seguinte separação:
Etapa
	Tipo
	Abrir arquivo
	comum
	Validar estrutura
	variável
	Ler dados
	variável
	Processar dados
	variável
	Salvar resultado
	comum
	Fechar arquivo
	comum
	As etapas comuns devem ficar implementadas na classe abstrata.
As etapas variáveis devem ser implementadas pelas classes concretas.


7. Requisitos das classes concretas
Cada processador deve representar um tipo diferente de arquivo.
ProcessadorClientes
Deve representar o processamento de um arquivo contendo dados de clientes.
Esse arquivo pode envolver informações como:
* nome;
* CPF;
* e-mail;
* telefone.
ProcessadorProdutos
Deve representar o processamento de um arquivo contendo dados de produtos.
Esse arquivo pode envolver informações como:
* código;
* descrição;
* preço;
* quantidade em estoque.
ProcessadorVendas
Deve representar o processamento de um arquivo contendo dados de vendas.
Esse arquivo pode envolver informações como:
* data da venda;
* produto vendido;
* quantidade;
* valor total.


8. Regras importantes
* O método principal do fluxo deve ser final.
* A ordem das etapas deve estar definida somente na classe abstrata.
* As subclasses não devem repetir o fluxo completo.
* Cada subclasse deve implementar apenas as etapas variáveis.
* As etapas comuns devem ficar na classe base.
* O padrão Template Method deve estar claramente aplicado.
* O sistema deve demonstrar no console o fluxo de processamento de cada tipo de arquivo.


9. Classe Main — cenário obrigatório
Na classe Main, você deve:
1. criar um processador de clientes;
2. executar o processamento;
3. criar um processador de produtos;
4. executar o processamento;
5. criar um processador de vendas;
6. executar o processamento.
A saída deve deixar claro que todos os arquivos seguem a mesma ordem geral, mas com comportamentos específicos em algumas etapas.
