#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out demo/Access.java Main.java
java -cp out Main
