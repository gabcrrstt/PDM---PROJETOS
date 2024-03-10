package com.example.projeto3_atividadegabriellycristine;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

import android.os.Handler;
import android.widget.Toast;

public class MyService extends Service {

    private MyReceiver smsReceiver;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Registrar o BroadcastReceiver para interceptar mensagens SMS
        smsReceiver = new MyReceiver();
        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(smsReceiver, intentFilter);

        // Exibir uma mensagem informando que o serviço foi iniciado
        Toast.makeText(this, "Serviço de monitoramento de SMS iniciado", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Desregistrar o BroadcastReceiver quando o serviço for encerrado
        if (smsReceiver != null) {
            unregisterReceiver(smsReceiver);
        }

        // Exibir uma mensagem informando que o serviço foi encerrado
        Toast.makeText(this, "Serviço de monitoramento de SMS encerrado", Toast.LENGTH_SHORT).show();
    }
}