package mg.app.fishbox.factory

import mg.app.fishbox.model.Character

interface BaseFactory {
    fun create(): Character
}
