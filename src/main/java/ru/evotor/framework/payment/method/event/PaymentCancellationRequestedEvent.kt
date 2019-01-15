package ru.evotor.framework.payment.method.event

import ru.evotor.framework.payment.Payment
import ru.evotor.framework.receipt.formation.event.ReceiptDraftEvent
import java.util.*

data class PaymentCancellationRequestedEvent(
        override val receiptDraftUuid: UUID,
        val payment: Payment
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    class SuccessResult internal constructor(val slip: List<String>? = null) : Result() {
        constructor() : this(null)
    }

    data class ErrorResult(val message: String) : Result()
}