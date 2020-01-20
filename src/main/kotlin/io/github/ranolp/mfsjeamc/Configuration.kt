package io.github.ranolp.mfsjeamc

import io.github.ranolp.mfsjea.keyboard.InputKeyboard
import io.github.ranolp.mfsjea.keyboard.OutputKeyboard
import io.github.ranolp.mfsjeamc.sender.MessageSender

internal object Configuration {
    object InitialState {
        var useMfsjea = true
        var inputKeyboard: InputKeyboard? = null
        var outputKeyboard: OutputKeyboard? = null
    }

    object MessageFormat {
        var shortCriteria = 1
        var short: MessageSender.Types = MessageSender.Types.NEXT
        var long: MessageSender.Types = MessageSender.Types.TOOLTIP
    }

    object Escaper {
        var use: Boolean = true
        var start = '['
        var end = ']'
    }
}
