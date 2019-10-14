package ru.evotor.framework.core.action.event.receipt.position_edited;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.evotor.framework.receipt.Position;

/**
 * @deprecated Используйте {@link ru.evotor.framework.receipt.position.event.PositionUpdatedEvent}
 */
@Deprecated
public class PositionEditedEvent extends PositionEvent {
    public static final String BROADCAST_ACTION_SELL_RECEIPT = "evotor.intent.action.receipt.sell.POSITION_EDITED";
    public static final String BROADCAST_ACTION_PAYBACK_RECEIPT = "evotor.intent.action.receipt.payback.POSITION_EDITED";
    public static final String BROADCAST_ACTION_BUY_RECEIPT = "evotor.intent.action.receipt.buy.POSITION_EDITED";
    public static final String BROADCAST_ACTION_BUYBACK_RECEIPT = "evotor.intent.action.receipt.buyback.POSITION_EDITED";

    @Nullable
    public static PositionEditedEvent create(@Nullable Bundle extras) {
        if (extras == null) {
            return null;
        }
        String receiptUuid = getReceiptUuid(extras);
        if (receiptUuid == null) {
            return null;
        }
        Position position = getPosition(extras);
        if (position == null) {
            return null;
        }
        return new PositionEditedEvent(receiptUuid, position);
    }

    public PositionEditedEvent(@NonNull String receiptUuid, @NonNull Position position) {
        super(receiptUuid, position);
    }
}
