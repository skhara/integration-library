package ru.evotor.framework.receipt.event

import java.util.*

abstract class ReceiptDraftEvent internal constructor() {
    abstract val receiptDraftUuid: UUID
}