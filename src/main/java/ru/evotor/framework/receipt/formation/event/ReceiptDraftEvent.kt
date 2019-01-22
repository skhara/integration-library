package ru.evotor.framework.receipt.formation.event

import java.util.*

abstract class ReceiptDraftEvent {
    abstract val receiptDraftUuid: UUID
}