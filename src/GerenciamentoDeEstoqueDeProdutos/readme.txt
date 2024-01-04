Exercício 6 - Gerenciamento de Estoque de Produtos

Ao inciar o programa irá aparecer para o usuário um menu com as opções 1. Cadastrar Produto, 2. Comprar Produto, 3. Vender Produto, 4. Exibir Informação do Produto, 5. Exibir Todos os Produtos, e 0. Sair.
Para o usuário conseguir utilizar as opções do menu 2,3,4,5, ele deverá cadastar um produto, utilizando a opção 1 do menu.
Se o usuário desejar cadastrar mais de um produto no programa, ele poderá, porém é necessário que o produto não tenha o mesmo nome e o mesmo código de um produto já cadastrado no programa. Se ele tiver o mesmo nome e o mesmo código de um produto cadastrado, o programa não irá deixar o usuário cadastrar o novo produto.
Para comprar o produto o usuário deverá fornecer o código do produto que comprou e após adicionar o número de produtos comprados.
Para a venda o usuário também deverá fornecer o código do produto vendido, e o número de vendido deverá ser menor ou igual a quantidade de produtos no estoque. Se for a quantidade de produtos for maior que a quantidade que tem em estoque, o programa não deixará realizar a venda deste produto.
Na opção de Exibir Informação do Produto, o usuário deverá fornecer o código do produto que deseja. Após o programa irá retornar o nome do produto, código, valor unitário e quantidade de estoque do produto que está cadastrado no sistema.
E na opção de Exibir todos os produtos, aparecerá uma lista com o código e nome dos produtos cadastrados.



Ao começar a desenvolver o programa, pensei em fazer apensa cadastrando um produto e realizando a compra, venda e exibir as informações do mesmo. Porém pensando em aprimorar o programa e utilizar os conhecimentos adquiridos nas aulas, decidi mudar um pouco meu programa.
Fazendo de modo que o usuário consiga cadastrar mais de um produto no programa, criando uma lista de objetos de produtos.
Adicionei também mais funções na classe Produto, onde consegui deixar o código da main.java mais enxuto, no qual o switch/case agora apenas utiliza as funções da classe Produto.
Ao pensar em como fazer a comparação de se existe um produto com o mesmo código e nome utilizei um boolean, verificiando se o código ou o nome do produto em um novo cadastro já estava sendo utilizado.

