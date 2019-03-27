package com.example.himanshuy.twilioapptest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.instance.Account;

import java.util.HashMap;

//import com.twilio.sdk.TwilioRestClient;

/**
 * Created by himanshu.y on 9/30/2016.
 */

public class Message_Send_Activity extends Activity implements View.OnClickListener{
    private EditText txttoNo,txtmessage;
    private Button btnSend;

    String accountSID = "";
    String authToken = "";
    TwilioRestClient client;
    CallFactory callFactory;
    HashMap<String, String> params = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_send_activity);
        txttoNo=(EditText)findViewById(R.id.txttoNo);
        txtmessage=(EditText)findViewById(R.id.txtmessage);
        btnSend=(Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
try {
    client = new TwilioRestClient(accountSID, authToken);
}catch (Exception ex)
{
    Log.d("Error",""+ex);
}

        Account account = client.getAccount();
        String Url="";
//        Url = Url + "?Message%5B0%5D=Hello%20World";

// Place the call From, To and URL values into a hash map.

        params.put("From", "8686120017"); // Use your own value for the second parameter.
        params.put("To", "9415555209");   // Use your own value for the second parameter.
        params.put("Url", Url);

// Create an instance of the CallFactory class.
      //   callFactory = account.getCallFactory();

// Make the call.



    }

    @Override
    public void onClick(View v) {
        try {
           // Call call = callFactory.create(params);
        }catch (Exception ex)
        {
            Log.d("Error",""+ex);
        }

    }
}
