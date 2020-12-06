package mg.app.fishbox.utils

import com.soywiz.korev.*
import com.soywiz.korge.input.*
import com.soywiz.korge.scene.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import mg.app.fishbox.scene.MainScene
import utils.addFixedUpdater

fun Container.addFpsText(window: GameWindow) =
        text("FPS: 0") {
            position(10, 10)
            addFixedUpdater {
                text = "FPS: " + window.fps.toString()
            }
        }

fun Container.showMenuListener(sceneContainer: SceneContainer) =
        keys { down { if (it.key == Key.ESCAPE) sceneContainer.changeToAsync<MainScene>() } }
