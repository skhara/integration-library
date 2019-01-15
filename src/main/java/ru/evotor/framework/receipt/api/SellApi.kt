package ru.evotor.framework.receipt.api

import android.content.Context
import android.content.Intent
import ru.evotor.framework.core.IntegrationManagerCallback
import ru.evotor.framework.core.action.command.open_receipt_command.OpenSellReceiptCommand
import ru.evotor.framework.core.action.event.receipt.changes.position.PositionAdd
import ru.evotor.framework.receipt.ReceiptDraft
import ru.evotor.framework.receipt.position.Position
import java.util.*

object SellApi {
    private const val ACTION_MAIN = "evotor.intent.action.edit.SELL"
    private const val ACTION_PAYMENT = "evotor.intent.action.payment.SELL"

/*    fun startReceiptsFormation(context: Context, positions: List<Position> = emptyList())

    fun getCurrentReceiptDrafts(context: Context): List<ReceiptDraft>

    @Throws(UnsupportedOperationException::class)
    fun replaceReceiptDraft(context: Context, oldReceiptDraftUuid: UUID, newReceiptDrafts: List<ReceiptDraft>, cancelExistingPaymentsIfNeede: Boolean = true)

    @Throws(UnsupportedOperationException::class)
    fun deleteReceiptDraft(context: Context, receiptDraftUuid: UUID, cancelExistingPayments: Boolean = true)*/

    fun createIntentForMainActivity() = Intent(ACTION_MAIN)

    fun createIntentForPaymentActivity() = Intent(ACTION_PAYMENT)
}