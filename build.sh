#!/bin/bash
set -e
bundle install
asciidoctor-pdf                                  \
  --failure-level WARN                           \
  --attribute revnumber="$(git describe)"        \
  --attribute revdate="$(date +%Y-%m-%d)"        \
  main.adoc                                      \
  --out-file 'the_road_from_java8_to_java11.pdf'

