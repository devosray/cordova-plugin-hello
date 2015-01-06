package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

	    Parse.initialize(this, "mZFEv9rL3OsAdGycLS0u54PcyBxIRz56TgVCxbrf", "vWoID4z5gSZkeIM4ZrLaLB0ViGmL5MsfrFYDUjdc");
            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
