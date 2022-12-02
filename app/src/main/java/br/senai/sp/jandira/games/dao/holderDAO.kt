package br.senai.sp.jandira.games.dao

import android.content.Context
import android.graphics.drawable.Drawable
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.model.holderModel

class holderDAO {

    companion object{

        fun getGames(context: Context): List<holderModel>{

            val game1 = holderModel()

            game1.codigo = 1
            game1.nome = "Joy Rider Turbo"
            game1.descricao = "Joy Ride Turbo é um jogo de corrida de kart para Xbox 360 e Xbox One. O jogador controla seu avatar..."
            game1.empresa = "BigPark"
            game1.imagem = context.getDrawable(R.drawable.joyrider)

            val game2 = holderModel()

            game2.codigo = 2
            game2.nome = "Just Dance 2022"
            game2.descricao = "Just Dance 2022 é um jogo eletrônico de dança de ritmo desenvolvido e publicado pela Ubisoft..."
            game2.empresa = "Ubsoft"
            game2.imagem = context.getDrawable(R.drawable.justdance)

            val game3 = holderModel()

            game3.codigo = 3
            game3.nome = "CoD Warfare II"
            game3.descricao = "Call of Duty: Modern Warfare II é um jogo eletrônico de tiro em primeira pessoa desenvolvido pela Infinity Ward e publicado pela Activision..."
            game3.empresa = "Activision"
            game3.imagem = context.getDrawable(R.drawable.codii)

            val holderList = listOf<holderModel>(game1, game2, game3)

            return holderList

        }
    }

}