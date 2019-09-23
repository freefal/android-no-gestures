module.exports = {
  disable_all_gestures: function () {
    return new Promise(function(resolve, reject) {
      cordova.exec(resolve, reject, 'CordovaPluginAndroidNoGestures', 'disable_all_gestures', []);
    });
  }
};
