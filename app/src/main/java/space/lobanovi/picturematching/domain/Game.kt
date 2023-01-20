package space.lobanovi.picturematching.domain

import android.graphics.Color
import com.github.jinatonic.confetti.CommonConfetti


class Game<content>(private val list: List<content>) {

    private val cards: ArrayList<Card<content>> = ArrayList()

    init {
        list.forEachIndexed { index, content ->
            cards.add(Card(id = index * index, content = content))
            cards.add(Card(id = index * index + 2, content = content))
        }
    }

    fun getCards() = cards

    fun onCardClick(card: Card<content>) {
        card.isFacedUp = !card.isFacedUp
        cards.map {
            if (it.isFacedUp && card.id != it.id) {
                if (card.content == it.content) {
                    cards[cards.indexOf(card)].isFacedUp = true
                    it.isFacedUp = true
                    cards[cards.indexOf(card)].isMatched = true
                    it.isMatched = true
                } else if (!it.isMatched) {
                    cards[cards.indexOf(card)].isFacedUp = false
                    it.isFacedUp = false
                }
            }
        }
    }
}