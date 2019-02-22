package ru.evotor.framework.receipt.formation.api

import ru.evotor.framework.receipt.SettlementType
import ru.evotor.framework.receipt.TaxationSystem
import ru.evotor.framework.receipt.position.PositionChangeIntention
import java.util.*

sealed class ReceiptDraftEditor(private val receiptDraftUuid: UUID) {
    protected var newReceiptDraftUuid: UUID? = null
    protected var settlementType: SettlementType? = null
    protected var taxationSystem: TaxationSystem? = null
    protected var positionChangeIntentions: List<PositionChangeIntention>? = null
}

class FiscalReceiptDraftEditor internal constructor(receiptDraftUuid: UUID) : ReceiptDraftEditor(receiptDraftUuid) {
    fun setUuid(uuid: UUID): FiscalReceiptDraftEditor = this.apply {
        this.newReceiptDraftUuid = uuid
    }

    fun setSettlementType(settlementType: SettlementType): FiscalReceiptDraftEditor = this.apply {
        this.settlementType = settlementType
    }

    fun setTaxationSystem(taxationSystem: TaxationSystem): FiscalReceiptDraftEditor = this.apply {
        this.taxationSystem = taxationSystem
    }

    fun changePositions(positionChangeIntentions: List<PositionChangeIntention>): FiscalReceiptDraftEditor = this.apply {
        this.positionChangeIntentions = positionChangeIntentions
    }
}