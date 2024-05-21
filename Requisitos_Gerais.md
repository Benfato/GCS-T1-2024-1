# Requisitos Gerais
1. Deseja-se um sistema para gerenciar ingressos de um parque de diversões.
2. O sistema deverá ser implementado em Java Console /ou/ Web Puro (apenas HTML+CSS+Javascript). Não utilizar frameworks ou outras dependências. A ideia é ter a base de código o mais simples possível. Cuidar para que todos os membros do time conheçam a(s) linguagem(s) escolhida(s).
3. Não implementar um mecanismo de persistência de dados. **O sistema deverá manter dados apenas em memória durante a execução.**
4. Não implementar um mecanismo de login. **No entanto, deverá ser possível identificar/alterar o usuário/funcionário que está usando o sistema no momento.**
5. **O sistema deverá iniciar com dados já preenchidos** (em bom número e de boa qualidade), de forma a facilitar os testes.

# Detalhamento
- O parque de diversões precisa armazenar dados de suas atrações e de seus visitantes. As atrações incluem, por exemplo, montanha-russa, roda-gigante, barco viking, carro-choque, trem-fantasma etc. 
- Sobre os visitantes adultos deseja-se armazenar nome, ano de nascimento e telefone. 
- Para crianças com menos de 12 anos, deve-se armazenar o nome, o ano de nascimento, o nome do responsável e seu telefone de contato. 
- O parque vende no máximo 500 ingressos por dia. 
- Cada ingresso tem um número identificador sequencial daquele dia (ex. “03/04/2024 seq 001”, “03/04/2024 seq 002” etc) e deve estar associado ao registro de um visitante (seja adulto ou criança).
- O ingresso de adulto custa $100,00 e o de crianças abaixo de 12 anos custa$80,00. O ingresso dá direito a todas as atrações do parque. 
- O sistema deverá armazenar qual visitante foi em qual atração. 
- O sistema somente é operado por um operador do parque. Não é necessário fazer login etc.



## Regras
- O Visitante pode entrar no parque, sem comprar um ingresso.
- O Visitante só pode viistar as atrações se tiver um ingresso válido (do dia).

- Um visitante deve ser registrado com nome e sobrenome.
   - .github/workflows/visitantes-cadastrados.yaml
- 