package ru.evotor.framework.payment.method.event.listener

import ru.evotor.framework.payment.AmountOfRubles
import ru.evotor.framework.payment.method.PaymentMethod
import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent

interface PaymentMethodIntegrationView {
    fun handleOnClickEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result?

    fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result?

    fun requestPaymentFromAnotherPaymentMethod(paymentMethod: PaymentMethod, paymentAmount: AmountOfRubles) {

    }

    fun requestPaymentCancellationFromAnotherPaymentMethod(paymentMethod: PaymentMethod) {

    }
}