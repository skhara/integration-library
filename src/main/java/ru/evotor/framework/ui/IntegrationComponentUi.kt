package ru.evotor.framework.ui

import android.graphics.drawable.Drawable
import java.util.*

sealed class IntegrationComponentUi {
    abstract val backgroundColor: Int?
    abstract val icon: Drawable?
    abstract val label: String
    abstract val labelColor: Int
}

data class PaymentMethodComponentUi internal constructor(
        val paymentMethodUuid: UUID,
        override val backgroundColor: Int?,
        override val icon: Drawable?,
        override val label: String,
        override val labelColor: Int
) : IntegrationComponentUi()