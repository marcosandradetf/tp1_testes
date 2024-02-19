# Tp1 - Classe Esporte e Testes

Este é um projeto de faculdade para implementar testes usando o JUnit em uma classe de Esporte contendo os atributos Nome, Posição, Craque, Camisa e Salário.


## Requisitos

- Java 8 ou superior
- Gradle (versão utilizada no projeto: 7.6.4)

## Configuração do Ambiente de Desenvolvimento

Certifique-se de ter o Java e o Gradle instalados em sua máquina. Você pode baixar o Gradle em [gradle.org](https://gradle.org/).

## Executando o Projeto

1. Clone o repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/marcosandradetf/tp1_testes.git

2. Navegue até o diretório do projeto:
    ```bash
   cd tp1_testes
3. Execute o projeto usando o Gradle:
   ```bash
   ./gradlew run

## Testando o Projeto

1. Para executar os testes do projeto, utilize o seguinte comando:
   ```bash 
   ./gradlew test 
   
## Métodos principais
* jogadorCraque: Cria um jogador considerado craque.
* jogadorComum: Cria um jogador comum.
* criarJogadorCraque: Adiciona jogadores craques à lista.
* criarJogadorComum: Adiciona jogadores comuns à lista.
* calcularSalario: caso o jogador seja craque tem um bonus de 1000