package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.AmountOfRubles
import ru.evotor.framework.payment.PaymentMean
import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent
import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener

class Sservice : SellIntegrationService() {
    override val paymentMethodEventListener = object : PaymentMethodEventListener {
        override fun handlePaymentRequestedEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result {
            Thread.sleep(100L)
            return PaymentRequestedEvent.SuccessfulResult(AmountOfRubles(10), PaymentMean.CASH)
        }

        override fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result {
            return PaymentCancellationRequestedEvent.SuccessfulResult()
        }
    }
}