package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener

open class SellIntegrationService {
    open fun handleBeforePositionsEditedEvent() = Unit

    open fun handleReceiptDiscountRequestedEvent() = Unit

    open fun handleReceiptDraftSplitRequestedEvent() = Unit

    open val paymentMethodEventListener: PaymentMethodEventListener? = null
}