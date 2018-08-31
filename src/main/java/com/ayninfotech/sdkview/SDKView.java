 package com.ayninfotech.sdkview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

public class SDKView extends LinearLayout {

    public EditText editMobileNumber;
    public EditText editPassword;

    public SDKView(Context context) {
        super(context);
        initialize(context);
    }

    public SDKView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.sdk_view, this);

        editMobileNumber = findViewById(R.id.edit_mobile_number);
        editPassword = findViewById(R.id.edit_password);
    }

    public String getEditMobileNumber() {
        return editMobileNumber.getText().toString();
    }

    public void setEditMobileNumber(String mobileNumber) {
        this.editMobileNumber.setText("" + mobileNumber);
    }

    public String getEditPassword() {
        return editPassword.getText().toString();
    }

    public void setEditPassword(String password) {
        this.editPassword.setText("" + password);
    }
}
