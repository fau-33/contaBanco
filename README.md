# Desafio de Sintaxe Java - DIO

## Descrição do Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Objetivo
Crie o projeto ContaBanco que receberá dados via terminal contendo as características de uma conta bancária conforme os atributos abaixo:

Atributos da Conta
Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48
Requisitos
Classe ContaTerminal.java:

Crie uma classe chamada ContaTerminal para realizar toda a codificação do programa.

Revise as regras de declaração de variáveis.

Entrada de Dados via Terminal:

Utilize a classe Scanner para permitir que os dados sejam inseridos via terminal.

O usuário deve receber mensagens indicando qual informação será solicitada. Por exemplo:

Programa: "Por favor, digite o número da Agência!"

Usuário: 1021 (depois ENTER para o próximo campo).

Concatenação de Strings:

Revise sobre concatenação e a classe String com o método concat.

Mensagem Final:

Após todas as informações serem inseridas, o sistema deve exibir a seguinte mensagem:

Copy
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
Os campos [ ] devem ser substituídos pelas informações inseridas pelo usuário.
