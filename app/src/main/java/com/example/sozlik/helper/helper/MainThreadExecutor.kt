package com.example.sozlik.helper.helper

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor

class MainThreadExecutor: Executor {

    private val mainThreadHandler: Handler = Handler(Looper.getMainLooper())

    override fun execute(command: Runnable) {
        mainThreadHandler.post(command)
    }
}