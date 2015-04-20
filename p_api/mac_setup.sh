#!/bin/bash

if [ "$(whoami)" != "root" ]; then
	echo "This script must be run as root"
	exit 1
fi

pip install virtualenv

cd flask
virtualenv venv --distribute
. venv/bin/activate
python setup.py develop
