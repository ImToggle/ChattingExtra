package me.imtoggle.chattingextra

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.data.*

object ModConfig : Config(Mod(ChattingExtra.NAME, ModType.UTIL_QOL), "${ChattingExtra.MODID}.json") {

    init {
        initialize()
    }
}