#!/bin/bash

cd flask
virtualenv venv --distribute
. venv/bin/activate
python setup.py develop
