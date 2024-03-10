package com.example.projeto3_atividadegabriellycristine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;


public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            Object[] pdus = (Object[]) bundle.get("pdus");
            if (pdus != null) {
                for (Object pdu : pdus) {
                    SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdu);
                    String messageBody = smsMessage.getMessageBody();
                    Toast.makeText(context, "SMS recebida: " + messageBody, Toast.LENGTH_SHORT).show();

                    if (messageBody.contains("palavra-chave")) {

                        Toast.makeText(context, "SMS recebida: " + messageBody, Toast.LENGTH_SHORT).show();

                    }
                }
            }
        }
    }
}

