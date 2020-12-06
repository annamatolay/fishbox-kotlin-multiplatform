package mg.app.fishbox.factory

import mg.app.fishbox.model.Character

class FishFactory : BaseFactory {
    override fun create() =
            object : Character() {
                override var x: Double
                    get() = TODO("Not yet implemented")
                    set(value) {}
                override val y: Double
                    get() = TODO("Not yet implemented")

                override var actions: List<Action>
                    get() = super.actions
                    set(value) {}
            }
}
