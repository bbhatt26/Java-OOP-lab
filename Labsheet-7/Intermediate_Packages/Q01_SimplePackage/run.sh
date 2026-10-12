#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out mypack/Hello.java Main.java
java -cp out Main
