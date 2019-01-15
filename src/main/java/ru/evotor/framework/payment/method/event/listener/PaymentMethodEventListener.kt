package ru.evotor.framework.payment.method.event.listener

import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent

interface PaymentMethodEventListener {
    fun handlePaymentRequestedEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result
    fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result
}