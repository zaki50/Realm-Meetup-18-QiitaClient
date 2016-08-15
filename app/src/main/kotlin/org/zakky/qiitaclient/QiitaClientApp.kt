package org.zakky.qiitaclient

import android.app.Application
import org.zakky.qiitaclient.dagger.AppComponent
import org.zakky.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}