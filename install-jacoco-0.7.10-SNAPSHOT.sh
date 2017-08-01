#!/usr/bin/env bash

git clone https://github.com/jacoco/jacoco.git
cd jacoco
mvn -D jdk18 -pl '!org.jacoco.cli.test,!org.jacoco.doc,!jacoco' install
