//package ru.netology.nmedia.activity
//
//import com.google.android.gms.common.GoogleApiAvailability
//import com.google.android.gms.common.GoogleApiAvailabilityLight
//import com.google.firebase.messaging.FirebaseMessaging
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ActivityComponent
//
//@Module
//@InstallIn(ActivityComponent::class)
//
//object GoogleModule {
//
//    @Provides
//    fun provideFirebaseMessenging() = FirebaseMessaging.getInstance()
//
//    @Provides
//    fun provideGoogleApiAvailability() = GoogleApiAvailability.getInstance()
//}
package ru.netology.nmedia.activity

import com.google.android.gms.common.GoogleApiAvailability
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class GoogleModule {

    @Provides
    fun provideGoogleApiAvailability() = GoogleApiAvailability.getInstance()
}