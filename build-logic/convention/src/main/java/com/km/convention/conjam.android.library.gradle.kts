import com.km.convention.app.configureCoroutineAndroid
import com.km.convention.app.configureHiltAndroid
import com.km.convention.app.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureCoroutineAndroid()
configureHiltAndroid()
