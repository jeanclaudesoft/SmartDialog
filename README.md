# SmartDialog
A simple library to show custom dialog in android

>Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```  

>Step 2. Add the dependency

```gradle
dependencies {
	        implementation 'com.github.jeanclaudesoft:SmartDialog:Tag'
	}
```
Replace Tag by specific versionSmart

>The library use lottie animation so add
```gradle
 implementation "com.airbnb.android:lottie:$lottieVersion"
 ```
To find lottie version visit https://github.com/airbnb/lottie-android
>To show Success Dialog

```java
SmartDialogBox.showSuccessDialog(Context, "message", "closing button text");
```
>To show Error Dialog

```java
SmartDialogBox.showErrorDialog(Context, "message", "closing button text");
```
>To show Info Dialog

```java
SmartDialogBox.showInfoDialog(Context, "message", "closing button text");
```
>To show Empty Result Dialog

```java
SmartDialogBox.showSearchDialog(Context, "message", "closing button text");
```
>To show No Internet Dialog

```java
SmartDialogBox.showInternetDialog(Context, "message", "closing button text");
```
