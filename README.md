# Based on Cordova Hello World Plugin

#NOTE: This is a test project to integrate Parse's Push API with Cordova. Not production ready.

Simple plugin that returns your string prefixed with hello.

Gretting a user with "Hello, world" is something that could be done in JavaScript. This plugin provides a simple example demonstrating how Corodva plugins work.

## Using
Clone the plugin

    $ git clone https://github.com/don/cordova-plugin-hello.git

Create a new Corodva Project

    $ cordova create hello com.example.helloapp Hello
    
Install the plugin

    $ cd hello
    $ cordova plugin install ../cordova-plugin-hello
    

Edit `www/js/index.html` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Hello Plugin");
    }

    hello.greet("World", success, failure);
```

Install iOS or Android platform

    cordova platform add ios
    corodva platform add android
    
Run the code

    cordova run 

## More Info

For more information on setting up Cordova see [the documentation](http://cordova.apache.org/docs/en/4.0.0/guide_cli_index.md.html#The%20Command-Line%20Interface)

For more info on plugins see the [Plugin Development Guide](http://cordova.apache.org/docs/en/4.0.0/guide_hybrid_plugins_index.md.html#Plugin%20Development%20Guide)
