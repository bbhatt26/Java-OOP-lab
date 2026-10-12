#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out animals/Dog.java ImportDemo.java QualifiedDemo.java
echo "--- with import ---"; java -cp out ImportDemo
echo "--- fully qualified ---"; java -cp out QualifiedDemo
