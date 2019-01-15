package ru.evotor.framework.receipt.formation.event

import java.util.*

abstract class ReceiptDraftEvent internal constructor() {
    abstract val receiptDraftUuid: UUID
}