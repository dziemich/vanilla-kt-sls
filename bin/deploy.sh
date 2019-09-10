#!/usr/bin/env bash

./gradlew clean shadowJar --info
sls deploy
