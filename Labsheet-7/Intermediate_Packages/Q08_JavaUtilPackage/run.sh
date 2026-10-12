#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out Main.java
java -cp out Main
