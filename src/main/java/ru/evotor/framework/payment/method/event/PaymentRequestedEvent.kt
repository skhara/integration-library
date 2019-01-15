package ru.evotor.framework.payment.method.event

import ru.evotor.framework.payment.Payment
import ru.evotor.framework.receipt.formation.event.ReceiptDraftEvent
import java.util.*

data class PaymentRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    class SuccessResult internal constructor(
            val payment: Payment,
            val slip: List<String>?
    ) : Result() {
        constructor(payment: Payment) : this(payment, null)

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is SuccessResult) return false

            if (payment != other.payment) return false
            if (slip != other.slip) return false

            return true
        }

        override fun hashCode(): Int {
            var result = payment.hashCode()
            result = 31 * result + (slip?.hashCode() ?: 0)
            return result
        }
    }

    data class ErrorResult(val message: String) : Result()
}