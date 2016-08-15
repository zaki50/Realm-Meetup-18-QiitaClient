package org.zakky.qiitaclient.dagger

import dagger.Component
import org.zakky.qiitaclient.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}