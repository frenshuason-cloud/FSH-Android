# FSH Android

Android store-submission project for the FSH social network.

## App identity
- App name: FSH
- Package name: `com.fsh.social`
- Version: 1.0.0 (versionCode 1)
- Target SDK: 36
- Minimum SDK: 23
- Production URL: https://fsh-b0573c.v2.appdeploy.ai/

## Architecture
The Android app opens the FSH service in a Chrome Custom Tab. This keeps FSH authentication in the browser security context instead of embedding OAuth inside a WebView.

## Build
Open this folder in current Android Studio and let Gradle sync. Build a signed release:
- `bundleRelease` -> Google Play `.aab`
- `assembleRelease` -> signed APK for compatible stores/testing

For Google Play, new apps must be uploaded as an Android App Bundle and, as of August 31, 2026, new apps must target Android 16 / API 36 or higher.

## Before publishing
1. Create/verify a Google Play Console developer account.
2. Keep the package name `com.fsh.social` once the app is registered.
3. Configure Play App Signing.
4. Prepare store screenshots, feature graphic, app description, privacy policy, and Data safety declarations.
5. Run internal/closed testing before production.
6. For PalmStore, follow its current developer submission requirements and upload the appropriate Android release artifact.

## Important
This source package is prepared for building and signing. The ChatGPT build environment used for this preparation does not contain the Android SDK/Gradle distribution, so an AAB/APK was not compiled here.
