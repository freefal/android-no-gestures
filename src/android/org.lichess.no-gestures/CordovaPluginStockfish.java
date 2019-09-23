package org.lichess.no_gestures;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import androidx.core.view.ViewCompat;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public final class CordovaPluginAndroidNoGestures extends CordovaPlugin {

  private CordovaWebView webView;

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
      super.initialize(cordova, webView);
      this.webView = webView;
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("disable_all_gestures")) {
      disable_all_gestures(callbackContext);
    else {
      return false;
    }
    return true;
  }

  private void disable_all_gestures(CallbackContext callbackContext) throws JSONException {
    try {
      ViewCompat.setSystemGestureExclusionRects(webView, )
    } catch (Error e) {
      callbackContext.error("Error disabling gestures");
    }
    callbackContext.success();
  }
}
