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
ionic cordova platform rm android 
ionic cordova platform add android 


(Error:Current working directory is not a Cordova-based project.) 
// ionic cordova platform add android 

ionic cordova run android

/*
npm config set registry https://registry.npm.taobao.org

npm install -g cnpm --registry=https://registry.npm.taobao.org

// Powershell as Administrator
cnpm install --global --production windows-build-tools

npm i -g native-run

cnpm install  
cnpm install -g ionic@5.0.2
cnpm install -g cordova@9.0.0
*/
```

#### 解决 cnpm : 无法加载文件 C:\xxx\cnpm.ps1，因为在此系统上禁止运行脚本。（Power shell as Administrator权限）:

set-ExecutionPolicy RemoteSigned，选择A即可

