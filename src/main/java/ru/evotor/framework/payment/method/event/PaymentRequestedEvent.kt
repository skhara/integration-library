package ru.evotor.framework.payment.method.event

import ru.evotor.framework.payment.Payment
import ru.evotor.framework.receipt.event.ReceiptDraftEvent
import java.util.*

data class PaymentRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    data class SuccessResult(val payment: Payment) : Result()

    data class ErrorResult(val message: String) : Result()
}