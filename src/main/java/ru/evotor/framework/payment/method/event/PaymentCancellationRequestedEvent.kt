package ru.evotor.framework.payment.method.event

import ru.evotor.framework.payment.Payment
import ru.evotor.framework.payment.Pinpad
import ru.evotor.framework.receipt.formation.event.ReceiptDraftEvent
import java.util.*

data class PaymentCancellationRequestedEvent(
        override val receiptDraftUuid: UUID,
        val payment: Payment
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    class SuccessfulResult internal constructor(
            val pinpad: Pinpad?,
            val slip: List<String>?
    ) : Result() {
        constructor() : this(null, null)

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is SuccessfulResult) return false

            if (pinpad != other.pinpad) return false
            if (slip != other.slip) return false

            return true
        }

        override fun hashCode(): Int {
            var result = pinpad?.hashCode() ?: 0
            result = 31 * result + (slip?.hashCode() ?: 0)
            return result
        }
    }

    data class ErroneousResult(val message: String) : Result()
}