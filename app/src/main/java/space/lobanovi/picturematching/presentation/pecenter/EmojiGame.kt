package space.lobanovi.picturematching.presentation.pecenter

import space.lobanovi.picturematching.domain.Card
import space.lobanovi.picturematching.domain.Game

class EmojiGame {

    private val emojiGame= Game (listOf("\uD83D\uDC30","\uD83D\uDC3C\n","\uD83D\uDC2F","\uD83E\uDD84","\uD83D\uDC31","\uD83D\uDC39\n").shuffled())

    fun emojiCard()=emojiGame.getCards()
    fun emojiCardClick(cardModel: Card<String>){
        emojiGame.onCardClick(cardModel)
    }
}