package ro.pub.cs.systems.eim.lab05.startedservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class StartedService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.d(Constants.TAG, "onCreate() method was invoked")
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.d(Constants.TAG, "onBind() method was invoked")
        return null
    }

    override fun onUnbind(intent: Intent): Boolean {
        Log.d(Constants.TAG, "onUnbind() method was invoked")
        return true
    }

    override fun onRebind(intent: Intent) {
        Log.d(Constants.TAG, "onRebind() method was invoked")
    }

    override fun onDestroy() {
        Log.d(Constants.TAG, "onDestroy() method was invoked")
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(Constants.TAG, "onStartCommand() method was invoked")
        // TODO: exercise 5 - implement and start the ProcessingThread
        return START_REDELIVER_INTENT
    }
}
