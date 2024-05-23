#!/bin/sh
set -eux
pipenv run migrate
pipenv run runserver
