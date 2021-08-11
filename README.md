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
	        implementation 'com.github.jeanclaudesoft:SmartDialog:1.0'
	}
```


>The library use lottie animation so add
```gradle
 implementation "com.airbnb.android:lottie:$lottieVersion"
 ```
To find lottie version visit https://github.com/airbnb/lottie-android
>To show Success Dialog

```java
SmartDialogBox.showSuccessDialog(Context, "message", "closing button text");
```

![Success Dialog](https://github.com/jeanclaudesoft/SmartDialog/blob/master/Screenshot_20210811-201852.png)
>To show Error Dialog

```java
SmartDialogBox.showErrorDialog(Context, "message", "closing button text");
```

![Error Dialog](https://github.com/jeanclaudesoft/SmartDialog/blob/master/Screenshot_20210811-201858.png)

>To show Info Dialog

```java
SmartDialogBox.showInfoDialog(Context, "message", "closing button text");
```
![Info Dialog](https://github.com/jeanclaudesoft/SmartDialog/blob/master/Screenshot_20210811-201907.png)
>To show Empty Result Dialog

```java
SmartDialogBox.showSearchDialog(Context, "message", "closing button text");
```

![No Result Dialog](https://github.com/jeanclaudesoft/SmartDialog/blob/master/Screenshot_20210811-201919.png)

>To show No Internet Dialog

```java
SmartDialogBox.showInternetDialog(Context, "message", "closing button text");
```

![No Internet Dialog](https://github.com/jeanclaudesoft/SmartDialog/blob/master/Screenshot_20210811-201912.png)
