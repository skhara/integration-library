package ru.evotor.framework.payment.method.event

import ru.evotor.framework.payment.AmountOfRubles
import ru.evotor.framework.payment.PaymentMean
import ru.evotor.framework.payment.Pinpad
import ru.evotor.framework.receipt.formation.event.ReceiptDraftEvent
import java.util.*

data class PaymentRequestedEvent(
        override val receiptDraftUuid: UUID
) : ReceiptDraftEvent() {
    abstract class Result internal constructor()

    class SuccessfulResult internal constructor(
            val sum: AmountOfRubles,
            val paymentMean: PaymentMean,
            val rrn: String?,
            val pinpad: Pinpad?,
            val slip: List<String>?
    ) : Result() {
        constructor(
                sum: AmountOfRubles,
                paymentMean: PaymentMean,
                rrn: String? = null
        ) : this(sum, paymentMean, rrn, null, null)

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is SuccessfulResult) return false

            if (sum != other.sum) return false
            if (paymentMean != other.paymentMean) return false
            if (rrn != other.rrn) return false
            if (pinpad != other.pinpad) return false
            if (slip != other.slip) return false

            return true
        }

        override fun hashCode(): Int {
            var result = sum.hashCode()
            result = 31 * result + paymentMean.hashCode()
            result = 31 * result + (rrn?.hashCode() ?: 0)
            result = 31 * result + (pinpad?.hashCode() ?: 0)
            result = 31 * result + (slip?.hashCode() ?: 0)
            return result
        }
    }

    data class ErrorResult(val message: String) : Result()
}