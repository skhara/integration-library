package ru.evotor.framework.receipt.formation.event

import ru.evotor.framework.payment.AmountOfRubles
import java.util.*

class ReceiptDiscountRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    class Result(val discount: AmountOfRubles)
}