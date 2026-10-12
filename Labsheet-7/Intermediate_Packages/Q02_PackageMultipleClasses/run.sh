#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out shapes/*.java Main.java
java -cp out Main
