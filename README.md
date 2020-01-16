# com.honeywell.plugin

**dev environment:**  
>  angular + Ionic  +	Cordova  

	Honeywell Barcode Scanner  
	Model:  
	Android EDA50/EDA51  
	
	
	
	
#### Config File 1:  
plugins\android.json
```xml
"dependent_plugins": {
    "com.honeywell.plugin": {
      "PACKAGE_NAME": "io.logichealth.packpress"
    }
}
```

#### Config File 2:  
src\app.component.ts
```javascript
InitScanner() {
    honeywellscanner.scan((barcode) => {
      this.PublishBarcode(this.event, barcode);
    });
  }
```

#### Config File 3:  
<project>\angular.json
```xml
"scripts": [
      "plugins/com.honeywell.plugin/www/honeywellscanner.js"
   ]
```

Run and Build:
```javascript
cordova platform rm android 
cordova platform add android

ionic cordova run android
