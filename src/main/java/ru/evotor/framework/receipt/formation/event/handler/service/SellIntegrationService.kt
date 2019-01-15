package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener

open class SellIntegrationService {
    open fun handleBeforePositionsEditedEvent() = Unit

    open fun handleReceiptDraftDiscountRequestedEvent() = Unit

    open fun handleReceiptDraftSplitRequestedEvent() = Unit

    open val paymentMethodEventListener: PaymentMethodEventListener? = null
}