import com.soywiz.korge.*
import com.soywiz.korge.scene.*
import com.soywiz.korim.color.*
import com.soywiz.korinject.*
import com.soywiz.korma.geom.*
import mg.app.fishbox.factory.FishFactory
import mg.app.fishbox.scene.MainScene
import kotlin.reflect.*

suspend fun main() = Korge(config = Korge.Config(module = GameModule))

object GameModule : Module() {
	override val mainScene: KClass<out Scene> = MainScene::class
	override val title: String = "FishBox"
	override val size: SizeInt = SizeInt(1240, 720)
	override val bgcolor = Colors.BLACK
//    override val icon = "/img/icon.png"

	override suspend fun AsyncInjector.configure() {
//        val bgMusic = resourcesVfs["sound/background.mp3"].readSound()
		mapPrototype { MainScene(FishFactory()) }
//				mapPrototype { MenuScene() }
	}
}