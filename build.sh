#!/bin/bash
set -e
bundler
asciidoctor-pdf *.adoc --out-file 'the_road_from_java8_to_java11.pdf'

