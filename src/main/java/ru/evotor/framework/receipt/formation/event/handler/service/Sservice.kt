package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.AmountOfRubles
import ru.evotor.framework.payment.CashlessPayment
import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent
import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener
import java.util.*

class Sservice : SellIntegrationService() {
    override val paymentMethodEventListener = object : PaymentMethodEventListener {
        override fun handlePaymentRequestedEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result {
            return PaymentRequestedEvent.SuccessResult(
                    CashlessPayment(UUID.randomUUID(), AmountOfRubles(10), "1233")
            )
        }

        override fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result {
            return PaymentCancellationRequestedEvent.SuccessResult()
        }
    }
}