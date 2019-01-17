package ru.evotor.framework.payment

import ru.evotor.framework.payment.method.PaymentMethod
import java.util.*

/**
 * Оплата
 */
class Payment internal constructor(
        /**
         * Uuid
         */
        val uuid: UUID,
        /**
         * Сумма
         */
        val sum: AmountOfRubles,
        /**
         * Использованное платёжное средство
         */
        val paymentMean: PaymentMean,
        /**
         * Использованный способ оплаты или null, если оплата была произведена не на терминале
         */
        val paymentMethod: PaymentMethod?,
        /**
         * Использованный пинпад или null, если оплата была произведена без пинпада
         */
        val pinpad: Pinpad?,
        /**
         * RRN (Идентификатор оплаты в банке, который производил транзакцию)
         */
        val rrn: String
) {
    constructor(
            /**
             * Uuid
             */
            uuid: UUID,
            /**
             * Сумма
             */
            sum: AmountOfRubles,
            /**
             * Использованное платёжное средство
             */
            paymentMean: PaymentMean,
            /**
             * RRN (Идентификатор оплаты в банке, который производил транзакцию)
             */
            rrn: String
    ) : this(
            uuid,
            sum,
            paymentMean,
            null,
            null,
            rrn
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Payment) return false

        if (uuid != other.uuid) return false
        if (sum != other.sum) return false
        if (paymentMean != other.paymentMean) return false
        if (paymentMethod != other.paymentMethod) return false
        if (pinpad != other.pinpad) return false
        if (rrn != other.rrn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = uuid.hashCode()
        result = 31 * result + sum.hashCode()
        result = 31 * result + paymentMean.hashCode()
        result = 31 * result + (paymentMethod?.hashCode() ?: 0)
        result = 31 * result + (pinpad?.hashCode() ?: 0)
        result = 31 * result + rrn.hashCode()
        return result
    }
}