package com.honeywell.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public class HoneywellReceiver extends BroadcastReceiver{
    private CallbackContext callbackContext;
    public HoneywellReceiver (CallbackContext callbackContext) {
        this.callbackContext = callbackContext;
    }
    @Override
    public void onReceive(Context context, Intent intent)    {
        /*barcode ：扫描的条码数据*/
        String barcode = intent.getStringExtra("data");

        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, barcode);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
        //callbackContext.success(barcode);
    }
}