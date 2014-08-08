#/bin/bash

clear

mvn -e compile exec:java  -Dexec.mainClass=$1
