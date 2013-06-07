1. A implementa��o de todas as classes do modelo, incluindo seus atributos e todos os m�todos. Se preciso for, podem ser acrescentados novos m�todos auxiliares. 
2. O pr�-carregamento de no m�nimo 10 her�is e 10 vil�es, de forma est�tica. 
3. Uma interface que possibilite ao jogador travar quantos combates desejar, de acordo com os requisitos discutidos em sala (exerc�cio de A.O.O., dispon�vel na plataforma Connection). Ou seja, a escolha dos combatentes, o n�mero de lutas, etc. 
4. Uma �interface de sa�da�, ou seja: o resultado das lutas individuais e o resultado final do combate. 

Um personagem pode ser de dois tipos: Her�i ou Vil�o. Independente disso, ambos possuem as seguintes caracter�sticas:  ? Nome; ? 
Experi�ncia de combate (contados em anos); ? Poder, que possui uma descri��o e um valor que determina sua pot�ncia. Por exemplo: �V�o | 30�; �Rajadas de energia: 50�; �Vis�o telesc�pica: 20�. ? Armas, que tamb�m possuem uma descri��o, um valor que determina seu poder de fogo e a quantidade de vezes que pode ser usada. 
Por exemplo: �Espada | 15 | 5�; �Arma laser | 35 | 20�, etc. 
A diferen�a entre um her�i e vil�o � que o her�i possui a caracter�stica de resist�ncia e o vil�o a caracter�stica de genialidade, ambos medidos em unidades. 
Qualquer personagem pode ter poder, armas, ou ambos. O jogo consiste em se criar combates entre v�rios personagens. O jogador deve escolher os personagens que deseja enviar ao combate, que pode conter apenas 2 personagens, ou v�rios personagens de cada lado, desde que o n�mero de personagens seja igual para ambos os lados. Al�m disso, um personagem s� pode ser escolhido 1 vez em cada combate.  
O combate acontece da seguinte forma: um her�i combate um vil�o, na ordem em que foi escolhido pelo jogador. Por exemplo: se foram escolhidos 3 personagens por equipe, o 1� her�i escolhido luta com o 1� vil�o escolhido. O 2� her�i luta com o 2� vil�o e 3� her�i luta com o 3� vil�o. O combate s� termina quando todos tiverem lutado. 
O personagem vencedor em cada luta � aquele que se sobrep�e ao outro em pontos, obedecendo a f�rmula:   
Para os Her�is: 
(experi�ncia * 2) + (poder.potencia * 3) + (armas.fogo * 5 / armas.quant) + resistencia. 
Para os Vil�es: 
(experi�ncia * 2) + (poder.potencia * 3) + (armas.fogo * 5 / armas.quant) + genialidade.  
A cada luta, deve ser contabilizada a vit�ria para um dos lados, e ao final de um combate, sai vitoriosa a equipe com mais pontos.  