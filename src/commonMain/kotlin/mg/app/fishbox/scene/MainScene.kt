package mg.app.fishbox.scene

import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import mg.app.fishbox.factory.FishFactory
import mg.app.fishbox.model.Character

class MainScene(factory: FishFactory) : Scene() {
    private val fish = factory.create()

    override suspend fun Container.sceneInit() {
        fish.actions = listOf(
                Character.Action.Look.Forward.apply {
//                    image = image(resourcesVfs["img/fish-forward.png"].readBitmap())
                },
                Character.Action.Look.Backward.apply {
//                    image = image(resourcesVfs["img/fish-backward.png"].readBitmap())
                }
        )
    }
}