package com.dev.sdv.contactstatus.utils;

import android.content.Context;
import android.content.SharedPreferences;

public interface Prefs {

    SharedPreferences.Editor getEditor(String prefs, Context context);

    interface Status {

        void setAutoChangeStatus(boolean autoChange, Context context);

        boolean isAutoChangeStatus(Context context);

        void setShowLocation(boolean show, Context context);

        boolean isShowLocation(Context context);

        void setAvailableForCall(boolean available, Context context);

        boolean isAvailableForCall(Context context);

        void setBatteryStateNormal(boolean normal, Context context);

        boolean isBatteryStateNormal(Context context);

        void setNetworkUnlimited(boolean unlimited, Context context);

        boolean isNetworkUnlimited(Context context);

        void setSoundModeNormal(boolean normal, Context context);

        boolean isSoundModeNormal(Context context);

        void setStatusMessage(String message, Context context);

        String getStatusMessage(Context context);
    }
}