#!/bin/bash
OUT_FILE=${1:-the_road_from_java8_to_java11.pdf}
set -e
bundle install
asciidoctor-pdf                           \
  -a toc                                  \
  --failure-level WARN                    \
  --attribute revnumber="$(git describe)" \
  --attribute revdate="$(date +%Y-%m-%d)" \
  main.adoc                               \
  --out-file ${OUT_FILE}
echo ${OUT_FILE} successfully created.
