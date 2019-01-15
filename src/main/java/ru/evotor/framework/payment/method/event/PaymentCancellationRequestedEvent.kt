package ru.evotor.framework.payment.method.event

import ru.evotor.framework.receipt.event.ReceiptDraftEvent
import java.util.*

data class PaymentCancellationRequestedEvent(
        override val receiptDraftUuid: UUID,
        val paymentUuid: UUID
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    class SuccessResult : Result()

    data class ErrorResult(val message: String) : Result()
}