package ru.evotor.framework.receipt.formation.event.view

import ru.evotor.framework.receipt.formation.event.ReceiptDiscountRequestedEvent

interface ReceiptDiscountIntegrationView {
    fun handleOnClickEvent(event: ReceiptDiscountRequestedEvent): ReceiptDiscountRequestedEvent.Result?
}