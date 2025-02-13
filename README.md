Desafio Controle Fluxo - Projeto DIO Java Basico 2

Descrição

Este projeto é uma aplicação simples em Java desenvolvida como parte do curso da DIO para praticar o uso de blocos try, catch e finally, além das estruturas de controle if, else e for. O programa recebe dois números inteiros do usuário e imprime uma contagem do primeiro número até o segundo. Caso o primeiro número seja maior que o segundo, uma exceção personalizada é lançada.

Funcionalidades

Solicita dois números inteiros ao usuário.

Verifica se o primeiro número é menor que o segundo.

Lança uma exceção personalizada (ParametrosInvalidosException) caso a condição não seja atendida.

Executa a contagem e exibe os números no console.

Garante que a contagem seja realizada com o uso do bloco finally.


Estruturas e conceitos aplicados

Blocos try, catch e finally:

try: Tenta executar a contagem.

catch: Captura a exceção caso o primeiro número seja maior que o segundo.

finally: Garante a execução de uma mensagem final.


Estrutura condicional if-else:

Garante que o primeiro número seja menor que o segundo antes de iniciar a contagem.


Loop for:

Percorre e imprime os números entre os valores informados pelo usuário.


Criação de Exceção Personalizada (ParametrosInvalidosException):

Exceção específica para validar os parâmetros de entrada.



Como executar o projeto

1. Certifique-se de ter o Java JDK instalado.


2. Copie o código para um arquivo chamado Contador.java.


3. Compile o programa com o comando:

javac Contador.java


4. Execute o programa com:

java Contador


5. Insira dois números inteiros quando solicitado.


6. Observe o resultado no console.



Exemplo de uso

Entrada:

Digite o primeiro número: 3  
Digite o segundo número: 7

Saída:

Imprimindo o número 3  
Imprimindo o número 4  
Imprimindo o número 5  
Imprimindo o número 6  
Imprimindo o número 7  
Contagem realizada.

Se o primeiro número for maior que o segundo:
Entrada:

Digite o primeiro número: 10  
Digite o segundo número: 5

Saída:

O primeiro número deve ser menor que o segundo número!  
Contagem realizada.

Melhorias futuras

Permitir múltiplas tentativas sem precisar reiniciar o programa.

Implementar uma interface gráfica para facilitar a interação do usuário.

Adicionar suporte a entrada de números decimais e contagem com incrementos personalizados.


Conclusão

Este projeto é uma ótima prática para o uso de exceções, estruturas de controle e loops no Java. Ele reforça conceitos fundamentais da linguagem e melhora a habilidade de tratar erros de forma eficiente.
