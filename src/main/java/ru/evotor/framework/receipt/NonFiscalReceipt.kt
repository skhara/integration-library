package ru.evotor.framework.receipt

import ru.evotor.framework.Document
import ru.evotor.framework.FutureFeature
import java.util.*

@FutureFeature("Нефискальный чек (квитанция)")
data class NonFiscalReceipt(
        override val uuid: UUID
) : Document() {
    enum class Type {
        /**
         * Квитанция
         */
        INVOICE,
        /**
         * ЕНВД чек, напечатанный строками
         */
        STRING_UTII
    }
}