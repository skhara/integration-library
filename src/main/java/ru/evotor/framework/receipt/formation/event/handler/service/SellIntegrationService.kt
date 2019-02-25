package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.payment.method.event.listener.PaymentMethodIntegrationView
import ru.evotor.framework.receipt.formation.event.AdditionalPrintingRequestedEvent
import ru.evotor.framework.receipt.formation.event.BeforePositionsChangedEvent
import ru.evotor.framework.receipt.formation.event.ReceiptDraftSplitRequestedEvent
import ru.evotor.framework.receipt.formation.event.view.ReceiptDiscountIntegrationView

open class SellIntegrationService {
    open fun handleBeforePositionsChangedEvent(event: BeforePositionsChangedEvent): BeforePositionsChangedEvent.Result? = null

    open val receiptDiscountIntegrationView: ReceiptDiscountIntegrationView? = null

    open fun handleReceiptDraftSplitRequestedEvent(event: ReceiptDraftSplitRequestedEvent): ReceiptDraftSplitRequestedEvent.Result? = null

    open val paymentMethodIntegrationView: PaymentMethodIntegrationView? = null

    open fun handleAdditionalPrintingRequestedEvent(event: AdditionalPrintingRequestedEvent): AdditionalPrintingRequestedEvent.Result? = null
}