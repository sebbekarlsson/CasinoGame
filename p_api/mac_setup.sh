#!/bin/bash

if [ "$(whoami)" == "root" ]; then
	echo "Don't run this as root"
	exit 1
fi

cd flask
virtualenv venv --distribute
. venv/bin/activate
python setup.py develop
