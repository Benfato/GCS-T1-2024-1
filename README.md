# GCS-T1-2024-1
Trabalho 1 para disciplina de GCS.

Detalhamento
O parque de diversões precisa armazenar dados de suas atrações e de seus visitantes. As atrações incluem,
por exemplo, montanha-russa, roda-gigante, barco viking, carro-choque, trem-fantasma etc. Sobre os
visitantes adultos deseja-se armazenar nome, ano de nascimento e telefone. Para crianças com menos de 12
anos, deve-se armazenar o nome, o ano de nascimento, o nome do responsável e seu telefone de contato. O
parque vende no máximo 500 ingressos por dia. Cada ingresso tem um número identificador sequencial
daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc) e deve estar associado ao registro de um
visitante (seja adulto ou criança). O ingresso de adulto custa $100,00 e o de crianças abaixo de 12 anos custa
$80,00. O ingresso dá direito a todas as atrações do parque. O sistema deverá armazenar qual visitante foi
em qual atração. O sistema somente é operado por um operador do parque. Não é necessário fazer login
etc.
Funcionalidades desejadas
1) O sistema deverá permitir ao operador cadastrar um novo visitante e listar os atuais visitantes já
   cadastrados.
2) O sistema deverá permitir emitir um novo ingresso para um dia, seguindo a sequência daquele dia e
   até o limite de 500 ingressos por dia, associando-o a um visitante já cadastrado.
3) O sistema deverá iniciar com todas as atrações do parque já cadastradas (sejam criativos!).
4) O sistema deverá permitir ao operador registrar que um visitante foi em qual atração. Um visitante
   poderá ir em qualquer atração no dia do ingresso, inclusive poderá ir na mesma atração mais de
   uma vez.
5) O sistema deverá permitir que o operador localize um visitante por parte de seu nome ou pela
   identificação do ingresso. Ao localizar o visitante, o sistema deverá listar todas as atrações em que o
   visitante foi.
6) O sistema deverá permitir ao operador consultar o faturamento de um determinado mês/ano,
   somando os valores dos ingressos dos respectivos dias).
7) O sistema deverá permitir ao operador consultar, para uma determinada data, todas as atrações do
   parque e a quantidade de visitantes que utilizou cada uma delas, ordenadas da mais visitada à
   menos visitada.
8) Duas funcionalidades a mais, à escolha do grupo.