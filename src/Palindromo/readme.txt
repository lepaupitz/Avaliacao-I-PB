Exercício 5 - Palíndromo

O programa pede para o usuário digitar uma palavra e após o usuário fornecer a palavra o programa vai responder se essa palavra é um palíndromo ou não.

Necessitei pesquisar como poderia fazer para o programa ler somente os caracteres e desconsiderar o espaço e as pontuações.
Criei uma função no qual ele le a palavra escrita, desconsidera os espaços e pontuações, deixa a frase inteira em letra minúscula, para não afetar se está em letra maiúscula ou minúscula. E depois utilizo um stringBuilder para criar a nova frase de trás pra frente utilizando o .reverse.
E posteriormente dentro ainda da função utilizo o .equals para comparar se as 2 strings são iguais.
Para imprimir se a palavra é um palíndromo ou não, utilizo um if/else.
Complementado com o try/catch, para pegar as exceções ou algum erro que possa a vir ter.