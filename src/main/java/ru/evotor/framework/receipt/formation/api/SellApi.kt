package ru.evotor.framework.receipt.formation.api

import android.content.Context
import android.content.Intent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import ru.evotor.framework.core.IntegrationManagerCallback
import ru.evotor.framework.core.action.command.open_receipt_command.OpenReceiptCommandResult
import ru.evotor.framework.core.action.command.open_receipt_command.OpenSellReceiptCommand
import ru.evotor.framework.core.action.event.receipt.changes.position.PositionAdd
import ru.evotor.framework.receipt.formation.ReceiptDraft
import ru.evotor.framework.receipt.position.Position
import java.util.*

object SellApi {
    private const val ACTION_MAIN = "evotor.intent.action.edit.SELL"
    private const val ACTION_PAYMENT = "evotor.intent.action.payment.SELL"

    fun createIntentForMainActivity() = Intent(ACTION_MAIN)

    fun createIntentForPaymentActivity() = Intent(ACTION_PAYMENT)

    fun startReceiptFormation(context: Context, positions: List<Position> = emptyList()): UUID {
        val s: BehaviorSubject<UUID> = BehaviorSubject.create<UUID>()
        val o = s.observeOn(Schedulers.newThread()).subscribeOn(AndroidSchedulers.mainThread())
        OpenSellReceiptCommand(positions.map { PositionAdd(it) }, null).process(context, IntegrationManagerCallback {
            s.onNext(UUID.fromString(OpenReceiptCommandResult.create(it.result.data)!!.receiptUuid))
        })
        return o.blockingFirst()
    }

    fun getReceiptDraft(context: Context, uuid: UUID): ReceiptDraft? {

    }

    fun getAllDefferedReceiptDrafts(context: Context): List<ReceiptDraft> {

    }

    fun editReceiptDraft(uuid: UUID) {

    }

    /*  @Throws(UnsupportedOperationException::class)
      fun replaceReceiptDraft(context: Context, oldReceiptDraftUuid: UUID, newReceiptDrafts: List<ReceiptDraft>, cancelExistingPaymentsIfNeeded: Boolean = true)

      @Throws(UnsupportedOperationException::class)
      fun deleteReceiptDraft(context: Context, receiptDraftUuid: UUID, cancelExistingPayments: Boolean = true) {

      }*/
}