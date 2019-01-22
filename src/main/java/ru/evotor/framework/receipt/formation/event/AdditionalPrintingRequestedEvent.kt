package ru.evotor.framework.receipt.formation.event

import java.util.*

class AdditionalPrintingRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    class Result
}