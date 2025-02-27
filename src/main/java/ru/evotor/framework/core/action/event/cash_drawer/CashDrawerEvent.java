package ru.evotor.framework.core.action.event.cash_drawer;

import android.os.Bundle;

import androidx.annotation.NonNull;

import ru.evotor.IBundlable;

/**
 * @deprecated Используйте {@link ru.evotor.framework.device.cash_drawer.event.CashDrawerEvent}
 */
@Deprecated
public abstract class CashDrawerEvent implements IBundlable {
    private static final String KEY_CASH_DRAWER_ID = "cashDrawerId";

    private final int cashDrawerId;

    CashDrawerEvent(@NonNull Bundle extras) {
        this(
                extras.getInt(KEY_CASH_DRAWER_ID, -1)
        );
    }

    CashDrawerEvent(int cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }

    @Override
    @NonNull
    public Bundle toBundle() {
        Bundle result = new Bundle();
        result.putInt(KEY_CASH_DRAWER_ID, cashDrawerId);
        return result;
    }

    public int getCashDrawerId() {
        return cashDrawerId;
    }
}
