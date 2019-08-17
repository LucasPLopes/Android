package com.example.fatosinteressantes.info;

import java.util.Random;

public class Fact {
    private final String [] fatos = new String[]{
            "O Brasil é o quinto maior país do mundo",
            "Nosso país está apenas atrás dos EUA em relação ao número de aeroportos",
            "Cirurgias de readequação de gênero são feitas gratuitamente no Brasil desde 2008",
            "O país ocupa 47,3% de toda a América do Sul e faz fronteiras com quase todos os países do continente, exceto com Equador e Chile",
            "Somos uma República Federativa composta de 5.570 municípios",
            "O país é o maior produtor mundial de café há 150 anos",
            "O Brasil foi o primeiro país a proibir o bronzeamento artificial",
            "Uma pesquisa revelou que 35% dos homens que trabalham em áreas rurais no país já fizeram sexo com um animal",
            "No Brasil, o preço de um iPhone é duas vezes mais alto do que nos EUA",
            "O Rio de Janeiro já foi a capital de Portugal, o que fez da cidade a única capital europeia fora da Europa",
            "A maior comunidade japonesa fora do Japão está no Brasil",
            "Rio de Janeiro ganhou esse nome acidentalmente, já que um explorador português achou que a baía era um rio, e não uma porção avançada do oceano",
            "Existe um gigantesco rio subterrâneo a 4 km abaixo do rio Amazonas",
            "Cerca de 4 milhões de africanos foram trazidos ao país para serem explorados como escravos",
            "O Brasil foi o único país independente da América do Sul a mandar tropas para lutar na Segunda Guerra Mundial. Foram mais de 25 mil soldados enviados",
            "Para a visita do Papa Francisco ao país em 2013, os cofres públicos gastaram quase R$ 200 milhões",
            "A tribo Bororo é um dos poucos grupos de pessoas no mundo nos quais todos têm o mesmo tipo sanguíneo: O",
            "No país, apenas 43% das pessoas adultas têm ensino superior completo",
            "O campo magnético da Terra enfraqueceu bastante nos últimos 180 anos, especialmente nas regiões onde Brasil e Argentina estão localizados",
            "Ninguém tem permissão para ir à Ilha da Queimada Grande: lá, existem mais de cinco cobras por metro quadrado",
            "O país gastou R$ 35 bilhões em infraestrutura para a Copa do Mundo de 2014",
            "Metade das cidades listadas no ranking das 20 com os maiores índices de assassinatos estão no Brasil",
            "Existe um município brasileiro chamado Não-me-Toque, que fica no Rio Grande do Sul",
            "Três das cinco pessoas mais ricas do país são do mercado cervejeiro",
            "Que tristeza! O país só perde para a Indonésia quando o assunto é desmatamento",
            "Em 1959, a rinoceronte Cacareco recebeu 100 mil votos, o que a colocaria como eleita entre os vereadores de São Paulo",
            "A maior parte da Floresta Amazônica (60%) fica em território brasileiro, mas ela está também no Peru (13%), na Colômbia (10%) e em menores partes na Venezuela, no Equador, na Bolívia, na Guiana, no Suriname e na Guiana Francesa",
            "O maior show de rock ao ar livre do mundo foi o do cantor Rod Stewart, que se apresentou para 4,2 milhões de pessoas na virada do ano de 1994, no Rio de Janeiro",
            "É no Brasil que se concentra o maior número de católicos do mundo: são 123 milhões de pessoas, o que corresponde a 64% da população do país",
            "Um grama de cocaína custa o equivalente a R$ 725 na Austrália e cerca de R$ 30 no Brasil",
            "No Estádio Milton Corrêa, em Macapá, a marca que divide o campo está totalmente alinhada com a Linha do Equador, o que faz com que cada time esteja posicionado em um hemisfério diferente. Por isso, o estádio é chamado também de “Zerão”",
            "O Parque Nacional Montanhas do Tumucumaque é o maior parque dentro da floresta tropical do mundo – ele é maior do que a Bélgica",
            "O primeiro Carnaval do país aconteceu em 1723",
            "A Usina de Itaipu é a hidrelétrica que mais produz energia no mundo"
    };

      public   String getFato(){

            Random rd = new Random();
            int r = rd.nextInt(fatos.length);
            return fatos[r];
        }
}
