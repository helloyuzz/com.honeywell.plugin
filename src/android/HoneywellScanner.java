package com.honeywell.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;


public class HoneywellScanner extends CordovaPlugin
{
    private static String HONEYWELL_ACTION_FILTER = "honeywell";

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("scan"))        {
            //intReceiver
            HoneywellReceiver mReceiver = new HoneywellReceiver(callbackContext);
            //registerReceiver
            IntentFilter filter = new IntentFilter(HONEYWELL_ACTION_FILTER);
            cordova.getActivity().registerReceiver(mReceiver, filter);
            return true;
        } else {
            return false;
        }
    }
}