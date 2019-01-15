package ru.evotor.framework.receipt.event.handler.service

import ru.evotor.framework.payment.AmountOfRubles
import ru.evotor.framework.payment.Prepayment
import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent
import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener

class Sservice : SellIntegrationService() {
    override val paymentMethodEventListener: PaymentMethodEventListener
        get() = object : PaymentMethodEventListener {
            override fun handlePaymentRequestedEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result {
                return PaymentRequestedEvent.SuccessResult(Prepayment(sum = AmountOfRubles(10)))
            }

            override fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
}