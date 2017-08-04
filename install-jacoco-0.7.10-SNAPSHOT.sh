#!/usr/bin/env bash

git clone https://github.com/jacoco/jacoco.git
cd jacoco
mvn clean install -DskipTests
