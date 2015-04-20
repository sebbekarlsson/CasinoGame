from flask import Flask, render_template, redirect, jsonify, session, request
from flask_oauthlib.provider import OAuth2Provider

app = Flask(__name__)
oauth = OAuth2Provider(app)

@app.route('/')
def hello_world():
    return 'The API is running!'

if __name__ == '__main__':
    oauth.init_app(app)
    app.run()
