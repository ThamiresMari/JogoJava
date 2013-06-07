1. A implementação de todas as classes do modelo, incluindo seus atributos e todos os métodos. Se preciso for, podem ser acrescentados novos métodos auxiliares. 
2. O pré-carregamento de no mínimo 10 heróis e 10 vilões, de forma estática. 
3. Uma interface que possibilite ao jogador travar quantos combates desejar, de acordo com os requisitos discutidos em sala (exercício de A.O.O., disponível na plataforma Connection). Ou seja, a escolha dos combatentes, o número de lutas, etc. 
4. Uma “interface de saída”, ou seja: o resultado das lutas individuais e o resultado final do combate. 

Um personagem pode ser de dois tipos: Herói ou Vilão. Independente disso, ambos possuem as seguintes características:  ? Nome; ? Experiência de combate (contados em anos); ? Poder, que possui uma descrição e um valor que determina sua potência. Por exemplo: “Vôo | 30”; “Rajadas de energia: 50”; “Visão telescópica: 20”. ? Armas, que também possuem uma descrição, um valor que determina seu poder de fogo e a quantidade de vezes que pode ser usada. Por exemplo: “Espada | 15 | 5”; “Arma laser | 35 | 20”, etc. 
A diferença entre um herói e vilão é que o herói possui a característica de resistência e o vilão a característica de genialidade, ambos medidos em unidades. 
Qualquer personagem pode ter poder, armas, ou ambos. O jogo consiste em se criar combates entre vários personagens. O jogador deve escolher os personagens que deseja enviar ao combate, que pode conter apenas 2 personagens, ou vários personagens de cada lado, desde que o número de personagens seja igual para ambos os lados. Além disso, um personagem só pode ser escolhido 1 vez em cada combate.  
O combate acontece da seguinte forma: um herói combate um vilão, na ordem em que foi escolhido pelo jogador. Por exemplo: se foram escolhidos 3 personagens por equipe, o 1º herói escolhido luta com o 1º vilão escolhido. O 2º herói luta com o 2º vilão e 3º herói luta com o 3º vilão. O combate só termina quando todos tiverem lutado. 
O personagem vencedor em cada luta é aquele que se sobrepõe ao outro em pontos, obedecendo a fórmula:   
Para os Heróis: 
(experiência * 2) + (poder.potencia * 3) + (armas.fogo * 5 / armas.quant) + resistencia. 
Para os Vilões: 
(experiência * 2) + (poder.potencia * 3) + (armas.fogo * 5 / armas.quant) + genialidade.  
A cada luta, deve ser contabilizada a vitória para um dos lados, e ao final de um combate, sai vitoriosa a equipe com mais pontos.  