package ru.evotor.framework.receipt.formation.event

import ru.evotor.framework.receipt.position.ChangePositionIntention
import java.util.*

data class BeforePositionsChangedEvent(
        override val receiptDraftUuid: UUID,
        val changePositionIntentions: List<ChangePositionIntention>
) : ReceiptDraftEvent() {
    data class Result(val changePositionIntentions: List<ChangePositionIntention>)
}