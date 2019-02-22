package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.method.event.listener.PaymentMethodEventListener
import ru.evotor.framework.receipt.formation.event.AdditionalPrintingRequestedEvent
import ru.evotor.framework.receipt.formation.event.BeforePositionsChangedEvent
import ru.evotor.framework.receipt.formation.event.ReceiptDiscountRequestedEvent
import ru.evotor.framework.receipt.formation.event.ReceiptDraftSplitRequestedEvent

open class SellIntegrationService {
    open fun handleBeforePositionsChangedEvent(event: BeforePositionsChangedEvent): BeforePositionsChangedEvent.Result? = null

    open fun handleReceiptDiscountRequestedEvent(event: ReceiptDiscountRequestedEvent): ReceiptDiscountRequestedEvent.Result? = null

    open fun handleReceiptDraftSplitRequestedEvent(event: ReceiptDraftSplitRequestedEvent): ReceiptDraftSplitRequestedEvent.Result? = null

    open val paymentMethodEventListener: PaymentMethodEventListener? = null

    open fun handleAdditionalPrintingRequestedEvent(event: AdditionalPrintingRequestedEvent): AdditionalPrintingRequestedEvent.Result? = null
}