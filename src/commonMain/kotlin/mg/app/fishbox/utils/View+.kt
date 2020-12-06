package utils

import com.soywiz.klock.*
import com.soywiz.korge.view.*

fun <T : View> T.addFixedUpdater(updatable: T.() -> Unit) =
    addFixedUpdater(timesPerSecond = 60.timesPerSecond, updatable = updatable)