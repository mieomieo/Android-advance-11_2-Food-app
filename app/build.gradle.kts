plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.googleDevtools)
    id("kotlin-android")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.example.assignment10"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.assignment10"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    dataBinding {
        enable = true
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    implementation(libs.glide)
    implementation(libs.circleimageview)
    implementation (libs.androidx.coroutines.core)
    implementation (libs.androidx.lifecycle.viewmodel)
    implementation (libs.androidx.lifecycle.common)
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.room.ktx)
    implementation (libs.androidx.room.runtime)
    annotationProcessor (libs.androidx.room.compiler)
    ksp (libs.androidx.room.compiler)



    implementation("com.squareup.moshi:moshi:1.13.0")
    implementation("com.squareup.moshi:moshi-adapters:1.12.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.12.0")

    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("com.github.bumptech.glide:glide:4.13.2")

}