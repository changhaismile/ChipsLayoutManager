package com.beloo.widget.chipslayoutmanager.logger;

import android.support.annotation.NonNull;

public class LoggerFactory {
    @NonNull
    public IFillLogger getFillLogger() {
        return new StartPositionLogger();
    }

    @NonNull
    public IAdapterActionsLogger getAdapterActionsLogger() {
        return new EmptyAdapterActionsLogger();
    }

    @NonNull
    public IPredictiveAnimationsLogger getPredictiveAnimationsLogger() {
        return new PredictiveAnimationsLogger();
    }
}
