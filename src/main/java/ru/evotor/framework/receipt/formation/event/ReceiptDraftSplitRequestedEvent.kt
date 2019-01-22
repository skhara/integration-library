package ru.evotor.framework.receipt.formation.event

import java.util.*

class ReceiptDraftSplitRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    class Result
}