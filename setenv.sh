#!/usr/bin/env bash

JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.222.b10-0.fc30.x86_64
export JAVA_HOME

PATH="$JAVA_HOME/bin:$HOME/.local/bin:$HOME/bin:$PATH"
export PATH

echo $JAVA_HOME