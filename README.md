# com.honeywell.plugin

**dev environment:**  
>  angular + Ionic  +	Cordova  

	Honeywell Barcode Scanner  
	Model:  
	Android EDA50/EDA51  
	
	
	
	
#### Config File 1:  
<project_root>\plugins\android.json
```xml
"dependent_plugins": {
    "com.honeywell.plugin": {
      "PACKAGE_NAME": "io.logichealth.packpress"
    }
}
```

#### Config File 2:  
<project_root>\src\app.component.ts
```javascript
InitScanner() {
    honeywellscanner.scan((barcode) => {
      this.PublishBarcode(this.event, barcode);
    });
  }
```

#### Config File 3:  
<project_root>\angular.json
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

/*
npm install -g cnpm --registry=https://registry.npm.taobao.org
cnpm install --global --production windows-build-tools   
cnpm install  
cnpm install -g ionic@5.0.2
cnpm install -g cordova
*/
