## Lei de Benford Java Analyzer

Este é um projeto em Java que demonstra a aplicação da Lei de Benford, também conhecida como Lei dos Números Anômalos, a conjuntos de dados numéricos. A Lei de Benford é uma observação estatística que descreve a distribuição dos primeiros dígitos em muitos conjuntos de dados do mundo real. Fiz este projeto pois achei muito interessante como é usado e como os dados seguem essa teoria, tentei simplificar os testes caso queiram testar deixarei passo a passo abiaxo:

![5f933df7a15dd491a516b3a9__4jm26wdeo3R_PTqO1OwWZefKvE7FDEcOXhvsiykdGn9QkrJx9BbWUa0dN5lkaN_XEwmmHXjB1ssR6VHwMcco-A35zBknbaJUX3QiX0bj-5n-vkUBXgiUmwHgyRx4w](https://github.com/GabrielFCarrijo/LeiBenfordJava/assets/84852692/5701bbb4-1cb4-4ace-9b3a-549b53328fdf)


### Como Funciona

O programa lê um arquivo contendo números e calcula a distribuição dos primeiros dígitos de acordo com a Lei de Benford. Ele cria um gráfico de barras mostrando a distribuição observada versus a distribuição esperada de acordo com a Lei de Benford. O gráfico resultante ajuda a visualizar como a distribuição dos dígitos dos números se alinha ou difere da distribuição esperada pela Lei de Benford.

### Como Usar

1. Clone este repositório em sua máquina.
2. Certifique-se de ter o Java e o Maven instalados em seu sistema.
3. Crie um arquivo de texto chamado `LeiBenfordFile.txt` na mesma pasta do projeto.
4. Adicione números, um por linha, ao arquivo `LeiBenfordFile.txt`.

### Recursos

- Uso da biblioteca JFreeChart para criar gráficos de barras.
- Leitura de números de um arquivo de texto para análise.
- Demonstração prática da Lei de Benford em conjuntos de dados numéricos.

  # Padrões de commits 📜

De acordo com a documentação do **[Conventional Commits](https://www.conventionalcommits.org/pt-br)**, commits semânticos são uma convenção simples para ser utilizada nas mensagens de commit. Essa convenção define um conjunto de regras para criar um histórico de commit explícito, o que facilita a criação de ferramentas automatizadas.

Esses commits auxiliarão você e sua equipe a entenderem de forma facilitada quais alterações foram realizadas no trecho de código que foi commitado.

Essa identificação ocorre por meio de uma palavra e emoji que identifica se aquele commit realizado se trata de uma alteração de código, atualização de pacotes, documentação, alteração de visual, teste...

## Tipo e descrição 🦄

O commit semântico possui os elementos estruturais abaixo (tipos), que informam a intenção do seu commit ao utilizador(a) de seu código.

- `feat`- Commits do tipo feat indicam que seu trecho de código está incluindo um **novo recurso** (se relaciona com o MINOR do versionamento semântico).

- `fix` - Commits do tipo fix indicam que seu trecho de código commitado está **solucionando um problema** (bug fix), (se relaciona com o PATCH do versionamento semântico).

- `docs` - Commits do tipo docs indicam que houveram **mudanças na documentação**, como por exemplo no Readme do seu repositório. (Não inclui alterações em código).

- `test` - Commits do tipo test são utilizados quando são realizadas **alterações em testes**, seja criando, alterando ou excluindo testes unitários. (Não inclui alterações em código)

- `build` - Commits do tipo build são utilizados quando são realizadas modificações em **arquivos de build e dependências**.

- `perf` - Commits do tipo perf servem para identificar quaisquer alterações de código que estejam relacionadas a **performance**.

- `style` - Commits do tipo style indicam que houveram alterações referentes a **formatações de código**, semicolons, trailing spaces, lint... (Não inclui alterações em código).

- `refactor` - Commits do tipo refactor referem-se a mudanças devido a **refatorações que não alterem sua funcionalidade**, como por exemplo, uma alteração no formato como é processada determinada parte da tela, mas que manteve a mesma funcionalidade, ou melhorias de performance devido a um code review.

- `chore` - Commits do tipo chore indicam **atualizações de tarefas** de build, configurações de administrador, pacotes... como por exemplo adicionar um pacote no gitignore. (Não inclui alterações em código)

- `ci` - Commits do tipo ci indicam mudanças relacionadas a **integração contínua** (_continuous integration_).


Este projeto é uma ferramenta útil para entender a aplicação da Lei de Benford a conjuntos de dados do mundo real. Ele pode ser usado para verificar a autenticidade de dados e explorar como a distribuição dos primeiros dígitos pode fornecer insights sobre os números que compõem o conjunto de dados.
Pode encontrar mais sobre lei benford neste artigo: https://repositorio.cgu.gov.br/bitstream/1/42560/8/Artigo_Lei_Newcomb_Bedford_identificacao_irregularidades.pdf
