Exercício 5 - Palíndromo

Após ter que pesquisar como eu poderia fazer para o programa ler somente os caracteres e desconsiderar o espaço e as pontuações, consegui resolver o problema tranquilo.
Criei uma função no qual ele le a palavra escrita, desconsidera os espaços e pontuações, deixa a frase inteira em letra minúscula, para não afetar se está em letra maiúscula ou minúscula. E depois utilizo um stringBuilder para criar a nova frase de trás pra frente utilizando o .reverse.
E posteriormente dentro ainda da função utilizo o .equals para comparar se as 2 strings são iguais.
Para imprimir se a palavra é um palíndromo ou não, utilizo um if/else.