#!/bin/bash

./gradlew ${1:-installDevMinSdkDevKernelDebug} --stacktrace && adb shell am start -n com.cierpliwy.sensortagexpo/host.exp.exponent.MainActivity
