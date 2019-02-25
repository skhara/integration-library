package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.method.event.PaymentCancellationRequestedEvent
import ru.evotor.framework.payment.method.event.PaymentRequestedEvent
import ru.evotor.framework.payment.method.event.listener.PaymentMethodIntegrationView
import ru.evotor.framework.receipt.formation.event.AdditionalPrintingRequestedEvent
import ru.evotor.framework.receipt.formation.event.ReceiptDiscountRequestedEvent
import ru.evotor.framework.receipt.formation.event.handler.view.ReceiptDiscountIntegrationView

class Sservice : SellIntegrationService() {
    override fun handleAdditionalPrintingRequestedEvent(event: AdditionalPrintingRequestedEvent): AdditionalPrintingRequestedEvent.Result? {
        return null
    }

    override val receiptDiscountIntegrationView = object : ReceiptDiscountIntegrationView {
        override fun handleOnClickEvent(event: ReceiptDiscountRequestedEvent): ReceiptDiscountRequestedEvent.Result? {
        }
    }

    override val paymentMethodIntegrationView = object : PaymentMethodIntegrationView {
        override fun handleOnClickEvent(event: PaymentRequestedEvent): PaymentRequestedEvent.Result? {
        }

        override fun handlePaymentCancellationRequestedEvent(event: PaymentCancellationRequestedEvent): PaymentCancellationRequestedEvent.Result? {
        }

    }
}